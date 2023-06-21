package net.ember.embrtrees.item;

import net.ember.embrtrees.EmbrTrees;
import net.ember.embrtrees.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB, EmbrTrees.MODID);

    public static RegistryObject<CreativeModeTab> EMBRTREES_TAB = CREATIVE_MODE_TABS.register("embrtrees-tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ASH_SAPLING.get()))
                    .title(Component.translatable("creativemodetab.embrtrees-tab")).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
