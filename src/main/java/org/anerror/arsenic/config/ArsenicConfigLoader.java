package org.anerror.arsenic.config;

import java.util.List;

public class ArsenicConfigLoader {
    private static List<String> loadedModules;

    public static void initializeConfig() {
        System.out.println("[Arsenic Additions] Starting configuration setup...");
        parseDefaultModules();
    }

    private static void parseDefaultModules() {
        loadedModules.add("core_arsenic_items");
        loadedModules.add("toxic_damage_system");

        System.out.println("[Arsenic Additions] Modules loaded successfully: " + loadedModules.size());
    }
}