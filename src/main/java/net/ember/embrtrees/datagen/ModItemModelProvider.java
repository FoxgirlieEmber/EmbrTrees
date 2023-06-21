package net.ember.embrtrees.datagen;

import net.ember.embrtrees.EmbrTrees;
import net.ember.embrtrees.block.ModBlocks;
import net.ember.embrtrees.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EmbrTrees.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //ASH
        saplingItem(ModBlocks.ASH_SAPLING);
        simpleItem(ModItems.ASH_BOAT);
        simpleItem(ModItems.ASH_CHEST_BOAT);
        simpleItem(ModItems.ASH_SIGN);
        simpleItem(ModItems.ASH_HANGING_SIGN);
        //ASTRAL
        saplingItem(ModBlocks.ASTRAL_SAPLING);
        simpleItem(ModItems.ASTRAL_BOAT);
        simpleItem(ModItems.ASTRAL_CHEST_BOAT);
        simpleItem(ModItems.ASTRAL_SIGN);
        simpleItem(ModItems.ASTRAL_HANGING_SIGN);
        //BLOSSOM
        saplingItem(ModBlocks.BLOSSOM_SAPLING);
        simpleItem(ModItems.BLOSSOM_BOAT);
        simpleItem(ModItems.BLOSSOM_CHEST_BOAT);
        simpleItem(ModItems.BLOSSOM_SIGN);
        simpleItem(ModItems.BLOSSOM_HANGING_SIGN);
        //VOID BLOSSOM
        saplingItem(ModBlocks.VOID_BLOSSOM_SAPLING);
        simpleItem(ModItems.VOID_BLOSSOM_BOAT);
        simpleItem(ModItems.VOID_BLOSSOM_CHEST_BOAT);
        simpleItem(ModItems.VOID_BLOSSOM_SIGN);
        simpleItem(ModItems.VOID_BLOSSOM_HANGING_SIGN);
        //MAHOGANY
        saplingItem(ModBlocks.MAHOGANY_SAPLING);
        simpleItem(ModItems.MAHOGANY_BOAT);
        simpleItem(ModItems.MAHOGANY_CHEST_BOAT);
        simpleItem(ModItems.MAHOGANY_SIGN);
        simpleItem(ModItems.MAHOGANY_HANGING_SIGN);
        //OCEANIC
        saplingItem(ModBlocks.OCEANIC_SAPLING);
        simpleItem(ModItems.OCEANIC_BOAT);
        simpleItem(ModItems.OCEANIC_CHEST_BOAT);
        simpleItem(ModItems.OCEANIC_SIGN);
        simpleItem(ModItems.OCEANIC_HANGING_SIGN);
        //QUARTZWOOD
        saplingItem(ModBlocks.QUARTZWOOD_SAPLING);
        simpleItem(ModItems.QUARTZWOOD_BOAT);
        simpleItem(ModItems.QUARTZWOOD_CHEST_BOAT);
        simpleItem(ModItems.QUARTZWOOD_SIGN);
        simpleItem(ModItems.QUARTZWOOD_HANGING_SIGN);
        //VAMPIRIC
        saplingItem(ModBlocks.VAMPIRIC_SAPLING);
        simpleItem(ModItems.VAMPIRIC_BOAT);
        simpleItem(ModItems.VAMPIRIC_CHEST_BOAT);
        simpleItem(ModItems.VAMPIRIC_SIGN);
        simpleItem(ModItems.VAMPIRIC_HANGING_SIGN);
        //WILLOW
        saplingItem(ModBlocks.WILLOW_SAPLING);
        simpleItem(ModItems.WILLOW_BOAT);
        simpleItem(ModItems.WILLOW_CHEST_BOAT);
        simpleItem(ModItems.WILLOW_SIGN);
        simpleItem(ModItems.WILLOW_HANGING_SIGN);
        //BLACKWOOD
        saplingItem(ModBlocks.BLACKWOOD_SAPLING);
        simpleItem(ModItems.BLACKWOOD_BOAT);
        simpleItem(ModItems.BLACKWOOD_CHEST_BOAT);
        simpleItem(ModItems.BLACKWOOD_SIGN);
        simpleItem(ModItems.BLACKWOOD_HANGING_SIGN);
        //WALNUT
        saplingItem(ModBlocks.WALNUT_SAPLING);
        simpleItem(ModItems.WALNUT_BOAT);
        simpleItem(ModItems.WALNUT_CHEST_BOAT);
        simpleItem(ModItems.WALNUT_SIGN);
        simpleItem(ModItems.WALNUT_HANGING_SIGN);
        //HEARTWOOD
        saplingItem(ModBlocks.HEARTWOOD_SAPLING);
        simpleItem(ModItems.HEARTWOOD_BOAT);
        simpleItem(ModItems.HEARTWOOD_CHEST_BOAT);
        simpleItem(ModItems.HEARTWOOD_SIGN);
        simpleItem(ModItems.HEARTWOOD_HANGING_SIGN);
        //SUNRISE
        saplingItem(ModBlocks.SUNRISE_SAPLING);
        simpleItem(ModItems.SUNRISE_BOAT);
        simpleItem(ModItems.SUNRISE_CHEST_BOAT);
        simpleItem(ModItems.SUNRISE_SIGN);
        simpleItem(ModItems.SUNRISE_HANGING_SIGN);
        //ERROR
        saplingItem(ModBlocks.ERROR_SAPLING);
        simpleItem(ModItems.ERROR_BOAT);
        simpleItem(ModItems.ERROR_CHEST_BOAT);
        simpleItem(ModItems.ERROR_SIGN);
        simpleItem(ModItems.ERROR_HANGING_SIGN);
        //CYAN
        saplingItem(ModBlocks.CYAN_SAPLING);
        simpleItem(ModItems.CYAN_BOAT);
        simpleItem(ModItems.CYAN_CHEST_BOAT);
        simpleItem(ModItems.CYAN_SIGN);
        simpleItem(ModItems.CYAN_HANGING_SIGN);
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(EmbrTrees.MODID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(EmbrTrees.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(EmbrTrees.MODID,"item/" + item.getId().getPath()));
    }
}
