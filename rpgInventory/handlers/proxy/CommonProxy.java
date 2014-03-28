package rpgInventory.handlers.proxy;

import java.util.Random;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import rpgInventory.mod_RpgInventory;
import rpgInventory.gui.rpginv.PlayerRpgInventory;
import rpgInventory.handlers.packets.ServerPacketHandler;

public class CommonProxy {

	public static final String RPG_DIR = "RPG_Inventories";

	public static void renderHandler() {
	}

	public void consumeItem(EntityPlayer player, Item itemID) {
		player.inventory.consumeInventoryItem(itemID);
	}

	public ModelBiped getArmorModel(int id) {
		return null;
	}

	public int getSphereID() {
		return 0;
	}

	public void openGUI(EntityPlayer player, int id) {
	}

	public void openGUI(EntityPlayer player, PlayerRpgInventory inv) {
	}

	public void playerLevel(EntityPlayer player, int amount) {
		player.addExperienceLevel(-amount);
	}

	public void registerLate() {
	}

	public void registerRenderInformation() {
	}

	public void spawnCharmParticle(World world, EntityLivingBase p, Random rng,
			boolean success) {
	}

	public void spawnParticle(World world, EntityLivingBase el, Random rng) {

	}
	
	
	public void load(){
		mod_RpgInventory.Channel.register(new ServerPacketHandler());
	}
}
