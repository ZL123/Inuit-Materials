package inuitMaterials.item;

import inuitMaterials.InuitMaterials;
import inuitMaterials.block.BlockSodPlank;
import inuitMaterials.block.ModBlocks;
import inuitMaterials.config.ConfigSettings;
import inuitMaterials.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSpadeSodding extends ItemIM {

	public ItemSpadeSodding() {
		setMaxDamage(ConfigSettings.spadeSodDurability - 1);
		this.setCreativeTab(InuitMaterials.tabInuitMaterials);
		isDamageable();
		maxStackSize = 1;
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer entityplayer, World world, int x, int y, int z, int side, float hitVecX, float hitVecY, float hitVecZ) {
		if (this.getDamage(stack) < this.getMaxDamage()) {
			
			Block block = world.getBlock(x, y, z);
			int meta = world.getBlockMetadata(x, y, z);
			
			if (block == Blocks.planks) {
				if (entityplayer.inventory.hasItemStack(new ItemStack(Blocks.dirt)) || entityplayer.capabilities.isCreativeMode) {
					if (meta == BlockSodPlank.oakMetaNumber) {
						world.setBlock(x, y, z, ModBlocks.blockSodPlank, BlockSodPlank.oakMetaNumber, Reference.SET_BLOCK_FLAG);
						stack.damageItem(1, entityplayer);
						if (!entityplayer.capabilities.isCreativeMode) {
							entityplayer.inventory.consumeInventoryItem(ItemBlock.getItemFromBlock(Blocks.dirt));
						}
						return true;
					}
					else if (meta == BlockSodPlank.pineMetaNumber) {
						world.setBlock(x, y, z, ModBlocks.blockSodPlank, BlockSodPlank.pineMetaNumber, Reference.SET_BLOCK_FLAG);
						stack.damageItem(1, entityplayer);
						if (!entityplayer.capabilities.isCreativeMode) {
							entityplayer.inventory.consumeInventoryItem(ItemBlock.getItemFromBlock(Blocks.dirt));
						}
						return true;
					}
					else if (meta == BlockSodPlank.birchMetaNumber) {
						world.setBlock(x, y, z, ModBlocks.blockSodPlank, BlockSodPlank.birchMetaNumber, Reference.SET_BLOCK_FLAG);
						stack.damageItem(1, entityplayer);
						if (!entityplayer.capabilities.isCreativeMode) {
							entityplayer.inventory.consumeInventoryItem(ItemBlock.getItemFromBlock(Blocks.dirt));
						}
						return true;
					}
					else if (meta == BlockSodPlank.jungleMetaNumber) {
						world.setBlock(x, y, z, ModBlocks.blockSodPlank, BlockSodPlank.jungleMetaNumber, Reference.SET_BLOCK_FLAG);
						stack.damageItem(1, entityplayer);
						if (!entityplayer.capabilities.isCreativeMode) {
							entityplayer.inventory.consumeInventoryItem(ItemBlock.getItemFromBlock(Blocks.dirt));
						}
						return true;
					}
				}
			}
		}
		return false;
	}
	
	@Override
    public String getItemStackDisplayName(ItemStack stack) {
		return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
    	this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":soddingSpade");
    }

}
