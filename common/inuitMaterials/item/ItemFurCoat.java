package inuitMaterials.item;

import inuitMaterials.InuitMaterials;
import inuitMaterials.lib.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFurCoat extends ItemArmor {

	public ItemFurCoat(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		this.setCreativeTab(InuitMaterials.tabInuitMaterials);
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
    	//this.itemIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getIconString());
		//use the code beneath until fel creates proper sprites
		if (this == ModItems.itemFurHat) this.itemIcon = register.registerIcon("chainmail_helmet");
		else if (this == ModItems.itemFurCoat) this.itemIcon = register.registerIcon("chainmail_chestplate");
		else if (this == ModItems.itemFurPants) this.itemIcon = register.registerIcon("chainmail_leggings");
		else if (this == ModItems.itemFurBoots) this.itemIcon = register.registerIcon("chainmail_boots");
		
    }
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == ModItems.itemFurHat || stack.getItem() == ModItems.itemFurCoat || stack.getItem() == ModItems.itemFurPants) {
			return Reference.MOD_ID + ":textures/models/furCoat_1.png";
		}
		
		if(stack.getItem() == ModItems.itemFurBoots) {
			return Reference.MOD_ID + ":textures/models/furCoat_2.png";
		}
		
		return null;
	}
}
