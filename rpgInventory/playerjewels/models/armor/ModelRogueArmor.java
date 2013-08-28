package rpgInventory.playerjewels.models.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRogueArmor extends ModelBiped
{
	//fields
	ModelRenderer KneeL;
	ModelRenderer KneeR;
	ModelRenderer ToetipL;
	ModelRenderer ToetipR;
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;

	public ModelRogueArmor(float par1, float par2, int par3, int par4)
	{
		textureWidth = 65;
		textureHeight = 64;
		this.bipedCloak = new ModelRenderer(this, 0, 0);
		this.bipedEars = new ModelRenderer(this, 24, 0);
		this.bipedHead = new ModelRenderer(this, 0, 0);
		this.bipedHead.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
		this.bipedHeadwear = new ModelRenderer(this, 32, 0);
		this.bipedHeadwear.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
		this.bipedBody = new ModelRenderer(this, 16, 16);
		this.bipedBody.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
		this.bipedRightArm = new ModelRenderer(this, 40, 16);
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F + par2, 0.0F);
		this.bipedLeftArm = new ModelRenderer(this, 40, 16);
		this.bipedLeftArm.mirror = true;
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F + par2, 0.0F);
		this.bipedRightLeg = new ModelRenderer(this, 0, 16);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F + par2, 0.0F);
		this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
		this.bipedLeftLeg.mirror = true;
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F + par2, 0.0F);
		KneeL = new ModelRenderer(this, 0, 32);
		KneeL.addBox(-1.5F, 3F, -2.5F, 3, 2, 1,0.9f);
		KneeL.setRotationPoint(0F, 0F, 0F);
		KneeL.setTextureSize(65, 64);
		KneeL.mirror = true;
		setRotation(KneeL, 0F, 0F, 0F);
		KneeR = new ModelRenderer(this, 0, 32);
		KneeR.addBox(-1.5F, 3F, -2.5F, 3, 2, 1,0.9f);
		KneeR.setRotationPoint(0F, 0F, 0F);
		KneeR.setTextureSize(65, 64);
		KneeR.mirror = true;
		setRotation(KneeR, 0F, 0F, 0F);
		ToetipL = new ModelRenderer(this, 0, 37);
		ToetipL.addBox(-2F, 10F, -3.5F, 4, 2, 1,0.5f);
		ToetipL.setRotationPoint(0F, 0F, 0F);
		ToetipL.setTextureSize(65, 64);
		ToetipL.mirror = true;
		setRotation(ToetipL, 0F, 0F, 0F);
		ToetipR = new ModelRenderer(this, 0, 37);
		ToetipR.addBox(-2F, 10F, -3.5F, 4, 2, 1,0.5f);
		ToetipR.setRotationPoint(0F, 0F, 0F);
		ToetipR.setTextureSize(65, 64);
		ToetipR.mirror = true;
		setRotation(ToetipR, 0F, 0F, 0F);

		bipedRightLeg.addChild(KneeR);
		bipedRightLeg.addChild(ToetipR);
		bipedLeftLeg.addChild(ToetipL);
		bipedLeftLeg.addChild(KneeL);

	}
	public void showBoots(boolean show)
	{
		ToetipL.showModel = ToetipR.showModel = show;
	}
	public void showKnee(boolean show)
	{
		KneeR.showModel = KneeL.showModel = show;
	}
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}