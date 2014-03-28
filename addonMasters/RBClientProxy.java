package addonMasters;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.renderer.entity.RenderXPOrb;
import net.minecraft.init.Items;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import rpgInventory.config.RpgConfig;
import addonBasic.models.item.ModelRogueArmor;
import addonMasters.entity.BoarPet;
import addonMasters.entity.BullPet;
import addonMasters.entity.EntityPetXP;
import addonMasters.entity.EntityTeleportStone;
import addonMasters.entity.SpiderPet;
import addonMasters.entity.renderers.RenderPet;
import addonMasters.models.LionHead;
import addonMasters.models.ModelBeastArmor;
import addonMasters.render.AxeRender;
import addonMasters.render.LionHeadRenderer;
import addonMasters.render.RenderDagger;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class RBClientProxy extends RBCommonProxy {

	private static final ModelRogueArmor armorRogueChest = new ModelRogueArmor(
			1.0f);

	private static final ModelRogueArmor armorRogue = new ModelRogueArmor(0.5f);
	private static final ModelBeastArmor armorBeastChest = new ModelBeastArmor(
			1.0f);
	private static final ModelBeastArmor armorBeast = new ModelBeastArmor(0.5f);

	@Override
	public ModelBiped getArmorModel(int id) {
		switch (id) {
		case 0:
			return armorRogueChest;
		case 1:
			return armorRogue;
		case 2:
			return armorBeastChest;
		case 3:
			return armorBeast;
		default:
			break;
		}
		return null;
	}

	@Override
	public void registerRendering() {
		if (RpgConfig.instance.render3D == true) {
			MinecraftForgeClient.registerItemRenderer(mod_RpgRB.beastAxe,
					new AxeRender());
			MinecraftForgeClient.registerItemRenderer(mod_RpgRB.daggers,
					new RenderDagger());

			MinecraftForgeClient.registerItemRenderer(mod_RpgRB.beastShield,
					new LionHeadRenderer(new LionHead(),
							"subaraki:jewels/lion.png"));
		}

		RenderingRegistry.registerEntityRenderingHandler(BullPet.class,
				new RenderPet());
		RenderingRegistry.registerEntityRenderingHandler(SpiderPet.class,
				new RenderPet());
		RenderingRegistry.registerEntityRenderingHandler(BoarPet.class,
				new RenderPet());
		RenderingRegistry.registerEntityRenderingHandler(EntityPetXP.class,
				new RenderXPOrb());
		RenderingRegistry
				.registerEntityRenderingHandler(EntityTeleportStone.class,
						new RenderSnowball(Items.feather, 1));

		// RPGKeyHandler.registerKeyhandler(new RpgKeyHandlerRB(),
		// IKeyHandler.bindKeys, IKeyHandler.reps);

		MinecraftForge.EVENT_BUS.register(new SoundManager());

		MinecraftForge.EVENT_BUS.register(new ClientTickHandler());
		// TickRegistry.registerTickHandler(new ClientTickHandler(),
		// Side.CLIENT);

	}
}
