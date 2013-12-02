package inuitMaterials.proxy;

import inuitMaterials.entity.EntityHide;
import inuitMaterials.entity.EntityIceArrow;
import inuitMaterials.entity.RenderHide;
import inuitMaterials.entity.RenderIceArrow;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void doRendering() {
		RenderingRegistry.registerEntityRenderingHandler(EntityIceArrow.class, new RenderIceArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityHide.class, new RenderHide());
	}
	
}
