package tk.pminer.urbanization.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import scala.Console;
import tk.pminer.urbanization.init.UrbanizationBlocks;

public class BlockGoSignItem extends Block
{
	public BlockGoSignItem(Material materialIn)
	{
		super(materialIn);
	}
	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) 
	{
		if(placer.getHorizontalFacing() == EnumFacing.WEST||facing == EnumFacing.EAST)
		{
			worldIn.setBlockState(pos.up(), UrbanizationBlocks.go_sign_2.getDefaultState());
		}
		else if(placer.getHorizontalFacing() == EnumFacing.NORTH||facing == EnumFacing.SOUTH)
		{
			worldIn.setBlockState(pos.up(), UrbanizationBlocks.go_sign_1.getDefaultState());
		}
		Console.println(placer.getHorizontalFacing());
		return UrbanizationBlocks.sign_post.getDefaultState();
	}
}
