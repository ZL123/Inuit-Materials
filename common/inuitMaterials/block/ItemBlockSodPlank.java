package inuitMaterials.block;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockSodPlank extends ItemBlock {
	
	private final static String[] subNames = {"oak", "pine", "birch", "jungle"};
	
	public ItemBlockSodPlank(int id) {
		super(id);
		setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack stack) {
		return getUnlocalizedName() + "." + subNames[stack.getItemDamage()];
	}
	
	public int getMetadata(int par1) {
		return par1;
	}
	
}
