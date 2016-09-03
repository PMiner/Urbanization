package tk.pminer.urbanization.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import tk.pminer.urbanization.init.UrbanizationBlocks;
import tk.pminer.urbanization.init.UrbanizationItems;

public class BlockPineapple extends Block
{
	public BlockPineapple(Material materialIn)
	{
		super(materialIn);
		setHardness(0.0F);
		setStepSound(Block.soundTypeGrass);
		setTickRandomly(true);
	}
	@Override
	public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock) 
	{
		int hasFarmland = 0;
		for (int i = 0; i <= 7; i++) 
		{
			if(worldIn.getBlockState(pos.down()) == Blocks.farmland.getStateFromMeta(i))
			{
				hasFarmland++;
			}
		}
		if(hasFarmland > 0){}
		else
		{
			Random rand = new Random();
			boolean drop = true;
			int  n = rand.nextInt(5) + 1;
			if(n == 1)
			{
				drop = false;
			}
			else
			{
				drop = true;
			}
			worldIn.destroyBlock(pos, drop);
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
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) 
	{
		int hasFarmland = 0;
		for (int i = 0; i <= 7; i++) 
		{
			if(worldIn.getBlockState(pos.down()) == Blocks.farmland.getStateFromMeta(i))
			{
				hasFarmland++;
			}

		}
		if(hasFarmland > 0)
		{
			return true;
		} 
		return false;
	}
	@Override
	public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) 
	{
		float light = worldIn.getLightBrightness(pos);
		if(light >= .6)
		{
			if (worldIn.getBlockState(pos) == UrbanizationBlocks.pineapple_1.getDefaultState())
			{
				worldIn.setBlockState(pos, UrbanizationBlocks.pineapple_2.getDefaultState());
			}
			else if (worldIn.getBlockState(pos) == UrbanizationBlocks.pineapple_2.getDefaultState())
			{
				worldIn.setBlockState(pos, UrbanizationBlocks.pineapple_3.getDefaultState());
			}
			else if (worldIn.getBlockState(pos) == UrbanizationBlocks.pineapple_3.getDefaultState())
			{
				worldIn.setBlockState(pos, UrbanizationBlocks.pineapple_4.getDefaultState());
			}
			else if (worldIn.getBlockState(pos) == UrbanizationBlocks.pineapple_4.getDefaultState())
			{
				worldIn.setBlockState(pos, UrbanizationBlocks.pineapple_5.getDefaultState());
			}
		}
	}
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess worldIn, BlockPos pos) 
	{
		setBlockBounds(0.0F, -0.1F, 0.0F, 1.0F, 0.0F, 1.0F);
	}
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos) 
	{
		return new ItemStack(Item.getItemFromBlock(UrbanizationBlocks.pineapple_1));
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return Item.getItemFromBlock(UrbanizationBlocks.pineapple_1);
	}
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumFacing side, float hitX, float hitY, float hitZ) 
	{
		ItemStack playerStack = playerIn.getHeldItem();
		if (playerStack != null)
		{
			Item playerItem = playerIn.getHeldItem().getItem();
			if (playerItem == net.minecraft.init.Items.dye)
			{
				if (!worldIn.isRemote)
				{
					playerIn.addChatComponentMessage(new net.minecraft.util.ChatComponentText("You need to make fertilizer for this plant!"));
				}
				return true;
			}
			if (playerItem != null)
			{
				if(playerItem == UrbanizationItems.fertilizer)
				{
					if(playerIn.inventory.addItemStackToInventory(new ItemStack(UrbanizationItems.sack)))
					{
						playerStack.stackSize--;
						if (worldIn.getBlockState(pos) == UrbanizationBlocks.pineapple_1.getDefaultState())
						{
							worldIn.setBlockState(pos, UrbanizationBlocks.pineapple_2.getDefaultState());
						}
						else if (worldIn.getBlockState(pos) == UrbanizationBlocks.pineapple_2.getDefaultState())
						{
							worldIn.setBlockState(pos, UrbanizationBlocks.pineapple_3.getDefaultState());
						}
						else if (worldIn.getBlockState(pos) == UrbanizationBlocks.pineapple_3.getDefaultState())
						{
							worldIn.setBlockState(pos, UrbanizationBlocks.pineapple_4.getDefaultState());
						}
						else if (worldIn.getBlockState(pos) == UrbanizationBlocks.pineapple_4.getDefaultState())
						{
							worldIn.setBlockState(pos, UrbanizationBlocks.pineapple_5.getDefaultState());
						}
					}
				}
			}
		}
		return false;
	}
	
}
