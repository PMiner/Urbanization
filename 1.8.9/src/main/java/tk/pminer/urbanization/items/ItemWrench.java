package tk.pminer.urbanization.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemWrench extends Item
{
	@Override
	public Item setContainerItem(Item containerItem) 
	{
		return containerItem;
	}
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) 
	{
		return itemStack;
	}
	@Override
	public boolean hasContainerItem(ItemStack stack) 
	{
		return true;
	}
}
