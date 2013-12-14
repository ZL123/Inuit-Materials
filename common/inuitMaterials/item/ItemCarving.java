package inuitMaterials.item;

import inuitMaterials.client.entity.EntityCarving;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCarving extends Item {
	
	public ItemCarving(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		if (world.isRemote) {
			return true;
		} else {
			EntityCarving carving = new EntityCarving(world);
			Entity entity = EntityList.createEntityByID(carving.entityId, world);
			
			if (entity != null) {
				entity.setLocationAndAngles(x, y, z, 0, 0);
			}
		
		return true;
		}
    }

}
