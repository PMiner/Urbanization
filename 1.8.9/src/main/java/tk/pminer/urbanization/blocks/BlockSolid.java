package tk.pminer.urbanization.blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class BlockSolid extends Block
{
	public BlockSolid(net.minecraft.block.material.Material materialIn)
	{
		super(materialIn);
		setHardness(2.0F);
		setStepSound(Block.soundTypeWood);
	}
}
