package addonBasic.renderer.weapons;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import rpgInventory.RpgInventoryMod;
import rpgInventory.gui.rpginv.PlayerRpgInventory;
import rpgInventory.renderer.RpgItemRenderer;
import addonBasic.RpgBaseAddon;
import addonBasic.models.weapons.ModelSoulSphere;

public class SoulSphereRender extends RpgItemRenderer {

	ModelSoulSphere swordmodel;
	public float hoverStart;
	Random random = new Random();
	float turn = 0;

	private static final ResourceLocation texture = new ResourceLocation("rpginventorymod:weapons/SoulSphere.png");
	public SoulSphereRender() {
		swordmodel = new ModelSoulSphere();
		this.hoverStart = (float) (Math.random() * Math.PI * 2.0D);
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

		switch (type) {
		case EQUIPPED:
			GL11.glPushMatrix();
			mc.renderEngine.bindTexture(texture);
			scale = 0.45F;
			GL11.glScalef(scale, scale, scale);
			GL11.glTranslatef(1.2F, 1F, -0.2F);
			turn += 0.01f;
			if ((data[1] != null) && (data[1] instanceof EntityPlayer)) {
				EntityPlayer p = (EntityPlayer) data[1];
				PlayerRpgInventory.get(p);

				if (RpgInventoryMod.playerClass.contains("archMage")|| RpgInventoryMod.playerClass.contains(RpgBaseAddon.CLASSALCHEMIST)) {
					swordmodel.renderFloatingShpere((Entity) data[1], turn,0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
					swordmodel.renderFloatingShpere((Entity) data[1],-(turn) + 100, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
					swordmodel.renderFloatingShpere((Entity) data[1],-(turn) / 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
				}
			}
			swordmodel.render((Entity) data[1], 0, 0.0F, 0.0F, 0.0F, 0.0F,0.0625F);
			GL11.glPopMatrix();
			break;

		case EQUIPPED_FIRST_PERSON:
			GL11.glPushMatrix();
			mc.renderEngine.bindTexture(texture);
			scale = 0.45F;
			GL11.glScalef(scale, scale, scale);
			GL11.glTranslatef(0.8F, 1.2F, -0.2F);
			turn += 0.01f;
			if ((data[1] != null) && (data[1] instanceof EntityPlayer)) {
				EntityPlayer p = (EntityPlayer) data[1];
				PlayerRpgInventory.get(p);

				if (RpgInventoryMod.playerClass.contains("archMage")|| RpgInventoryMod.playerClass.contains(RpgBaseAddon.CLASSALCHEMIST)) {
					swordmodel.renderFloatingShpere((Entity) data[1], turn,0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
					swordmodel.renderFloatingShpere((Entity) data[1],-(turn) + 100, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
					swordmodel.renderFloatingShpere((Entity) data[1],-(turn) / 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
				}
			}
			swordmodel.render((Entity) data[1], 0, 0.0F, 0.0F, 0.0F, 0.0F,
					0.0625F);
			GL11.glPopMatrix();
			break;

		case ENTITY:
			GL11.glPushMatrix();
			mc.renderEngine.bindTexture(texture);
			float scale = 0.8F;
			GL11.glScalef(scale, scale, scale);
			GL11.glRotatef(0F, 1.0f, 0.0f, 0.0f);
			GL11.glRotatef(0F, 0.0f, 1.0f, 0.0f);
			GL11.glRotatef(0F, 0.0f, 0.0f, 1.0f);
			GL11.glTranslatef(0F, 0.3F, 0.0F);
			turn += 0.01f;
			swordmodel.render((Entity) data[1], 0, 0.0F, 0.0F, 0.0F, 0.0F,
					0.0625F);
			GL11.glPopMatrix();
			break;

		case INVENTORY:
			GL11.glPushMatrix();
			mc.renderEngine.bindTexture(texture);
			scale = 1.9F;
			GL11.glScalef(scale, scale, scale);
			GL11.glTranslatef(0.0F, 0.2F, 0F);
			swordmodel.render(0.0625F);
			GL11.glPopMatrix();
			break;

		default:
			break;
		}
	}
}
