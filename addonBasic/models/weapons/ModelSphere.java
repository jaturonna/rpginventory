/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package addonBasic.models.weapons;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.Tessellator;

import org.lwjgl.opengl.GL11;

import rpgInventory.RpgInventoryMod;

/**
 *
 * @author Home
 */
public class ModelSphere extends ModelBox {

	public ModelSphere(ModelRenderer par1ModelRenderer, int par2, int par3,
			float par4, float par5, float par6, int par7, int par8, int par9,
			float par10) {
		super(par1ModelRenderer, par2, par3, par4, par5, par6, par7, par8,
				par9, par10);
	}

	@Override
	public ModelBox func_78244_a(String par1Str) {
		return super.func_78244_a(par1Str);
	}

	@Override
	public void render(Tessellator par1Tessellator, float par2) {
		GL11.glCallList(RpgInventoryMod.proxy.getSphereID());
	}

	public ModelSphere setModelName(String par1Str) {
		return (ModelSphere) func_78244_a(par1Str);
	}
}
