package rpgInventory.block.te;

import java.util.Iterator;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import rpgInventory.block.te.slot.GoldBlockSlot;
import rpgInventory.block.te.slot.MoldSlot;
import rpgInventory.block.te.slot.SlotFuel;
import rpgInventory.block.te.slot.SlotMineral;
import rpgInventory.block.te.slot.SlotMold;

public class MoldContainer extends Container {
	private TEMold temold;
	private int lastGoldOvenCookTime;
	private int lastGoldOvenBurnTime;
	private int lastGoldOvenItemBurnTime;

	public MoldContainer(InventoryPlayer par1InventoryPlayer,
			TEMold par2TileEntityGoldOven) {
		lastGoldOvenCookTime = 0;
		lastGoldOvenBurnTime = 0;
		lastGoldOvenItemBurnTime = 0;
		temold = par2TileEntityGoldOven;
		this.addSlotToContainer(new SlotFuel(par2TileEntityGoldOven, 0, 48, 72)); // fuel
		this.addSlotToContainer(new GoldBlockSlot(par2TileEntityGoldOven, 1,
				48, 32)); // gold block
		this.addSlotToContainer(new MoldSlot(par2TileEntityGoldOven, 2, 96, 51)); // mold
		this.addSlotToContainer(new SlotMineral(par2TileEntityGoldOven, 3, 96,32)); // mineral

		this.addSlotToContainer(new SlotMold(par1InventoryPlayer.player,par2TileEntityGoldOven, 4, 136, 40));

		// 5-32
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 9; k++) {
				addSlotToContainer(new Slot(par1InventoryPlayer, k + (i * 9)+ 9, 8 + (k * 18), 84 + (i * 18) + 18));
			}
		}

		// 32-41
		for (int j = 0; j < 9; j++) {
			addSlotToContainer(new Slot(par1InventoryPlayer, j, 8 + (j * 18),142 + 18));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer par1EntityPlayer) {
		return temold.isUseableByPlayer(par1EntityPlayer);
	}

	/**
	 * Updates crafting matrix; called from onCraftMatrixChanged. Args: none
	 */
	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		Iterator var1 = this.crafters.iterator();
		while (var1.hasNext()) {
			ICrafting var2 = (ICrafting) var1.next();
			if (this.lastGoldOvenCookTime != this.temold.goldCookTime) {
				var2.sendProgressBarUpdate(this, 0, this.temold.goldCookTime);
			}
			if (this.lastGoldOvenBurnTime != this.temold.goldBurnTime) {
				var2.sendProgressBarUpdate(this, 1, this.temold.goldBurnTime);
			}
			if (this.lastGoldOvenItemBurnTime != this.temold.goldItemBurnTime) {
				var2.sendProgressBarUpdate(this, 2,
						this.temold.goldItemBurnTime);
			}
		}
		this.lastGoldOvenCookTime = this.temold.goldCookTime;
		this.lastGoldOvenBurnTime = this.temold.goldBurnTime;
		this.lastGoldOvenItemBurnTime = this.temold.goldItemBurnTime;
		temold.updateEntity();
	}

	/**
	 * Called to transfer a stack from one inventory to the other eg. when shift
	 * clicking.
	 */
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slotnumber) {
		super.transferStackInSlot(player, slotnumber);

		//TODO transfer clicking

		return null;
	}

	@Override
	public void updateProgressBar(int par1, int par2) {
		if (par1 == 0) {
			temold.goldCookTime = par2;
		}

		if (par1 == 1) {
			temold.goldBurnTime = par2;
		}

		if (par1 == 2) {
			temold.goldItemBurnTime = par2;
		}
	}
}