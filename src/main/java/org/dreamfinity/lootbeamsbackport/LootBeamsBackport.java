package org.dreamfinity.lootbeamsbackport;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dreamfinity.lootbeamsbackport.proxy.CommonProxy;


@Mod(
    modid = LootBeamsBackport.MODID,
    name = LootBeamsBackport.NAME,
    version = LootBeamsBackport.VERSION
)
public class LootBeamsBackport {
    public static final  String MODID = "lootbeamsbackport";
    public static final String NAME = "LootBeamsBackport";
    public static final String VERSION = "@version@";

    @SidedProxy(
        clientSide = "org.dreamfinity.lootbeamsbackport.proxy.ClientProxy",
        serverSide = "org.dreamfinity.lootbeamsbackport.proxy.CommonProxy"
    )
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        Config.load(event);
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
