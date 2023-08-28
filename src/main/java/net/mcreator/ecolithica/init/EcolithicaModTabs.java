
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ecolithica.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EcolithicaModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("ecolithica", "ecolithica"),
				builder -> builder.title(Component.translatable("item_group.ecolithica.ecolithica")).icon(() -> new ItemStack(EcolithicaModBlocks.FROSTPETAL.get())).displayItems((parameters, tabData) -> {
					tabData.accept(EcolithicaModBlocks.FROSTPETAL.get().asItem());
					tabData.accept(EcolithicaModBlocks.LUMIBLOOM.get().asItem());
					tabData.accept(EcolithicaModBlocks.EMBERBLOSSOM.get().asItem());
					tabData.accept(EcolithicaModBlocks.SYLVAN_ROSE.get().asItem());
				}).withSearchBar());
	}
}
