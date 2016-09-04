package tk.pminer.urbanization.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import tk.pminer.urbanization.Urbanization;
import tk.pminer.urbanization.init.UrbanizationBlocks;

public class BlockCarpetPattern extends Block
{
	public BlockCarpetPattern(Material materialIn)
	{
		super(materialIn);
		setHardness(2.0F);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
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
	public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) 
	{
		return true;
	}
	@Override
	public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) 
	{
		return 150;
	}
	@Override
	public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock) 
	{
		if((worldIn.getBlockState(pos.down()) == Blocks.air.getDefaultState()))
		{
			worldIn.destroyBlock(pos, true);
			if(worldIn.getBlockState(pos.up()) == UrbanizationBlocks.carpet_checkered.getDefaultState())
			{
				worldIn.destroyBlock(pos.up(), true);
			}
		}
	}
}