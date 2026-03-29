package org.anerror.arsenic.core;

import org.anerror.arsenic.Arsenic;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,Arsenic.MOD_ID);

    public static final RegistryObject<Item> ARSENIC_INGOT = ITEMS.register("arsenic_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ARSENIC_NUGGET = ITEMS.register("arsenic_nugget",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}