package addonMasters.entity.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelRpgSpider extends ModelBase {
	// fields

	ModelRenderer Head;
	ModelRenderer Body;
	ModelRenderer RearEnd;
	ModelRenderer Leg8;
	ModelRenderer Leg8ext;
	ModelRenderer Leg6;
	ModelRenderer Leg6ext;
	ModelRenderer Leg4;
	ModelRenderer Leg4ext;
	ModelRenderer Leg2;
	ModelRenderer Leg2ext;
	ModelRenderer Leg7;
	ModelRenderer Leg7ext;
	ModelRenderer Leg5;
	ModelRenderer Leg5ext;
	ModelRenderer Leg3;
	ModelRenderer Leg3ext;
	ModelRenderer Leg1;
	ModelRenderer Leg1ext;
	ModelRenderer Shape1;
	ModelRenderer Shape2;

	public ModelRpgSpider() {
		textureWidth = 64;
		textureHeight = 64;
		Head = new ModelRenderer(this, 32, 4);
		Head.addBox(-4F, -4F, -8F, 8, 8, 8);
		Head.setRotationPoint(0F, 12F, -3F);
		Head.setTextureSize(64, 64);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		Body = new ModelRenderer(this, 0, 0);
		Body.addBox(-3F, -2F, -4F, 6, 6, 6);
		Body.setRotationPoint(0F, 12F, 0F);
		Body.setTextureSize(64, 64);
		Body.mirror = true;
		setRotation(Body, -0.1745329F, 0F, 0F);
		RearEnd = new ModelRenderer(this, 0, 12);
		RearEnd.addBox(-5F, -1F, -7F, 10, 8, 12);
		RearEnd.setRotationPoint(0F, 12F, 9F);
		RearEnd.setTextureSize(64, 64);
		RearEnd.mirror = true;
		setRotation(RearEnd, -0.296706F, 0F, 0F);
		Leg8 = new ModelRenderer(this, 18, 0);
		Leg8.addBox(-1F, -1F, -1F, 16, 2, 2);
		Leg8.setRotationPoint(4F, 12F, -1F);
		Leg8.setTextureSize(64, 64);
		Leg8.mirror = true;
		setRotation(Leg8, 0F, 0.5759587F, 0.1919862F);
		Leg8ext = new ModelRenderer(this, 0, 35);
		Leg8ext.addBox(-1F, -1F, -1F, 10, 2, 2);
		Leg8ext.setRotationPoint(15F, 0.5F, 0F);
		Leg8ext.setTextureSize(64, 64);
		Leg8ext.mirror = true;
		setRotation(Leg8ext, 0F, 0F, 0.1919862F * 4);
		Leg6 = new ModelRenderer(this, 18, 0);
		Leg6.addBox(-1F, -1F, -1F, 16, 2, 2);
		Leg6.setRotationPoint(4F, 12F, 0F);
		Leg6.setTextureSize(64, 64);
		Leg6.mirror = true;
		setRotation(Leg6, 0F, 0.2792527F, 0.1919862F);
		Leg6ext = new ModelRenderer(this, 0, 35);
		Leg6ext.addBox(-1F, -1F, -1F, 10, 2, 2);
		Leg6ext.setRotationPoint(15F, 0.5F, 0F);
		Leg6ext.setTextureSize(64, 64);
		Leg6ext.mirror = true;
		setRotation(Leg6ext, 0F, 0, 0.1919862F * 4);
		Leg4 = new ModelRenderer(this, 18, 0);
		Leg4.addBox(-1F, -1F, -1F, 16, 2, 2);
		Leg4.setRotationPoint(4F, 12F, 1F);
		Leg4.setTextureSize(64, 64);
		Leg4.mirror = true;
		setRotation(Leg4, 0F, -0.2792527F, 0.1919862F);
		Leg4ext = new ModelRenderer(this, 0, 35);
		Leg4ext.addBox(-1F, -1F, -1F, 10, 2, 2);
		Leg4ext.setRotationPoint(15F, 0.5F, 0F);
		Leg4ext.setTextureSize(64, 64);
		Leg4ext.mirror = true;
		setRotation(Leg4ext, 0F, 0F, 0.1919862F * 4);
		Leg2 = new ModelRenderer(this, 18, 0);
		Leg2.addBox(-1F, -1F, -1F, 16, 2, 2);
		Leg2.setRotationPoint(4F, 12F, 2F);
		Leg2.setTextureSize(64, 64);
		Leg2.mirror = true;
		setRotation(Leg2, 0F, -0.5759587F, 0.1919862F);
		Leg2ext = new ModelRenderer(this, 0, 35);
		Leg2ext.addBox(-1F, -1F, -1F, 10, 2, 2);
		Leg2ext.setRotationPoint(15F, 0.5F, 0F);
		Leg2ext.setTextureSize(64, 64);
		Leg2ext.mirror = true;
		setRotation(Leg2ext, 0F, 0F, 0.1919862F * 4);
		Leg7 = new ModelRenderer(this, 18, 0);
		Leg7.addBox(-15F, -1F, -1F, 16, 2, 2);
		Leg7.setRotationPoint(-3F, 12F, -1F);
		Leg7.setTextureSize(64, 64);
		Leg7.mirror = true;
		setRotation(Leg7, 0F, -0.5759587F, -0.1919862F);
		Leg7ext = new ModelRenderer(this, 0, 35);
		Leg7ext.addBox(-1F, -1F, -1F, 10, 2, 2);
		Leg7ext.setRotationPoint(-21F, 6F, 0F);
		Leg7ext.setTextureSize(64, 64);
		Leg7ext.mirror = true;
		setRotation(Leg7ext, 0F, 0F, -0.1919862F * 4);
		Leg5 = new ModelRenderer(this, 18, 0);
		Leg5.addBox(-15F, -1F, -1F, 16, 2, 2);
		Leg5.setRotationPoint(-4F, 12F, 0F);
		Leg5.setTextureSize(64, 64);
		Leg5.mirror = true;
		setRotation(Leg5, 0F, -0.2792527F, -0.1919862F);
		Leg5ext = new ModelRenderer(this, 0, 35);
		Leg5ext.addBox(-1F, -1F, -1F, 10, 2, 2);
		Leg5ext.setRotationPoint(-21F, 6F, 0F);
		Leg5ext.setTextureSize(64, 64);
		Leg5ext.mirror = true;
		setRotation(Leg5ext, 0F, 0F, -0.1919862F * 4);
		Leg3 = new ModelRenderer(this, 18, 0);
		Leg3.addBox(-15F, -1F, -1F, 16, 2, 2);
		Leg3.setRotationPoint(-4F, 12F, 1F);
		Leg3.setTextureSize(64, 64);
		Leg3.mirror = true;
		setRotation(Leg3, 0F, 0.2792527F, -0.1919862F);
		Leg3ext = new ModelRenderer(this, 0, 35);
		Leg3ext.addBox(-1F, -1F, -1F, 10, 2, 2);
		Leg3ext.setRotationPoint(-21F, 6F, 0F);
		Leg3ext.setTextureSize(64, 64);
		Leg3ext.mirror = true;
		setRotation(Leg3ext, 0F, 0F, -0.1919862F * 4);
		Leg1 = new ModelRenderer(this, 18, 0);
		Leg1.addBox(-15F, -1F, -1F, 16, 2, 2);
		Leg1.setRotationPoint(-4F, 12F, 2F);
		Leg1.setTextureSize(64, 64);
		Leg1.mirror = true;
		setRotation(Leg1, 0F, 0.5759587F, -0.1919862F);
		Leg1ext = new ModelRenderer(this, 0, 35);
		Leg1ext.addBox(-1F, -1F, -1F, 10, 2, 2);
		Leg1ext.setRotationPoint(-21F, 6F, 0F);
		Leg1ext.setTextureSize(64, 64);
		Leg1ext.mirror = true;
		setRotation(Leg1ext, 0F, 0F, -0.1919862F * 4);
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape1.setRotationPoint(-3F, 2F, -9F);
		Shape1.setTextureSize(64, 64);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 0);
		Shape2.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape2.setRotationPoint(1F, 2F, -9F);
		Shape2.setTextureSize(64, 64);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);

		Leg8.addChild(Leg8ext);
		Leg7.addChild(Leg7ext);
		Leg6.addChild(Leg6ext);
		Leg5.addChild(Leg5ext);
		Leg4.addChild(Leg4ext);
		Leg3.addChild(Leg3ext);
		Leg2.addChild(Leg2ext);
		Leg1.addChild(Leg1ext);
		Head.addChild(Shape1);
		Head.addChild(Shape2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Head.render(f5);
		Body.render(f5);
		RearEnd.render(f5);
		Leg8.render(f5);
		Leg6.render(f5);
		Leg4.render(f5);
		Leg2.render(f5);
		Leg7.render(f5);
		Leg5.render(f5);
		Leg3.render(f5);
		Leg1.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3,
			float par4, float par5, float par6, Entity par7Entity) {
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
		this.Head.rotateAngleY = par4 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = par5 / (180F / (float) Math.PI);
		float var8 = ((float) Math.PI / 4F);
		this.Leg1.rotateAngleZ = -var8;
		this.Leg2.rotateAngleZ = var8;
		this.Leg3.rotateAngleZ = -var8 * 0.74F;
		this.Leg4.rotateAngleZ = var8 * 0.74F;
		this.Leg5.rotateAngleZ = -var8 * 0.74F;
		this.Leg6.rotateAngleZ = var8 * 0.74F;
		this.Leg7.rotateAngleZ = -var8;
		this.Leg8.rotateAngleZ = var8;
		float var9 = -0.0F;
		float var10 = 0.3926991F;
		this.Leg1.rotateAngleY = (var10 * 2.0F) + var9;
		this.Leg2.rotateAngleY = (-var10 * 2.0F) - var9;
		this.Leg3.rotateAngleY = (var10 * 1.0F) + var9;
		this.Leg4.rotateAngleY = (-var10 * 1.0F) - var9;
		this.Leg5.rotateAngleY = (-var10 * 1.0F) + var9;
		this.Leg6.rotateAngleY = (var10 * 1.0F) - var9;
		this.Leg7.rotateAngleY = (-var10 * 2.0F) + var9;
		this.Leg8.rotateAngleY = (var10 * 2.0F) - var9;
		float var11 = -(MathHelper.cos((par1 * 0.6662F * 2.0F) + 0.0F) * 0.4F)
				* par2;
		float var12 = -(MathHelper.cos((par1 * 0.6662F * 2.0F)
				+ (float) Math.PI) * 0.4F)
				* par2;
		float var13 = -(MathHelper.cos((par1 * 0.6662F * 2.0F)
				+ ((float) Math.PI / 2F)) * 0.4F)
				* par2;
		float var14 = -(MathHelper.cos((par1 * 0.6662F * 2.0F)
				+ (((float) Math.PI * 3F) / 2F)) * 0.4F)
				* par2;
		float var15 = Math.abs(MathHelper.sin((par1 * 0.6662F) + 0.0F) * 0.4F)
				* par2;
		float var16 = Math.abs(MathHelper.sin((par1 * 0.6662F)
				+ (float) Math.PI) * 0.4F)
				* par2;
		float var17 = Math.abs(MathHelper.sin((par1 * 0.6662F)
				+ ((float) Math.PI / 2F)) * 0.4F)
				* par2;
		float var18 = Math.abs(MathHelper.sin((par1 * 0.6662F)
				+ (((float) Math.PI * 3F) / 2F)) * 0.4F)
				* par2;
		this.Leg1.rotateAngleY += var11;
		this.Leg2.rotateAngleY += -var11;
		this.Leg3.rotateAngleY += var12;
		this.Leg4.rotateAngleY += -var12;
		this.Leg5.rotateAngleY += var13;
		this.Leg6.rotateAngleY += -var13;
		this.Leg7.rotateAngleY += var14;
		this.Leg8.rotateAngleY += -var14;
		this.Leg1.rotateAngleZ += var15;
		this.Leg2.rotateAngleZ += -var15;
		this.Leg3.rotateAngleZ += var16;
		this.Leg4.rotateAngleZ += -var16;
		this.Leg5.rotateAngleZ += var17;
		this.Leg6.rotateAngleZ += -var17;
		this.Leg7.rotateAngleZ += var18;
		this.Leg8.rotateAngleZ += -var18;
	}
}
