package net.ember.embrtrees.block;

import net.ember.embrtrees.EmbrTrees;
import net.ember.embrtrees.block.custom.*;
import net.ember.embrtrees.block.entity.ModWoodTypes;
import net.ember.embrtrees.item.ModItems;
import net.ember.embrtrees.worldgen.tree.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EmbrTrees.MODID);
//ASH WOOD
    public static final RegistryObject<Block> ASH_LOG = registerBlock("ash-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> ASH_WOOD = registerBlock("ash-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ASH_LOG = registerBlock("stripped-ash-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ASH_WOOD = registerBlock("stripped-ash-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> ASH_PLANKS = registerBlock("ash-planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 5;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 20;}
            });
    public static final RegistryObject<Block> ASH_LEAVES = registerBlock("ash-leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 30;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 60;}
            });
    public static final RegistryObject<Block> ASH_SAPLING = registerBlock("ash-sapling",
            () -> new SaplingBlock(new AshTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> ASH_DOOR = registerBlock("ash-door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> ASH_TRAPDOOR = registerBlock("ash-trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> ASH_STAIRS = registerBlock("ash-stairs",
            () -> new StairBlock(() -> ModBlocks.ASH_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ASH_SLAB = registerBlock("ash-slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ASH_FENCE = registerBlock("ash-fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ASH_FENCE_GATE = registerBlock("ash-fence-gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> ASH_PRESSURE_PLATE = registerBlock("ash-pressure-plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> ASH_BUTTON = registerBlock("ash-button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> ASH_WALL_SIGN = registerBlockNoItem("ash-wall-sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.ASH));
    public static final RegistryObject<Block> ASH_SIGN = registerBlockNoItem("ash-sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.ASH));
    public static final RegistryObject<Block> ASH_HANGING_WALL_SIGN = registerBlockNoItem("ash-hanging-wall-sign",
            () -> new ModHangingWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.ASH));
    public static final RegistryObject<Block> ASH_HANGING_SIGN = registerBlockNoItem("ash-hanging-sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.ASH));
//ASTRAL WOOD
    public static final RegistryObject<Block> ASTRAL_LOG = registerBlock("astral-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> ASTRAL_WOOD = registerBlock("astral-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ASTRAL_LOG = registerBlock("stripped-astral-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ASTRAL_WOOD = registerBlock("stripped-astral-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> ASTRAL_PLANKS = registerBlock("astral-planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 5;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 20;}
            });
    public static final RegistryObject<Block> ASTRAL_LEAVES = registerBlock("astral-leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 30;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 60;}
            });
    public static final RegistryObject<Block> ASTRAL_SAPLING = registerBlock("astral-sapling",
            () -> new SaplingBlock(new AstralTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> ASTRAL_DOOR = registerBlock("astral-door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> ASTRAL_TRAPDOOR = registerBlock("astral-trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> ASTRAL_STAIRS = registerBlock("astral-stairs",
            () -> new StairBlock(() -> ModBlocks.ASTRAL_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ASTRAL_SLAB = registerBlock("astral-slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ASTRAL_FENCE = registerBlock("astral-fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ASTRAL_FENCE_GATE = registerBlock("astral-fence-gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> ASTRAL_PRESSURE_PLATE = registerBlock("astral-pressure-plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> ASTRAL_BUTTON = registerBlock("astral-button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> ASTRAL_WALL_SIGN = registerBlockNoItem("astral-wall-sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.ASTRAL));
    public static final RegistryObject<Block> ASTRAL_SIGN = registerBlockNoItem("astral-sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.ASTRAL));
    public static final RegistryObject<Block> ASTRAL_HANGING_WALL_SIGN = registerBlockNoItem("astral-hanging-wall-sign",
            () -> new ModHangingWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.ASTRAL));
    public static final RegistryObject<Block> ASTRAL_HANGING_SIGN = registerBlockNoItem("astral-hanging-sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.ASTRAL));
//BLOSSOM WOOD
    public static final RegistryObject<Block> BLOSSOM_LOG = registerBlock("blossom-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> BLOSSOM_WOOD = registerBlock("blossom-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BLOSSOM_LOG = registerBlock("stripped-blossom-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BLOSSOM_WOOD = registerBlock("stripped-blossom-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> BLOSSOM_PLANKS = registerBlock("blossom-planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 5;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 20;}
            });
    public static final RegistryObject<Block> BLOSSOM_LEAVES = registerBlock("blossom-leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 30;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 60;}
            });
    public static final RegistryObject<Block> BLOSSOM_SAPLING = registerBlock("blossom-sapling",
            () -> new SaplingBlock(new BlossomTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> BLOSSOM_DOOR = registerBlock("blossom-door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BLOSSOM_TRAPDOOR = registerBlock("blossom-trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BLOSSOM_STAIRS = registerBlock("blossom-stairs",
            () -> new StairBlock(() -> ModBlocks.BLOSSOM_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> BLOSSOM_SLAB = registerBlock("blossom-slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> BLOSSOM_FENCE = registerBlock("blossom-fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BLOSSOM_FENCE_GATE = registerBlock("blossom-fence-gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> BLOSSOM_PRESSURE_PLATE = registerBlock("blossom-pressure-plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> BLOSSOM_BUTTON = registerBlock("blossom-button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> BLOSSOM_WALL_SIGN = registerBlockNoItem("blossom-wall-sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BLOSSOM));
    public static final RegistryObject<Block> BLOSSOM_SIGN = registerBlockNoItem("blossom-sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.BLOSSOM));
    public static final RegistryObject<Block> BLOSSOM_HANGING_WALL_SIGN = registerBlockNoItem("blossom-hanging-wall-sign",
            () -> new ModHangingWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BLOSSOM));
    public static final RegistryObject<Block> BLOSSOM_HANGING_SIGN = registerBlockNoItem("blossom-hanging-sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BLOSSOM));
//VOID_BLOSSOM WOOD
    public static final RegistryObject<Block> VOID_BLOSSOM_LOG = registerBlock("void-blossom-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> VOID_BLOSSOM_WOOD = registerBlock("void-blossom-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_VOID_BLOSSOM_LOG = registerBlock("stripped-void-blossom-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_VOID_BLOSSOM_WOOD = registerBlock("stripped-void-blossom-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> VOID_BLOSSOM_PLANKS = registerBlock("void-blossom-planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 5;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 20;}
            });
    public static final RegistryObject<Block> VOID_BLOSSOM_LEAVES = registerBlock("void-blossom-leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 30;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 60;}
            });
    public static final RegistryObject<Block> VOID_BLOSSOM_SAPLING = registerBlock("void-blossom-sapling",
            () -> new SaplingBlock(new VoidBlossomTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> VOID_BLOSSOM_DOOR = registerBlock("void-blossom-door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> VOID_BLOSSOM_TRAPDOOR = registerBlock("void-blossom-trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> VOID_BLOSSOM_STAIRS = registerBlock("void-blossom-stairs",
            () -> new StairBlock(() -> ModBlocks.VOID_BLOSSOM_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> VOID_BLOSSOM_SLAB = registerBlock("void-blossom-slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> VOID_BLOSSOM_FENCE = registerBlock("void-blossom-fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> VOID_BLOSSOM_FENCE_GATE = registerBlock("void-blossom-fence-gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> VOID_BLOSSOM_PRESSURE_PLATE = registerBlock("void-blossom-pressure-plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> VOID_BLOSSOM_BUTTON = registerBlock("void-blossom-button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> VOID_BLOSSOM_WALL_SIGN = registerBlockNoItem("void-blossom-wall-sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.VOID_BLOSSOM));
    public static final RegistryObject<Block> VOID_BLOSSOM_SIGN = registerBlockNoItem("void-blossom-sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.VOID_BLOSSOM));
    public static final RegistryObject<Block> VOID_BLOSSOM_HANGING_WALL_SIGN = registerBlockNoItem("void_blossom-hanging-wall-sign",
            () -> new ModHangingWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.VOID_BLOSSOM));
    public static final RegistryObject<Block> VOID_BLOSSOM_HANGING_SIGN = registerBlockNoItem("void_blossom-hanging-sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.VOID_BLOSSOM));
//GHOSTWOOD WOOD
    public static final RegistryObject<Block> GHOSTWOOD_LOG = registerBlock("ghostwood-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()));
    public static final RegistryObject<Block> GHOSTWOOD_WOOD = registerBlock("ghostwood-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()));
    public static final RegistryObject<Block> STRIPPED_GHOSTWOOD_LOG = registerBlock("stripped-ghostwood-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()));
    public static final RegistryObject<Block> STRIPPED_GHOSTWOOD_WOOD = registerBlock("stripped-ghostwood-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()));
    public static final RegistryObject<Block> GHOSTWOOD_PLANKS = registerBlock("ghostwood-planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 5;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 20;}
            });
    public static final RegistryObject<Block> GHOSTWOOD_LEAVES = registerBlock("ghostwood-leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 30;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 60;}
            });
    public static final RegistryObject<Block> GHOSTWOOD_SAPLING = registerBlock("ghostwood-sapling",
            () -> new SaplingBlock(new GhostwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> GHOSTWOOD_DOOR = registerBlock("ghostwood-door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> GHOSTWOOD_TRAPDOOR = registerBlock("ghostwood-trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> GHOSTWOOD_STAIRS = registerBlock("ghostwood-stairs",
            () -> new StairBlock(() -> ModBlocks.GHOSTWOOD_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion()));
    public static final RegistryObject<Block> GHOSTWOOD_SLAB = registerBlock("ghostwood-slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion()));
    public static final RegistryObject<Block> GHOSTWOOD_FENCE = registerBlock("ghostwood-fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).noOcclusion()));
    public static final RegistryObject<Block> GHOSTWOOD_FENCE_GATE = registerBlock("ghostwood-fence-gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).noOcclusion(),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> GHOSTWOOD_PRESSURE_PLATE = registerBlock("ghostwood-pressure-plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> GHOSTWOOD_BUTTON = registerBlock("ghostwood-button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON).noOcclusion(), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> GHOSTWOOD_WALL_SIGN = registerBlockNoItem("ghostwood-wall-sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noOcclusion(), ModWoodTypes.GHOSTWOOD));
    public static final RegistryObject<Block> GHOSTWOOD_SIGN = registerBlockNoItem("ghostwood-sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noOcclusion(), ModWoodTypes.GHOSTWOOD));
    public static final RegistryObject<Block> GHOSTWOOD_HANGING_WALL_SIGN = registerBlockNoItem("ghostwood-hanging-wall-sign",
            () -> new ModHangingWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).noOcclusion(), ModWoodTypes.GHOSTWOOD));
    public static final RegistryObject<Block> GHOSTWOOD_HANGING_SIGN = registerBlockNoItem("ghostwood-hanging-sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).noOcclusion(), ModWoodTypes.GHOSTWOOD));
//MAHOGANY WOOD
    public static final RegistryObject<Block> MAHOGANY_LOG = registerBlock("mahogany-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> MAHOGANY_WOOD = registerBlock("mahogany-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_MAHOGANY_LOG = registerBlock("stripped-mahogany-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_MAHOGANY_WOOD = registerBlock("stripped-mahogany-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> MAHOGANY_PLANKS = registerBlock("mahogany-planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 5;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 20;}
            });
    public static final RegistryObject<Block> MAHOGANY_LEAVES = registerBlock("mahogany-leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 30;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 60;}
            });
    public static final RegistryObject<Block> MAHOGANY_SAPLING = registerBlock("mahogany-sapling",
            () -> new SaplingBlock(new MahoganyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> MAHOGANY_DOOR = registerBlock("mahogany-door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> MAHOGANY_TRAPDOOR = registerBlock("mahogany-trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> MAHOGANY_STAIRS = registerBlock("mahogany-stairs",
            () -> new StairBlock(() -> ModBlocks.MAHOGANY_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> MAHOGANY_SLAB = registerBlock("mahogany-slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> MAHOGANY_FENCE = registerBlock("mahogany-fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> MAHOGANY_FENCE_GATE = registerBlock("mahogany-fence-gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> MAHOGANY_PRESSURE_PLATE = registerBlock("mahogany-pressure-plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> MAHOGANY_BUTTON = registerBlock("mahogany-button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> MAHOGANY_WALL_SIGN = registerBlockNoItem("mahogany-wall-sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.MAHOGANY));
    public static final RegistryObject<Block> MAHOGANY_SIGN = registerBlockNoItem("mahogany-sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.MAHOGANY));
    public static final RegistryObject<Block> MAHOGANY_HANGING_WALL_SIGN = registerBlockNoItem("mahogany-hanging-wall-sign",
            () -> new ModHangingWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.MAHOGANY));
    public static final RegistryObject<Block> MAHOGANY_HANGING_SIGN = registerBlockNoItem("mahogany-hanging-sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.MAHOGANY));
//OCEANIC WOOD
    public static final RegistryObject<Block> OCEANIC_LOG = registerBlock("oceanic-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> OCEANIC_WOOD = registerBlock("oceanic-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_OCEANIC_LOG = registerBlock("stripped-oceanic-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_OCEANIC_WOOD = registerBlock("stripped-oceanic-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> OCEANIC_PLANKS = registerBlock("oceanic-planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 5;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 20;}
            });
    public static final RegistryObject<Block> OCEANIC_LEAVES = registerBlock("oceanic-leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 30;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 60;}
            });
    public static final RegistryObject<Block> OCEANIC_SAPLING = registerBlock("oceanic-sapling",
            () -> new SaplingBlock(new OceanicTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> OCEANIC_DOOR = registerBlock("oceanic-door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> OCEANIC_TRAPDOOR = registerBlock("oceanic-trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> OCEANIC_STAIRS = registerBlock("oceanic-stairs",
            () -> new StairBlock(() -> ModBlocks.OCEANIC_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> OCEANIC_SLAB = registerBlock("oceanic-slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> OCEANIC_FENCE = registerBlock("oceanic-fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> OCEANIC_FENCE_GATE = registerBlock("oceanic-fence-gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> OCEANIC_PRESSURE_PLATE = registerBlock("oceanic-pressure-plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> OCEANIC_BUTTON = registerBlock("oceanic-button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> OCEANIC_WALL_SIGN = registerBlockNoItem("oceanic-wall-sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.OCEANIC));
    public static final RegistryObject<Block> OCEANIC_SIGN = registerBlockNoItem("oceanic-sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.OCEANIC));
    public static final RegistryObject<Block> OCEANIC_HANGING_WALL_SIGN = registerBlockNoItem("oceanic-hanging-wall-sign",
            () -> new ModHangingWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.OCEANIC));
    public static final RegistryObject<Block> OCEANIC_HANGING_SIGN = registerBlockNoItem("oceanic-hanging-sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.OCEANIC));
//QUARTZWOOD WOOD
    public static final RegistryObject<Block> QUARTZWOOD_LOG = registerBlock("quartzwood-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> QUARTZWOOD_WOOD = registerBlock("quartzwood-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_QUARTZWOOD_LOG = registerBlock("stripped-quartzwood-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_QUARTZWOOD_WOOD = registerBlock("stripped-quartzwood-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> QUARTZWOOD_PLANKS = registerBlock("quartzwood-planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 5;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 20;}
            });
    public static final RegistryObject<Block> QUARTZWOOD_LEAVES = registerBlock("quartzwood-leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 30;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 60;}
            });
    public static final RegistryObject<Block> QUARTZWOOD_SAPLING = registerBlock("quartzwood-sapling",
            () -> new SaplingBlock(new QuartzwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> QUARTZWOOD_DOOR = registerBlock("quartzwood-door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> QUARTZWOOD_TRAPDOOR = registerBlock("quartzwood-trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> QUARTZWOOD_STAIRS = registerBlock("quartzwood-stairs",
            () -> new StairBlock(() -> ModBlocks.QUARTZWOOD_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> QUARTZWOOD_SLAB = registerBlock("quartzwood-slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> QUARTZWOOD_FENCE = registerBlock("quartzwood-fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> QUARTZWOOD_FENCE_GATE = registerBlock("quartzwood-fence-gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> QUARTZWOOD_PRESSURE_PLATE = registerBlock("quartzwood-pressure-plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> QUARTZWOOD_BUTTON = registerBlock("quartzwood-button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> QUARTZWOOD_WALL_SIGN = registerBlockNoItem("quartzwood-wall-sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.QUARTZWOOD));
    public static final RegistryObject<Block> QUARTZWOOD_SIGN = registerBlockNoItem("quartzwood-sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.QUARTZWOOD));
    public static final RegistryObject<Block> QUARTZWOOD_HANGING_WALL_SIGN = registerBlockNoItem("quartzwood-hanging-wall-sign",
            () -> new ModHangingWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.QUARTZWOOD));
    public static final RegistryObject<Block> QUARTZWOOD_HANGING_SIGN = registerBlockNoItem("quartzwood-hanging-sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.QUARTZWOOD));
//VAMPIRIC WOOD
    public static final RegistryObject<Block> VAMPIRIC_LOG = registerBlock("vampiric-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> VAMPIRIC_WOOD = registerBlock("vampiric-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_VAMPIRIC_LOG = registerBlock("stripped-vampiric-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_VAMPIRIC_WOOD = registerBlock("stripped-vampiric-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> VAMPIRIC_PLANKS = registerBlock("vampiric-planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 5;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 20;}
            });
    public static final RegistryObject<Block> VAMPIRIC_LEAVES = registerBlock("vampiric-leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 30;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 60;}
            });
    public static final RegistryObject<Block> VAMPIRIC_SAPLING = registerBlock("vampiric-sapling",
            () -> new SaplingBlock(new VampiricTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> VAMPIRIC_DOOR = registerBlock("vampiric-door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> VAMPIRIC_TRAPDOOR = registerBlock("vampiric-trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> VAMPIRIC_STAIRS = registerBlock("vampiric-stairs",
            () -> new StairBlock(() -> ModBlocks.VAMPIRIC_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> VAMPIRIC_SLAB = registerBlock("vampiric-slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> VAMPIRIC_FENCE = registerBlock("vampiric-fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> VAMPIRIC_FENCE_GATE = registerBlock("vampiric-fence-gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> VAMPIRIC_PRESSURE_PLATE = registerBlock("vampiric-pressure-plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> VAMPIRIC_BUTTON = registerBlock("vampiric-button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> VAMPIRIC_WALL_SIGN = registerBlockNoItem("vampiric-wall-sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.VAMPIRIC));
    public static final RegistryObject<Block> VAMPIRIC_SIGN = registerBlockNoItem("vampiric-sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.VAMPIRIC));
    public static final RegistryObject<Block> VAMPIRIC_HANGING_WALL_SIGN = registerBlockNoItem("vampiric-hanging-wall-sign",
            () -> new ModHangingWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.VAMPIRIC));
    public static final RegistryObject<Block> VAMPIRIC_HANGING_SIGN = registerBlockNoItem("vampiric-hanging-sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.VAMPIRIC));
//WILLOW WOOD
    public static final RegistryObject<Block> WILLOW_LOG = registerBlock("willow-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> WILLOW_WOOD = registerBlock("willow-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = registerBlock("stripped-willow-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = registerBlock("stripped-willow-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> WILLOW_PLANKS = registerBlock("willow-planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 5;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 20;}
            });
    public static final RegistryObject<Block> WILLOW_LEAVES = registerBlock("willow-leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 30;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 60;}
            });
    public static final RegistryObject<Block> WILLOW_SAPLING = registerBlock("willow-sapling",
            () -> new SaplingBlock(new WillowTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> WILLOW_DOOR = registerBlock("willow-door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> WILLOW_TRAPDOOR = registerBlock("willow-trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> WILLOW_STAIRS = registerBlock("willow-stairs",
            () -> new StairBlock(() -> ModBlocks.WILLOW_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> WILLOW_SLAB = registerBlock("willow-slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> WILLOW_FENCE = registerBlock("willow-fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> WILLOW_FENCE_GATE = registerBlock("willow-fence-gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> WILLOW_PRESSURE_PLATE = registerBlock("willow-pressure-plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> WILLOW_BUTTON = registerBlock("willow-button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> WILLOW_WALL_SIGN = registerBlockNoItem("willow-wall-sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.WILLOW));
    public static final RegistryObject<Block> WILLOW_SIGN = registerBlockNoItem("willow-sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.WILLOW));
    public static final RegistryObject<Block> WILLOW_HANGING_WALL_SIGN = registerBlockNoItem("willow-hanging-wall-sign",
            () -> new ModHangingWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.WILLOW));
    public static final RegistryObject<Block> WILLOW_HANGING_SIGN = registerBlockNoItem("willow-hanging-sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.WILLOW));
//BLACKWOOD
    public static final RegistryObject<Block> BLACKWOOD_LOG = registerBlock("blackwood-log",
        () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> BLACKWOOD_WOOD = registerBlock("blackwood-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BLACKWOOD_LOG = registerBlock("stripped-blackwood-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BLACKWOOD_WOOD = registerBlock("stripped-blackwood-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> BLACKWOOD_PLANKS = registerBlock("blackwood-planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 5;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 20;}
            });
    public static final RegistryObject<Block> BLACKWOOD_LEAVES = registerBlock("blackwood-leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 30;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 60;}
            });
    public static final RegistryObject<Block> BLACKWOOD_SAPLING = registerBlock("blackwood-sapling",
            () -> new SaplingBlock(new BlackwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> BLACKWOOD_DOOR = registerBlock("blackwood-door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BLACKWOOD_TRAPDOOR = registerBlock("blackwood-trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BLACKWOOD_STAIRS = registerBlock("blackwood-stairs",
            () -> new StairBlock(() -> ModBlocks.BLACKWOOD_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> BLACKWOOD_SLAB = registerBlock("blackwood-slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> BLACKWOOD_FENCE = registerBlock("blackwood-fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BLACKWOOD_FENCE_GATE = registerBlock("blackwood-fence-gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> BLACKWOOD_PRESSURE_PLATE = registerBlock("blackwood-pressure-plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> BLACKWOOD_BUTTON = registerBlock("blackwood-button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> BLACKWOOD_WALL_SIGN = registerBlockNoItem("blackwood-wall-sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BLACKWOOD));
    public static final RegistryObject<Block> BLACKWOOD_SIGN = registerBlockNoItem("blackwood-sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.BLACKWOOD));
    public static final RegistryObject<Block> BLACKWOOD_HANGING_WALL_SIGN = registerBlockNoItem("blackwood-hanging-wall-sign",
            () -> new ModHangingWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BLACKWOOD));
    public static final RegistryObject<Block> BLACKWOOD_HANGING_SIGN = registerBlockNoItem("blackwood-hanging-sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BLACKWOOD));
//WALNUT WOOD
    public static final RegistryObject<Block> WALNUT_LOG = registerBlock("walnut-log",
        () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> WALNUT_WOOD = registerBlock("walnut-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_WALNUT_LOG = registerBlock("stripped-walnut-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_WALNUT_WOOD = registerBlock("stripped-walnut-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> WALNUT_PLANKS = registerBlock("walnut-planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 5;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 20;}
            });
    public static final RegistryObject<Block> WALNUT_LEAVES = registerBlock("walnut-leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 30;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 60;}
            });
    public static final RegistryObject<Block> WALNUT_SAPLING = registerBlock("walnut-sapling",
            () -> new SaplingBlock(new WalnutTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> WALNUT_DOOR = registerBlock("walnut-door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> WALNUT_TRAPDOOR = registerBlock("walnut-trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> WALNUT_STAIRS = registerBlock("walnut-stairs",
            () -> new StairBlock(() -> ModBlocks.WALNUT_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> WALNUT_SLAB = registerBlock("walnut-slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> WALNUT_FENCE = registerBlock("walnut-fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> WALNUT_FENCE_GATE = registerBlock("walnut-fence-gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> WALNUT_PRESSURE_PLATE = registerBlock("walnut-pressure-plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> WALNUT_BUTTON = registerBlock("walnut-button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> WALNUT_WALL_SIGN = registerBlockNoItem("walnut-wall-sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.WALNUT));
    public static final RegistryObject<Block> WALNUT_SIGN = registerBlockNoItem("walnut-sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.WALNUT));
    public static final RegistryObject<Block> WALNUT_HANGING_WALL_SIGN = registerBlockNoItem("walnut-hanging-wall-sign",
            () -> new ModHangingWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.WALNUT));
    public static final RegistryObject<Block> WALNUT_HANGING_SIGN = registerBlockNoItem("walnut-hanging-sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.WALNUT));
//HEARTWOOD
    public static final RegistryObject<Block> HEARTWOOD_LOG = registerBlock("heartwood-log",
        () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> HEARTWOOD_WOOD = registerBlock("heartwood-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_HEARTWOOD_LOG = registerBlock("stripped-heartwood-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_HEARTWOOD_WOOD = registerBlock("stripped-heartwood-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> HEARTWOOD_PLANKS = registerBlock("heartwood-planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 5;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 20;}
            });
    public static final RegistryObject<Block> HEARTWOOD_LEAVES = registerBlock("heartwood-leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 30;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 60;}
            });
    public static final RegistryObject<Block> HEARTWOOD_SAPLING = registerBlock("heartwood-sapling",
            () -> new SaplingBlock(new HeartwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> HEARTWOOD_DOOR = registerBlock("heartwood-door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> HEARTWOOD_TRAPDOOR = registerBlock("heartwood-trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> HEARTWOOD_STAIRS = registerBlock("heartwood-stairs",
            () -> new StairBlock(() -> ModBlocks.HEARTWOOD_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> HEARTWOOD_SLAB = registerBlock("heartwood-slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> HEARTWOOD_FENCE = registerBlock("heartwood-fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> HEARTWOOD_FENCE_GATE = registerBlock("heartwood-fence-gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> HEARTWOOD_PRESSURE_PLATE = registerBlock("heartwood-pressure-plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> HEARTWOOD_BUTTON = registerBlock("heartwood-button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> HEARTWOOD_WALL_SIGN = registerBlockNoItem("heartwood-wall-sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.HEARTWOOD));
    public static final RegistryObject<Block> HEARTWOOD_SIGN = registerBlockNoItem("heartwood-sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.HEARTWOOD));
    public static final RegistryObject<Block> HEARTWOOD_HANGING_WALL_SIGN = registerBlockNoItem("heartwood-hanging-wall-sign",
            () -> new ModHangingWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.HEARTWOOD));
    public static final RegistryObject<Block> HEARTWOOD_HANGING_SIGN = registerBlockNoItem("heartwood-hanging-sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.HEARTWOOD));
//SUNRISE
    public static final RegistryObject<Block> SUNRISE_LOG = registerBlock("sunrise-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> SUNRISE_WOOD = registerBlock("sunrise-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_SUNRISE_LOG = registerBlock("stripped-sunrise-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_SUNRISE_WOOD = registerBlock("stripped-sunrise-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> SUNRISE_PLANKS = registerBlock("sunrise-planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 5;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 20;}
            });
    public static final RegistryObject<Block> SUNRISE_LEAVES = registerBlock("sunrise-leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 30;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 60;}
            });
    public static final RegistryObject<Block> SUNRISE_SAPLING = registerBlock("sunrise-sapling",
            () -> new SaplingBlock(new SunriseTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> SUNRISE_DOOR = registerBlock("sunrise-door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> SUNRISE_TRAPDOOR = registerBlock("sunrise-trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> SUNRISE_STAIRS = registerBlock("sunrise-stairs",
            () -> new StairBlock(() -> ModBlocks.SUNRISE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> SUNRISE_SLAB = registerBlock("sunrise-slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> SUNRISE_FENCE = registerBlock("sunrise-fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SUNRISE_FENCE_GATE = registerBlock("sunrise-fence-gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> SUNRISE_PRESSURE_PLATE = registerBlock("sunrise-pressure-plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> SUNRISE_BUTTON = registerBlock("sunrise-button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> SUNRISE_WALL_SIGN = registerBlockNoItem("sunrise-wall-sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.SUNRISE));
    public static final RegistryObject<Block> SUNRISE_SIGN = registerBlockNoItem("sunrise-sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.SUNRISE));
    public static final RegistryObject<Block> SUNRISE_HANGING_WALL_SIGN = registerBlockNoItem("sunrise-hanging-wall-sign",
            () -> new ModHangingWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.SUNRISE));
    public static final RegistryObject<Block> SUNRISE_HANGING_SIGN = registerBlockNoItem("sunrise-hanging-sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.SUNRISE));
//ERROR
    public static final RegistryObject<Block> ERROR_LOG = registerBlock("error-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> ERROR_WOOD = registerBlock("error-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ERROR_LOG = registerBlock("stripped-error-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ERROR_WOOD = registerBlock("stripped-error-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> ERROR_PLANKS = registerBlock("error-planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 5;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 20;}
            });
    public static final RegistryObject<Block> ERROR_LEAVES = registerBlock("error-leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 30;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 60;}
            });
    public static final RegistryObject<Block> ERROR_SAPLING = registerBlock("error-sapling",
            () -> new SaplingBlock(new ErrorTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> ERROR_DOOR = registerBlock("error-door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> ERROR_TRAPDOOR = registerBlock("error-trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> ERROR_STAIRS = registerBlock("error-stairs",
            () -> new StairBlock(() -> ModBlocks.ERROR_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ERROR_SLAB = registerBlock("error-slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ERROR_FENCE = registerBlock("error-fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ERROR_FENCE_GATE = registerBlock("error-fence-gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> ERROR_PRESSURE_PLATE = registerBlock("error-pressure-plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> ERROR_BUTTON = registerBlock("error-button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> ERROR_WALL_SIGN = registerBlockNoItem("error-wall-sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.ERROR));
    public static final RegistryObject<Block> ERROR_SIGN = registerBlockNoItem("error-sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.ERROR));
    public static final RegistryObject<Block> ERROR_HANGING_WALL_SIGN = registerBlockNoItem("error-hanging-wall-sign",
            () -> new ModHangingWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.ERROR));
    public static final RegistryObject<Block> ERROR_HANGING_SIGN = registerBlockNoItem("error-hanging-sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.ERROR));
//CYAN
    public static final RegistryObject<Block> CYAN_LOG = registerBlock("cyan-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> CYAN_WOOD = registerBlock("cyan-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_CYAN_LOG = registerBlock("stripped-cyan-log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_CYAN_WOOD = registerBlock("stripped-cyan-wood",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> CYAN_PLANKS = registerBlock("cyan-planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 5;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 20;}
            });
    public static final RegistryObject<Block> CYAN_LEAVES = registerBlock("cyan-leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 30;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {return 60;}
            });
    public static final RegistryObject<Block> CYAN_SAPLING = registerBlock("cyan-sapling",
            () -> new SaplingBlock(new CyanTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> CYAN_DOOR = registerBlock("cyan-door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> CYAN_TRAPDOOR = registerBlock("cyan-trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> CYAN_STAIRS = registerBlock("cyan-stairs",
            () -> new StairBlock(() -> ModBlocks.CYAN_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> CYAN_SLAB = registerBlock("cyan-slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> CYAN_FENCE = registerBlock("cyan-fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> CYAN_FENCE_GATE = registerBlock("cyan-fence-gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> CYAN_PRESSURE_PLATE = registerBlock("cyan-pressure-plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> CYAN_BUTTON = registerBlock("cyan-button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> CYAN_WALL_SIGN = registerBlockNoItem("cyan-wall-sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.CYAN));
    public static final RegistryObject<Block> CYAN_SIGN = registerBlockNoItem("cyan-sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.CYAN));
    public static final RegistryObject<Block> CYAN_HANGING_WALL_SIGN = registerBlockNoItem("cyan-hanging-wall-sign",
            () -> new ModHangingWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.CYAN));
    public static final RegistryObject<Block> CYAN_HANGING_SIGN = registerBlockNoItem("cyan-hanging-sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.CYAN));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> registerBlockNoItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
