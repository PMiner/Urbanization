package tk.pminer.urbanization.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import tk.pminer.urbanization.items.ItemSingularity;

public class BlockSingularityTransponder extends Block
{
  public BlockSingularityTransponder(Material materialIn)
  {
    super(materialIn);
    this.setHardness(0.5F);
    this.setStepSound(Block.soundTypeStone);
    
  }
  public boolean func_180639_a(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
  {
    ItemStack stack = playerIn.getHeldItem();
    if (stack != null)
    {
      if ((stack.getItem() instanceof ItemSingularity))
      {
        if (stack.getItem().hasEffect(stack))
        {
          Teleport(playerIn.getHeldItem(), playerIn);
          if (!worldIn.isRemote)
          {
            playerIn.addChatComponentMessage(new net.minecraft.util.ChatComponentText("Teleporting!"));
          }
        }
      }
    }
    return true;
  }
  
  public static void Teleport(ItemStack singularity, EntityPlayer player) {
    NBTTagCompound nbt = (NBTTagCompound)singularity.getTagCompound().getTag("coords");
    int Dim = nbt.getInteger("Dim");
    int posX = nbt.getInteger("posX");
    int posY = nbt.getInteger("posY");
    int posZ = nbt.getInteger("posZ");
    if (player.dimension != Dim)
    {
      player.travelToDimension(Dim);
    }
    player.setLocationAndAngles(posX + 0.5D, posY+0.0D, posZ + 0.5D, 0, 0);
  }
  
  public boolean func_176212_b(IBlockAccess worldIn, BlockPos pos, EnumFacing side)
  {
    return false;
  }
  @Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public boolean isFullCube()
	{
		return false;
	}
	
	@Override
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}
  
}
