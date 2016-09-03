package tk.pminer.urbanization.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;




public class BlockTrans extends Block
{
	public BlockTrans(Material materialIn)
	{
		super(materialIn);
		setHardness(2.0F);
		setStepSound(Block.soundTypeGlass);
	}
	@Override
	public boolean isOpaqueCube() 
	{
		return false;
	}
	@Override
	public EnumWorldBlockLayer getBlockLayer() 
	{
		return EnumWorldBlockLayer.CUTOUT;
	}
	@Override
	public boolean isFullCube() 
	{
		return false;
	}
}
