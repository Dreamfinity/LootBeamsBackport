package org.dreamfinity.beamingdrops;

import com.integral.hooklibultimate.minecraft.PrimaryClassTransformer;


public class HookLoader extends com.integral.hooklibultimate.minecraft.HookLoader {

    @Override
    public String[] getASMTransformerClass() {
        return new String[]{PrimaryClassTransformer.class.getName()};
    }

    @Override
    public void registerHooks() {
        registerHookContainer("org.dreamfinity.beamingdrops.hooks.DroppedItemRenderHook");
    }
}
