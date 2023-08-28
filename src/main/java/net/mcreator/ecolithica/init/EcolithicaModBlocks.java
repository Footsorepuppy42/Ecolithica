
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ecolithica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.ecolithica.block.SylvanRoseBlock;
import net.mcreator.ecolithica.block.MournvineBlock;
import net.mcreator.ecolithica.block.LumibloomBlock;
import net.mcreator.ecolithica.block.GeminiBlossomBlock;
import net.mcreator.ecolithica.block.FrostpetalBlock;
import net.mcreator.ecolithica.block.EmberbudCoreopsisBlock;
import net.mcreator.ecolithica.block.EmberblossomBlock;
import net.mcreator.ecolithica.block.AqualilyBlock;
import net.mcreator.ecolithica.EcolithicaMod;

public class EcolithicaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EcolithicaMod.MODID);
	public static final RegistryObject<Block> FROSTPETAL = REGISTRY.register("frostpetal", () -> new FrostpetalBlock());
	public static final RegistryObject<Block> LUMIBLOOM = REGISTRY.register("lumibloom", () -> new LumibloomBlock());
	public static final RegistryObject<Block> EMBERBLOSSOM = REGISTRY.register("emberblossom", () -> new EmberblossomBlock());
	public static final RegistryObject<Block> SYLVAN_ROSE = REGISTRY.register("sylvan_rose", () -> new SylvanRoseBlock());
	public static final RegistryObject<Block> AQUALILY = REGISTRY.register("aqualily", () -> new AqualilyBlock());
	public static final RegistryObject<Block> MOURNVINE = REGISTRY.register("mournvine", () -> new MournvineBlock());
	public static final RegistryObject<Block> EMBERBUD_COREOPSIS = REGISTRY.register("emberbud_coreopsis", () -> new EmberbudCoreopsisBlock());
	public static final RegistryObject<Block> GEMINI_BLOSSOM = REGISTRY.register("gemini_blossom", () -> new GeminiBlossomBlock());
}
