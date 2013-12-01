package inuitMaterials.item;

import inuitMaterials.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemIceArrow extends Item {

	public ItemIceArrow(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
    	this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":iceArrow");
    }
	
	@SideOnly(Side.CLIENT)
	public String getItemDisplayName(ItemStack stack)
    {
        return EnumChatFormatting.BLUE + super.getItemDisplayName(stack); 
    }
	
}
