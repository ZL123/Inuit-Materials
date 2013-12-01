package inuitMaterials.item;

import cpw.mods.fml.common.registry.EntityRegistry;
import inuitMaterials.config.ConfigSettings;
import inuitMaterials.entity.EntityIceArrow;
import net.minecraft.item.Item;

public class ModItems {
	
	//Instances
	public static Item itemSpadeSodding;
	public static Item itemIceBow;
	public static Item itemIceArrow;
	
	public static void init() {
		
		itemSpadeSodding = new ItemSpadeSodding(ConfigSettings.spadeSodID).setUnlocalizedName("spadeSodding");
		itemIceBow = new ItemIceBow(ConfigSettings.iceBowID).setTextureName("ukkungawok").setUnlocalizedName("iceBow");
		itemIceArrow = new ItemIceArrow(ConfigSettings.iceArrowID).setUnlocalizedName("iceArrow");
		
		
		EntityRegistry.registerGlobalEntityID(EntityIceArrow.class, "iceArrow", EntityRegistry.findGlobalUniqueEntityId());
		
	}
	
	
}
