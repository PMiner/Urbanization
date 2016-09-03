package tk.pminer.urbanization.init;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class UrbanizationWorldGen implements IWorldGenerator
{ 
	public static void init()
	{
		net.minecraftforge.fml.common.registry.GameRegistry.registerWorldGenerator(new UrbanizationWorldGen(), 0);
	}
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.getDimensionId())
		{
			case -1: 
				generateNether(world, random, chunkX, chunkZ);
				break;
			case 0: 
				generateOverworld(world, random, chunkX, chunkZ);
				break;
			case 1: 
				generateEnd(world, random, chunkX, chunkZ);
		}
	}
  
	public void generateNether(World world, Random rand, int x, int z)
	{
		generateOre(UrbanizationBlocks.nether_singularity_ore, world, rand, x, z, 3, 5, 60, 10, 100, Blocks.netherrack);
	}

	public void generateOverworld(World world, Random rand, int x, int z) 
	{
		generateOre(UrbanizationBlocks.copper_ore, world, rand, x, z, 3, 5, 60, 30, 70, Blocks.stone);
	}
  

  public void generateEnd(World world, Random rand, int x, int z) {}
  
  public void generateOre(Block block, World world, Random rand, int chunkX, int chunkZ, int minVeinSize, int maxVeinSize, int chance, int minY, int maxY, Block generateIn)
  {
    int veinSize = minVeinSize + rand.nextInt(maxVeinSize - minVeinSize);
    int heightRange = maxY - minY;
    WorldGenMinable gen = new WorldGenMinable(block.getDefaultState(), veinSize, BlockHelper.forBlock(generateIn));
    for (int i = 0; i < chance; i++)
    {
      int Xrand = chunkX * 16 + rand.nextInt(16);
      int Yrand = rand.nextInt(heightRange) + minY;
      int Zrand = chunkZ * 16 + rand.nextInt(16);
      gen.generate(world, rand, new net.minecraft.util.BlockPos(Xrand, Yrand, Zrand));
    }
  }
}
