
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ecolithica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ecolithica.item.AqualilyItemItem;
import net.mcreator.ecolithica.EcolithicaMod;

public class EcolithicaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EcolithicaMod.MODID);
	public static final RegistryObject<Item> FROSTPETAL = block(EcolithicaModBlocks.FROSTPETAL);
	public static final RegistryObject<Item> LUMIBLOOM = block(EcolithicaModBlocks.LUMIBLOOM);
	public static final RegistryObject<Item> EMBERBLOSSOM = block(EcolithicaModBlocks.EMBERBLOSSOM);
	public static final RegistryObject<Item> SYLVAN_ROSE = block(EcolithicaModBlocks.SYLVAN_ROSE);
	public static final RegistryObject<Item> AQUALILY = block(EcolithicaModBlocks.AQUALILY);
	public static final RegistryObject<Item> AQUALILY_ITEM = REGISTRY.register("aqualily_item", () -> new AqualilyItemItem());
	public static final RegistryObject<Item> MOURNVINE = block(EcolithicaModBlocks.MOURNVINE);
	public static final RegistryObject<Item> SHADE_WOOD = block(EcolithicaModBlocks.SHADE_WOOD);
	public static final RegistryObject<Item> EMBERBUD_COREOPSIS = block(EcolithicaModBlocks.EMBERBUD_COREOPSIS);
	public static final RegistryObject<Item> SHADE_LOG = block(EcolithicaModBlocks.SHADE_LOG);
	public static final RegistryObject<Item> GEMINI_BLOSSOM = block(EcolithicaModBlocks.GEMINI_BLOSSOM);
	public static final RegistryObject<Item> SHADE_PLANKS = block(EcolithicaModBlocks.SHADE_PLANKS);
	public static final RegistryObject<Item> SHADE_STAIRS = block(EcolithicaModBlocks.SHADE_STAIRS);
	public static final RegistryObject<Item> SHADE_SLAB = block(EcolithicaModBlocks.SHADE_SLAB);
	public static final RegistryObject<Item> SHADE_FENCE = block(EcolithicaModBlocks.SHADE_FENCE);
	public static final RegistryObject<Item> SHADE_FENCE_GATE = block(EcolithicaModBlocks.SHADE_FENCE_GATE);
	public static final RegistryObject<Item> SHADE_PRESSURE_PLATE = block(EcolithicaModBlocks.SHADE_PRESSURE_PLATE);
	public static final RegistryObject<Item> SHADE_BUTTON = block(EcolithicaModBlocks.SHADE_BUTTON);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
