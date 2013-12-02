package inuitMaterials.item;

import inuitMaterials.config.ConfigSettings;
import inuitMaterials.entity.EntityHide;
import inuitMaterials.entity.EntityIceArrow;
import inuitMaterials.lib.Reference;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModItems {
	
	//Instances
	public static Item itemSpadeSodding;
	public static Item itemIceBow;
	public static Item itemIceArrow;
	public static Item itemHide;
	
	public static void init() {
		
		itemSpadeSodding = new ItemSpadeSodding(ConfigSettings.spadeSodID).setUnlocalizedName("spadeSodding");
		itemIceBow = new ItemIceBow(ConfigSettings.iceBowID).setTextureName("ukkungawok").setUnlocalizedName("iceBow");
		itemIceArrow = new ItemIceArrow(ConfigSettings.iceArrowID).setUnlocalizedName("iceArrow");
		itemHide = new ItemHide(ConfigSettings.hideID).setTextureName(Reference.MOD_ID + ":hide").setUnlocalizedName("hide");
		
		
		EntityRegistry.registerGlobalEntityID(EntityIceArrow.class, "iceArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerGlobalEntityID(EntityHide.class, "hide", EntityRegistry.findGlobalUniqueEntityId());
		
	}
	
	
}
