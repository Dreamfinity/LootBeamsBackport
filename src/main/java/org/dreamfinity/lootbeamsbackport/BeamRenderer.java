package org.dreamfinity.lootbeamsbackport;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.HashMap;

public class BeamRenderer extends Render {
//    private static final ResourceLocation LOOT_BEAM_TEXTURE = new ResourceLocation("lootbeams", "textures/entity/loot_beam.png");
    private static final ResourceLocation LOOT_BEAM_TEXTURE = new ResourceLocation("textures/entity/beacon_beam.png");
    public static HashMap<String, Color> charToAWTColor = new HashMap<String, Color>(){{
        put("0", new Color(0x000000));
        put("1", new Color(0x0000AA));
        put("2", new Color(0x00AA00));
        put("3", new Color(0x00AAAA));
        put("4", new Color(0xAA0000));
        put("5", new Color(0xAA00AA));
        put("6", new Color(0xFFAA00));
        put("7", new Color(0xAAAAAA));
        put("8", new Color(0x555555));
        put("9", new Color(0x5555FF));
        put("a", new Color(0x55FF55));
        put("b", new Color(0x55FFFF));
        put("c", new Color(0xFF5555));
        put("d", new Color(0xFF55FF));
        put("e", new Color(0xFFFF55));
        put("f", new Color(0xFFFFFF));
        put("g", new Color(0xDDD605));
    }};

    public static void renderBeam(RenderItem renderItem, EntityItem entityItem) {
        Color beamColor;
        
        if (entityItem == null) {
            return;
        }

        beamColor = getItemColor(entityItem);

        Tessellator tessellator = Tessellator.instance;
        RenderManager renderManager = RenderManager.instance;
        renderManager.renderEngine.bindTexture(LOOT_BEAM_TEXTURE);

        GL11.glAlphaFunc(516, 0.1F);
        GL11.glTexParameterf(3553, 10242, 10497.0F);
        GL11.glTexParameterf(3553, 10243, 10497.0F);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glDepthMask(true);
        OpenGlHelper.glBlendFunc(770, 1, 1, 0);

        float var9 = 1.0f;
        float var11 = (float) entityItem.worldObj.getTotalWorldTime() + 2;
        float var12 = -var11 * 0.2F - (float) MathHelper.floor_float(-var11 * 0.1F);
        byte var13 = 1;
        double var14 = (double) var11 * 0.025 * (1.0 - (double) (var13 & 1) * 2.5);
        tessellator.startDrawingQuads();
        tessellator.setColorRGBA(255, 255, 255, 32);
        double var16 = (double) var13 * 0.2;
        double var18 = 0.5 + Math.cos(var14 + 2.356194490192345) * var16;
        double var20 = 0.5 + Math.sin(var14 + 2.356194490192345) * var16;
        double var22 = 0.5 + Math.cos(var14 + 0.7853981633974483) * var16;
        double var24 = 0.5 + Math.sin(var14 + 0.7853981633974483) * var16;
        double var26 = 0.5 + Math.cos(var14 + 3.9269908169872414) * var16;
        double var28 = 0.5 + Math.sin(var14 + 3.9269908169872414) * var16;
        double var30 = 0.5 + Math.cos(var14 + 5.497787143782138) * var16;
        double var32 = 0.5 + Math.sin(var14 + 5.497787143782138) * var16;
        double var34 = 256.0F * var9;
        double var36 = 0.0;
        double var38 = 1.0;
        double var40 = -1.0F + var12;
        double var42 = (double) (256.0F * var9) * (0.5 / var16) + var40;
        double entityXPos = entityItem.posX;
        double entityYPos = entityItem.posY;
        double entityZPos = entityItem.posZ;
        tessellator.addVertexWithUV(entityXPos + var18, entityYPos + var34, entityZPos + var20, var38, var42);
        tessellator.addVertexWithUV(entityXPos + var18, entityYPos, entityZPos + var20, var38, var40);
        tessellator.addVertexWithUV(entityXPos + var22, entityYPos, entityZPos + var24, var36, var40);
        tessellator.addVertexWithUV(entityXPos + var22, entityYPos + var34, entityZPos + var24, var36, var42);
        tessellator.addVertexWithUV(entityXPos + var30, entityYPos + var34, entityZPos + var32, var38, var42);
        tessellator.addVertexWithUV(entityXPos + var30, entityYPos, entityZPos + var32, var38, var40);
        tessellator.addVertexWithUV(entityXPos + var26, entityYPos, entityZPos + var28, var36, var40);
        tessellator.addVertexWithUV(entityXPos + var26, entityYPos + var34, entityZPos + var28, var36, var42);
        tessellator.addVertexWithUV(entityXPos + var22, entityYPos + var34, entityZPos + var24, var38, var42);
        tessellator.addVertexWithUV(entityXPos + var22, entityYPos, entityZPos + var24, var38, var40);
        tessellator.addVertexWithUV(entityXPos + var30, entityYPos, entityZPos + var32, var36, var40);
        tessellator.addVertexWithUV(entityXPos + var30, entityYPos + var34, entityZPos + var32, var36, var42);
        tessellator.addVertexWithUV(entityXPos + var26, entityYPos + var34, entityZPos + var28, var38, var42);
        tessellator.addVertexWithUV(entityXPos + var26, entityYPos, entityZPos + var28, var38, var40);
        tessellator.addVertexWithUV(entityXPos + var18, entityYPos, entityZPos + var20, var36, var40);
        tessellator.addVertexWithUV(entityXPos + var18, entityYPos + var34, entityZPos + var20, var36, var42);
        tessellator.draw();
        GL11.glEnable(GL11.GL_BLEND);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glDepthMask(false);
//        tessellator.startDrawingQuads();
//        tessellator.setColorRGBA(255, 255, 255, 32);
//        double var44 = 0.2;
//        double var15 = 0.2;
//        double var17 = 0.8;
//        double var19 = 0.2;
//        double var21 = 0.2;
//        double var23 = 0.8;
//        double var25 = 0.8;
//        double var27 = 0.8;
//        double var29 = (double) (256.0F * var9);
//        double var31 = 0.0;
//        double var33 = 1.0;
//        double var35 = (double) (-1.0F + var12);
//        double var37 = (double) (256.0F * var9) + var35;
//        tessellator.addVertexWithUV(entityXPos + var44, entityYPos + var29, entityZPos + var15, var33, var37);
//        tessellator.addVertexWithUV(entityXPos + var44, entityYPos, entityZPos + var15, var33, var35);
//        tessellator.addVertexWithUV(entityXPos + var17, entityYPos, entityZPos + var19, var31, var35);
//        tessellator.addVertexWithUV(entityXPos + var17, entityYPos + var29, entityZPos + var19, var31, var37);
//        tessellator.addVertexWithUV(entityXPos + var25, entityYPos + var29, entityZPos + var27, var33, var37);
//        tessellator.addVertexWithUV(entityXPos + var25, entityYPos, entityZPos + var27, var33, var35);
//        tessellator.addVertexWithUV(entityXPos + var21, entityYPos, entityZPos + var23, var31, var35);
//        tessellator.addVertexWithUV(entityXPos + var21, entityYPos + var29, entityZPos + var23, var31, var37);
//        tessellator.addVertexWithUV(entityXPos + var17, entityYPos + var29, entityZPos + var19, var33, var37);
//        tessellator.addVertexWithUV(entityXPos + var17, entityYPos, entityZPos + var19, var33, var35);
//        tessellator.addVertexWithUV(entityXPos + var25, entityYPos, entityZPos + var27, var31, var35);
//        tessellator.addVertexWithUV(entityXPos + var25, entityYPos + var29, entityZPos + var27, var31, var37);
//        tessellator.addVertexWithUV(entityXPos + var21, entityYPos + var29, entityZPos + var23, var33, var37);
//        tessellator.addVertexWithUV(entityXPos + var21, entityYPos, entityZPos + var23, var33, var35);
//        tessellator.addVertexWithUV(entityXPos + var44, entityYPos, entityZPos + var15, var31, var35);
//        tessellator.addVertexWithUV(entityXPos + var44, entityYPos + var29, entityZPos + var15, var31, var37);
//        tessellator.draw();
        GL11.glEnable(GL11.GL_LIGHTING);

        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glDepthMask(true);
    }

    private static Color getItemColor(EntityItem item) {
        String itemName = item.getEntityItem().getDisplayName();
        int colorTagIndex = itemName.indexOf("§");

        if (colorTagIndex == -1) {
            return Color.WHITE;
        }

        String colorCodePosition = String.valueOf(itemName.charAt(colorTagIndex + 1));
        return charToAWTColor.getOrDefault(colorCodePosition, Color.WHITE);
    }

    @Override
    public void doRender(Entity entity, double v, double v1, double v2, float v3, float v4) {
        
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return null;
    }
}
