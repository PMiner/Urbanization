package tk.pminer.urbanization.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import tk.pminer.urbanization.init.UrbanizationBlocks;
import tk.pminer.urbanization.items.ItemWrench;

public class BlockStopSign extends Block
{
	public BlockStopSign(Material materialIn)
	{
		super(materialIn);
		setHardness(2.0F);
		setResistance(5.0F);
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
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return Item.getItemFromBlock(UrbanizationBlocks.stop_sign_item);
	}
	@Override
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) 
	{
		worldIn.destroyBlock(pos.down(), false);
	}
	@Override
	public boolean isReplaceable(World worldIn, BlockPos pos) 
	{
		return false;
	}
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) 
	{
		ItemStack stack = playerIn.getHeldItem();
		if(stack != null)
		{
			if(stack.getItem() instanceof ItemWrench);
			{
				if(worldIn.getBlockState(pos) == UrbanizationBlocks.stop_sign_1.getDefaultState())
				{
					worldIn.setBlockState(pos, UrbanizationBlocks.stop_sign_2.getDefaultState());
					return true;
				}
				else if(worldIn.getBlockState(pos) == UrbanizationBlocks.stop_sign_2.getDefaultState());
				{
					worldIn.setBlockState(pos, UrbanizationBlocks.stop_sign_1.getDefaultState());
				}
			}
		}
		return false;
	}
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos, EntityPlayer player) 
	{
		return new ItemStack(Item.getItemFromBlock(UrbanizationBlocks.stop_sign_item));
	}
}
