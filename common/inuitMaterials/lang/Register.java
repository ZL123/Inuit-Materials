package inuitMaterials.lang;

import inuitMaterials.block.BlockSodPlank;
import inuitMaterials.block.ModBlocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Register {
	
	public static void load() {
		
		//Blocks
		
		
		//Metadata Blocks
		LanguageRegistry.addName(new ItemStack(ModBlocks.blockSodPlank, 1, BlockSodPlank.oakMetaNumber), BlockSodPlank.BLOCK_NAMES[BlockSodPlank.oakMetaNumber]);
		LanguageRegistry.addName(new ItemStack(ModBlocks.blockSodPlank, 1, BlockSodPlank.pineMetaNumber), BlockSodPlank.BLOCK_NAMES[BlockSodPlank.pineMetaNumber]);
		LanguageRegistry.addName(new ItemStack(ModBlocks.blockSodPlank, 1, BlockSodPlank.birchMetaNumber), BlockSodPlank.BLOCK_NAMES[BlockSodPlank.birchMetaNumber]);
		LanguageRegistry.addName(new ItemStack(ModBlocks.blockSodPlank, 1, BlockSodPlank.jungleMetaNumber), BlockSodPlank.BLOCK_NAMES[BlockSodPlank.jungleMetaNumber]);
	
	}
	
}
