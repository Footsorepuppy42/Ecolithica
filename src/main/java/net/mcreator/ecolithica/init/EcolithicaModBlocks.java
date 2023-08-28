
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ecolithica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.ecolithica.block.SylvanRoseBlock;
import net.mcreator.ecolithica.block.ShadeWoodBlock;
import net.mcreator.ecolithica.block.ShadeStairsBlock;
import net.mcreator.ecolithica.block.ShadeSlabBlock;
import net.mcreator.ecolithica.block.ShadePressurePlateBlock;
import net.mcreator.ecolithica.block.ShadePlanksBlock;
import net.mcreator.ecolithica.block.ShadeLogBlock;
import net.mcreator.ecolithica.block.ShadeFenceGateBlock;
import net.mcreator.ecolithica.block.ShadeFenceBlock;
import net.mcreator.ecolithica.block.ShadeButtonBlock;
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
	public static final RegistryObject<Block> SHADE_WOOD = REGISTRY.register("shade_wood", () -> new ShadeWoodBlock());
	public static final RegistryObject<Block> EMBERBUD_COREOPSIS = REGISTRY.register("emberbud_coreopsis", () -> new EmberbudCoreopsisBlock());
	public static final RegistryObject<Block> SHADE_LOG = REGISTRY.register("shade_log", () -> new ShadeLogBlock());
	public static final RegistryObject<Block> GEMINI_BLOSSOM = REGISTRY.register("gemini_blossom", () -> new GeminiBlossomBlock());
	public static final RegistryObject<Block> SHADE_PLANKS = REGISTRY.register("shade_planks", () -> new ShadePlanksBlock());
	public static final RegistryObject<Block> SHADE_STAIRS = REGISTRY.register("shade_stairs", () -> new ShadeStairsBlock());
	public static final RegistryObject<Block> SHADE_SLAB = REGISTRY.register("shade_slab", () -> new ShadeSlabBlock());
	public static final RegistryObject<Block> SHADE_FENCE = REGISTRY.register("shade_fence", () -> new ShadeFenceBlock());
	public static final RegistryObject<Block> SHADE_FENCE_GATE = REGISTRY.register("shade_fence_gate", () -> new ShadeFenceGateBlock());
	public static final RegistryObject<Block> SHADE_PRESSURE_PLATE = REGISTRY.register("shade_pressure_plate", () -> new ShadePressurePlateBlock());
	public static final RegistryObject<Block> SHADE_BUTTON = REGISTRY.register("shade_button", () -> new ShadeButtonBlock());
}
