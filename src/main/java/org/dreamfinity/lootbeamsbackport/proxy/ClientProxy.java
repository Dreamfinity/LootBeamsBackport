package org.dreamfinity.lootbeamsbackport.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {}

    @Override
    public void init(FMLInitializationEvent event) {
        this.registerKeyBindings();
        this.registerEvents();
        this.registerEvents();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {}

    private void registerKeyBindings() {}

    public void registerRenderers() {}

    private void registerEvents() {}
}
