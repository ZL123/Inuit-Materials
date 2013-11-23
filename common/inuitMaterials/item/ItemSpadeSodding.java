package inuitMaterials.item;

import inuitMaterials.block.BlockSodPlank;
import inuitMaterials.block.ModBlocks;
import inuitMaterials.config.ConfigSettings;
import inuitMaterials.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSpadeSodding extends ItemIM {

	public ItemSpadeSodding(int par1) {
		super(par1);
		setMaxDamage(ConfigSettings.spadeSodDurability - 1);
		this.setCreativeTab(CreativeTabs.tabTools);
		isDamageable();
		maxStackSize = 1;
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer entityplayer, World world, int x, int y, int z, int side, float hitVecX, float hitVecY, float hitVecZ) {
		if (this.getDamage(stack) < this.getMaxDamage()) {
			
			int id = world.getBlockId(x, y, z);
			int meta = world.getBlockMetadata(x, y, z);
			
			if (id == Block.planks.blockID) {
				
				if (meta == BlockSodPlank.oakMetaNumber) {
					world.setBlock(x, y, z, ModBlocks.blockSodPlank.blockID, BlockSodPlank.oakMetaNumber, Reference.SET_BLOCK_FLAG);
					stack.damageItem(1, entityplayer);
					return true;
				}
				else if (meta == BlockSodPlank.pineMetaNumber) {
					world.setBlock(x, y, z, ModBlocks.blockSodPlank.blockID, BlockSodPlank.pineMetaNumber, Reference.SET_BLOCK_FLAG);
					stack.damageItem(1, entityplayer);
					return true;
				}
				else if (meta == BlockSodPlank.birchMetaNumber) {
					world.setBlock(x, y, z, ModBlocks.blockSodPlank.blockID, BlockSodPlank.birchMetaNumber, Reference.SET_BLOCK_FLAG);
					stack.damageItem(1, entityplayer);
					return true;
				}
				else if (meta == BlockSodPlank.jungleMetaNumber) {
					world.setBlock(x, y, z, ModBlocks.blockSodPlank.blockID, BlockSodPlank.jungleMetaNumber, Reference.SET_BLOCK_FLAG);
					stack.damageItem(1, entityplayer);
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
    public String getItemDisplayName(ItemStack stack) {
		return EnumChatFormatting.YELLOW + super.getItemDisplayName(stack);
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
    	this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":soddingSpade");
    }

}
