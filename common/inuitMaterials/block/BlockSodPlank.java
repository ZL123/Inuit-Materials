package inuitMaterials.block;

import inuitMaterials.lib.Reference;

import java.util.List;

import net.minecraft.block.Block;
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
	protected IIcon IconOak;
	@SideOnly(Side.CLIENT)
	protected IIcon IconPine;
	@SideOnly(Side.CLIENT)
	protected IIcon IconBirch;
	@SideOnly(Side.CLIENT)
	protected IIcon IconJungle;
	@SideOnly(Side.CLIENT)
	protected IIcon IconAcacia;
	@SideOnly(Side.CLIENT)
	protected IIcon IconDarkOak;
	
	public static final int oakMetaNumber = 0;
	public static final int pineMetaNumber = 1;
	public static final int birchMetaNumber = 2;
	public static final int jungleMetaNumber = 3;
	public static final int acaciaMetaNumber = 4;
	public static final int darkOakMetaNumber = 5;
	
	protected static final String[] BLOCK_NAMES = {"Sod Oak Planks", "Sod Spruce Planks", "Sod Birch Planks", "Sod Jungle Planks", "Sod Acacia Planks", "Sod Dark Oak Planks"};
	
	public BlockSodPlank() {
		super(Material.wood);
		this.setHardness(2F);
		this.setResistance(15F);
		this.setBlockName("sodPlank");
		this.setStepSound(Block.soundTypeWood);
		this.setBlockTextureName("sod");
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register) {
		IconOak = register.registerIcon(Reference.MOD_ID + ":" + this.getTextureName() + "Oak");
		IconPine = register.registerIcon(Reference.MOD_ID + ":" + this.getTextureName() + "Pine");
		IconBirch = register.registerIcon(Reference.MOD_ID + ":" + this.getTextureName() + "Birch");
		IconJungle = register.registerIcon(Reference.MOD_ID + ":" + this.getTextureName() + "Jungle");
		IconAcacia = IconJungle;
		IconDarkOak = IconPine;
	}
	

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta) {
		switch(meta) {
		case oakMetaNumber: return IconOak;
		case pineMetaNumber: return IconPine;
		case birchMetaNumber: return IconBirch;
		case jungleMetaNumber: return IconJungle;
		case acaciaMetaNumber: return IconAcacia;
		case darkOakMetaNumber: return IconDarkOak;
		default: return IconOak;
		}
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
