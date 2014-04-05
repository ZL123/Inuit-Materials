package inuitMaterials.item;

import inuitMaterials.InuitMaterials;
import inuitMaterials.entity.EntityHide;
import net.minecraft.entity.EntityHanging;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHangingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

public class ItemHide extends ItemHangingEntity {

	public ItemHide() {
		super(EntityHide.class);
		this.setCreativeTab(InuitMaterials.tabInuitMaterials);
	}
	
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par7 == 0 || par7 == 1) {
            return false;
        }
        else {
            int i1 = Direction.facingToDirection[par7];
            EntityHanging entityhanging = new EntityHide(par3World, par4, par5, par6, i1);

            if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
            {
                return false;
            }
            else
            {
                if (entityhanging != null && entityhanging.onValidSurface())
                {
                    if (!par3World.isRemote)
                    {
                        par3World.spawnEntityInWorld(entityhanging);
                    }

                    --par1ItemStack.stackSize;
                }

                return true;
            }
        }
    }

}
