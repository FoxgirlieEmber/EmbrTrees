package net.ember.embrtrees.block.entity;

import net.ember.embrtrees.block.entity.custom.ModHangingSignBlockEntity;
import net.ember.embrtrees.block.entity.custom.ModSignBlockEntity;
import net.ember.embrtrees.EmbrTrees;
import net.ember.embrtrees.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, EmbrTrees.MODID);

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("mod_sign_entities", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.ASH_WALL_SIGN.get(),
                            ModBlocks.ASH_SIGN.get(),
                            ModBlocks.ASTRAL_WALL_SIGN.get(),
                            ModBlocks.ASTRAL_SIGN.get(),
                            ModBlocks.BLOSSOM_WALL_SIGN.get(),
                            ModBlocks.BLOSSOM_SIGN.get(),
                            ModBlocks.VOID_BLOSSOM_WALL_SIGN.get(),
                            ModBlocks.VOID_BLOSSOM_SIGN.get(),
                            ModBlocks.GHOSTWOOD_WALL_SIGN.get(),
                            ModBlocks.GHOSTWOOD_SIGN.get(),
                            ModBlocks.MAHOGANY_WALL_SIGN.get(),
                            ModBlocks.MAHOGANY_SIGN.get(),
                            ModBlocks.OCEANIC_WALL_SIGN.get(),
                            ModBlocks.OCEANIC_SIGN.get(),
                            ModBlocks.QUARTZWOOD_WALL_SIGN.get(),
                            ModBlocks.QUARTZWOOD_SIGN.get(),
                            ModBlocks.VAMPIRIC_WALL_SIGN.get(),
                            ModBlocks.VAMPIRIC_SIGN.get(),
                            ModBlocks.WILLOW_WALL_SIGN.get(),
                            ModBlocks.WILLOW_SIGN.get(),
                            ModBlocks.BLACKWOOD_WALL_SIGN.get(),
                            ModBlocks.BLACKWOOD_SIGN.get(),
                            ModBlocks.WALNUT_WALL_SIGN.get(),
                            ModBlocks.WALNUT_SIGN.get(),
                            ModBlocks.HEARTWOOD_WALL_SIGN.get(),
                            ModBlocks.HEARTWOOD_SIGN.get(),
                            ModBlocks.SUNRISE_WALL_SIGN.get(),
                            ModBlocks.SUNRISE_SIGN.get(),
                            ModBlocks.ERROR_WALL_SIGN.get(),
                            ModBlocks.ERROR_SIGN.get(),
                            ModBlocks.CYAN_WALL_SIGN.get(),
                            ModBlocks.CYAN_SIGN.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> HANGING_SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("mod_hanging_sign_entities", () ->
                    BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                            ModBlocks.ASH_HANGING_WALL_SIGN.get(),
                            ModBlocks.ASH_HANGING_SIGN.get(),
                            ModBlocks.ASTRAL_HANGING_WALL_SIGN.get(),
                            ModBlocks.ASTRAL_HANGING_SIGN.get(),
                            ModBlocks.BLOSSOM_HANGING_WALL_SIGN.get(),
                            ModBlocks.BLOSSOM_HANGING_SIGN.get(),
                            ModBlocks.VOID_BLOSSOM_HANGING_WALL_SIGN.get(),
                            ModBlocks.VOID_BLOSSOM_HANGING_SIGN.get(),
                            ModBlocks.GHOSTWOOD_HANGING_WALL_SIGN.get(),
                            ModBlocks.GHOSTWOOD_HANGING_SIGN.get(),
                            ModBlocks.MAHOGANY_HANGING_WALL_SIGN.get(),
                            ModBlocks.MAHOGANY_HANGING_SIGN.get(),
                            ModBlocks.OCEANIC_HANGING_WALL_SIGN.get(),
                            ModBlocks.OCEANIC_HANGING_SIGN.get(),
                            ModBlocks.QUARTZWOOD_HANGING_WALL_SIGN.get(),
                            ModBlocks.QUARTZWOOD_HANGING_SIGN.get(),
                            ModBlocks.VAMPIRIC_HANGING_WALL_SIGN.get(),
                            ModBlocks.VAMPIRIC_HANGING_SIGN.get(),
                            ModBlocks.WILLOW_HANGING_WALL_SIGN.get(),
                            ModBlocks.WILLOW_HANGING_SIGN.get(),
                            ModBlocks.BLACKWOOD_HANGING_WALL_SIGN.get(),
                            ModBlocks.BLACKWOOD_HANGING_SIGN.get(),
                            ModBlocks.WALNUT_HANGING_WALL_SIGN.get(),
                            ModBlocks.WALNUT_HANGING_SIGN.get(),
                            ModBlocks.HEARTWOOD_HANGING_WALL_SIGN.get(),
                            ModBlocks.HEARTWOOD_HANGING_SIGN.get(),
                            ModBlocks.SUNRISE_HANGING_WALL_SIGN.get(),
                            ModBlocks.SUNRISE_HANGING_SIGN.get(),
                            ModBlocks.ERROR_HANGING_WALL_SIGN.get(),
                            ModBlocks.ERROR_HANGING_SIGN.get(),
                            ModBlocks.CYAN_HANGING_WALL_SIGN.get(),
                            ModBlocks.CYAN_HANGING_SIGN.get()
                    ).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}

