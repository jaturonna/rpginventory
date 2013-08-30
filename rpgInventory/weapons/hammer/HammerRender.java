package rpgInventory.weapons.hammer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import rpgInventory.gui.rpginv.RpgGui;


public class HammerRender implements IItemRenderer {

	ModelHammer swordmodel;
	Minecraft mc;
	public HammerRender()
	{
		swordmodel = new ModelHammer();

	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch(type)
		{
		case  EQUIPPED: return true;
		case  EQUIPPED_FIRST_PERSON: return true;
		case ENTITY : return true;
		default: break;
		}
		return false;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch(type)
		{
		case  EQUIPPED:
		{	
			mc = Minecraft.getMinecraft();
			GL11.glPushMatrix();

			if(((EntityPlayer)data[1]).getFoodStats().getFoodLevel() <4
					||((EntityPlayer)data[1]).func_110143_aJ() <4){
				mc.renderEngine.func_110577_a(new ResourceLocation("subaraki:weapons/RageHammer.png"));
			}
			else{
				mc.renderEngine.func_110577_a(new ResourceLocation("subaraki:weapons/Hammer.png"));
			}

			float scale = 1.5F;
			GL11.glScalef(scale,scale,scale);

			GL11.glRotatef(-180F, 0f, 0.0f, 1.0f);  
			GL11.glRotatef(90F, 0.0f, 1.0f, 0.0f);
			GL11.glRotatef(-50F, 1.0f, 0.0f, 0f);

			boolean isFirstPerson;

			if(data[1] != null && data[1] instanceof EntityPlayer)
			{
				if(!((EntityPlayer)data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative || Minecraft.getMinecraft().currentScreen instanceof RpgGui) && RenderManager.instance.playerViewY == 180.0F)))
				{
					GL11.glTranslatef(-0.05F, 0.5F, -0.43F);
				}
				else
				{
					isFirstPerson = true;
					GL11.glRotatef(20F, 1.0f, 0.0f, 0.0f);
					GL11.glRotatef(-10F, 0.0f, 1.0f, 0.0f);
					GL11.glRotatef(0F, 0.0f, 0.0f, 1.0f);
					GL11.glTranslatef(-0.1f,0.5f,-0.5F);
				}

			}
			else
			{
				GL11.glTranslatef(-0.05F, 0.5F, -0.43F);
			}

			swordmodel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();


		}
		break;
		case  EQUIPPED_FIRST_PERSON:
		{	
			mc = Minecraft.getMinecraft();
			GL11.glPushMatrix();

			if(((EntityPlayer)data[1]).getFoodStats().getFoodLevel() <4
					||((EntityPlayer)data[1]).func_110143_aJ() <4){
				mc.renderEngine.func_110577_a(new ResourceLocation("subaraki:weapons/RageHammer.png"));
			}
			else{
				mc.renderEngine.func_110577_a(new ResourceLocation("subaraki:weapons/Hammer.png"));
			}

			float scale = 1.5F;
			GL11.glScalef(scale,scale,scale);

			GL11.glRotatef(-180F, 0f, 0.0f, 1.0f);  
			GL11.glRotatef(90F, 0.0f, 1.0f, 0.0f);
			GL11.glRotatef(-50F, 1.0f, 0.0f, 0f);

			boolean isFirstPerson;

			if(data[1] != null && data[1] instanceof EntityPlayer)
			{
				if(!((EntityPlayer)data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative || Minecraft.getMinecraft().currentScreen instanceof RpgGui) && RenderManager.instance.playerViewY == 180.0F)))
				{
					GL11.glTranslatef(-0.05F, 0.5F, -0.43F);
				}
				else
				{
					isFirstPerson = true;
					GL11.glRotatef(20F, 1.0f, 0.0f, 0.0f);
					GL11.glRotatef(-10F, 0.0f, 1.0f, 0.0f);
					GL11.glRotatef(0F, 0.0f, 0.0f, 1.0f);
					GL11.glTranslatef(-0.1f,0.5f,-0.5F);
				}

			}
			else
			{
				GL11.glTranslatef(-0.05F, 0.5F, -0.43F);
			}

			swordmodel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();


		}
		break;
		case  ENTITY:
		{
			mc = Minecraft.getMinecraft();
			GL11.glPushMatrix();

			mc.renderEngine.func_110577_a(new ResourceLocation("subaraki:weapons/Hammer.png"));

			float scale = 1.8F;
			GL11.glScalef(scale,scale,scale);

			GL11.glRotatef(90F, 1.0f, 0.0f, 0.0f);
			GL11.glRotatef(90F, 0.0f, 1.0f, 0.0f);
			GL11.glRotatef(5F, 0.0f, 0.0f, 1.0f);

			GL11.glTranslatef(0.0F, 0.55F, 0F);


			swordmodel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();

		}
		break;

		default: break;
		}
	}
}
