package inuitMaterials.item;

import inuitMaterials.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFurCoat extends ItemArmor {

	public ItemFurCoat(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
    	//this.itemIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getIconString());
		//use the code beneath until fel creates proper sprites
		if (this.itemID == ModItems.itemFurHat.itemID) this.itemIcon = register.registerIcon("chainmail_helmet");
		else if (this.itemID == ModItems.itemFurCoat.itemID) this.itemIcon = register.registerIcon("chainmail_chestplate");
		else if (this.itemID == ModItems.itemFurPants.itemID) this.itemIcon = register.registerIcon("chainmail_leggings");
		else if (this.itemID == ModItems.itemFurBoots.itemID) this.itemIcon = register.registerIcon("chainmail_boots");
		
    }
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if(stack.itemID == ModItems.itemFurHat.itemID || stack.itemID == ModItems.itemFurCoat.itemID || stack.itemID == ModItems.itemFurPants.itemID) {
			return Reference.MOD_ID + ":textures/models/furCoat_1.png";
		}
		
		if(stack.itemID == ModItems.itemFurBoots.itemID) {
			return Reference.MOD_ID + ":textures/models/furCoat_2.png";
		}
		else return null;
	}
}
