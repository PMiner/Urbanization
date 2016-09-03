package tk.pminer.urbanization.guis;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiHelpGuide extends GuiScreen
{
	private final int bookImageHeight = 192;
	private final int bookImageWidth = 192;
	private int currPage = 0;
	private static final int bookTotalPages = 7;
	private static ResourceLocation[] bookPageTextures = new ResourceLocation[7];

	private static String[] stringPageText = new String[7];
	private GuiButton buttonDone;
	private NextPageButton buttonNextPage;
	private NextPageButton buttonPreviousPage;
	public GuiHelpGuide()
	{
		bookPageTextures[0] = new ResourceLocation("minecraft:textures/gui/book.png");
		bookPageTextures[1] = new ResourceLocation("minecraft:textures/gui/book.png");
		bookPageTextures[2] = new ResourceLocation("minecraft:textures/gui/book.png");
		stringPageText[0] = "Note: If your cursor disapears, just move your mouse cursor out of the MC window, and then move it back in. Sorry for the issue!";
		stringPageText[1] = "Welcome to urbanization! I see you have found the help guide! This guide will help you understand all of the features of urbanization! First, you should get some seeds! These can be found by breaking grass!";
		stringPageText[2] = "Onece you have a good food supply, we can get into the machines! The first machine is the Singularity Transponder! For this, you will need a singularity! These can be found in the nether, or by making singularity containers";
		stringPageText[3] = "Singularity containers, when broken drop singularities. if you click the ground with a singularity, the singularity will remeber where you clicked it, and you will warp to that location when you click the transponder with the";
		stringPageText[4] = "singularity. You can have multiple singularities! if you click an entire stack on the ground, the entire stack will remember the location as well! Next we can talk about decorations! Many decorations require special items to craft!";
		stringPageText[5] = "Such as the chandelier wich requires some lightbulbs to craft! The stop signs, require iron posts, and stop sign tops. same for go signs. the ceiling fan, requires copper! copper is found between Y 30-70. Smelt them into ingots,";
		stringPageText[6] = "then make a copper coil wich will be made in a metal press soon, but for now in a crafting grid. then you make a motor. If you have any questions, go to PMinerYT@gmail.com. Thanks for checking out my mod!";
	}
	@Override
	public void initGui() 
	{
		// DEBUG
		System.out.println("GuiMysteriousStranger initGUI()");
		buttonList.clear();
		Keyboard.enableRepeatEvents(true);
		buttonDone = new GuiButton(0, width / 2 + 2, 4 + bookImageHeight, 98, 20, I18n.format("gui.done", new Object[0]));
		buttonList.add(buttonDone);
		int offsetFromScreenLeft = (width - bookImageWidth) / 2;
		buttonList.add(buttonNextPage = new NextPageButton(1, offsetFromScreenLeft + 120, 156, true));
		buttonList.add(buttonPreviousPage = new NextPageButton(2, offsetFromScreenLeft + 38, 156, false));
	}

	@Override
    public void updateScreen() 
    {
        buttonDone.visible = (currPage == bookTotalPages - 1);
        buttonNextPage.visible = (currPage < bookTotalPages - 1);
        buttonPreviousPage.visible = currPage > 0;
    }
	
	@Override
    public void drawScreen(int parWidth, int parHeight, float p_73863_3_)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (currPage == 0)
        {
        	mc.getTextureManager().bindTexture(bookPageTextures[0]);
        }
        else
        {
        	mc.getTextureManager().bindTexture(bookPageTextures[1]);
        }
        int offsetFromScreenLeft = (width - bookImageWidth ) / 2;
        drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, bookImageWidth, bookImageHeight);
        int widthOfString;
        String stringPageIndicator = I18n.format("book.pageIndicator", new Object[] {Integer.valueOf(currPage + 1), bookTotalPages});
        widthOfString = fontRendererObj.getStringWidth(stringPageIndicator);
        fontRendererObj.drawString(stringPageIndicator, offsetFromScreenLeft - widthOfString + bookImageWidth - 44, 18, 0);
        fontRendererObj.drawSplitString(stringPageText[currPage], offsetFromScreenLeft + 36, 34, 116, 0);
        super.drawScreen(parWidth, parHeight, p_73863_3_);
    }
	@Override
    protected void mouseClickMove(int parMouseX, int parMouseY, int parLastButtonClicked, long parTimeSinceMouseClick) {}
	@Override
	protected void actionPerformed(GuiButton parButton) 
	{
		if (parButton == buttonDone)
		{
			mc.displayGuiScreen((GuiScreen)null);
		}
		else if (parButton == buttonNextPage)
		{
			if (currPage < bookTotalPages - 1)
			{
				++currPage;
			}
		}
		else if (parButton == buttonPreviousPage)
		{
			if (currPage > 0)
			{
				--currPage;
			}
		}
	}
	@Override
	public void onGuiClosed() 
	{
		currPage = 0;
	}
	@Override
	public boolean doesGuiPauseGame() 
	{
		return false;
	}
  
	@SideOnly(Side.CLIENT)
    static class NextPageButton extends GuiButton
    {
        private final boolean isNextButton;
        public NextPageButton(int parButtonId, int parPosX, int parPosY, boolean parIsNextButton)
        {
            super(parButtonId, parPosX, parPosY, 23, 13, "");
            isNextButton = parIsNextButton;
        }
        @Override
        public void drawButton(Minecraft mc, int parX, int parY)
        {
            if (visible)
            {
                boolean isButtonPressed = (parX >= xPosition && parY >= yPosition && parX < xPosition + width && parY < yPosition + height);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                mc.getTextureManager().bindTexture(bookPageTextures[1]);
                int textureX = 0;
                int textureY = 192;
                if (isButtonPressed)
                {
                    textureX += 23;
                }
                if (!isNextButton)
                {
                    textureY += 13;
                }
                drawTexturedModalRect(xPosition, yPosition, textureX, textureY, 23, 13);
            }
        }
    }
}
