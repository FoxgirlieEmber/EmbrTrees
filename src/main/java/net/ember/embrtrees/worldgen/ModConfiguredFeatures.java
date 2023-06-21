package net.ember.embrtrees.worldgen;

import net.ember.embrtrees.EmbrTrees;
import net.ember.embrtrees.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> ASH_KEY = registerKey("ash");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ASTRAL_KEY = registerKey("astral");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLOSSOM_KEY = registerKey("blossom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VOID_BLOSSOM_KEY = registerKey("void_blossom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GHOSTWOOD_KEY = registerKey("ghostwood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAHOGANY_KEY = registerKey("mahogany");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OCEANIC_KEY = registerKey("oceanic");
    public static final ResourceKey<ConfiguredFeature<?, ?>> QUARTZWOOD_KEY = registerKey("quartzwood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VAMPIRIC_KEY = registerKey("vampiric");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_KEY = registerKey("willow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKWOOD_KEY = registerKey("blackwood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WALNUT_KEY = registerKey("walnut");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HEARTWOOD_KEY = registerKey("heartwood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SUNRISE_KEY = registerKey("sunrise");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ERROR_KEY = registerKey("error");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYAN_KEY = registerKey("cyan");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(context, ASH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ASH_LOG.get()),
                new StraightTrunkPlacer(5,6, 3),
                BlockStateProvider.simple(ModBlocks.ASH_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, ASTRAL_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ASTRAL_LOG.get()),
                new StraightTrunkPlacer(5,6, 3),
                BlockStateProvider.simple(ModBlocks.ASTRAL_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, BLOSSOM_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.BLOSSOM_LOG.get()),
                new StraightTrunkPlacer(5,6, 3),
                BlockStateProvider.simple(ModBlocks.BLOSSOM_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, VOID_BLOSSOM_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.VOID_BLOSSOM_LOG.get()),
                new StraightTrunkPlacer(5,6, 3),
                BlockStateProvider.simple(ModBlocks.VOID_BLOSSOM_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, GHOSTWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GHOSTWOOD_LOG.get()),
                new StraightTrunkPlacer(5,6, 3),
                BlockStateProvider.simple(ModBlocks.GHOSTWOOD_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, MAHOGANY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.MAHOGANY_LOG.get()),
                new StraightTrunkPlacer(5,6, 3),
                BlockStateProvider.simple(ModBlocks.MAHOGANY_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, OCEANIC_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.OCEANIC_LOG.get()),
                new StraightTrunkPlacer(5,6, 3),
                BlockStateProvider.simple(ModBlocks.OCEANIC_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, QUARTZWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.QUARTZWOOD_LOG.get()),
                new StraightTrunkPlacer(5,6, 3),
                BlockStateProvider.simple(ModBlocks.QUARTZWOOD_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, VAMPIRIC_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.VAMPIRIC_LOG.get()),
                new StraightTrunkPlacer(5,6, 3),
                BlockStateProvider.simple(ModBlocks.VAMPIRIC_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, WILLOW_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WILLOW_LOG.get()),
                new StraightTrunkPlacer(5,6, 3),
                BlockStateProvider.simple(ModBlocks.WILLOW_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, BLACKWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.BLACKWOOD_LOG.get()),
                new StraightTrunkPlacer(5,6, 3),
                BlockStateProvider.simple(ModBlocks.BLACKWOOD_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, WALNUT_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WALNUT_LOG.get()),
                new StraightTrunkPlacer(5,6, 3),
                BlockStateProvider.simple(ModBlocks.WALNUT_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, HEARTWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.HEARTWOOD_LOG.get()),
                new StraightTrunkPlacer(5,6, 3),
                BlockStateProvider.simple(ModBlocks.HEARTWOOD_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, SUNRISE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.SUNRISE_LOG.get()),
                new StraightTrunkPlacer(5,6, 3),
                BlockStateProvider.simple(ModBlocks.SUNRISE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, ERROR_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ERROR_LOG.get()),
                new StraightTrunkPlacer(5,6, 3),
                BlockStateProvider.simple(ModBlocks.ERROR_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, CYAN_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CYAN_LOG.get()),
                new StraightTrunkPlacer(5,6, 3),
                BlockStateProvider.simple(ModBlocks.CYAN_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(EmbrTrees.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
