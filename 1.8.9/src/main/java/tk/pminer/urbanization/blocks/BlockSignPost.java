package tk.pminer.urbanization.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import tk.pminer.urbanization.init.UrbanizationBlocks;

public class BlockSignPost
extends Block
{
	public BlockSignPost(Material materialIn)
	{
		super(materialIn);
		setResistance(2.0F);
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
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos, EntityPlayer player) 
	{
		if(world.getBlockState(pos.up()) instanceof BlockStopSign)
		{
			return new ItemStack(Item.getItemFromBlock(UrbanizationBlocks.stop_sign_item));
		}
		else if(world.getBlockState(pos.up()) instanceof BlockStopSign)
		{
			return new ItemStack(Item.getItemFromBlock(UrbanizationBlocks.go_sign_item));
		}
		return new ItemStack(Item.getItemFromBlock(UrbanizationBlocks.sign_post));
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return null;
	}
	@Override
	public void onBlockDestroyedByPlayer(World p_onBlockDestroyedByPlayer_1_, BlockPos p_onBlockDestroyedByPlayer_2_, IBlockState p_onBlockDestroyedByPlayer_3_) 
	{
		p_onBlockDestroyedByPlayer_1_.destroyBlock(p_onBlockDestroyedByPlayer_2_.up(), true);
	}
	@Override
	public boolean canPlaceBlockAt(World p_canPlaceBlockAt_1_, BlockPos p_canPlaceBlockAt_2_) 
	{
		return false;
	}
}
