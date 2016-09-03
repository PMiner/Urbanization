package tk.pminer.urbanization.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class UrbanizationRecipies
{
  public UrbanizationRecipies() {}
  
  public static void init()
  {
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationBlocks.singularity_container), new Object[] { "rgr", "gdg", "rgr", Character.valueOf('d'), "gemDiamond", Character.valueOf('g'), "blockGlassColorless", Character.valueOf('r'), "dustRedstone" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationBlocks.concrete_road), new Object[] { " c ", "csc", " c ", Character.valueOf('c'), "materialClay", Character.valueOf('s'), "stone" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationBlocks.singularity_transponder), new Object[] { " s ", "rdg", "cic", Character.valueOf('s'), "itemSingularity", Character.valueOf('g'), "blockGreenWool", Character.valueOf('r'), "blockRedWool", Character.valueOf('d'), "dustRedstone", Character.valueOf('c'), "blockConcrete", Character.valueOf('i'), "blockIron" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationBlocks.singularity_container), new Object[] { " g ", "gsg", " g ", Character.valueOf('g'), "blockGlassColorless", Character.valueOf('s'), "itemStar" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationBlocks.sign_post), new Object[] { "i", "i", Character.valueOf('i'), "ingotIron" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationBlocks.stop_sign_1), new Object[] { " i ", "iri", " i ", Character.valueOf('i'), "ingotIron", Character.valueOf('r'), "dyeRed" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationBlocks.stop_sign_item), new Object[] { "s", "i", "i", Character.valueOf('s'), "itemStopSignTop", Character.valueOf('i'), "itemIronPost" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationBlocks.go_sign_1), new Object[] { " i ", "iri", " i ", Character.valueOf('i'), "ingotIron", Character.valueOf('r'), "dyeGreen" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationBlocks.go_sign_item), new Object[] { "s", "i", "i", Character.valueOf('s'), "itemGoSignTop", Character.valueOf('i'), "itemIronPost" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationItems.lightbulb), new Object[] { "b", "g", "i", Character.valueOf('b'), "itemGlassBottle", Character.valueOf('i'), "ingotIron", Character.valueOf('g'), "dustGlowstone" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationBlocks.chandelier), new Object[] { " s ", "qpq", "l l", Character.valueOf('s'), "stickWood", Character.valueOf('q'), "gemQuartz", Character.valueOf('p'), "blockDarkOakFence", Character.valueOf('l'), "itemLightbulb" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationItems.coil), new Object[] { " c ", "cic", " c ", Character.valueOf('c'), "ingotCopper", Character.valueOf('i'), "ingotIron" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationItems.wrench), new Object[] { "i i", " p ", Character.valueOf('i'), "ingotIron", Character.valueOf('p'), "itemIronPost" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationItems.motor), new Object[] { " i ", "icr", " i ", Character.valueOf('i'), "ingotIron", Character.valueOf('c'), "itemCoil", Character.valueOf('r'), "dustRedstone" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationBlocks.ceiling_fan_1), new Object[] { " s ", "qpq", "sms", Character.valueOf('s'), "stickWood", Character.valueOf('q'), "gemQuartz", Character.valueOf('p'), "plankWood", Character.valueOf('m'), "itemMotor" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationItems.gear), new Object[] { " i ", "i i", " i ", Character.valueOf('i'), "ingotIron" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationItems.hand_blender), new Object[] { "   ", "igi", " is", Character.valueOf('i'), "ingotIron", Character.valueOf('g'), "itemGear", Character.valueOf('s'), "stickWood" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationItems.nuggets), new Object[] { "ppp", "nnn", "nnn", Character.valueOf('p'), "itemPaper", Character.valueOf('n'), "foodNugget" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationItems.cheese_patty), new Object[] { "c", "p", Character.valueOf('c'), "foodCheese", Character.valueOf('p'), "foodPatty" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UrbanizationItems.burger), new Object[] { " b ", "lpt", " b ", Character.valueOf('b'), "foodBread", Character.valueOf('l'), "foodLettuce", Character.valueOf('p'), "foodCheesePatty", Character.valueOf('t'), "foodTomato" }));
    
    GameRegistry.addRecipe(new ItemStack(UrbanizationBlocks.concrete_road_striped_1), new Object[] { " d ", " c ", " d ", Character.valueOf('c'), new ItemStack(UrbanizationBlocks.concrete_road), Character.valueOf('d'), new ItemStack(Items.dye, 1, 11) });
    GameRegistry.addRecipe(new ItemStack(UrbanizationBlocks.concrete_road_striped_2), new Object[] { "   ", "dcd", "   ", Character.valueOf('c'), new ItemStack(UrbanizationBlocks.concrete_road), Character.valueOf('d'), new ItemStack(Items.dye, 1, 11) });
    

    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UrbanizationItems.help_guide), new Object[] { "itemBook", "itemGear" }));
    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UrbanizationItems.fertilizer), new Object[] { "dyeWhite", "blockDirt", "itemSack" }));
    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UrbanizationBlocks.pineapple_1, 2), new Object[] { "foodPineapple" }));
    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UrbanizationItems.cheese), new Object[] { "dustSalt", "liquidMilk" }));
    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getItemFromBlock(UrbanizationBlocks.lettuce_1)), new Object[] { "foodLettuce" }));
    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getItemFromBlock(UrbanizationBlocks.tomato_1)), new Object[] { "foodTomato" }));
    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UrbanizationItems.raw_patty), new Object[] { "foodBeef", "itemHandBlender" }));
    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UrbanizationItems.raw_nugget, 6), new Object[] { "materialCrumbs", "materialChickenPuree" }));
    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UrbanizationItems.crumbs), new Object[] { "itemHandBlender", "foodBread" }));
    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UrbanizationItems.chicken_puree), new Object[] { "itemHandBlender", "foodChicken" }));
    
    GameRegistry.addShapelessRecipe(new ItemStack(UrbanizationBlocks.concrete_road_striped_2), new Object[] { new ItemStack(UrbanizationBlocks.concrete_road_striped_1), new ItemStack(UrbanizationItems.wrench) });
    GameRegistry.addShapelessRecipe(new ItemStack(UrbanizationBlocks.concrete_road_striped_1), new Object[] { new ItemStack(UrbanizationBlocks.concrete_road_striped_2), new ItemStack(UrbanizationItems.wrench) });
    


    GameRegistry.addSmelting(new ItemStack(Items.potionitem, 1, 0), new ItemStack(UrbanizationItems.salt), 0.0F);
    GameRegistry.addSmelting(new ItemStack(Items.water_bucket), new ItemStack(UrbanizationItems.salt, 8), 0.0F);
    GameRegistry.addSmelting(new ItemStack(UrbanizationBlocks.copper_ore), new ItemStack(UrbanizationItems.copper_ingot), 1.0F);
    GameRegistry.addSmelting(new ItemStack(UrbanizationItems.raw_nugget), new ItemStack(UrbanizationItems.nugget), 1.0F);
    GameRegistry.addSmelting(new ItemStack(UrbanizationItems.raw_patty), new ItemStack(UrbanizationItems.patty), 1.0F);
  }
  

  private static void Template()
  {
    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getItemFromBlock(Blocks.air)), new Object[] { "oreName", "oreName" }));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Item.getItemFromBlock(Blocks.air)), new Object[] { "ooo", "ooo", "ooo", Character.valueOf('o'), "oreName" }));
    GameRegistry.addSmelting(new ItemStack(Blocks.air), new ItemStack(Blocks.air), 0.0F);
  }
}
