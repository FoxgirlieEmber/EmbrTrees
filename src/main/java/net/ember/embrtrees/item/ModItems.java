package net.ember.embrtrees.item;

import net.ember.embrtrees.EmbrTrees;
import net.ember.embrtrees.block.ModBlocks;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EmbrTrees.MODID);
//ASH WOOD
    public static final RegistryObject<Item> ASH_BOAT = ITEMS.register("ash-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASH_CHEST_BOAT = ITEMS.register("ash-chest-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASH_SIGN = ITEMS.register("ash-sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.ASH_SIGN.get(), ModBlocks.ASH_WALL_SIGN.get()));
    public static final RegistryObject<Item> ASH_HANGING_SIGN = ITEMS.register("ash-hanging-sign",
            () -> new HangingSignItem(ModBlocks.ASH_HANGING_SIGN.get(), ModBlocks.ASH_HANGING_WALL_SIGN.get(),
                    new Item.Properties().stacksTo(16)));
//ASTRAL WOOD
    public static final RegistryObject<Item> ASTRAL_BOAT = ITEMS.register("astral-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASTRAL_CHEST_BOAT = ITEMS.register("astral-chest-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASTRAL_SIGN = ITEMS.register("astral-sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.ASTRAL_SIGN.get(), ModBlocks.ASTRAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ASTRAL_HANGING_SIGN = ITEMS.register("astral-hanging-sign",
            () -> new HangingSignItem(ModBlocks.ASTRAL_HANGING_SIGN.get(), ModBlocks.ASTRAL_HANGING_WALL_SIGN.get(),
                    new Item.Properties().stacksTo(16)));
//BLOSSOM WOOD
    public static final RegistryObject<Item> BLOSSOM_BOAT = ITEMS.register("blossom-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOSSOM_CHEST_BOAT = ITEMS.register("blossom-chest-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOSSOM_SIGN = ITEMS.register("blossom-sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.BLOSSOM_SIGN.get(), ModBlocks.BLOSSOM_WALL_SIGN.get()));
    public static final RegistryObject<Item> BLOSSOM_HANGING_SIGN = ITEMS.register("blossom-hanging-sign",
            () -> new HangingSignItem(ModBlocks.BLOSSOM_HANGING_SIGN.get(), ModBlocks.BLOSSOM_HANGING_WALL_SIGN.get(),
                    new Item.Properties().stacksTo(16)));
//VOID_BLOSSOM WOOD
    public static final RegistryObject<Item> VOID_BLOSSOM_BOAT = ITEMS.register("void-blossom-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VOID_BLOSSOM_CHEST_BOAT = ITEMS.register("void-blossom-chest-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VOID_BLOSSOM_SIGN = ITEMS.register("void-blossom-sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.VOID_BLOSSOM_SIGN.get(), ModBlocks.VOID_BLOSSOM_WALL_SIGN.get()));
    public static final RegistryObject<Item> VOID_BLOSSOM_HANGING_SIGN = ITEMS.register("void-blossom-hanging-sign",
            () -> new HangingSignItem(ModBlocks.VOID_BLOSSOM_HANGING_SIGN.get(), ModBlocks.VOID_BLOSSOM_HANGING_WALL_SIGN.get(),
                    new Item.Properties().stacksTo(16)));
//GHOSTWOOD WOOD
    public static final RegistryObject<Item> GHOSTWOOD_BOAT = ITEMS.register("ghostwood-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GHOSTWOOD_CHEST_BOAT = ITEMS.register("ghostwood-chest-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GHOSTWOOD_SIGN = ITEMS.register("ghostwood-sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.GHOSTWOOD_SIGN.get(), ModBlocks.GHOSTWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> GHOSTWOOD_HANGING_SIGN = ITEMS.register("ghostwood-hanging-sign",
            () -> new HangingSignItem(ModBlocks.GHOSTWOOD_HANGING_SIGN.get(), ModBlocks.GHOSTWOOD_HANGING_WALL_SIGN.get(),
                    new Item.Properties().stacksTo(16)));
//MAHOGANY WOOD
    public static final RegistryObject<Item> MAHOGANY_BOAT = ITEMS.register("mahogany-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_CHEST_BOAT = ITEMS.register("mahogany-chest-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_SIGN = ITEMS.register("mahogany-sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.MAHOGANY_SIGN.get(), ModBlocks.MAHOGANY_WALL_SIGN.get()));
    public static final RegistryObject<Item> MAHOGANY_HANGING_SIGN = ITEMS.register("mahogany-hanging-sign",
            () -> new HangingSignItem(ModBlocks.MAHOGANY_HANGING_SIGN.get(), ModBlocks.MAHOGANY_HANGING_WALL_SIGN.get(),
                    new Item.Properties().stacksTo(16)));
//OCEANIC WOOD
    public static final RegistryObject<Item> OCEANIC_BOAT = ITEMS.register("oceanic-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OCEANIC_CHEST_BOAT = ITEMS.register("oceanic-chest-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OCEANIC_SIGN = ITEMS.register("oceanic-sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.OCEANIC_SIGN.get(), ModBlocks.OCEANIC_WALL_SIGN.get()));
    public static final RegistryObject<Item> OCEANIC_HANGING_SIGN = ITEMS.register("oceanic-hanging-sign",
            () -> new HangingSignItem(ModBlocks.OCEANIC_HANGING_SIGN.get(), ModBlocks.OCEANIC_HANGING_WALL_SIGN.get(),
                    new Item.Properties().stacksTo(16)));
//QUARTZWOOD WOOD
    public static final RegistryObject<Item> QUARTZWOOD_BOAT = ITEMS.register("quartzwood-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUARTZWOOD_CHEST_BOAT = ITEMS.register("quartzwood-chest-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUARTZWOOD_SIGN = ITEMS.register("quartzwood-sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.QUARTZWOOD_SIGN.get(), ModBlocks.QUARTZWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> QUARTZWOOD_HANGING_SIGN = ITEMS.register("quartzwood-hanging-sign",
            () -> new HangingSignItem(ModBlocks.QUARTZWOOD_HANGING_SIGN.get(), ModBlocks.QUARTZWOOD_HANGING_WALL_SIGN.get(),
                    new Item.Properties().stacksTo(16)));
//VAMPIRIC WOOD
    public static final RegistryObject<Item> VAMPIRIC_BOAT = ITEMS.register("vampiric-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VAMPIRIC_CHEST_BOAT = ITEMS.register("vampiric-chest-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VAMPIRIC_SIGN = ITEMS.register("vampiric-sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.VAMPIRIC_SIGN.get(), ModBlocks.VAMPIRIC_WALL_SIGN.get()));
    public static final RegistryObject<Item> VAMPIRIC_HANGING_SIGN = ITEMS.register("vampiric-hanging-sign",
            () -> new HangingSignItem(ModBlocks.VAMPIRIC_HANGING_SIGN.get(), ModBlocks.VAMPIRIC_HANGING_WALL_SIGN.get(),
                    new Item.Properties().stacksTo(16)));
//WILLOW WOOD
    public static final RegistryObject<Item> WILLOW_BOAT = ITEMS.register("willow-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_CHEST_BOAT = ITEMS.register("willow-chest-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_SIGN = ITEMS.register("willow-sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.WILLOW_SIGN.get(), ModBlocks.WILLOW_WALL_SIGN.get()));
    public static final RegistryObject<Item> WILLOW_HANGING_SIGN = ITEMS.register("willow-hanging-sign",
            () -> new HangingSignItem(ModBlocks.WILLOW_HANGING_SIGN.get(), ModBlocks.WILLOW_HANGING_WALL_SIGN.get(),
                    new Item.Properties().stacksTo(16)));
//BLACKWOOD WOOD
    public static final RegistryObject<Item> BLACKWOOD_BOAT = ITEMS.register("blackwood-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_CHEST_BOAT = ITEMS.register("blackwood-chest-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_SIGN = ITEMS.register("blackwood-sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.BLACKWOOD_SIGN.get(), ModBlocks.BLACKWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> BLACKWOOD_HANGING_SIGN = ITEMS.register("blackwood-hanging-sign",
            () -> new HangingSignItem(ModBlocks.BLACKWOOD_HANGING_SIGN.get(), ModBlocks.BLACKWOOD_HANGING_WALL_SIGN.get(),
                    new Item.Properties().stacksTo(16)));
//WALNUT WOOD
    public static final RegistryObject<Item> WALNUT_BOAT = ITEMS.register("walnut-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WALNUT_CHEST_BOAT = ITEMS.register("walnut-chest-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WALNUT_SIGN = ITEMS.register("walnut-sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.WALNUT_SIGN.get(), ModBlocks.WALNUT_WALL_SIGN.get()));
    public static final RegistryObject<Item> WALNUT_HANGING_SIGN = ITEMS.register("walnut-hanging-sign",
            () -> new HangingSignItem(ModBlocks.WALNUT_HANGING_SIGN.get(), ModBlocks.WALNUT_HANGING_WALL_SIGN.get(),
                    new Item.Properties().stacksTo(16)));
//HEARTWOOD WOOD
    public static final RegistryObject<Item> HEARTWOOD_BOAT = ITEMS.register("heartwood-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEARTWOOD_CHEST_BOAT = ITEMS.register("heartwood-chest-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEARTWOOD_SIGN = ITEMS.register("heartwood-sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.HEARTWOOD_SIGN.get(), ModBlocks.HEARTWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> HEARTWOOD_HANGING_SIGN = ITEMS.register("heartwood-hanging-sign",
            () -> new HangingSignItem(ModBlocks.HEARTWOOD_HANGING_SIGN.get(), ModBlocks.HEARTWOOD_HANGING_WALL_SIGN.get(),
                    new Item.Properties().stacksTo(16)));
    //SUNRISE WOOD
    public static final RegistryObject<Item> SUNRISE_BOAT = ITEMS.register("sunrise-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUNRISE_CHEST_BOAT = ITEMS.register("sunrise-chest-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUNRISE_SIGN = ITEMS.register("sunrise-sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.SUNRISE_SIGN.get(), ModBlocks.SUNRISE_WALL_SIGN.get()));
    public static final RegistryObject<Item> SUNRISE_HANGING_SIGN = ITEMS.register("sunrise-hanging-sign",
            () -> new HangingSignItem(ModBlocks.SUNRISE_HANGING_SIGN.get(), ModBlocks.SUNRISE_HANGING_WALL_SIGN.get(),
                    new Item.Properties().stacksTo(16)));
    //ERROR WOOD
    public static final RegistryObject<Item> ERROR_BOAT = ITEMS.register("error-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ERROR_CHEST_BOAT = ITEMS.register("error-chest-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ERROR_SIGN = ITEMS.register("error-sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.ERROR_SIGN.get(), ModBlocks.ERROR_WALL_SIGN.get()));
    public static final RegistryObject<Item> ERROR_HANGING_SIGN = ITEMS.register("error-hanging-sign",
            () -> new HangingSignItem(ModBlocks.ERROR_HANGING_SIGN.get(), ModBlocks.ERROR_HANGING_WALL_SIGN.get(),
                    new Item.Properties().stacksTo(16)));
    //CYAN WOOD
    public static final RegistryObject<Item> CYAN_BOAT = ITEMS.register("cyan-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CYAN_CHEST_BOAT = ITEMS.register("cyan-chest-boat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CYAN_SIGN = ITEMS.register("cyan-sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.CYAN_SIGN.get(), ModBlocks.CYAN_WALL_SIGN.get()));
    public static final RegistryObject<Item> CYAN_HANGING_SIGN = ITEMS.register("cyan-hanging-sign",
            () -> new HangingSignItem(ModBlocks.CYAN_HANGING_SIGN.get(), ModBlocks.CYAN_HANGING_WALL_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
