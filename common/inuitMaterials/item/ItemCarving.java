package inuitMaterials.item;

import inuitMaterials.InuitMaterials;
import inuitMaterials.entity.EntityCarving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCarving extends Item {
	
	public ItemCarving() {
		this.setCreativeTab(InuitMaterials.tabInuitMaterials);
	}
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		if (world.isRemote) {
			return true;
		} else {
			EntityCarving carving = new EntityCarving(world);
			Entity entity = EntityList.createEntityByID(carving.getEntityId(), world);
			
			if (entity != null) {
				entity.setLocationAndAngles(x, y, z, 0, 0);
			}
		
		return true;
		}
    }

}
