package inuitMaterials.entity;

import inuitMaterials.InuitMaterials;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntities {
	
	public static void load() {
		EntityRegistry.registerModEntity(EntityIceArrow.class, "iceArrow", 0, InuitMaterials.instance, 128, 3, true);
		EntityRegistry.registerModEntity(EntityHide.class, "hide", 1, InuitMaterials.instance, 128, 3, false);
	}
	
}
