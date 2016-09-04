package tk.pminer.urbanization.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tk.pminer.urbanization.Reference;
import tk.pminer.urbanization.Urbanization;
import tk.pminer.urbanization.blocks.BlockCarpetPattern;
import tk.pminer.urbanization.blocks.BlockCeilingFan1;
import tk.pminer.urbanization.blocks.BlockConcreteRoad;
import tk.pminer.urbanization.blocks.BlockConcreteRoadStriped1;
import tk.pminer.urbanization.blocks.BlockConcreteRoadStriped2;
import tk.pminer.urbanization.blocks.BlockLettuce;
import tk.pminer.urbanization.blocks.BlockPineapple;
import tk.pminer.urbanization.blocks.BlockSignPost;
import tk.pminer.urbanization.blocks.BlockSingularityContainer;
import tk.pminer.urbanization.blocks.BlockStopSign;
import tk.pminer.urbanization.blocks.BlockTomato;

public class UrbanizationBlocks
{
	public static Block carpet_checkered;
	public static Block pineapple_1;
	public static Block lettuce_1;
	public static Block tomato_1;
	public static Block singularity_container;
	public static Block nether_singularity_ore;
	public static Block copper_ore;
	public static Block ceiling_fan_1;
	public static Block chandelier;
	public static Block go_sign_item;
	public static Block stop_sign_item;
	public static Block concrete_road;
	public static Block concrete_road_striped_1;
	public static Block concrete_road_striped_2;
	public static Block singularity_transponder;
	public static Block go_sign_1;
	public static Block stop_sign_1;
	public static Block sign_post;
	public static Block pineapple_2;
	public static Block pineapple_3;
	public static Block pineapple_4;
	public static Block pineapple_5;
	public static Block lettuce_5;
	public static Block lettuce_4;
	public static Block lettuce_3;
	public static Block lettuce_2;
	public static Block tomato_5;
	public static Block tomato_4;
	public static Block tomato_3;
	public static Block tomato_2;
	public static Block ceiling_fan_2;
	public static Block go_sign_2;
	public static Block stop_sign_2;

	public UrbanizationBlocks() {}

	public static void registerRenders()
	{
		registerRender(carpet_checkered);
		registerRender(pineapple_1);
		registerRender(lettuce_1);
		registerRender(tomato_1);

		registerRender(singularity_container);
		registerRender(nether_singularity_ore);
		registerRender(copper_ore);

		registerRender(ceiling_fan_1);
		registerRender(chandelier);
		registerRender(go_sign_item);
		registerRender(stop_sign_item);

		registerRender(concrete_road);
		registerRender(concrete_road_striped_1);
		registerRender(concrete_road_striped_2);

		registerRender(singularity_transponder);

		registerRender(go_sign_1);
		registerRender(stop_sign_1);
		registerRender(sign_post);

		registerRender(pineapple_2);
		registerRender(pineapple_3);
		registerRender(pineapple_4);
		registerRender(pineapple_5);
		registerRender(lettuce_5);
		registerRender(lettuce_4);
		registerRender(lettuce_3);
		registerRender(lettuce_2);
		registerRender(tomato_5);
		registerRender(tomato_4);
		registerRender(tomato_3);
		registerRender(tomato_2);
		registerRender(ceiling_fan_2);
		registerRender(go_sign_2);
		registerRender(stop_sign_2);
	}

	public static void init()
	{
		carpet_checkered = new BlockCarpetPattern(Material.carpet).setUnlocalizedName("carpet_checkered").setCreativeTab(Urbanization.tabUrbanization);
		pineapple_1 = new BlockPineapple(Material.plants).setUnlocalizedName("pineapple_1").setCreativeTab(Urbanization.tabUrbanization);
		lettuce_1 = new BlockLettuce(Material.plants).setUnlocalizedName("lettuce_1").setCreativeTab(Urbanization.tabUrbanization);
		tomato_1 = new BlockTomato(Material.plants).setUnlocalizedName("tomato_1").setCreativeTab(Urbanization.tabUrbanization);

		singularity_container = new BlockSingularityContainer(Material.iron).setUnlocalizedName("singularity_container").setCreativeTab(Urbanization.tabUrbanization);
		nether_singularity_ore = new BlockSingularityContainer(Material.iron).setUnlocalizedName("nether_singularity_ore").setCreativeTab(Urbanization.tabUrbanization);
		copper_ore = new tk.pminer.urbanization.blocks.BlockCopperOre(Material.iron).setUnlocalizedName("copper_ore").setCreativeTab(Urbanization.tabUrbanization);

		ceiling_fan_1 = new BlockCeilingFan1(Material.wood).setUnlocalizedName("ceiling_fan_1").setCreativeTab(Urbanization.tabUrbanization);
		chandelier = new tk.pminer.urbanization.blocks.BlockChandelier(Material.wood).setUnlocalizedName("chandelier").setCreativeTab(Urbanization.tabUrbanization);
		go_sign_item = new tk.pminer.urbanization.blocks.BlockGoSignItem(Material.iron).setUnlocalizedName("go_sign_item").setCreativeTab(Urbanization.tabUrbanization);
		stop_sign_item = new tk.pminer.urbanization.blocks.BlockStopSignItem(Material.iron).setUnlocalizedName("stop_sign_item").setCreativeTab(Urbanization.tabUrbanization);

		concrete_road = new BlockConcreteRoad(Material.rock).setUnlocalizedName("concrete_road").setCreativeTab(Urbanization.tabUrbanization);
		concrete_road_striped_1 = new BlockConcreteRoadStriped1(Material.rock).setUnlocalizedName("concrete_road_striped_1").setCreativeTab(Urbanization.tabUrbanization);
		concrete_road_striped_2 = new BlockConcreteRoadStriped2(Material.rock).setUnlocalizedName("concrete_road_striped_2").setCreativeTab(Urbanization.tabUrbanization);

		singularity_transponder = new tk.pminer.urbanization.blocks.BlockSingularityTransponder(Material.iron).setUnlocalizedName("singularity_transponder").setCreativeTab(Urbanization.tabUrbanization);

		go_sign_1 = new tk.pminer.urbanization.blocks.BlockGoSign(Material.iron).setUnlocalizedName("go_sign_1").setCreativeTab(Urbanization.tabUrbanization);
		stop_sign_1 = new tk.pminer.urbanization.blocks.BlockStopSign(Material.iron).setUnlocalizedName("stop_sign_1").setCreativeTab(Urbanization.tabUrbanization);
		sign_post = new BlockSignPost(Material.iron).setUnlocalizedName("sign_post").setCreativeTab(Urbanization.tabUrbanization);

		pineapple_2 = new BlockPineapple(Material.plants).setUnlocalizedName("pineapple_2");
		pineapple_3 = new BlockPineapple(Material.plants).setUnlocalizedName("pineapple_3");
		pineapple_4 = new BlockPineapple(Material.plants).setUnlocalizedName("pineapple_4");
		pineapple_5 = new tk.pminer.urbanization.blocks.BlockPineappleGrown(Material.plants).setUnlocalizedName("pineapple_5");
		lettuce_5 = new tk.pminer.urbanization.blocks.BlockLettuceGrown(Material.plants).setUnlocalizedName("lettuce_5");
		lettuce_4 = new BlockLettuce(Material.plants).setUnlocalizedName("lettuce_4");
		lettuce_3 = new BlockLettuce(Material.plants).setUnlocalizedName("lettuce_3");
		lettuce_2 = new BlockLettuce(Material.plants).setUnlocalizedName("lettuce_2");
		tomato_5 = new tk.pminer.urbanization.blocks.BlockTomatoGrown(Material.plants).setUnlocalizedName("tomato_5");
		tomato_4 = new BlockTomato(Material.plants).setUnlocalizedName("tomato_4");
		tomato_3 = new BlockTomato(Material.plants).setUnlocalizedName("tomato_3");
		tomato_2 = new BlockTomato(Material.plants).setUnlocalizedName("tomato_2");
		ceiling_fan_2 = new BlockCeilingFan1(Material.wood).setUnlocalizedName("ceiling_fan_2");
		go_sign_2 = new tk.pminer.urbanization.blocks.BlockGoSign(Material.iron).setUnlocalizedName("go_sign_2");
		stop_sign_2 = new BlockStopSign(Material.iron).setUnlocalizedName("stop_sign_2");
	}

	public static void register()
	{
		GameRegistry.registerBlock(carpet_checkered, carpet_checkered.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(pineapple_1, pineapple_1.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lettuce_1, lettuce_1.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tomato_1, tomato_1.getUnlocalizedName().substring(5));

		GameRegistry.registerBlock(singularity_container, singularity_container.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(nether_singularity_ore, nether_singularity_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(copper_ore, copper_ore.getUnlocalizedName().substring(5));

		GameRegistry.registerBlock(ceiling_fan_1, ceiling_fan_1.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chandelier, chandelier.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(go_sign_item, go_sign_item.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stop_sign_item, stop_sign_item.getUnlocalizedName().substring(5));

		GameRegistry.registerBlock(concrete_road, concrete_road.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(concrete_road_striped_1, concrete_road_striped_1.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(concrete_road_striped_2, concrete_road_striped_2.getUnlocalizedName().substring(5));

		GameRegistry.registerBlock(singularity_transponder, singularity_transponder.getUnlocalizedName().substring(5));

		GameRegistry.registerBlock(go_sign_1, go_sign_1.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stop_sign_1, stop_sign_1.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(sign_post, sign_post.getUnlocalizedName().substring(5));

		GameRegistry.registerBlock(pineapple_2, pineapple_2.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(pineapple_3, pineapple_3.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(pineapple_4, pineapple_4.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(pineapple_5, pineapple_5.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lettuce_5, lettuce_5.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lettuce_4, lettuce_4.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lettuce_3, lettuce_3.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lettuce_2, lettuce_2.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tomato_5, tomato_5.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tomato_4, tomato_4.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tomato_3, tomato_3.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tomato_2, tomato_2.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ceiling_fan_2, ceiling_fan_2.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(go_sign_2, go_sign_2.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stop_sign_2, stop_sign_2.getUnlocalizedName().substring(5));
	}





	private static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
