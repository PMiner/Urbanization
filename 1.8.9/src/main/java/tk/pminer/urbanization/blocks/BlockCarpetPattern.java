package tk.pminer.urbanization.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;

public class BlockCarpetPattern extends Block
{
	public BlockCarpetPattern(Material materialIn)
	{
		super(materialIn);
		setHardness(2.0F);
		setStepSound(Block.soundTypeCloth);
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
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess worldIn, BlockPos pos) 
	{
		setBlockBounds(0.0F, 0.06F, 0.0F, 1.0F, 0.0F, 1.0F);
	}
	@Override
	public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) 
	{
		return true;
	}
}