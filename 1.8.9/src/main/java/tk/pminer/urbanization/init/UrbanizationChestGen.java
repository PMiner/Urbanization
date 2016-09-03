package tk.pminer.urbanization.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;


public class UrbanizationChestGen
{
  public UrbanizationChestGen() {}
  
  public static void init()
  {
    addChestI(UrbanizationItems.help_guide, 0, 1, 100);
  }
  
  private static void addChestI(Item item, int Min, int Max, int Rarity) {
    ChestGenHooks.getInfo("bonusChest").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("netherFortress").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("mineshaftCorridor").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("pyramidDesertyChest").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("pyramidJungleChest").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("strongholdCrossing").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("strongholdLibrary").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
  }
  
  private static void addChestB(Block block, int Min, int Max, int Rarity) {
    Item item = Item.getItemFromBlock(block);
    ChestGenHooks.getInfo("bonusChest").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("netherFortress").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("mineshaftCorridor").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("pyramidDesertyChest").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("pyramidJungleChest").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("strongholdCrossing").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("strongholdLibrary").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
    ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(item), Min, Max, Rarity));
  }
  
  private static void addChestS(ItemStack item, int Min, int Max, int Rarity) {
    ChestGenHooks.getInfo("bonusChest").addItem(new WeightedRandomChestContent(item, Min, Max, Rarity));
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(item, Min, Max, Rarity));
    ChestGenHooks.getInfo("netherFortress").addItem(new WeightedRandomChestContent(item, Min, Max, Rarity));
    ChestGenHooks.getInfo("mineshaftCorridor").addItem(new WeightedRandomChestContent(item, Min, Max, Rarity));
    ChestGenHooks.getInfo("pyramidDesertyChest").addItem(new WeightedRandomChestContent(item, Min, Max, Rarity));
    ChestGenHooks.getInfo("pyramidJungleChest").addItem(new WeightedRandomChestContent(item, Min, Max, Rarity));
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(item, Min, Max, Rarity));
    ChestGenHooks.getInfo("strongholdCrossing").addItem(new WeightedRandomChestContent(item, Min, Max, Rarity));
    ChestGenHooks.getInfo("strongholdLibrary").addItem(new WeightedRandomChestContent(item, Min, Max, Rarity));
    ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(item, Min, Max, Rarity));
  }
}
