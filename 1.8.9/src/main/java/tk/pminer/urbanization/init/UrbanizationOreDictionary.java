package tk.pminer.urbanization.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class UrbanizationOreDictionary
{
	public static void LoadOreDictionary()
	{
		oreDictionaryLoad(UrbanizationItems.cheese_patty, "foodCheesePatty");
		oreDictionaryLoad(Items.book, "itemBook");
		oreDictionaryLoad(UrbanizationItems.pineapple, "foodPineapple");
		oreDictionaryLoad(UrbanizationItems.cheese, "foodCheese");
		oreDictionaryLoad(UrbanizationItems.salt, "dustSalt");
		oreDictionaryLoad(UrbanizationItems.lettuce, "foodLettuce");
		oreDictionaryLoad(UrbanizationItems.singularity, "itemSingularity");
		oreDictionaryLoad(UrbanizationItems.donut, "foodDonut");
		oreDictionaryLoad(UrbanizationItems.wrench, "itemWrench");
		oreDictionaryLoad(UrbanizationItems.coffee, "foodCoffee");
		oreDictionaryLoad(UrbanizationItems.cupcake, "foodCupcake");
		oreDictionaryLoad(UrbanizationItems.lightbulb, "itemLightbulb");
		oreDictionaryLoad(UrbanizationItems.coil, "itemCoil");
		oreDictionaryLoad(UrbanizationItems.copper_ingot, "ingotCopper");
		oreDictionaryLoad(UrbanizationItems.motor, "itemMotor");
		oreDictionaryLoad(UrbanizationItems.chimichanga, "foodChimichanga");
		oreDictionaryLoad(UrbanizationItems.fries, "foodFries");
		oreDictionaryLoad(UrbanizationItems.burger, "foodBurger");
		oreDictionaryLoad(UrbanizationItems.nugget, "foodNugget");
		oreDictionaryLoad(UrbanizationItems.raw_nugget, "itemRawNugget");
		oreDictionaryLoad(UrbanizationItems.nuggets, "foodNuggets");
		oreDictionaryLoad(UrbanizationItems.hand_blender, "itemHandBlender");
		oreDictionaryLoad(UrbanizationItems.chicken_puree, "materialChickenPuree");
		oreDictionaryLoad(UrbanizationItems.gear, "itemGear");
		oreDictionaryLoad(UrbanizationItems.crumbs, "materialCrumbs");
		oreDictionaryLoad(UrbanizationItems.raw_patty, "itemRawPatty");
		oreDictionaryLoad(UrbanizationItems.patty, "foodPatty");
		oreDictionaryLoad(UrbanizationItems.tomato, "foodTomato");
		oreDictionaryLoad(Items.milk_bucket, "liquidMilk");
		oreDictionaryLoad(Items.clay_ball, "materialClay");
		oreDictionaryLoad(Items.beef, "foodBeef");
		oreDictionaryLoad(Items.bread, "foodBread");
		oreDictionaryLoad(Items.chicken, "foodChicken");
		oreDictionaryLoad(Items.nether_star, "itemStar");
		oreDictionaryLoad(Items.glass_bottle, "itemGlassBottle");
		oreDictionaryLoad(Items.paper, "itemPaper");
		oreDictionaryLoad(UrbanizationItems.sack, "itemSack");

		oreDictionaryLoadI(new ItemStack(Blocks.wool, 1, 13), "blockGreenWool");
		oreDictionaryLoadI(new ItemStack(Blocks.wool, 1, 14), "blockRedWool");

		oreDictionaryLoadB(Blocks.dirt, "blockDirt");
		oreDictionaryLoadB(Blocks.dark_oak_fence, "blockDarkOakFence");
		oreDictionaryLoadB(UrbanizationBlocks.lettuce_1, "seedsLettuce");
		oreDictionaryLoadB(UrbanizationBlocks.singularity_transponder, "blockSingularityTransponder");
		oreDictionaryLoadB(UrbanizationBlocks.concrete_road, "blockConcrete");
		oreDictionaryLoadB(UrbanizationBlocks.concrete_road_striped_1, "blockConcrete");
		oreDictionaryLoadB(UrbanizationBlocks.concrete_road_striped_2, "blockConcrete");
		oreDictionaryLoadB(UrbanizationBlocks.singularity_container, "blockSingularityContainer");
		oreDictionaryLoadB(UrbanizationBlocks.sign_post, "itemIronPost");
		oreDictionaryLoadB(UrbanizationBlocks.stop_sign_item, "itemStopSign");
		oreDictionaryLoadB(UrbanizationBlocks.stop_sign_1, "itemStopSignTop");
		oreDictionaryLoadB(UrbanizationBlocks.stop_sign_2, "itemStopSignTop");
		oreDictionaryLoadB(UrbanizationBlocks.go_sign_1, "itemGoSignTop");
		oreDictionaryLoadB(UrbanizationBlocks.go_sign_2, "itemGoSignTop");
		oreDictionaryLoadB(UrbanizationBlocks.go_sign_item, "itemGoSign");
		oreDictionaryLoadB(UrbanizationBlocks.chandelier, "blockChandelier");
		oreDictionaryLoadB(UrbanizationBlocks.ceiling_fan_1, "blockCeilingFan");
		oreDictionaryLoadB(UrbanizationBlocks.copper_ore, "oreCopper");
		oreDictionaryLoadB(UrbanizationBlocks.tomato_1, "seedsTomato");
		oreDictionaryLoadB(UrbanizationBlocks.pineapple_1, "seedsPineapple");
		oreDictionaryLoadB(UrbanizationBlocks.nether_singularity_ore, "oreSingularity");
	}

	public static void oreDictionaryLoad(Item ore, String name) 
	{
		OreDictionary.registerOre(name, ore);
	}

	public static void oreDictionaryLoadB(Block ore, String name) 
	{
		OreDictionary.registerOre(name, ore);
	}

	public static void oreDictionaryLoadI(ItemStack ore, String name) 
	{
		OreDictionary.registerOre(name, ore);
	}
}
