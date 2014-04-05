package inuitMaterials.config;

import inuitMaterials.lib.DefaultIDs;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ConfigLoader {
	
	public static Configuration config;
	
	public static void init(FMLPreInitializationEvent event) {
		
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		//Block IDs
		ConfigSettings.sodPlankID = config.get("Block", "Sod Plank ID", DefaultIDs.sodPlankID).getInt();
		
		
		//Item IDs
		ConfigSettings.spadeSodID = config.get("Item", "Sodding Spade ID", DefaultIDs.spadeSodID).getInt();
		ConfigSettings.iceBowID = config.get("Item", "Ukkungawok ID", DefaultIDs.iceBowID).getInt();
		ConfigSettings.iceArrowID = config.get("Item", "Frozen Arrow ID", DefaultIDs.iceArrowID).getInt();
		ConfigSettings.hideID = config.get("Item", "Hide ID", DefaultIDs.hideID).getInt();
		ConfigSettings.furHatID = config.get("Item", "Fur Hood ID", DefaultIDs.furHatID).getInt();
		ConfigSettings.furCoatID = config.get("Item", "Fur Coat ID", DefaultIDs.furCoatID).getInt();
		ConfigSettings.furPantsID = config.get("Item", "Fur Leggings ID", DefaultIDs.furPantsID).getInt();
		ConfigSettings.furBootsID = config.get("Item", "Fur Boots ID", DefaultIDs.furBootsID).getInt();
		ConfigSettings.carvingID = config.get("Item", "Carving ID", DefaultIDs.carvingID).getInt();
		
		
		//Durability
		ConfigSettings.spadeSodDurability = config.get("Durability", "Sodding Spade Durability", DefaultIDs.spadeSodDurability).getInt();
		ConfigSettings.iceBowDurability = config.get("Durability", "Ukkungawok Durability", DefaultIDs.iceBowDurability).getInt();
		
		config.save();
		
	}
	
}
