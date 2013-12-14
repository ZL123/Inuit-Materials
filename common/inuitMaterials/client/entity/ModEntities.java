package inuitMaterials.client.entity;

import inuitMaterials.InuitMaterials;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntities {
	
	public static void load() {
		
		//registerModEntity
		EntityRegistry.registerModEntity(EntityIceArrow.class, "iceArrow", 0, InuitMaterials.instance, 128, 3, true);
		EntityRegistry.registerModEntity(EntityHide.class, "hide", 1, InuitMaterials.instance, 128, 3, false);
		EntityRegistry.registerModEntity(EntityCarving.class, "carving", 2, InuitMaterials.instance, 128, 3, true);
	
		//registerGlobalEntityID
		EntityRegistry.registerGlobalEntityID(EntityIceArrow.class, "iceArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerGlobalEntityID(EntityHide.class, "hide", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerGlobalEntityID(EntityCarving.class, "carving", EntityRegistry.findGlobalUniqueEntityId());
		
	
	}
	
}
