package inuitMaterials.item;

import inuitMaterials.config.ConfigSettings;
import inuitMaterials.entity.EntityHide;
import inuitMaterials.entity.EntityIceArrow;
import inuitMaterials.lib.Reference;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModItems {
	
	//Instances
	public static Item itemSpadeSodding;
	public static Item itemIceBow;
	public static Item itemIceArrow;
	public static Item itemHide;
	public static Item itemFurHat;
	public static Item itemFurCoat;
	public static Item itemFurPants;
	public static Item itemFurBoots;
	
	public static void init() {
		
		EnumArmorMaterial materialFur = EnumHelper.addArmorMaterial("Fur", 7, new int[] {2, 5, 3, 1}, 25);
		
		itemSpadeSodding = new ItemSpadeSodding(ConfigSettings.spadeSodID).setUnlocalizedName("spadeSodding");
		itemIceBow = new ItemIceBow(ConfigSettings.iceBowID).setTextureName("ukkungawok").setUnlocalizedName("iceBow");
		itemIceArrow = new ItemIceArrow(ConfigSettings.iceArrowID).setUnlocalizedName("iceArrow");
		itemHide = new ItemHide(ConfigSettings.hideID).setTextureName(Reference.MOD_ID + ":hide").setUnlocalizedName("hide");
		itemFurHat = new ItemFurCoat(ConfigSettings.furHatID, materialFur, 0, 0).setTextureName("furHat").setUnlocalizedName("furHat");
		itemFurCoat = new ItemFurCoat(ConfigSettings.furCoatID, materialFur, 0, 1).setTextureName("furCoat").setUnlocalizedName("furCoat");
		itemFurPants = new ItemFurCoat(ConfigSettings.furPantsID, materialFur, 0, 2).setTextureName("furPants").setUnlocalizedName("furPants");
		itemFurBoots = new ItemFurCoat(ConfigSettings.furBootsID, materialFur, 0, 3).setTextureName("furBoots").setUnlocalizedName("furBoots");
		
		EntityRegistry.registerGlobalEntityID(EntityIceArrow.class, "iceArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerGlobalEntityID(EntityHide.class, "hide", EntityRegistry.findGlobalUniqueEntityId());
		
	}
	
	
}
