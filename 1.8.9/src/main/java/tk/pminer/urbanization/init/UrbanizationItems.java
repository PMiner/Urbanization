package tk.pminer.urbanization.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tk.pminer.urbanization.Reference;
import tk.pminer.urbanization.Urbanization;
import tk.pminer.urbanization.items.ItemHandBlender;
import tk.pminer.urbanization.items.ItemHelpGuide;
import tk.pminer.urbanization.items.ItemSingularity;
import tk.pminer.urbanization.items.ItemWrench;


public class UrbanizationItems
{
  public static Item cheese_patty;
  public static Item cheese;
  public static Item patty;
  public static Item nuggets;
  public static Item nugget;
  public static Item burger;
  public static Item fries;
  public static Item chimichanga;
  public static Item cupcake;
  public static Item coffee;
  public static Item donut;
  public static Item tomato;
  public static Item pineapple;
  public static Item lettuce;
  public static Item copper_ingot;
  public static Item sack;
  public static Item raw_patty;
  public static Item salt;
  public static Item crumbs;
  public static Item raw_nugget;
  public static Item gear;
  public static Item chicken_puree;
  public static Item motor;
  public static Item coil;
  public static Item lightbulb;
  public static Item wrench;
  public static Item fertilizer;
  public static Item hand_blender;
  public static Item singularity;
  public static Item help_guide;
  
  public UrbanizationItems() {}
  
  public static void init()
  {
    cheese_patty = new ItemFood(4, 0.7F, false).setUnlocalizedName("cheese_patty").setCreativeTab(Urbanization.tabUrbanization);
    cheese = new ItemFood(2, 0.7F, false).setUnlocalizedName("cheese").setCreativeTab(Urbanization.tabUrbanization);
    patty = new ItemFood(2, 0.7F, false).setUnlocalizedName("patty").setCreativeTab(Urbanization.tabUrbanization);
    nuggets = new ItemFood(16, 0.8F, false).setUnlocalizedName("nuggets").setCreativeTab(Urbanization.tabUrbanization);
    nugget = new ItemFood(2, 0.7F, false).setUnlocalizedName("nugget").setCreativeTab(Urbanization.tabUrbanization);
    burger = new ItemFood(16, 0.9F, true).setUnlocalizedName("burger").setCreativeTab(Urbanization.tabUrbanization);
    fries = new ItemFood(8, 0.7F, true).setUnlocalizedName("fries").setCreativeTab(Urbanization.tabUrbanization);
    chimichanga = new ItemFood(20, 0.8F, true).setUnlocalizedName("chimichanga").setCreativeTab(Urbanization.tabUrbanization);
    cupcake = new ItemFood(8, 0.4F, true).setUnlocalizedName("cupcake").setCreativeTab(Urbanization.tabUrbanization);
    coffee = new ItemFood(2, 0.0F, false).setUnlocalizedName("coffee").setCreativeTab(Urbanization.tabUrbanization);
    donut = new ItemFood(8, 0.4F, true).setUnlocalizedName("donut").setCreativeTab(Urbanization.tabUrbanization);
    
    tomato = new ItemFood(2, 0.7F, false).setUnlocalizedName("tomato").setCreativeTab(Urbanization.tabUrbanization);
    pineapple = new ItemFood(4, 0.7F, false).setUnlocalizedName("pineapple").setCreativeTab(Urbanization.tabUrbanization);
    lettuce = new ItemFood(2, 0.7F, false).setUnlocalizedName("lettuce").setCreativeTab(Urbanization.tabUrbanization);
    
    copper_ingot = new Item().setUnlocalizedName("copper_ingot").setCreativeTab(Urbanization.tabUrbanization);
    sack = new Item().setUnlocalizedName("sack").setCreativeTab(Urbanization.tabUrbanization);
    raw_patty = new Item().setUnlocalizedName("raw_patty").setCreativeTab(Urbanization.tabUrbanization);
    salt = new Item().setUnlocalizedName("salt").setCreativeTab(Urbanization.tabUrbanization);
    crumbs = new Item().setUnlocalizedName("crumbs").setCreativeTab(Urbanization.tabUrbanization);
    raw_nugget = new Item().setUnlocalizedName("raw_nugget").setCreativeTab(Urbanization.tabUrbanization);
    gear = new Item().setUnlocalizedName("gear").setCreativeTab(Urbanization.tabUrbanization);
    chicken_puree = new Item().setUnlocalizedName("chicken_puree").setCreativeTab(Urbanization.tabUrbanization);
    motor = new Item().setUnlocalizedName("motor").setCreativeTab(Urbanization.tabUrbanization);
    coil = new Item().setUnlocalizedName("coil").setCreativeTab(Urbanization.tabUrbanization);
    lightbulb = new Item().setUnlocalizedName("lightbulb").setCreativeTab(Urbanization.tabUrbanization);
    
    wrench = new ItemWrench().setUnlocalizedName("wrench").setCreativeTab(Urbanization.tabUrbanization);
    fertilizer = new Item().setUnlocalizedName("fertilizer").setCreativeTab(Urbanization.tabUrbanization);
    hand_blender = new ItemHandBlender().setUnlocalizedName("hand_blender").setCreativeTab(Urbanization.tabUrbanization);
    singularity = new ItemSingularity().setUnlocalizedName("singularity").setCreativeTab(Urbanization.tabUrbanization);
    help_guide = new ItemHelpGuide().setUnlocalizedName("help_guide").setCreativeTab(Urbanization.tabUrbanization);
  }
  

  public static void register()
  {
    GameRegistry.registerItem(cheese_patty, cheese_patty.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(cheese, cheese.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(patty, patty.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(nuggets, nuggets.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(nugget, nugget.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(burger, burger.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(fries, fries.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(chimichanga, chimichanga.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(cupcake, cupcake.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(coffee, coffee.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(donut, donut.getUnlocalizedName().substring(5));
    
    GameRegistry.registerItem(tomato, tomato.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(pineapple, pineapple.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(lettuce, lettuce.getUnlocalizedName().substring(5));
    
    GameRegistry.registerItem(copper_ingot, copper_ingot.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(sack, sack.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(raw_patty, raw_patty.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(salt, salt.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(crumbs, crumbs.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(raw_nugget, raw_nugget.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(gear, gear.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(chicken_puree, chicken_puree.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(motor, motor.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(coil, coil.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(lightbulb, lightbulb.getUnlocalizedName().substring(5));
    
    GameRegistry.registerItem(wrench, wrench.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(fertilizer, fertilizer.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(hand_blender, hand_blender.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(singularity, singularity.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(help_guide, help_guide.getUnlocalizedName().substring(5));
  }
  

  public static void registerRenders()
  {
    registerRender(cheese_patty);
    registerRender(cheese);
    registerRender(patty);
    registerRender(nuggets);
    registerRender(nugget);
    registerRender(burger);
    registerRender(fries);
    registerRender(chimichanga);
    registerRender(cupcake);
    registerRender(coffee);
    registerRender(donut);
    
    registerRender(tomato);
    registerRender(pineapple);
    registerRender(lettuce);
    
    registerRender(copper_ingot);
    registerRender(sack);
    registerRender(raw_patty);
    registerRender(salt);
    registerRender(crumbs);
    registerRender(raw_nugget);
    registerRender(gear);
    registerRender(chicken_puree);
    registerRender(motor);
    registerRender(coil);
    registerRender(lightbulb);
    
    registerRender(wrench);
    registerRender(fertilizer);
    registerRender(hand_blender);
    registerRender(singularity);
    registerRender(help_guide);
  }
  




  public static void registerRender(Item item)
  {
	  Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
  }
}
