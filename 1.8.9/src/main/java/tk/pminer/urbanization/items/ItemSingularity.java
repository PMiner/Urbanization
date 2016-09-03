package tk.pminer.urbanization.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ItemSingularity extends Item
{
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side,
			float hitX, float hitY, float hitZ) 
	{
		if (!playerIn.isSneaking())
		{
			if (stack.getTagCompound() == null)
			{
				stack.setTagCompound(new NBTTagCompound());
			}
			NBTTagCompound nbt = new NBTTagCompound();
			nbt.setInteger("Dim", playerIn.dimension);
			nbt.setInteger("posX", pos.getX());
			nbt.setInteger("posY", pos.getY() + 1);
			nbt.setInteger("posZ", pos.getZ());
			stack.getTagCompound().setTag("coords", nbt);
			stack.setStackDisplayName(EnumChatFormatting.GREEN + "Singularity");
			SetCoords(playerIn, stack, worldIn);
		}
		return false;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) 
	{
		if (playerIn.isSneaking())
		{
			if (itemStackIn.getTagCompound() != null)
			{
				itemStackIn.getTagCompound().removeTag("coords");
				itemStackIn.setStackDisplayName(EnumChatFormatting.WHITE + "Singularity");
				RemovedCoords(playerIn, worldIn);
			}
		}
		return itemStackIn;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack) 
	{
		if (stack.getTagCompound() != null)
		{
			return stack.getTagCompound().hasKey("coords");
		}
		return false;
	}
	public void RemovedCoords(EntityPlayer player, World worldIn) {
		if (!worldIn.isRemote)
		{
			player.addChatMessage(new ChatComponentText("Removed coords"));
		}
	}

	public void SetCoords(EntityPlayer player, ItemStack stack, World worldIn) {
		NBTTagCompound nbt = (NBTTagCompound)stack.getTagCompound().getTag("coords");
		int Dim = nbt.getInteger("Dim");
		int posX = nbt.getInteger("posX");
		int posY = nbt.getInteger("posY");
		int posZ = nbt.getInteger("posZ");
		if (!worldIn.isRemote)
		{
			player.addChatMessage(new ChatComponentText("Set coords:"));
			player.addChatMessage(new ChatComponentText("Dimension: " + Dim + " X: " + posX + " Y: " + (posY - 1) + " Z: " + posZ));
		}
	}
}
