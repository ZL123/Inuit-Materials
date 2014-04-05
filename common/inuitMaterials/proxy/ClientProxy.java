package inuitMaterials.proxy;

import inuitMaterials.client.render.RenderHide;
import inuitMaterials.client.render.RenderIceArrow;
import inuitMaterials.entity.EntityHide;
import inuitMaterials.entity.EntityIceArrow;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void doRendering() {
		RenderingRegistry.registerEntityRenderingHandler(EntityIceArrow.class, new RenderIceArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityHide.class, new RenderHide());
	}
	
}
