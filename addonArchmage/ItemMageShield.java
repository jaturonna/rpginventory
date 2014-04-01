package addonArchmage;

import rpgInventory.item.armor.ItemRpgInvArmor;
import rpgInventory.models.MainShield;
import addonBasic.models.item.bookMage;

public class ItemMageShield extends ItemRpgInvArmor {

	private bookMage book = new bookMage();

	public ItemMageShield(int par4, int maxDamage, String name,
			String resourcelocation) {
		super(par4, maxDamage, name, resourcelocation);
	}

	@Override
	public String boundArmorClass() {
		return RpgArchmageAddon.CLASSARCHMAGE;
	}

	@Override
	public MainShield getShieldModel() {
		if (this.equals(RpgArchmageAddon.archBook))
			return book;
		return super.getShieldModel();
	}

	@Override
	public String shieldClass() {
		return RpgArchmageAddon.CLASSARCHMAGESHIELD;
	}

	@Override
	public String getMantleTexture() {
		return "subaraki:jewels/magemantle.png";
	}
}