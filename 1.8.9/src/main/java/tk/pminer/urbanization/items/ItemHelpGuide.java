package tk.pminer.urbanization.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tk.pminer.urbanization.Urbanization;
import tk.pminer.urbanization.proxy.CommonProxy;

public class ItemHelpGuide
extends Item
{
	public ItemHelpGuide() {}
	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) 
	{
		if (!worldIn.isRemote)
		{
			Urbanization.proxy.openHelpGuideGui();
		}
		return itemStackIn;
	}
}
