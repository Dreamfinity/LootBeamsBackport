package org.dreamfinity.lootbeamsbackport;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class Config {
    static Configuration config;
    private static final String COMMON = "Beam settings";
    public static boolean needRenderBeam = true;
    public static boolean useHighResBeam = true;
    public static boolean useRotatingBeam = true;
    public static double beamDiameter = 0.25;
    public static double beamHeight = 1.5;

    public static void load(FMLPreInitializationEvent event) {
        config = new Configuration(new File(event.getModConfigurationDirectory(), "LootBeamsBackport.cfg"), true);
        config.load();
        needRenderBeam = config.getBoolean("needRenderBeam", COMMON, true,  "Render beam above items or not");
        useHighResBeam = config.getBoolean("useHighResBeam", COMMON, true,  "Use high-res (256x256) beam texture or low-res(16x16)");
        useRotatingBeam = config.getBoolean("useRotatingBeam", COMMON, true,  "Rotate beam over time (like beacon's beam)");
        beamDiameter = config.getFloat("beamDiameter", COMMON, 0.25f, 0.05f, 3.0f, "Beam diameter");
        beamHeight = config.getFloat("beamHeight", COMMON, 1.5f, 0.5f, 32.0f, "Beam height (in blocks)");
        config.save();
    }

    public static void save() {
        config.save();
    }
}
