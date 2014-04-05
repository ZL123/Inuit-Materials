package inuitMaterials.block;

import inuitMaterials.lib.Reference;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSodPlank extends BlockIM {
	
	@SideOnly(Side.CLIENT)
	private IIcon IconOak;
	@SideOnly(Side.CLIENT)
	private IIcon IconPine;
	@SideOnly(Side.CLIENT)
	private IIcon IconBirch;
	@SideOnly(Side.CLIENT)
	private IIcon IconJungle;
	
	public static final int oakMetaNumber = 0;
	public static final int pineMetaNumber = 1;
	public static final int birchMetaNumber = 2;
	public static final int jungleMetaNumber = 3;
	
	public static final String[] BLOCK_NAMES = {"Sod Oak Planks", "Sod Spruce Planks", "Sod Birch Planks", "Sod Jungle Planks"};
	
	
	public BlockSodPlank() {
		super(Material.wood);
		this.setHardness(2F);
		this.setResistance(15F);
		this.setBlockTextureName("sod");
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIIcon(int side, int meta) {
		switch(meta) {
		case oakMetaNumber: return IconOak;
		case pineMetaNumber: return IconPine;
		case birchMetaNumber: return IconBirch;
		case jungleMetaNumber: return IconJungle;
		default: return IconOak;
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register) {
		IconOak = register.registerIcon(Reference.MOD_ID + ":" + this.getTextureName() + "Oak");
		IconPine = register.registerIcon(Reference.MOD_ID + ":" + this.getTextureName() + "Pine");
		IconBirch = register.registerIcon(Reference.MOD_ID + ":" + this.getTextureName() + "Birch");
		IconJungle = register.registerIcon(Reference.MOD_ID + ":" + this.getTextureName() + "Jungle");
	}
	
	@Override
	public int damageDropped(int meta) {
		return meta;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(Item item, CreativeTabs tabs, List list)
	{
		for(int i = 0; i < BLOCK_NAMES.length; i++)
		{
			list.add(new ItemStack(item, 1, i));
		}
	}
	
}
