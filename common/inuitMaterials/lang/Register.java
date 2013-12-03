package inuitMaterials.lang;

import inuitMaterials.block.BlockSodPlank;
import inuitMaterials.block.ModBlocks;
import inuitMaterials.item.ModItems;
import inuitMaterials.lib.Reference;
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
		
		//Items
		LanguageRegistry.addName(ModItems.itemSpadeSodding, "Sodding Spade");
		LanguageRegistry.addName(ModItems.itemIceBow, "Ukkungawok");
		LanguageRegistry.addName(ModItems.itemIceArrow, "Frozen Arrow");
		LanguageRegistry.addName(ModItems.itemHide, "Hide (WIP)");
		LanguageRegistry.addName(ModItems.itemFurHat, "Fur Hat");
		LanguageRegistry.addName(ModItems.itemFurCoat, "Fur Coat");
		LanguageRegistry.addName(ModItems.itemFurPants, "Fur Pants");
		LanguageRegistry.addName(ModItems.itemFurBoots, "Fur Boots");
		
		//Entities
		LanguageRegistry.instance().addStringLocalization("entity." + Reference.MOD_ID + ".iceArrow.name", "Frozen Arrow");
		
		
	}
	
}
