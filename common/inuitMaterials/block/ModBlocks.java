package inuitMaterials.block;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	//Instances
	public static Block blockSodPlank;
	
	public static void init() {
		
		//Set stuff
		blockSodPlank = new BlockSodPlank().setBlockName("sodPlank");
		
		//Register stuff
		GameRegistry.registerBlock(blockSodPlank, ItemBlockSodPlank.class, "sodPlanks");
		
		//Set harvest level
		
	}
	
	
}
