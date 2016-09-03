package tk.pminer.urbanization.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class UrbanizationSeeds
{
  public UrbanizationSeeds() {}
  
  public static void init()
  {
    addSeedB(UrbanizationBlocks.lettuce_1, 10);
    addSeedB(UrbanizationBlocks.tomato_1, 10);
    addSeedB(UrbanizationBlocks.pineapple_1, 5);
  }
  
  private static void addSeedI(Item item, int seed_count) {
    MinecraftForge.addGrassSeed(new ItemStack(item), seed_count);
  }
  
  private static void addSeedB(Block block, int seed_count) {
    MinecraftForge.addGrassSeed(new ItemStack(Item.getItemFromBlock(block)), seed_count);
  }
  
  private static void addSeedS(ItemStack stack, int seed_count) {
    MinecraftForge.addGrassSeed(stack, seed_count);
  }
}
