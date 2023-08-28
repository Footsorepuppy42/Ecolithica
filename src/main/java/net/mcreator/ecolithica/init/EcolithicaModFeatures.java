
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ecolithica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.ecolithica.world.features.ObsadionrockFeature;
import net.mcreator.ecolithica.EcolithicaMod;

@Mod.EventBusSubscriber
public class EcolithicaModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, EcolithicaMod.MODID);
	public static final RegistryObject<Feature<?>> OBSADIONROCK = REGISTRY.register("obsadionrock", ObsadionrockFeature::new);
}
