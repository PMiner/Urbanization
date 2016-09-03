package tk.pminer.urbanization.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import tk.pminer.urbanization.init.UrbanizationBlocks;
import tk.pminer.urbanization.init.UrbanizationItems;

public class BlockTomatoGrown extends Block
{
	public BlockTomatoGrown(Material materialIn)
	{
		super(materialIn);
		setHardness(0.0F);
		setStepSound(Block.soundTypeGrass);
		setTickRandomly(true);
	}
	@Override
	public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock) 
	{
		if ((worldIn.getBlockState(pos.down()) != Blocks.farmland.getStateFromMeta(0)) && (worldIn.getBlockState(pos.down()) != Blocks.farmland.getStateFromMeta(1)) && (worldIn.getBlockState(pos.down()) != Blocks.farmland.getStateFromMeta(2)) && (worldIn.getBlockState(pos.down()) != Blocks.farmland.getStateFromMeta(3)) && (worldIn.getBlockState(pos.down()) != Blocks.farmland.getStateFromMeta(4)) && (worldIn.getBlockState(pos.down()) != Blocks.farmland.getStateFromMeta(5)) && (worldIn.getBlockState(pos.down()) != Blocks.farmland.getStateFromMeta(6)) && (worldIn.getBlockState(pos.down()) != Blocks.farmland.getStateFromMeta(7)))
		{

			worldIn.destroyBlock(pos, true);
		}
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
		setBlockBounds(0.0F, -0.1F, 0.0F, 1.0F, 0.0F, 1.0F);
	}
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos) 
	{
		return new ItemStack(Item.getItemFromBlock(UrbanizationBlocks.tomato_1));
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return UrbanizationItems.tomato;
	}
}
