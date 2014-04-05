package inuitMaterials.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockSodPlank extends ItemBlock {
	
	public static final int oakMetaNumber = 0;
	public static final int pineMetaNumber = 1;
	public static final int birchMetaNumber = 2;
	public static final int jungleMetaNumber = 3;
	public static final int acaciaMetaNumber = 4;
	public static final int darkOakMetaNumber = 5;
	
	protected final static String[] subNames = {"oak", "pine", "birch", "jungle", "acacia", "darkOak"};
	
	public ItemBlockSodPlank(Block block) {
		super(block);
		setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack stack) {
		return getUnlocalizedName() + "." + subNames[stack.getItemDamage()];
	}
	
	public int getMetadata(int par1) {
		return par1;
	}	
	
}
