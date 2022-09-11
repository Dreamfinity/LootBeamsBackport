package org.dreamfinity.lootbeamsbackport.hooks;

import com.integral.hooklibultimate.asm.Hook;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.util.IIcon;
import org.dreamfinity.lootbeamsbackport.BeamRenderer;


public class DroppedItemRenderHook {
    @Hook(targetMethod = "renderDroppedItem", injectOnExit = true)
    public static void renderDroppedItem(
        RenderItem renderItem,
        EntityItem entityItem,
        IIcon iIcon,
        int p_77020_3_,
        float p_77020_4_,
        float p_77020_5_,
        float p_77020_6_,
        float p_77020_7_
    ) {
        BeamRenderer.renderBeam(entityItem.worldObj, entityItem.getEntityItem());
    }
}
