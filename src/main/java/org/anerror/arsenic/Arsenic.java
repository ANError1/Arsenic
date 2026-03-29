package org.anerror.arsenic;

import org.anerror.arsenic.core.ModItems;
import org.anerror.arsenic.config.ArsenicConfigLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Arsenic.MOD_ID)
public class Arsenic {
    public static final String MOD_ID = "arsenic";

    public Arsenic() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ArsenicConfigLoader.initializeConfig();
        });
    }
}