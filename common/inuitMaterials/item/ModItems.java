package inuitMaterials.item;

import inuitMaterials.config.ConfigSettings;
import net.minecraft.item.Item;

public class ModItems {
	
	//Instances
	public static Item itemSpadeSodding;
	
	public static void init() {
		
		itemSpadeSodding = new ItemSpadeSodding(ConfigSettings.spadeSodID).setUnlocalizedName("spadeSodding");
		
		
	}
	
	
}
