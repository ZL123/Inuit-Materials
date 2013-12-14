package inuitMaterials.client.render;

import inuitMaterials.lib.Reference;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderCarving extends Render {

	@Override
	public void doRender(Entity entity, double x, double y, double z,
			float yaw, float partialTickTime) {
		super.doRenderShadowAndFire(entity, x, y, z, yaw, partialTickTime);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation(Reference.MOD_ID + ":textures/models/Carving.png");
	}

}
