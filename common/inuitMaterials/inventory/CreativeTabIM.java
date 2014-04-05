package inuitMaterials.inventory;

import inuitMaterials.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabIM extends CreativeTabs {

	public CreativeTabIM(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.itemIceBow;
	}
	
}
