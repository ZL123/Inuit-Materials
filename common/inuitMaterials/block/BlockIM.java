package inuitMaterials.block;

import inuitMaterials.InuitMaterials;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockIM extends Block {

	public BlockIM(Material material) {
		super(material);
		this.setCreativeTab(InuitMaterials.tabInuitMaterials);
	}

}
