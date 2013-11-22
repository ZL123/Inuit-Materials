package inuitMaterials.block;

import cpw.mods.fml.common.registry.GameRegistry;
import inuitMaterials.config.ConfigSettings;
import net.minecraft.block.Block;

public class ModBlocks {
	
	//Instances
	public static Block blockSodPlank;
	
	public static void init() {
		
		//Set stuff
		blockSodPlank = new BlockSodPlank(ConfigSettings.sodPlankID).setUnlocalizedName("sodPlank");
		
		//Register stuff
		GameRegistry.registerBlock(blockSodPlank, ItemBlockSodPlank.class, "sodPlanks");
		
		//Set harvest level
		
	}
	
	
}
