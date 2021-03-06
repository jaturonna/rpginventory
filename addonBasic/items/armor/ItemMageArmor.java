package addonBasic.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import rpgInventory.utils.AbstractArmor;
import addonBasic.RpgBaseAddon;

public class ItemMageArmor extends AbstractArmor {

	public ItemMageArmor(ArmorMaterial arm, int par1, int par2) {
		super(par1, par2, arm);
	}

	@Override
	public String armorClassName() {
		return RpgBaseAddon.CLASSALCHEMIST;
	}

	@Override
	protected void get3DArmorModel(EntityLivingBase elb, ItemStack stack,
			int armorSlot) {
		if (stack != null) {
			if (stack.getItem() instanceof ItemArmor) {

				int type = ((ItemArmor) stack.getItem()).armorType;

				if ((type == 1) || (type == 3)) {
					armorModel = RpgBaseAddon.proxy.getArmorModel(1);
				} else {
					armorModel = RpgBaseAddon.proxy.getArmorModel(0);
				}
			}
		}
	}

	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot,
			String type) {
		if ((itemstack.getItem() == RpgBaseAddon.alchemisthood)
				|| (itemstack.getItem() == RpgBaseAddon.alchemistgown)
				|| (itemstack.getItem() == RpgBaseAddon.alchemistboots)) {
			return "armor:mage_1.png";
		}
		if (itemstack.getItem() == RpgBaseAddon.alchemistpants) {
			return "armor:mage_2.png";
		}
		return super.getArmorTexture(itemstack, entity, slot, type);
	}
}
