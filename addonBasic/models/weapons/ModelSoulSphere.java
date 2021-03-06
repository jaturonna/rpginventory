package addonBasic.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSoulSphere extends ModelBase {
	// fields
	ModelRenderer circel1a;
	ModelRenderer circel1b;
	ModelRenderer circel1c;
	ModelRenderer circel1d;
	ModelRenderer circel1e;
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;
	ModelRenderer Core;
	ModelRenderer Shape18;
	ModelRenderer Shape19;
	ModelRenderer Shape20;
	ModelRenderer Shape21;
	ModelRenderer Shape6;
	ModelRenderer Shape11;
	ModelRenderer Shape16;
	ModelRenderer Shape17;
	ModelRenderer Shape22;
	ModelRenderer Shape23;
	ModelRenderer FloatingSphere1;
	ModelRenderer FloatingSphere2;
	ModelRenderer FloatingSphere3;

	public ModelSoulSphere() {
		textureWidth = 64;
		textureHeight = 32;

		circel1a = new ModelRenderer(this, 0, 29);
		circel1a.addBox(-1F, 0F, -1F, 2, 1, 2);
		circel1a.setRotationPoint(0F, 0F, 0F);
		circel1a.setTextureSize(64, 32);
		circel1a.mirror = true;
		setRotation(circel1a, 0F, 0F, 0F);
		circel1b = new ModelRenderer(this, 0, 22);
		circel1b.addBox(1F, 0F, -1F, 1, 1, 2);
		circel1b.setRotationPoint(0F, 0F, 0F);
		circel1b.setTextureSize(64, 32);
		circel1b.mirror = true;
		setRotation(circel1b, 0F, 0F, 0F);
		circel1c = new ModelRenderer(this, 0, 26);
		circel1c.addBox(-1F, 0F, -2F, 2, 1, 1);
		circel1c.setRotationPoint(0F, 0F, 0F);
		circel1c.setTextureSize(64, 32);
		circel1c.mirror = true;
		setRotation(circel1c, 0F, 0F, 0F);
		circel1d = new ModelRenderer(this, 0, 26);
		circel1d.addBox(-1F, 0F, 1F, 2, 1, 1);
		circel1d.setRotationPoint(0F, 0F, 0F);
		circel1d.setTextureSize(64, 32);
		circel1d.mirror = true;
		setRotation(circel1d, 0F, 0F, 0F);
		circel1e = new ModelRenderer(this, 0, 22);
		circel1e.addBox(-2F, 0F, -1F, 1, 1, 2);
		circel1e.setRotationPoint(0F, 0F, 0F);
		circel1e.setTextureSize(64, 32);
		circel1e.mirror = true;
		setRotation(circel1e, 0F, 0F, 0F);
		Shape1 = new ModelRenderer(this, 26, 0);
		Shape1.addBox(-2F, -1F, -2F, 4, 1, 4);
		Shape1.setRotationPoint(0F, 0F, 0F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 26, 6);
		Shape2.addBox(-2F, -1F, 2F, 4, 1, 1);
		Shape2.setRotationPoint(0F, 0F, 0F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 26, 6);
		Shape3.addBox(-2F, -1F, -3F, 4, 1, 1);
		Shape3.setRotationPoint(0F, 0F, 0F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 26, 10);
		Shape4.addBox(2F, -1F, -2F, 1, 1, 4);
		Shape4.setRotationPoint(0F, 0F, 0F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 26, 10);
		Shape5.addBox(-3F, -1F, -2F, 1, 1, 4);
		Shape5.setRotationPoint(0F, 0F, 0F);
		Shape5.setTextureSize(64, 32);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 0, 26);
		Shape7.addBox(-1F, -2F, 3F, 2, 1, 1);
		Shape7.setRotationPoint(0F, 0F, 0F);
		Shape7.setTextureSize(64, 32);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 0, 26);
		Shape8.addBox(-1F, -2F, -4F, 2, 1, 1);
		Shape8.setRotationPoint(0F, 0F, 0F);
		Shape8.setTextureSize(64, 32);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 0, 22);
		Shape9.addBox(-4F, -2F, -1F, 1, 1, 2);
		Shape9.setRotationPoint(0F, 0F, 0F);
		Shape9.setTextureSize(64, 32);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 0, 22);
		Shape10.addBox(3F, -2F, -1F, 1, 1, 2);
		Shape10.setRotationPoint(0F, 0F, 0F);
		Shape10.setTextureSize(64, 32);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 0, 12);
		Shape12.addBox(-2F, -4F, -4F, 4, 2, 1);
		Shape12.setRotationPoint(0F, 0F, 0F);
		Shape12.setTextureSize(64, 32);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 11, 12);
		Shape13.addBox(3F, -4F, -2F, 1, 2, 4);
		Shape13.setRotationPoint(0F, 0F, 0F);
		Shape13.setTextureSize(64, 32);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 0, 12);
		Shape14.addBox(-2F, -4F, 3F, 4, 2, 1);
		Shape14.setRotationPoint(0F, 0F, 0F);
		Shape14.setTextureSize(64, 32);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new ModelRenderer(this, 11, 12);
		Shape15.addBox(-4F, -4F, -2F, 1, 2, 4);
		Shape15.setRotationPoint(0F, 0F, 0F);
		Shape15.setTextureSize(64, 32);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
		Core = new ModelRenderer(this, 0, 0);
		Core.addBox(-3F, -5F, -3F, 6, 4, 6);
		Core.setRotationPoint(0F, 0F, 0F);
		Core.setTextureSize(64, 32);
		Core.mirror = true;
		setRotation(Core, 0F, 0F, 0F);
		Shape18 = new ModelRenderer(this, 0, 22);
		Shape18.addBox(3F, -5F, -1F, 1, 1, 2);
		Shape18.setRotationPoint(0F, 0F, 0F);
		Shape18.setTextureSize(64, 32);
		Shape18.mirror = true;
		setRotation(Shape18, 0F, 0F, 0F);
		Shape19 = new ModelRenderer(this, 0, 22);
		Shape19.addBox(-4F, -5F, -1F, 1, 1, 2);
		Shape19.setRotationPoint(0F, 0F, 0F);
		Shape19.setTextureSize(64, 32);
		Shape19.mirror = true;
		setRotation(Shape19, 0F, 0F, 0F);
		Shape20 = new ModelRenderer(this, 0, 26);
		Shape20.addBox(-1F, -5F, -4F, 2, 1, 1);
		Shape20.setRotationPoint(0F, 0F, 0F);
		Shape20.setTextureSize(64, 32);
		Shape20.mirror = true;
		setRotation(Shape20, 0F, 0F, 0F);
		Shape21 = new ModelRenderer(this, 0, 26);
		Shape21.addBox(-1F, -5F, 3F, 2, 1, 1);
		Shape21.setRotationPoint(0F, 0F, 0F);
		Shape21.setTextureSize(64, 32);
		Shape21.mirror = true;
		setRotation(Shape21, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 10, 20);
		Shape6.addBox(-3F, -6F, -2F, 6, 1, 4);
		Shape6.setRotationPoint(0F, 0F, 0F);
		Shape6.setTextureSize(64, 32);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 26, 6);
		Shape11.addBox(-2F, -6F, 2F, 4, 1, 1);
		Shape11.setRotationPoint(0F, 0F, 0F);
		Shape11.setTextureSize(64, 32);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape16 = new ModelRenderer(this, 26, 6);
		Shape16.addBox(-2F, -6F, -3F, 4, 1, 1);
		Shape16.setRotationPoint(0F, 0F, 0F);
		Shape16.setTextureSize(64, 32);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, 0F);
		Shape17 = new ModelRenderer(this, 10, 26);
		Shape17.addBox(-1F, -7F, -2F, 2, 1, 4);
		Shape17.setRotationPoint(0F, 0F, 0F);
		Shape17.setTextureSize(64, 32);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
		Shape22 = new ModelRenderer(this, 0, 22);
		Shape22.addBox(1F, -7F, -1F, 1, 1, 2);
		Shape22.setRotationPoint(0F, 0F, 0F);
		Shape22.setTextureSize(64, 32);
		Shape22.mirror = true;
		setRotation(Shape22, 0F, 0F, 0F);
		Shape23 = new ModelRenderer(this, 0, 22);
		Shape23.addBox(-2F, -7F, -1F, 1, 1, 2);
		Shape23.setRotationPoint(0F, 0F, 0F);
		Shape23.setTextureSize(64, 32);
		Shape23.mirror = true;
		setRotation(Shape23, 0F, 0F, 0F);
		FloatingSphere1 = new ModelRenderer(this, 54, 16);
		FloatingSphere1.addBox(0F, -1F, 11F, 2, 2, 2);
		FloatingSphere1.setRotationPoint(0F, -2.5F, 0F);
		FloatingSphere1.setTextureSize(64, 32);
		FloatingSphere1.mirror = true;
		setRotation(FloatingSphere1, 0F, 0F, 0F);
		FloatingSphere2 = new ModelRenderer(this, 54, 10);
		FloatingSphere2.addBox(0F, -1F, 11F, 2, 2, 2);
		FloatingSphere2.setRotationPoint(0F, -2.5F, 0F);
		FloatingSphere2.setTextureSize(64, 32);
		FloatingSphere2.mirror = true;
		setRotation(FloatingSphere2, 0F, 0F, 0F);
		FloatingSphere3 = new ModelRenderer(this, 54, 22);
		FloatingSphere3.addBox(0F, -1F, 11F, 2, 2, 2);
		FloatingSphere3.setRotationPoint(0F, -2.5F, 0F);
		FloatingSphere3.setTextureSize(64, 32);
		FloatingSphere3.mirror = true;
		setRotation(FloatingSphere3, 0F, 0F, 0F);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		render(f5);
	}

	public void render(float f5) {
		circel1a.render(f5);
		circel1b.render(f5);
		circel1c.render(f5);
		circel1d.render(f5);
		circel1e.render(f5);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
		Shape14.render(f5);
		Shape15.render(f5);
		Core.render(f5);
		Shape18.render(f5);
		Shape19.render(f5);
		Shape20.render(f5);
		Shape21.render(f5);
		Shape6.render(f5);
		Shape11.render(f5);
		Shape16.render(f5);
		Shape17.render(f5);
		Shape22.render(f5);
		Shape23.render(f5);
	}

	public void renderFloatingShpere(Entity entity, float f, float f1,
			float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		renderSPheres(f5);
	}

	public void renderSPheres(float f5) {
		FloatingSphere1.render(f5);
		FloatingSphere2.render(f5);
		FloatingSphere3.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity ent) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);

		this.FloatingSphere1.rotateAngleY = (MathHelper.sin(f) * 1F) + 3.6f;
		this.FloatingSphere2.rotateAngleY = (MathHelper.sin(f) * 2F) + 6.5f;
		this.FloatingSphere3.rotateAngleY = (MathHelper.sin(f) * 3F) + 4.5f;

		this.FloatingSphere1.rotateAngleX = (MathHelper.sin(f) * 6F) + 4.1f;
		this.FloatingSphere2.rotateAngleX = (MathHelper.sin(f) * 4F) + 4.7f;
		this.FloatingSphere3.rotateAngleX = (MathHelper.sin(f) * 5F) + 3.25f;

		this.FloatingSphere1.rotateAngleZ = (MathHelper.sin(f) * 4F) + 5.5f;
		this.FloatingSphere2.rotateAngleZ = (MathHelper.sin(f) * 5F) + 7;
		this.FloatingSphere3.rotateAngleZ = (MathHelper.sin(f) * 6F) + 2;
	}

}
