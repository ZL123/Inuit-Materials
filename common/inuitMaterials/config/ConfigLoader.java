package inuitMaterials.config;

import inuitMaterials.lib.DefaultIDs;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class ConfigLoader {
	
	public static Configuration config;
	
	public static void init(FMLPreInitializationEvent event) {
		
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		//Block IDs
		ConfigSettings.sodPlankID = config.getBlock("Sod Plank ID", DefaultIDs.sodPlankID).getInt();
		
		
		//Item IDs
		ConfigSettings.spadeSodID = config.getItem("Sodding Spade ID", DefaultIDs.spadeSodID).getInt();
		ConfigSettings.iceBowID = config.getItem("Ukkungawok ID", DefaultIDs.iceBowID).getInt();
		ConfigSettings.iceArrowID = config.getItem("Frozen Arrow ID", DefaultIDs.iceArrowID).getInt();
		ConfigSettings.hideID = config.getItem("Hide ID", DefaultIDs.hideID).getInt();
		ConfigSettings.furHatID = config.getItem("Fur Hat ID", DefaultIDs.furHatID).getInt();
		ConfigSettings.furCoatID = config.getItem("Fur Coat ID", DefaultIDs.furCoatID).getInt();
		ConfigSettings.furPantsID = config.getItem("Fur Pants ID", DefaultIDs.furPantsID).getInt();
		ConfigSettings.furBootsID = config.getItem("Fur Boots ID", DefaultIDs.furBootsID).getInt();
		
		
		//Durability
		ConfigSettings.spadeSodDurability = config.get("Durability", "Sodding Spade Durability", DefaultIDs.spadeSodDurability).getInt();
		ConfigSettings.iceBowDurability = config.get("Durability", "Ukkungawok Durability", DefaultIDs.iceBowDurability).getInt();
		
		
	}
	
}
