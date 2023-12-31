
package net.mcreator.ecolithica.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.BlockPileConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.BlockPileFeature;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceKey;

import java.util.Set;

public class ObsadionrockFeature extends BlockPileFeature {
	private final Set<ResourceKey<Level>> generateDimensions = Set.of(Level.NETHER);

	public ObsadionrockFeature() {
		super(BlockPileConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<BlockPileConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generateDimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
