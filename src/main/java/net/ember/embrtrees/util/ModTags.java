package net.ember.embrtrees.util;

import net.ember.embrtrees.EmbrTrees;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks
    {
        public static final TagKey<Block> ASH_LOGS = tag("ash-logs");
        public static final TagKey<Block> ASTRAL_LOGS = tag("astral-logs");
        public static final TagKey<Block> BLOSSOM_LOGS = tag("blossom-logs");
        public static final TagKey<Block> VOID_BLOSSOM_LOGS = tag("void-blossom-logs");
        public static final TagKey<Block> GHOSTWOOD_LOGS = tag("ghostwood-logs");
        public static final TagKey<Block> MAHOGANY_LOGS = tag("mahogany-logs");
        public static final TagKey<Block> OCEANIC_LOGS = tag("oceanic-logs");
        public static final TagKey<Block> QUARTZWOOD_LOGS = tag("quartzwood-logs");
        public static final TagKey<Block> VAMPIRIC_LOGS = tag("vampiric-logs");
        public static final TagKey<Block> WILLOW_LOGS = tag("willow-logs");
        public static final TagKey<Block> BLACKWOOD_LOGS = tag("blackwood-logs");
        public static final TagKey<Block> WALNUT_LOGS = tag("walnut-logs");
        public static final TagKey<Block> HEARTWOOD_LOGS = tag("heartwood-logs");
        public static final TagKey<Block> SUNRISE_LOGS = tag("sunrise-logs");
        public static final TagKey<Block> ERROR_LOGS = tag("error-logs");
        public static final TagKey<Block> CYAN_LOGS = tag("cyan-logs");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(EmbrTrees.MODID, name));
        }

        public static final TagKey<Block> PLANKS = mcTag("planks");
        public static final TagKey<Block> LOGS = mcTag("logs");
        public static final TagKey<Block> LOGS_THAT_BURN = mcTag("logs_that_burn");
        public static final TagKey<Block> LEAVES = mcTag("leaves");
        public static final TagKey<Block> FENCES = mcTag("fences");

        public static TagKey<Block> mcTag(String name) {
            return BlockTags.create(new ResourceLocation("minecraft", name));
        }
    }

    public static class Items
    {
        public static final TagKey<Item> ASH_LOGS = tag("ash-logs");
        public static final TagKey<Item> ASTRAL_LOGS = tag("astral-logs");
        public static final TagKey<Item> BLOSSOM_LOGS = tag("blossom-logs");
        public static final TagKey<Item> VOID_BLOSSOM_LOGS = tag("void-blossom-logs");
        public static final TagKey<Item> GHOSTWOOD_LOGS = tag("ghostwood-logs");
        public static final TagKey<Item> MAHOGANY_LOGS = tag("mahogany-logs");
        public static final TagKey<Item> OCEANIC_LOGS = tag("oceanic-logs");
        public static final TagKey<Item> QUARTZWOOD_LOGS = tag("quartzwood-logs");
        public static final TagKey<Item> VAMPIRIC_LOGS = tag("vampiric-logs");
        public static final TagKey<Item> WILLOW_LOGS = tag("willow-logs");
        public static final TagKey<Item> BLACKWOOD_LOGS = tag("blackwood-logs");
        public static final TagKey<Item> WALNUT_LOGS = tag("walnut-logs");
        public static final TagKey<Item> HEARTWOOD_LOGS = tag("heartwood-logs");
        public static final TagKey<Item> SUNRISE_LOGS = tag("sunrise-logs");
        public static final TagKey<Item> ERROR_LOGS = tag("error-logs");
        public static final TagKey<Item> CYAN_LOGS = tag("cyan-logs");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(EmbrTrees.MODID, name));
        }

        public static final TagKey<Item> PLANKS = mcTag("planks");
        public static final TagKey<Item> LOGS = mcTag("logs");
        public static final TagKey<Item> LOGS_THAT_BURN = mcTag("logs_that_burn");
        public static final TagKey<Item> LEAVES = mcTag("leaves");
        public static final TagKey<Item> FENCES = mcTag("fences");

        public static TagKey<Item> mcTag(String name) {
            return ItemTags.create(new ResourceLocation("minecraft", name));
        }
    }
}
