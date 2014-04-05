package inuitMaterials.entity;

import inuitMaterials.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityCarving extends Entity {

	public EntityCarving(World par1World) {
		super(par1World);
	}

	protected void entityInit() {
		this.dataWatcher.addObject(17, new Integer(0));
	}
	
	public int getWidthPixels() {
		return 16;
	}
	
	public int getHeightPixels() {
		return 16;
	}
	
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readFromNBT(nbttagcompound);
	}

	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeToNBT(nbttagcompound);
	}
	
    public void onBroken(Entity par1Entity) {
    	this.dropItem(ModItems.itemCarving, 1);
    	this.setDead();
    }

}
