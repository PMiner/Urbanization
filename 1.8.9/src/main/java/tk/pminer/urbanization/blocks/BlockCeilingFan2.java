package tk.pminer.urbanization.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import tk.pminer.urbanization.init.UrbanizationBlocks;

public class BlockCeilingFan2 extends Block
{
	public static Integer counter = 0;
	public BlockCeilingFan2(Material materialIn) 
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
	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) 
	{
		worldIn.scheduleBlockUpdate(pos, UrbanizationBlocks.ceiling_fan_2, 5, 0);
		return super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer);
	}
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) 
	{
		worldIn.setBlockState(pos, UrbanizationBlocks.ceiling_fan_1.getDefaultState());
		worldIn.scheduleBlockUpdate(pos, UrbanizationBlocks.ceiling_fan_1, 5, 1);
	}
}
