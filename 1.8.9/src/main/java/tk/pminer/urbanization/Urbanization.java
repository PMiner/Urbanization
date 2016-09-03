package tk.pminer.urbanization;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import scala.Console;
import tk.pminer.urbanization.init.UrbanizationBlocks;
import tk.pminer.urbanization.init.UrbanizationChestGen;
import tk.pminer.urbanization.init.UrbanizationItems;
import tk.pminer.urbanization.init.UrbanizationOreDictionary;
import tk.pminer.urbanization.proxy.CommonProxy;

@net.minecraftforge.fml.common.Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.Version, acceptedMinecraftVersions="[1.8.9]")
public class Urbanization
{
	public static final UrbanizationTab tabUrbanization = new UrbanizationTab("tabUrbanization");
	@net.minecraftforge.fml.common.SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	public Urbanization() {}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		UrbanizationBlocks.init();
		UrbanizationBlocks.register();
		UrbanizationItems.init();
		UrbanizationItems.register();
		tk.pminer.urbanization.init.UrbanizationRecipies.init();
		tk.pminer.urbanization.init.UrbanizationWorldGen.init();
		UrbanizationOreDictionary.LoadOreDictionary();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerRenders();
		tk.pminer.urbanization.init.UrbanizationSeeds.init();
		UrbanizationChestGen.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Console.print("Urbanization Copyright\n#***************************************************************\nUrbanization belongs to PMiner. If you want to use mod this in a mod pack, public or private, you must state that this mod was made by PMiner.\nPlease don't sell this mod for any reason. Modding is hard work. Please don't modify it, or steal the code, but you can learn from it.\nIf you want to ask for an exception, email me. Please don't redistribute the mod without asking me first.\nAlso, don't post it on your website without asking me first! I don't have a website, so don't look for one.\nBy using this mod, you agree to these terms.\n+ I don't in any way own Minecraft. Minecraft is owned by mojang. It is copyrighted to Mojang. In case you are wondering, i don't own Mojang either.\n+ I also don't own Forge Mod Loader. The code is authored by cpw. To view the full licence, look for credits-fml.txt in the forge jar file in your minecraft directory.\n+ I do however, own Urbanizaiton. So don't sell that. Owned by PMiner, just in case you forgot.\n#***************************************************************\n\nNow that i have covered the copyright stuff, i will cover how my mod works!\nBasically, you can urbanize minecraft! build cities! Make roads!\nThere will be many, many, many more updates coming soon! I really hope you enjoy this mod! :D email any suggestions you have to my email! thanks! :D\n\nMy email: pminerYT@gmail.com\n");
	}
}
