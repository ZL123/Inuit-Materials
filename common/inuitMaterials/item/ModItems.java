package inuitMaterials.item;

import inuitMaterials.lib.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

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
	public static Item itemCarving;
	
	public static void init() {
		
		ArmorMaterial materialFur = EnumHelper.addArmorMaterial("Fur", 7, new int[] {2, 5, 3, 1}, 25);
		
		itemSpadeSodding = new ItemSpadeSodding().setUnlocalizedName("spadeSodding");
		itemIceBow = new ItemIceBow().setTextureName("ukkungawok").setUnlocalizedName("iceBow");
		itemIceArrow = new ItemIceArrow().setUnlocalizedName("iceArrow");
		itemHide = new ItemHide().setTextureName(Reference.MOD_ID + ":hide").setUnlocalizedName("hide");
		itemFurHat = new ItemFurCoat(materialFur, 0, 0).setTextureName("furHat").setUnlocalizedName("furHat");
		itemFurCoat = new ItemFurCoat(materialFur, 0, 1).setTextureName("furCoat").setUnlocalizedName("furCoat");
		itemFurPants = new ItemFurCoat(materialFur, 0, 2).setTextureName("furPants").setUnlocalizedName("furPants");
		itemFurBoots = new ItemFurCoat(materialFur, 0, 3).setTextureName("furBoots").setUnlocalizedName("furBoots");
		itemCarving = new ItemCarving().setTextureName(Reference.MOD_ID + ":carving").setUnlocalizedName("carving");
		
		register(itemSpadeSodding);
		register(itemIceBow);
		register(itemIceArrow);
		register(itemHide);
		register(itemFurHat);
		register(itemFurCoat);
		register(itemFurPants);
		register(itemFurBoots);
		register(itemCarving);
	}
	
	public static void register(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
	
	
}
