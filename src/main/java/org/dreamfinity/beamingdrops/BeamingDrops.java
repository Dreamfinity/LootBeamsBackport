package org.dreamfinity.beamingdrops;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.dreamfinity.beamingdrops.proxy.CommonProxy;


@Mod(
    modid = BeamingDrops.MODID,
    name = BeamingDrops.NAME,
    version = BeamingDrops.VERSION
)
public class BeamingDrops {
    public static final  String MODID = "beamingdrops";
    public static final String NAME = "BeamingDrops";
    public static final String VERSION = "@version@";

    @SidedProxy(
        clientSide = "org.dreamfinity.beamingdrops.proxy.ClientProxy",
        serverSide = "org.dreamfinity.beamingdrops.proxy.CommonProxy"
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
