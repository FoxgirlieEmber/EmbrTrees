package net.ember.embrtrees.datagen;

import net.ember.embrtrees.block.ModBlocks;
import net.ember.embrtrees.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
//ASH WOOD
        this.dropSelf(ModBlocks.ASH_LOG.get());
        this.dropSelf(ModBlocks.ASH_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ASH_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_ASH_WOOD.get());
        this.dropSelf(ModBlocks.ASH_PLANKS.get());
        this.dropSelf(ModBlocks.ASH_STAIRS.get());
        this.dropSelf(ModBlocks.ASH_SLAB.get());
        this.dropSelf(ModBlocks.ASH_TRAPDOOR.get());
        this.dropSelf(ModBlocks.ASH_FENCE.get());
        this.dropSelf(ModBlocks.ASH_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ASH_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ASH_BUTTON.get());
        this.add(ModBlocks.ASH_DOOR.get(), (block) ->
                createDoorTable(ModBlocks.ASH_DOOR.get()));
        this.add(ModBlocks.ASH_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.ASH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.ASH_SAPLING.get());
        this.dropOther(ModBlocks.ASH_WALL_SIGN.get(), ModItems.ASH_SIGN.get());
        this.dropOther(ModBlocks.ASH_SIGN.get(), ModItems.ASH_SIGN.get());
        this.dropOther(ModBlocks.ASH_HANGING_WALL_SIGN.get(), ModItems.ASH_HANGING_SIGN.get());
        this.dropOther(ModBlocks.ASH_HANGING_SIGN.get(), ModItems.ASH_HANGING_SIGN.get());
//ASTRAL WOOD
        this.dropSelf(ModBlocks.ASTRAL_LOG.get());
        this.dropSelf(ModBlocks.ASTRAL_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ASTRAL_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_ASTRAL_WOOD.get());
        this.dropSelf(ModBlocks.ASTRAL_PLANKS.get());
        this.dropSelf(ModBlocks.ASTRAL_STAIRS.get());
        this.dropSelf(ModBlocks.ASTRAL_SLAB.get());
        this.dropSelf(ModBlocks.ASTRAL_TRAPDOOR.get());
        this.dropSelf(ModBlocks.ASTRAL_FENCE.get());
        this.dropSelf(ModBlocks.ASTRAL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ASTRAL_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ASTRAL_BUTTON.get());
        this.add(ModBlocks.ASTRAL_DOOR.get(), (block) ->
                createDoorTable(ModBlocks.ASTRAL_DOOR.get()));
        this.add(ModBlocks.ASTRAL_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.ASTRAL_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.ASTRAL_SAPLING.get());
        this.dropOther(ModBlocks.ASTRAL_WALL_SIGN.get(), ModItems.ASTRAL_SIGN.get());
        this.dropOther(ModBlocks.ASTRAL_SIGN.get(), ModItems.ASTRAL_SIGN.get());
        this.dropOther(ModBlocks.ASTRAL_HANGING_WALL_SIGN.get(), ModItems.ASTRAL_HANGING_SIGN.get());
        this.dropOther(ModBlocks.ASTRAL_HANGING_SIGN.get(), ModItems.ASTRAL_HANGING_SIGN.get());
//BLOSSOM WOOD
        this.dropSelf(ModBlocks.BLOSSOM_LOG.get());
        this.dropSelf(ModBlocks.BLOSSOM_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_BLOSSOM_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BLOSSOM_WOOD.get());
        this.dropSelf(ModBlocks.BLOSSOM_PLANKS.get());
        this.dropSelf(ModBlocks.BLOSSOM_STAIRS.get());
        this.dropSelf(ModBlocks.BLOSSOM_SLAB.get());
        this.dropSelf(ModBlocks.BLOSSOM_TRAPDOOR.get());
        this.dropSelf(ModBlocks.BLOSSOM_FENCE.get());
        this.dropSelf(ModBlocks.BLOSSOM_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLOSSOM_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.BLOSSOM_BUTTON.get());
        this.add(ModBlocks.BLOSSOM_DOOR.get(), (block) ->
                createDoorTable(ModBlocks.BLOSSOM_DOOR.get()));
        this.add(ModBlocks.BLOSSOM_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.BLOSSOM_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.BLOSSOM_SAPLING.get());
        this.dropOther(ModBlocks.BLOSSOM_WALL_SIGN.get(), ModItems.BLOSSOM_SIGN.get());
        this.dropOther(ModBlocks.BLOSSOM_SIGN.get(), ModItems.BLOSSOM_SIGN.get());
        this.dropOther(ModBlocks.BLOSSOM_HANGING_WALL_SIGN.get(), ModItems.BLOSSOM_HANGING_SIGN.get());
        this.dropOther(ModBlocks.BLOSSOM_HANGING_SIGN.get(), ModItems.BLOSSOM_HANGING_SIGN.get());
//VOID_BLOSSOM WOOD
        this.dropSelf(ModBlocks.VOID_BLOSSOM_LOG.get());
        this.dropSelf(ModBlocks.VOID_BLOSSOM_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_VOID_BLOSSOM_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_VOID_BLOSSOM_WOOD.get());
        this.dropSelf(ModBlocks.VOID_BLOSSOM_PLANKS.get());
        this.dropSelf(ModBlocks.VOID_BLOSSOM_STAIRS.get());
        this.dropSelf(ModBlocks.VOID_BLOSSOM_SLAB.get());
        this.dropSelf(ModBlocks.VOID_BLOSSOM_TRAPDOOR.get());
        this.dropSelf(ModBlocks.VOID_BLOSSOM_FENCE.get());
        this.dropSelf(ModBlocks.VOID_BLOSSOM_FENCE_GATE.get());
        this.dropSelf(ModBlocks.VOID_BLOSSOM_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.VOID_BLOSSOM_BUTTON.get());
        this.add(ModBlocks.VOID_BLOSSOM_DOOR.get(), (block) ->
                createDoorTable(ModBlocks.VOID_BLOSSOM_DOOR.get()));
        this.add(ModBlocks.VOID_BLOSSOM_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.VOID_BLOSSOM_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.VOID_BLOSSOM_SAPLING.get());
        this.dropOther(ModBlocks.VOID_BLOSSOM_WALL_SIGN.get(), ModItems.VOID_BLOSSOM_SIGN.get());
        this.dropOther(ModBlocks.VOID_BLOSSOM_SIGN.get(), ModItems.VOID_BLOSSOM_SIGN.get());
        this.dropOther(ModBlocks.VOID_BLOSSOM_HANGING_WALL_SIGN.get(), ModItems.VOID_BLOSSOM_HANGING_SIGN.get());
        this.dropOther(ModBlocks.VOID_BLOSSOM_HANGING_SIGN.get(), ModItems.VOID_BLOSSOM_HANGING_SIGN.get());
//GHOSTWOOD WOOD
        this.dropSelf(ModBlocks.GHOSTWOOD_LOG.get());
        this.dropSelf(ModBlocks.GHOSTWOOD_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_GHOSTWOOD_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_GHOSTWOOD_WOOD.get());
        this.dropSelf(ModBlocks.GHOSTWOOD_PLANKS.get());
        this.dropSelf(ModBlocks.GHOSTWOOD_STAIRS.get());
        this.dropSelf(ModBlocks.GHOSTWOOD_SLAB.get());
        this.dropSelf(ModBlocks.GHOSTWOOD_TRAPDOOR.get());
        this.dropSelf(ModBlocks.GHOSTWOOD_FENCE.get());
        this.dropSelf(ModBlocks.GHOSTWOOD_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GHOSTWOOD_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.GHOSTWOOD_BUTTON.get());
        this.add(ModBlocks.GHOSTWOOD_DOOR.get(), (block) ->
                createDoorTable(ModBlocks.GHOSTWOOD_DOOR.get()));
        this.add(ModBlocks.GHOSTWOOD_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.GHOSTWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.GHOSTWOOD_SAPLING.get());
        this.dropOther(ModBlocks.GHOSTWOOD_WALL_SIGN.get(), ModItems.GHOSTWOOD_SIGN.get());
        this.dropOther(ModBlocks.GHOSTWOOD_SIGN.get(), ModItems.GHOSTWOOD_SIGN.get());
        this.dropOther(ModBlocks.GHOSTWOOD_HANGING_WALL_SIGN.get(), ModItems.GHOSTWOOD_HANGING_SIGN.get());
        this.dropOther(ModBlocks.GHOSTWOOD_HANGING_SIGN.get(), ModItems.GHOSTWOOD_HANGING_SIGN.get());
//MAHOGANY WOOD
        this.dropSelf(ModBlocks.MAHOGANY_LOG.get());
        this.dropSelf(ModBlocks.MAHOGANY_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_MAHOGANY_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_MAHOGANY_WOOD.get());
        this.dropSelf(ModBlocks.MAHOGANY_PLANKS.get());
        this.dropSelf(ModBlocks.MAHOGANY_STAIRS.get());
        this.dropSelf(ModBlocks.MAHOGANY_SLAB.get());
        this.dropSelf(ModBlocks.MAHOGANY_TRAPDOOR.get());
        this.dropSelf(ModBlocks.MAHOGANY_FENCE.get());
        this.dropSelf(ModBlocks.MAHOGANY_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MAHOGANY_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.MAHOGANY_BUTTON.get());
        this.add(ModBlocks.MAHOGANY_DOOR.get(), (block) ->
                createDoorTable(ModBlocks.MAHOGANY_DOOR.get()));
        this.add(ModBlocks.MAHOGANY_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.MAHOGANY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.MAHOGANY_SAPLING.get());
        this.dropOther(ModBlocks.MAHOGANY_WALL_SIGN.get(), ModItems.MAHOGANY_SIGN.get());
        this.dropOther(ModBlocks.MAHOGANY_SIGN.get(), ModItems.MAHOGANY_SIGN.get());
        this.dropOther(ModBlocks.MAHOGANY_HANGING_WALL_SIGN.get(), ModItems.MAHOGANY_HANGING_SIGN.get());
        this.dropOther(ModBlocks.MAHOGANY_HANGING_SIGN.get(), ModItems.MAHOGANY_HANGING_SIGN.get());
//OCEANIC WOOD
        this.dropSelf(ModBlocks.OCEANIC_LOG.get());
        this.dropSelf(ModBlocks.OCEANIC_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_OCEANIC_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_OCEANIC_WOOD.get());
        this.dropSelf(ModBlocks.OCEANIC_PLANKS.get());
        this.dropSelf(ModBlocks.OCEANIC_STAIRS.get());
        this.dropSelf(ModBlocks.OCEANIC_SLAB.get());
        this.dropSelf(ModBlocks.OCEANIC_TRAPDOOR.get());
        this.dropSelf(ModBlocks.OCEANIC_FENCE.get());
        this.dropSelf(ModBlocks.OCEANIC_FENCE_GATE.get());
        this.dropSelf(ModBlocks.OCEANIC_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.OCEANIC_BUTTON.get());
        this.add(ModBlocks.OCEANIC_DOOR.get(), (block) ->
                createDoorTable(ModBlocks.OCEANIC_DOOR.get()));
        this.add(ModBlocks.OCEANIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.OCEANIC_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.OCEANIC_SAPLING.get());
        this.dropOther(ModBlocks.OCEANIC_WALL_SIGN.get(), ModItems.OCEANIC_SIGN.get());
        this.dropOther(ModBlocks.OCEANIC_SIGN.get(), ModItems.OCEANIC_SIGN.get());
        this.dropOther(ModBlocks.OCEANIC_HANGING_WALL_SIGN.get(), ModItems.OCEANIC_HANGING_SIGN.get());
        this.dropOther(ModBlocks.OCEANIC_HANGING_SIGN.get(), ModItems.OCEANIC_HANGING_SIGN.get());
//QUARTZWOOD WOOD
        this.dropSelf(ModBlocks.QUARTZWOOD_LOG.get());
        this.dropSelf(ModBlocks.QUARTZWOOD_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_QUARTZWOOD_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_QUARTZWOOD_WOOD.get());
        this.dropSelf(ModBlocks.QUARTZWOOD_PLANKS.get());
        this.dropSelf(ModBlocks.QUARTZWOOD_STAIRS.get());
        this.dropSelf(ModBlocks.QUARTZWOOD_SLAB.get());
        this.dropSelf(ModBlocks.QUARTZWOOD_TRAPDOOR.get());
        this.dropSelf(ModBlocks.QUARTZWOOD_FENCE.get());
        this.dropSelf(ModBlocks.QUARTZWOOD_FENCE_GATE.get());
        this.dropSelf(ModBlocks.QUARTZWOOD_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.QUARTZWOOD_BUTTON.get());
        this.add(ModBlocks.QUARTZWOOD_DOOR.get(), (block) ->
                createDoorTable(ModBlocks.QUARTZWOOD_DOOR.get()));
        this.add(ModBlocks.QUARTZWOOD_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.QUARTZWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.QUARTZWOOD_SAPLING.get());
        this.dropOther(ModBlocks.QUARTZWOOD_WALL_SIGN.get(), ModItems.QUARTZWOOD_SIGN.get());
        this.dropOther(ModBlocks.QUARTZWOOD_SIGN.get(), ModItems.QUARTZWOOD_SIGN.get());
        this.dropOther(ModBlocks.QUARTZWOOD_HANGING_WALL_SIGN.get(), ModItems.QUARTZWOOD_HANGING_SIGN.get());
        this.dropOther(ModBlocks.QUARTZWOOD_HANGING_SIGN.get(), ModItems.QUARTZWOOD_HANGING_SIGN.get());
//VAMPIRIC WOOD
        this.dropSelf(ModBlocks.VAMPIRIC_LOG.get());
        this.dropSelf(ModBlocks.VAMPIRIC_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_VAMPIRIC_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_VAMPIRIC_WOOD.get());
        this.dropSelf(ModBlocks.VAMPIRIC_PLANKS.get());
        this.dropSelf(ModBlocks.VAMPIRIC_STAIRS.get());
        this.dropSelf(ModBlocks.VAMPIRIC_SLAB.get());
        this.dropSelf(ModBlocks.VAMPIRIC_TRAPDOOR.get());
        this.dropSelf(ModBlocks.VAMPIRIC_FENCE.get());
        this.dropSelf(ModBlocks.VAMPIRIC_FENCE_GATE.get());
        this.dropSelf(ModBlocks.VAMPIRIC_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.VAMPIRIC_BUTTON.get());
        this.add(ModBlocks.VAMPIRIC_DOOR.get(), (block) ->
                createDoorTable(ModBlocks.VAMPIRIC_DOOR.get()));
        this.add(ModBlocks.VAMPIRIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.VAMPIRIC_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.VAMPIRIC_SAPLING.get());
        this.dropOther(ModBlocks.VAMPIRIC_WALL_SIGN.get(), ModItems.VAMPIRIC_SIGN.get());
        this.dropOther(ModBlocks.VAMPIRIC_SIGN.get(), ModItems.VAMPIRIC_SIGN.get());
        this.dropOther(ModBlocks.VAMPIRIC_HANGING_WALL_SIGN.get(), ModItems.VAMPIRIC_HANGING_SIGN.get());
        this.dropOther(ModBlocks.VAMPIRIC_HANGING_SIGN.get(), ModItems.VAMPIRIC_HANGING_SIGN.get());
//WILLOW WOOD
        this.dropSelf(ModBlocks.WILLOW_LOG.get());
        this.dropSelf(ModBlocks.WILLOW_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_WILLOW_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WILLOW_WOOD.get());
        this.dropSelf(ModBlocks.WILLOW_PLANKS.get());
        this.dropSelf(ModBlocks.WILLOW_STAIRS.get());
        this.dropSelf(ModBlocks.WILLOW_SLAB.get());
        this.dropSelf(ModBlocks.WILLOW_TRAPDOOR.get());
        this.dropSelf(ModBlocks.WILLOW_FENCE.get());
        this.dropSelf(ModBlocks.WILLOW_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WILLOW_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.WILLOW_BUTTON.get());
        this.add(ModBlocks.WILLOW_DOOR.get(), (block) ->
                createDoorTable(ModBlocks.WILLOW_DOOR.get()));
        this.add(ModBlocks.WILLOW_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.WILLOW_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.WILLOW_SAPLING.get());
        this.dropOther(ModBlocks.WILLOW_WALL_SIGN.get(), ModItems.WILLOW_SIGN.get());
        this.dropOther(ModBlocks.WILLOW_SIGN.get(), ModItems.WILLOW_SIGN.get());
        this.dropOther(ModBlocks.WILLOW_HANGING_WALL_SIGN.get(), ModItems.WILLOW_HANGING_SIGN.get());
        this.dropOther(ModBlocks.WILLOW_HANGING_SIGN.get(), ModItems.WILLOW_HANGING_SIGN.get());
//BLACKWOOD WOOD
        this.dropSelf(ModBlocks.BLACKWOOD_LOG.get());
        this.dropSelf(ModBlocks.BLACKWOOD_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_BLACKWOOD_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BLACKWOOD_WOOD.get());
        this.dropSelf(ModBlocks.BLACKWOOD_PLANKS.get());
        this.dropSelf(ModBlocks.BLACKWOOD_STAIRS.get());
        this.dropSelf(ModBlocks.BLACKWOOD_SLAB.get());
        this.dropSelf(ModBlocks.BLACKWOOD_TRAPDOOR.get());
        this.dropSelf(ModBlocks.BLACKWOOD_FENCE.get());
        this.dropSelf(ModBlocks.BLACKWOOD_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLACKWOOD_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.BLACKWOOD_BUTTON.get());
        this.add(ModBlocks.BLACKWOOD_DOOR.get(), (block) ->
                createDoorTable(ModBlocks.BLACKWOOD_DOOR.get()));
        this.add(ModBlocks.BLACKWOOD_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.BLACKWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.BLACKWOOD_SAPLING.get());
        this.dropOther(ModBlocks.BLACKWOOD_WALL_SIGN.get(), ModItems.BLACKWOOD_SIGN.get());
        this.dropOther(ModBlocks.BLACKWOOD_SIGN.get(), ModItems.BLACKWOOD_SIGN.get());
        this.dropOther(ModBlocks.BLACKWOOD_HANGING_WALL_SIGN.get(), ModItems.BLACKWOOD_HANGING_SIGN.get());
        this.dropOther(ModBlocks.BLACKWOOD_HANGING_SIGN.get(), ModItems.BLACKWOOD_HANGING_SIGN.get());
//WALNUT WOOD
        this.dropSelf(ModBlocks.WALNUT_LOG.get());
        this.dropSelf(ModBlocks.WALNUT_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_WALNUT_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WALNUT_WOOD.get());
        this.dropSelf(ModBlocks.WALNUT_PLANKS.get());
        this.dropSelf(ModBlocks.WALNUT_STAIRS.get());
        this.dropSelf(ModBlocks.WALNUT_SLAB.get());
        this.dropSelf(ModBlocks.WALNUT_TRAPDOOR.get());
        this.dropSelf(ModBlocks.WALNUT_FENCE.get());
        this.dropSelf(ModBlocks.WALNUT_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WALNUT_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.WALNUT_BUTTON.get());
        this.add(ModBlocks.WALNUT_DOOR.get(), (block) ->
                createDoorTable(ModBlocks.WALNUT_DOOR.get()));
        this.add(ModBlocks.WALNUT_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.WALNUT_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.WALNUT_SAPLING.get());
        this.dropOther(ModBlocks.WALNUT_WALL_SIGN.get(), ModItems.WALNUT_SIGN.get());
        this.dropOther(ModBlocks.WALNUT_SIGN.get(), ModItems.WALNUT_SIGN.get());
        this.dropOther(ModBlocks.WALNUT_HANGING_WALL_SIGN.get(), ModItems.WALNUT_HANGING_SIGN.get());
        this.dropOther(ModBlocks.WALNUT_HANGING_SIGN.get(), ModItems.WALNUT_HANGING_SIGN.get());
//HEARTWOOD WOOD
        this.dropSelf(ModBlocks.HEARTWOOD_LOG.get());
        this.dropSelf(ModBlocks.HEARTWOOD_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_HEARTWOOD_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_HEARTWOOD_WOOD.get());
        this.dropSelf(ModBlocks.HEARTWOOD_PLANKS.get());
        this.dropSelf(ModBlocks.HEARTWOOD_STAIRS.get());
        this.dropSelf(ModBlocks.HEARTWOOD_SLAB.get());
        this.dropSelf(ModBlocks.HEARTWOOD_TRAPDOOR.get());
        this.dropSelf(ModBlocks.HEARTWOOD_FENCE.get());
        this.dropSelf(ModBlocks.HEARTWOOD_FENCE_GATE.get());
        this.dropSelf(ModBlocks.HEARTWOOD_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.HEARTWOOD_BUTTON.get());
        this.add(ModBlocks.HEARTWOOD_DOOR.get(), (block) ->
                createDoorTable(ModBlocks.HEARTWOOD_DOOR.get()));
        this.add(ModBlocks.HEARTWOOD_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.HEARTWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.HEARTWOOD_SAPLING.get());
        this.dropOther(ModBlocks.HEARTWOOD_WALL_SIGN.get(), ModItems.HEARTWOOD_SIGN.get());
        this.dropOther(ModBlocks.HEARTWOOD_SIGN.get(), ModItems.HEARTWOOD_SIGN.get());
        this.dropOther(ModBlocks.HEARTWOOD_HANGING_WALL_SIGN.get(), ModItems.HEARTWOOD_HANGING_SIGN.get());
        this.dropOther(ModBlocks.HEARTWOOD_HANGING_SIGN.get(), ModItems.HEARTWOOD_HANGING_SIGN.get());
//SUNRISE WOOD
        this.dropSelf(ModBlocks.SUNRISE_LOG.get());
        this.dropSelf(ModBlocks.SUNRISE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_SUNRISE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_SUNRISE_WOOD.get());
        this.dropSelf(ModBlocks.SUNRISE_PLANKS.get());
        this.dropSelf(ModBlocks.SUNRISE_STAIRS.get());
        this.dropSelf(ModBlocks.SUNRISE_SLAB.get());
        this.dropSelf(ModBlocks.SUNRISE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.SUNRISE_FENCE.get());
        this.dropSelf(ModBlocks.SUNRISE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SUNRISE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SUNRISE_BUTTON.get());
        this.add(ModBlocks.SUNRISE_DOOR.get(), (block) ->
                createDoorTable(ModBlocks.SUNRISE_DOOR.get()));
        this.add(ModBlocks.SUNRISE_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.SUNRISE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.SUNRISE_SAPLING.get());
        this.dropOther(ModBlocks.SUNRISE_WALL_SIGN.get(), ModItems.SUNRISE_SIGN.get());
        this.dropOther(ModBlocks.SUNRISE_SIGN.get(), ModItems.SUNRISE_SIGN.get());
        this.dropOther(ModBlocks.SUNRISE_HANGING_WALL_SIGN.get(), ModItems.SUNRISE_HANGING_SIGN.get());
        this.dropOther(ModBlocks.SUNRISE_HANGING_SIGN.get(), ModItems.SUNRISE_HANGING_SIGN.get());
//ERROR WOOD
        this.dropSelf(ModBlocks.ERROR_LOG.get());
        this.dropSelf(ModBlocks.ERROR_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ERROR_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_ERROR_WOOD.get());
        this.dropSelf(ModBlocks.ERROR_PLANKS.get());
        this.dropSelf(ModBlocks.ERROR_STAIRS.get());
        this.dropSelf(ModBlocks.ERROR_SLAB.get());
        this.dropSelf(ModBlocks.ERROR_TRAPDOOR.get());
        this.dropSelf(ModBlocks.ERROR_FENCE.get());
        this.dropSelf(ModBlocks.ERROR_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ERROR_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ERROR_BUTTON.get());
        this.add(ModBlocks.ERROR_DOOR.get(), (block) ->
                createDoorTable(ModBlocks.ERROR_DOOR.get()));
        this.add(ModBlocks.ERROR_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.ERROR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.ERROR_SAPLING.get());
        this.dropOther(ModBlocks.ERROR_WALL_SIGN.get(), ModItems.ERROR_SIGN.get());
        this.dropOther(ModBlocks.ERROR_SIGN.get(), ModItems.ERROR_SIGN.get());
        this.dropOther(ModBlocks.ERROR_HANGING_WALL_SIGN.get(), ModItems.ERROR_HANGING_SIGN.get());
        this.dropOther(ModBlocks.ERROR_HANGING_SIGN.get(), ModItems.ERROR_HANGING_SIGN.get());
//CYAN WOOD
        this.dropSelf(ModBlocks.CYAN_LOG.get());
        this.dropSelf(ModBlocks.CYAN_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CYAN_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CYAN_WOOD.get());
        this.dropSelf(ModBlocks.CYAN_PLANKS.get());
        this.dropSelf(ModBlocks.CYAN_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_SLAB.get());
        this.dropSelf(ModBlocks.CYAN_TRAPDOOR.get());
        this.dropSelf(ModBlocks.CYAN_FENCE.get());
        this.dropSelf(ModBlocks.CYAN_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CYAN_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CYAN_BUTTON.get());
        this.add(ModBlocks.CYAN_DOOR.get(), (block) ->
                createDoorTable(ModBlocks.CYAN_DOOR.get()));
        this.add(ModBlocks.CYAN_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.CYAN_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.CYAN_SAPLING.get());
        this.dropOther(ModBlocks.CYAN_WALL_SIGN.get(), ModItems.CYAN_SIGN.get());
        this.dropOther(ModBlocks.CYAN_SIGN.get(), ModItems.CYAN_SIGN.get());
        this.dropOther(ModBlocks.CYAN_HANGING_WALL_SIGN.get(), ModItems.CYAN_HANGING_SIGN.get());
        this.dropOther(ModBlocks.CYAN_HANGING_SIGN.get(), ModItems.CYAN_HANGING_SIGN.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
