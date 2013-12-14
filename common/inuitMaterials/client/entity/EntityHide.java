package inuitMaterials.client.entity;

import inuitMaterials.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityPainting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityHide extends EntityPainting {

	public EntityHide(World world) {
		super(world);
	}
	
	public EntityHide(World world, int x, int y, int z, int side) {
		super(world, x, y, z, side);
		this.setDirection(side);
	}

	@Override
	public int getWidthPixels() {
		return 32;
	}

	@Override
	public int getHeightPixels() {
		return 32;
	}

	@Override
	public void onBroken(Entity entity) {
		if (entity instanceof EntityPlayer) {
            EntityPlayer entityplayer = (EntityPlayer)entity;
            if (entityplayer.capabilities.isCreativeMode) {
                return;
            }
        }
        this.entityDropItem(new ItemStack(ModItems.itemHide), 0.0F);
	}

}
