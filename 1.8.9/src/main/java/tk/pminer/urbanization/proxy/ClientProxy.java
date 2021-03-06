package tk.pminer.urbanization.proxy;

import net.minecraft.client.Minecraft;
import tk.pminer.urbanization.guis.GuiHelpGuide;
import tk.pminer.urbanization.init.UrbanizationItems;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenders()
	{
		tk.pminer.urbanization.init.UrbanizationBlocks.registerRenders();
		UrbanizationItems.registerRenders();
	}
	@Override
	public void openHelpGuideGui()
	{
		Minecraft.getMinecraft().displayGuiScreen(new GuiHelpGuide());
	}
}
