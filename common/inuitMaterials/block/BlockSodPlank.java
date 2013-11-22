package inuitMaterials.block;

import inuitMaterials.lib.Reference;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSodPlank extends BlockIM {
	
	@SideOnly(Side.CLIENT)
	private Icon iconOak;
	@SideOnly(Side.CLIENT)
	private Icon iconPine;
	@SideOnly(Side.CLIENT)
	private Icon iconBirch;
	@SideOnly(Side.CLIENT)
	private Icon iconJungle;
	
	public static final int oakMetaNumber = 0;
	public static final int pineMetaNumber = 1;
	public static final int birchMetaNumber = 2;
	public static final int jungleMetaNumber = 3;
	
	public static final String[] BLOCK_NAMES = {"Sod Oak Planks", "Sod Spruce Planks", "Sod Birch Planks", "Sod Jungle Planks"};
	
	
	public BlockSodPlank(int id) {
		super(id, Material.wood);
		this.setHardness(2F);
		this.setResistance(15F);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		switch(meta)
		{
		case oakMetaNumber: return iconOak;
		case pineMetaNumber: return iconPine;
		case birchMetaNumber: return iconBirch;
		case jungleMetaNumber: return iconJungle;
		default: return iconOak;
		}
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		iconOak = register.registerIcon(Reference.MOD_ID + ":" + "sodOak");
		iconPine = register.registerIcon(Reference.MOD_ID + ":" + "sodPine");
		iconBirch = register.registerIcon(Reference.MOD_ID + ":" + "sodBirch");
		iconJungle = register.registerIcon(Reference.MOD_ID + ":" + "sodJungle");
	}
	
	@Override
	public int damageDropped(int meta) {
		return meta;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int id, CreativeTabs tabs, List list)
	{
		for(int i = 0; i < BLOCK_NAMES.length; i++)
		{
			list.add(new ItemStack(id, 1, i));
		}
	}
	
}
