package tk.pminer.urbanization;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tk.pminer.urbanization.init.UrbanizationItems;

public class UrbanizationTab extends CreativeTabs
{
	public UrbanizationTab(String label) 
	{
		super(label);
		setBackgroundImageName("urbanization.png");
	}
	@Override
	public Item getTabIconItem() 
	{
		return UrbanizationItems.wrench;
	}
}
