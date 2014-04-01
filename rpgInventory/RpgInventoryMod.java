package rpgInventory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import rpgInventory.block.BlockForge;
import rpgInventory.block.te.TEMold;
import rpgInventory.gui.RpgInventoryTab;
import rpgInventory.handlers.ClientTickHandler;
import rpgInventory.handlers.CommonTickHandler;
import rpgInventory.handlers.GuiHandler;
import rpgInventory.handlers.RPGEventHooks;
import rpgInventory.handlers.RPGKeyHandler;
import rpgInventory.handlers.packets.ServerPacketHandler;
import rpgInventory.handlers.proxy.ClientProxy;
import rpgInventory.handlers.proxy.CommonProxy;
import rpgInventory.item.ItemMold;
import rpgInventory.item.armor.ItemRpgInvArmor;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.FMLEventChannel;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = RpgInventoryMod.name, name = RpgInventoryMod.ID, version = RpgInventoryMod.version)
public class RpgInventoryMod {

	public static class ITEMTYPE {

		public static final int NECKLACE = 0;
		public static final int SHIELD = 1;
		public static final int CLOAK = 2;
		public static final int GLOVES = 3;
		public static final int RING = 4;
		public static final int CRYSTAL = 5;
	}

	public static final String name = "rpginventorymod";
	public static final String ID = "Rpg Inventory";

	protected static final String version = "1.7.2";

	/**Check this on clientside only !*/
	public static String playerClass = "none";
	public static RpgInventoryMod instance;

	// public static final PacketPipeline17 PIPELINE = new PacketPipeline17();
	public static FMLEventChannel Channel;

	@SidedProxy(serverSide = "rpgInventory.handlers.proxy.CommonProxy", clientSide = "rpgInventory.handlers.proxy.ClientProxy")
	public static CommonProxy proxy;

	public static Item
	/* ====jewels==== */
	neckgold, neckdia, neckem, necklap, glovesbutter, glovesdia, glovesem,
	gloveslap, ringgold, ringdia, ringem, ringlap,
	/* ====cloaks==== */
	cloak, cloakI, cloakSub, cloakRed, cloakYellow, cloakGreen,
	cloakBlue,
	/* ====molds==== */
	colmold, ringmold, wantmold;

	public Item[] allItems;

	public static Block forgeBlock;
	// Die bitches.
	public static List<String> developers = new ArrayList<String>();

	public static List<Integer> rpvInvIDs = new ArrayList();

	private static int uniqueID = 0;

	public static CreativeTabs tab;

	public static ArrayList<String> donators = new ArrayList<String>();
	/**this boolean gets manually changed by the creator before obfuscating the mod to false
	 * this field is used for Reflection */
	public static boolean isDev;
	public static final String channelName = "RpgInv";

	public RpgInventoryMod() {
		instance = this;
	}

	public void addCandyChestLoot(ItemStack is, int min, int max, int rarity,
			String item) {
		FMLLog.info("Adding to chests: " + item, min);
		WeightedRandomChestContent chestGen = new WeightedRandomChestContent(
				is.copy(), min, max, rarity);

		ChestGenHooks.getInfo("dungeonChest").addItem(chestGen);
		ChestGenHooks.getInfo("mineshaftCorridor").addItem(chestGen);
		ChestGenHooks.getInfo("strongholdCorridor").addItem(chestGen);
		ChestGenHooks.getInfo("strongholdLibrary").addItem(chestGen);
		ChestGenHooks.getInfo("strongholdCrossing").addItem(chestGen);
		ChestGenHooks.getInfo("bonusChest").addItem(chestGen);

	}

	public void addChestLoot(ItemStack is, int min, int max, int rarity,
			String item) {
		FMLLog.info("Adding to chests: " + item, min);
		WeightedRandomChestContent chestGen = new WeightedRandomChestContent(
				is.copy(), min, max, rarity);

		ChestGenHooks.getInfo("dungeonChest").addItem(chestGen);
		ChestGenHooks.getInfo("villageBlacksmith").addItem(chestGen);
		ChestGenHooks.getInfo("pyramidJungleChest").addItem(chestGen);
		ChestGenHooks.getInfo("pyramidDesertyChest").addItem(chestGen);
		ChestGenHooks.getInfo("mineshaftCorridor").addItem(chestGen);

	}

	public void addRareLoot(ItemStack is, int min, int max, int rarity,
			String item) {
		FMLLog.info("Adding to chests: " + item, min);
		WeightedRandomChestContent chestGen = new WeightedRandomChestContent(
				is.copy(), min, max, rarity);

		ChestGenHooks.getInfo("dungeonChest").addItem(chestGen);
		ChestGenHooks.getInfo("mineshaftCorridor").addItem(chestGen);
		ChestGenHooks.getInfo("strongholdCorridor").addItem(chestGen);
		ChestGenHooks.getInfo("strongholdLibrary").addItem(chestGen);
		ChestGenHooks.getInfo("strongholdCrossing").addItem(chestGen);
	}

	public int getUniqueID() {
		return uniqueID++;
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {

		
		isDev = true;
		
		ToLoad.loadMoldRecipes();
		ToLoad.loadGameRecipes();

		Channel = NetworkRegistry.INSTANCE.newEventDrivenChannel("RpgInv");
		proxy.load();
		FMLCommonHandler.instance().bus().register(new CommonTickHandler());
		RpgInventoryMod.Channel.register(new ServerPacketHandler());

		setDonators();
		// GameRegistry.registerPlayerTracker(new OnPlayerLogin(version, name));

		developers.add("unjustice");
		developers.add("artix_all_mighty");
		developers.add("rich1051414");
		developers.add("darkhax");

		proxy.registerRenderInformation();

		addChestLoot(new ItemStack(RpgInventoryMod.colmold), 1, 1, 20,
				"Necklace Mold");
		addChestLoot(new ItemStack(RpgInventoryMod.ringmold), 1, 1, 10,
				"Ring Mold");
		addChestLoot(new ItemStack(RpgInventoryMod.wantmold), 1, 1, 20,
				"Gloves Mold");
		addRareLoot(new ItemStack(RpgInventoryMod.cloakI), 1, 1, 1,
				"Gloves Mold");

		GameRegistry.registerTileEntity(TEMold.class, "temold");

		// DONE ?
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

		MinecraftForge.EVENT_BUS.register(new RPGEventHooks());

		ClientProxy.renderHandler();

	}

	public String playerClass() {
		return playerClass;
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
		// PIPELINE.postInitialise();

		proxy.registerLate();
		// All mods should be initialized now, check what potion effects are
		// installed
		// and list the bad ones for later reference.
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// loadConfig(event.getSuggestedConfigurationFile());

		// NOTHING BEFORE THE GOD DAMN TAB !
		// any items that need to be in it, put in it BEFORE the tab exists will
		// not be in
		tab = new RpgInventoryTab(CreativeTabs.getNextID(),
				"Rpg Inventory Jewelery");

		neckgold = new ItemRpgInvArmor(ItemRpgInvArmor.NECKLACE, -1, "",
				"subaraki:jewels/NeckGold.png").setUnlocalizedName("neckGold")
				.setCreativeTab(tab);
		neckdia = new ItemRpgInvArmor(ItemRpgInvArmor.NECKLACE, -1, "",
				"subaraki:jewels/NeckDia.png").setUnlocalizedName("neckDia")
				.setCreativeTab(tab);
		neckem = new ItemRpgInvArmor(ItemRpgInvArmor.NECKLACE, -1, "",
				"subaraki:jewels/NeckEm.png").setUnlocalizedName("neckEm")
				.setCreativeTab(tab);
		necklap = new ItemRpgInvArmor(ItemRpgInvArmor.NECKLACE, -1, "",
				"subaraki:jewels/NeckLap.png").setUnlocalizedName("neckLap")
				.setCreativeTab(tab);

		ringgold = new ItemRpgInvArmor(ItemRpgInvArmor.RING, -1, "", "")
		.setUnlocalizedName("ringGold").setCreativeTab(tab);
		ringdia = new ItemRpgInvArmor(ItemRpgInvArmor.RING, -1, "", "")
		.setUnlocalizedName("ringDia").setCreativeTab(tab);
		ringem = new ItemRpgInvArmor(ItemRpgInvArmor.RING, -1, "", "")
		.setUnlocalizedName("ringEm").setCreativeTab(tab);
		ringlap = new ItemRpgInvArmor(ItemRpgInvArmor.RING, -1, "", "")
		.setUnlocalizedName("ringLap").setCreativeTab(tab);

		glovesbutter = new ItemRpgInvArmor(ItemRpgInvArmor.GLOVES, -1, "",
				"subaraki:jewels/Glove.png").setUnlocalizedName("gloveGold")
				.setCreativeTab(tab);
		glovesdia = new ItemRpgInvArmor(ItemRpgInvArmor.GLOVES, -1, "",
				"subaraki:jewels/GloveDia.png").setUnlocalizedName("gloveDia")
				.setCreativeTab(tab);
		glovesem = new ItemRpgInvArmor(ItemRpgInvArmor.GLOVES, -1, "",
				"subaraki:jewels/GloveEm.png").setUnlocalizedName("gloveEm")
				.setCreativeTab(tab);
		gloveslap = new ItemRpgInvArmor(ItemRpgInvArmor.GLOVES, -1, "",
				"subaraki:jewels/GloveLap.png").setUnlocalizedName("gloveLap")
				.setCreativeTab(tab);

		cloak = new ItemRpgInvArmor(ItemRpgInvArmor.CLOAK, -1, "",
				"subaraki:capes/GreyCape.png").setFull3D()
				.setUnlocalizedName("capeGrey").setCreativeTab(tab);
		cloakI = new ItemRpgInvArmor(ItemRpgInvArmor.CLOAK, -1, "",
				"subaraki:capes/GreyCape.png").setFull3D()
				.setUnlocalizedName("i.capeGrey").setCreativeTab(tab);

		cloakRed = new ItemRpgInvArmor(ItemRpgInvArmor.CLOAK, -1, "",
				"subaraki:capes/RedCape.png").setFull3D()
				.setUnlocalizedName("r.capeGrey").setCreativeTab(tab);

		cloakYellow = new ItemRpgInvArmor(ItemRpgInvArmor.CLOAK, -1, "",
				"subaraki:capes/GoldCape.png").setFull3D()
				.setUnlocalizedName("y.capeGrey").setCreativeTab(tab);

		cloakGreen = new ItemRpgInvArmor(ItemRpgInvArmor.CLOAK, -1, "",
				"subaraki:capes/GreenCape.png").setFull3D()
				.setUnlocalizedName("g.capeGrey").setCreativeTab(tab);
		cloakBlue = new ItemRpgInvArmor(ItemRpgInvArmor.CLOAK, -1, "",
				"subaraki:capes/SkyCape.png").setFull3D()
				.setUnlocalizedName("b.capeGrey").setCreativeTab(tab);
		cloakSub = new ItemRpgInvArmor(ItemRpgInvArmor.CLOAK, -1, "",
				"subaraki:capes/BlaCape.png").setFull3D()
				.setUnlocalizedName("s.capeGrey").setCreativeTab(tab);

		colmold = (ItemMold)new ItemMold().setUnlocalizedName("moldNeck").setCreativeTab(
				tab);
		ringmold = (ItemMold)new ItemMold().setUnlocalizedName("moldRing")
				.setCreativeTab(tab);
		wantmold = new ItemMold().setUnlocalizedName("moldGlove")
				.setCreativeTab(tab);

		forgeBlock = new BlockForge(Material.rock).setHardness(5f)
				.setBlockName("MoldForge").setCreativeTab(tab);
		GameRegistry.registerBlock(forgeBlock, "MoldForge");

		allItems = new Item[] { neckgold, neckdia, neckem, necklap,
				glovesbutter, glovesdia, glovesem, gloveslap, ringgold,
				ringdia, ringem, ringlap, cloak, cloakI, cloakSub, cloakRed,
				cloakYellow, cloakGreen, cloakBlue, colmold, ringmold, wantmold };

		// DONE
		for (int i = 0; i < allItems.length; i++)
			if (allItems[i] != null) {
				String itemName = allItems[i].getUnlocalizedName().substring(
						allItems[i].getUnlocalizedName().indexOf(".") + 1);

				String itemNameCropped = itemName.substring(itemName
						.indexOf(".") + 1);

				allItems[i].setTextureName(RpgInventoryMod.name + ":"
						+ itemNameCropped);

				GameRegistry
				.registerItem(allItems[i],
						allItems[i].getUnlocalizedName(),
						RpgInventoryMod.name);

			} else
				System.out.println("Item is null !" + i);
	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent e) {
		// NetworkRegistry.INSTANCE.newChannel("RpgInv", new
		// RpgPacketHandler());

	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
		// TODO get commands back

		// CommandHandler commandManager = (CommandHandler) event.getServer()
		// .getCommandManager();
		// commandManager
		// .registerCommand(new rpgInventory.handlers.CommandPanel());
		// rpgInventory.handlers.CommandPanel.init();
	}

	private void setDonators() {
		try {
			URL url = new URL(
					"http://www.dnstechpack.com/user/subaraki/rpgcapes/donatorList.txt");
			BufferedReader in = new BufferedReader(new InputStreamReader(
					url.openStream()));
			String str;
			while ((str = in.readLine()) != null)
				donators.add(str);
			FMLLog.getLogger().info(
					"Added Dev-Donation rank for : " + donators.toString());

			in.close();
		} catch (MalformedURLException e) {
			FMLLog.getLogger().info(
					"[ERROR] Couldn't Handle Donators. Index 1.");
		} catch (IOException e) {
			FMLLog.getLogger().info(
					"[ERROR] Couldn't Handle Donators. Index 2.");
		}
	}
}