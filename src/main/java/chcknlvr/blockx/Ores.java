package chcknlvr.blockx;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class Ores {
    private static final ConfiguredFeature<?, ?> WOLFRAMITE_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER,
                    Blockx.WOLFRAMITE.getDefaultState(),
                    4)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    15)))
            .spreadHorizontally()
            .repeat(2); // number of veins per chunk


    public static void oreRegister() {
        RegistryKey<ConfiguredFeature<?, ?>> wolframiteNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("blockx", "wolframite_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, wolframiteNether.getValue(), WOLFRAMITE_NETHER);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, wolframiteNether);
    }
}
