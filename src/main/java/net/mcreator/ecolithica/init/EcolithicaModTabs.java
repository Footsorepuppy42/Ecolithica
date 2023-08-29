
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ecolithica.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EcolithicaModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(EcolithicaModBlocks.SHADE_FENCE_GATE.get().asItem());
			tabData.accept(EcolithicaModBlocks.SHADE_PRESSURE_PLATE.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(EcolithicaModBlocks.SHADE_FENCE.get().asItem());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("ecolithica", "ecolithica"),
				builder -> builder.title(Component.translatable("item_group.ecolithica.ecolithica")).icon(() -> new ItemStack(EcolithicaModBlocks.FROSTPETAL.get())).displayItems((parameters, tabData) -> {
					tabData.accept(EcolithicaModBlocks.FROSTPETAL.get().asItem());
					tabData.accept(EcolithicaModBlocks.SHORT_GRASS.get().asItem());
					tabData.accept(EcolithicaModBlocks.LUMIBLOOM.get().asItem());
					tabData.accept(EcolithicaModBlocks.EMBERBLOSSOM.get().asItem());
					tabData.accept(EcolithicaModBlocks.SYLVAN_ROSE.get().asItem());
					tabData.accept(EcolithicaModBlocks.MOURNVINE.get().asItem());
					tabData.accept(EcolithicaModBlocks.SHADE_WOOD.get().asItem());
					tabData.accept(EcolithicaModBlocks.EMBERBUD_COREOPSIS.get().asItem());
					tabData.accept(EcolithicaModBlocks.SHADE_LOG.get().asItem());
					tabData.accept(EcolithicaModBlocks.GEMINI_BLOSSOM.get().asItem());
					tabData.accept(EcolithicaModBlocks.SHADE_PLANKS.get().asItem());
					tabData.accept(EcolithicaModBlocks.SHADE_STAIRS.get().asItem());
					tabData.accept(EcolithicaModBlocks.SHADE_SLAB.get().asItem());
					tabData.accept(EcolithicaModBlocks.SHADE_BUTTON.get().asItem());
				}).withSearchBar());
	}
}
