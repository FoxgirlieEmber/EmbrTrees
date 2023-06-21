package net.ember.embrtrees.block.custom;

import net.ember.embrtrees.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class ModLogs extends RotatedPillarBlock {
    public ModLogs(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(state.is(ModBlocks.ASH_LOG.get())) {
                return ModBlocks.STRIPPED_ASH_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.ASH_WOOD.get())) {
                return ModBlocks.STRIPPED_ASH_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.ASTRAL_LOG.get())) {
                return ModBlocks.ASTRAL_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.BLOSSOM_WOOD.get())) {
                return ModBlocks.STRIPPED_ASTRAL_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.BLOSSOM_LOG.get())) {
                return ModBlocks.STRIPPED_BLOSSOM_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.BLOSSOM_WOOD.get())) {
                return ModBlocks.STRIPPED_BLOSSOM_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.VOID_BLOSSOM_LOG.get())) {
                return ModBlocks.STRIPPED_VOID_BLOSSOM_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.VOID_BLOSSOM_WOOD.get())) {
                return ModBlocks.STRIPPED_VOID_BLOSSOM_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.GHOSTWOOD_LOG.get())) {
                return ModBlocks.STRIPPED_GHOSTWOOD_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.GHOSTWOOD_WOOD.get())) {
                return ModBlocks.STRIPPED_GHOSTWOOD_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.MAHOGANY_LOG.get())) {
                return ModBlocks.STRIPPED_MAHOGANY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.MAHOGANY_WOOD.get())) {
                return ModBlocks.STRIPPED_MAHOGANY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.OCEANIC_LOG.get())) {
                return ModBlocks.STRIPPED_OCEANIC_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.OCEANIC_WOOD.get())) {
                return ModBlocks.STRIPPED_OCEANIC_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.QUARTZWOOD_LOG.get())) {
                return ModBlocks.STRIPPED_QUARTZWOOD_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.QUARTZWOOD_WOOD.get())) {
                return ModBlocks.STRIPPED_QUARTZWOOD_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.VAMPIRIC_LOG.get())) {
                return ModBlocks.STRIPPED_VAMPIRIC_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.VAMPIRIC_WOOD.get())) {
                return ModBlocks.STRIPPED_VAMPIRIC_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.WILLOW_LOG.get())) {
                return ModBlocks.STRIPPED_WILLOW_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.WILLOW_WOOD.get())) {
                return ModBlocks.STRIPPED_WILLOW_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.BLACKWOOD_LOG.get())) {
                return ModBlocks.STRIPPED_BLACKWOOD_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.BLACKWOOD_WOOD.get())) {
                return ModBlocks.STRIPPED_BLACKWOOD_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.WALNUT_LOG.get())) {
                return ModBlocks.STRIPPED_WALNUT_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.WALNUT_WOOD.get())) {
                return ModBlocks.STRIPPED_WALNUT_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.HEARTWOOD_LOG.get())) {
                return ModBlocks.STRIPPED_HEARTWOOD_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.HEARTWOOD_WOOD.get())) {
                return ModBlocks.STRIPPED_HEARTWOOD_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.SUNRISE_LOG.get())) {
                return ModBlocks.STRIPPED_SUNRISE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.SUNRISE_WOOD.get())) {
                return ModBlocks.STRIPPED_SUNRISE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.ERROR_LOG.get())) {
                return ModBlocks.STRIPPED_ERROR_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.ERROR_WOOD.get())) {
                return ModBlocks.STRIPPED_ERROR_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.CYAN_LOG.get())) {
                return ModBlocks.STRIPPED_CYAN_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.CYAN_WOOD.get())) {
                return ModBlocks.STRIPPED_CYAN_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
