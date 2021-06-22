package net.chcknlvr.blockx.worldgen;

import net.chcknlvr.blockx.Blockx;
import net.chcknlvr.blockx.block.Blocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class Ores {
    private static ConfiguredFeature<?, ?> WOLFRAMITE_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER, // We use OreFeatureConfig.Rules.BASE_STONE_NETHER for nether
                    Blocks.WOLFRAMITE.getDefaultState(),
                    2))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    UniformHeightProvider.create(
                            YOffset.fixed(0),
                            YOffset.fixed(15)))))
            .spreadHorizontally()
            .repeat(2);
    public static void register() {
        RegistryKey<ConfiguredFeature<?, ?>> wolframiteNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(Blockx.MODID, "wolframite_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, wolframiteNether.getValue(), WOLFRAMITE_NETHER);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, wolframiteNether);
    }
}
