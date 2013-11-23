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
		
		
		//Other Numbers
		ConfigSettings.spadeSodDurability = config.get("Durability", "Sodding Spade Durability", 512).getInt();
		
	}
	
}
