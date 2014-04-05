package inuitMaterials.item;

import inuitMaterials.lib.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemIceArrow extends ItemIM {

	public ItemIceArrow() {
		super();
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
    	this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":iceArrow");
    }
	
	@SideOnly(Side.CLIENT)
	public String getItemDisplayName(ItemStack stack)
    {
        return EnumChatFormatting.BLUE + super.getItemStackDisplayName(stack); 
    }
	
}
