package tk.pminer.urbanization.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import tk.pminer.urbanization.init.UrbanizationBlocks;

public class BlockStopSignItem extends Block
{
	public BlockStopSignItem(Material materialIn)
	{
		super(materialIn);
	}
	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) 
	{
		if(facing == EnumFacing.WEST||facing == EnumFacing.EAST)
		{
			worldIn.setBlockState(pos.up(), UrbanizationBlocks.stop_sign_2.getDefaultState());
		}
		else if(facing == EnumFacing.NORTH||facing == EnumFacing.SOUTH)
		{
			worldIn.setBlockState(pos.up(), UrbanizationBlocks.stop_sign_1.getDefaultState());
		}
		return UrbanizationBlocks.sign_post.getDefaultState();
	}
}
