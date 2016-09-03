package tk.pminer.urbanization.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import tk.pminer.urbanization.items.ItemWrench;

public class BlockConcreteRoadStriped2 extends Block
{
	public BlockConcreteRoadStriped2(Material materialIn)
	{
		super(materialIn);
		setHardness(2.0F);
	}
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) 
	{
		ItemStack stack = playerIn.getHeldItem();
		if (stack != null)
		{
			if ((stack.getItem() instanceof ItemWrench))
			{
				worldIn.setBlockState(pos, tk.pminer.urbanization.init.UrbanizationBlocks.concrete_road_striped_1.getDefaultState());
				return true;
			}
		}
		return false;
	}
}
