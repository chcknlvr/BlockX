package chcknlvr.blockx

import net.minecraft.world.gen.feature.OreFeatureConfig
import net.minecraft.world.gen.decorator.Decorator
import net.minecraft.world.gen.decorator.RangeDecoratorConfig
import net.minecraft.util.registry.BuiltinRegistries
import net.fabricmc.fabric.api.biome.v1.BiomeModifications
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.util.registry.RegistryKey
import net.minecraft.world.gen.GenerationStep
import net.minecraft.world.gen.feature.Feature

object Ores {
    private val WOLFRAMITE_NETHER = Feature.ORE
        .configure(
            OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_NETHER,
                Blockx.WOLFRAMITE.defaultState,
                2
            )
        ) // vein size
        .decorate(
            Decorator.RANGE.configure(
                RangeDecoratorConfig(
                    0,
                    0,
                    15
                )
            )
        )
        .spreadHorizontally()
        .repeat(2) // number of veins per chunk

    @JvmStatic
    fun oreRegister() {
        val wolframiteNether = RegistryKey.of(
            Registry.CONFIGURED_FEATURE_WORLDGEN,
            Identifier("blockx", "wolframite_nether")
        )
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, wolframiteNether.value, WOLFRAMITE_NETHER)
        BiomeModifications.addFeature(
            BiomeSelectors.foundInTheNether(),
            GenerationStep.Feature.UNDERGROUND_ORES,
            wolframiteNether
        )
    }
}