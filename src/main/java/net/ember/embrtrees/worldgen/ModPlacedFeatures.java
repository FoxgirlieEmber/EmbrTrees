package net.ember.embrtrees.worldgen;

import net.ember.embrtrees.EmbrTrees;
import net.ember.embrtrees.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> ASH_PLACED_KEY = createKey("ash_placed");
    public static final ResourceKey<PlacedFeature> ASTRAL_PLACED_KEY = createKey("astral_placed");
    public static final ResourceKey<PlacedFeature> BLOSSOM_PLACED_KEY = createKey("blossom_placed");
    public static final ResourceKey<PlacedFeature> VOID_BLOSSOM_PLACED_KEY = createKey("void_blossom_placed");
    public static final ResourceKey<PlacedFeature> GHOSTWOOD_PLACED_KEY = createKey("ghostwood_placed");
    public static final ResourceKey<PlacedFeature> MAHOGANY_PLACED_KEY = createKey("mahogany_placed");
    public static final ResourceKey<PlacedFeature> OCEANIC_PLACED_KEY = createKey("oceanic_placed");
    public static final ResourceKey<PlacedFeature> QUARTZWOOD_PLACED_KEY = createKey("quartzwood_placed");
    public static final ResourceKey<PlacedFeature> VAMPIRIC_PLACED_KEY = createKey("vampiric_placed");
    public static final ResourceKey<PlacedFeature> WILLOW_PLACED_KEY = createKey("willow_placed");
    public static final ResourceKey<PlacedFeature> BLACKWOOD_PLACED_KEY = createKey("blackwood_placed");
    public static final ResourceKey<PlacedFeature> WALNUT_PLACED_KEY = createKey("walnut_placed");
    public static final ResourceKey<PlacedFeature> HEARTWOOD_PLACED_KEY = createKey("heartwood_placed");
    public static final ResourceKey<PlacedFeature> SUNRISE_PLACED_KEY = createKey("sunrise_placed");
    public static final ResourceKey<PlacedFeature> ERROR_PLACED_KEY = createKey("error_placed");
    public static final ResourceKey<PlacedFeature> CYAN_PLACED_KEY = createKey("cyan_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ASH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ASH_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.ASH_SAPLING.get()));
        register(context, ASTRAL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ASTRAL_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.ASTRAL_SAPLING.get()));
        register(context, BLOSSOM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLOSSOM_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.BLOSSOM_SAPLING.get()));
        register(context, VOID_BLOSSOM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.VOID_BLOSSOM_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.VOID_BLOSSOM_SAPLING.get()));
        register(context, GHOSTWOOD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GHOSTWOOD_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.GHOSTWOOD_SAPLING.get()));
        register(context, MAHOGANY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAHOGANY_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.MAHOGANY_SAPLING.get()));
        register(context, OCEANIC_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OCEANIC_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.OCEANIC_SAPLING.get()));
        register(context, QUARTZWOOD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.QUARTZWOOD_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.QUARTZWOOD_SAPLING.get()));
        register(context, VAMPIRIC_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.VAMPIRIC_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.VAMPIRIC_SAPLING.get()));
        register(context, WILLOW_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WILLOW_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.WILLOW_SAPLING.get()));
        register(context, BLACKWOOD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACKWOOD_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.BLACKWOOD_SAPLING.get()));
        register(context, WALNUT_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WALNUT_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.WALNUT_SAPLING.get()));
        register(context, HEARTWOOD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.HEARTWOOD_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.HEARTWOOD_SAPLING.get()));
        register(context, SUNRISE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SUNRISE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.SUNRISE_SAPLING.get()));

        register(context, ERROR_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ERROR_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.ERROR_SAPLING.get()));

        register(context, CYAN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CYAN_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.CYAN_SAPLING.get()));

    }



    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(EmbrTrees.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
