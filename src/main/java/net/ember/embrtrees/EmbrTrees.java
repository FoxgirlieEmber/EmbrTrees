package net.ember.embrtrees;

import net.ember.embrtrees.block.entity.ModBlockEntities;
import net.ember.embrtrees.block.entity.ModWoodTypes;
import net.ember.embrtrees.item.ModCreativeModeTabs;
import net.ember.embrtrees.item.ModItems;
import net.ember.embrtrees.block.ModBlocks;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(EmbrTrees.MODID)
public class EmbrTrees
{
    public static final String MODID = "embrtrees";
    private static final Logger LOGGER = LogUtils.getLogger();

    public EmbrTrees()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        Sheets.addWoodType(ModWoodTypes.ASH);
    }

    private void clientSetup(final FMLCommonSetupEvent event)
    {
        WoodType.register(ModWoodTypes.ASH);
        BlockEntityRenderers.register(ModBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.HANGING_SIGN_BLOCK_ENTITIES.get(), HangingSignRenderer::new);
    }
    
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTab() == ModCreativeModeTabs.EMBRTREES_TAB.get())
        {
            //ASH WOOD
            event.accept(ModBlocks.ASH_SAPLING);
            event.accept(ModBlocks.ASH_LEAVES);
            event.accept(ModBlocks.ASH_LOG);
            event.accept(ModBlocks.ASH_WOOD);
            event.accept(ModBlocks.STRIPPED_ASH_LOG);
            event.accept(ModBlocks.STRIPPED_ASH_WOOD);
            event.accept(ModBlocks.ASH_PLANKS);
            event.accept(ModBlocks.ASH_STAIRS);
            event.accept(ModBlocks.ASH_SLAB);
            event.accept(ModBlocks.ASH_TRAPDOOR);
            event.accept(ModBlocks.ASH_DOOR);
            event.accept(ModBlocks.ASH_FENCE);
            event.accept(ModBlocks.ASH_FENCE_GATE);
            event.accept(ModBlocks.ASH_PRESSURE_PLATE);
            event.accept(ModBlocks.ASH_BUTTON);
            event.accept(ModItems.ASH_SIGN);
            event.accept(ModItems.ASH_HANGING_SIGN);
            event.accept(ModItems.ASH_BOAT);
            event.accept(ModItems.ASH_CHEST_BOAT);
            //ASTRAL WOOD
            event.accept(ModBlocks.ASTRAL_SAPLING);
            event.accept(ModBlocks.ASTRAL_LEAVES);
            event.accept(ModBlocks.ASTRAL_LOG);
            event.accept(ModBlocks.ASTRAL_WOOD);
            event.accept(ModBlocks.STRIPPED_ASTRAL_LOG);
            event.accept(ModBlocks.STRIPPED_ASTRAL_WOOD);
            event.accept(ModBlocks.ASTRAL_PLANKS);
            event.accept(ModBlocks.ASTRAL_STAIRS);
            event.accept(ModBlocks.ASTRAL_SLAB);
            event.accept(ModBlocks.ASTRAL_TRAPDOOR);
            event.accept(ModBlocks.ASTRAL_DOOR);
            event.accept(ModBlocks.ASTRAL_FENCE);
            event.accept(ModBlocks.ASTRAL_FENCE_GATE);
            event.accept(ModBlocks.ASTRAL_PRESSURE_PLATE);
            event.accept(ModBlocks.ASTRAL_BUTTON);
            event.accept(ModItems.ASTRAL_SIGN);
            event.accept(ModItems.ASTRAL_HANGING_SIGN);
            event.accept(ModItems.ASTRAL_BOAT);
            event.accept(ModItems.ASTRAL_CHEST_BOAT);
            //BLOSSOM WOOD
            event.accept(ModBlocks.BLOSSOM_SAPLING);
            event.accept(ModBlocks.BLOSSOM_LEAVES);
            event.accept(ModBlocks.BLOSSOM_LOG);
            event.accept(ModBlocks.BLOSSOM_WOOD);
            event.accept(ModBlocks.STRIPPED_BLOSSOM_LOG);
            event.accept(ModBlocks.STRIPPED_BLOSSOM_WOOD);
            event.accept(ModBlocks.BLOSSOM_PLANKS);
            event.accept(ModBlocks.BLOSSOM_STAIRS);
            event.accept(ModBlocks.BLOSSOM_SLAB);
            event.accept(ModBlocks.BLOSSOM_TRAPDOOR);
            event.accept(ModBlocks.BLOSSOM_DOOR);
            event.accept(ModBlocks.BLOSSOM_FENCE);
            event.accept(ModBlocks.BLOSSOM_FENCE_GATE);
            event.accept(ModBlocks.BLOSSOM_PRESSURE_PLATE);
            event.accept(ModBlocks.BLOSSOM_BUTTON);
            event.accept(ModItems.BLOSSOM_SIGN);
            event.accept(ModItems.BLOSSOM_HANGING_SIGN);
            event.accept(ModItems.BLOSSOM_BOAT);
            event.accept(ModItems.BLOSSOM_CHEST_BOAT);
            //VOID_BLOSSOM WOOD
            event.accept(ModBlocks.VOID_BLOSSOM_SAPLING);
            event.accept(ModBlocks.VOID_BLOSSOM_LEAVES);
            event.accept(ModBlocks.VOID_BLOSSOM_LOG);
            event.accept(ModBlocks.VOID_BLOSSOM_WOOD);
            event.accept(ModBlocks.STRIPPED_VOID_BLOSSOM_LOG);
            event.accept(ModBlocks.STRIPPED_VOID_BLOSSOM_WOOD);
            event.accept(ModBlocks.VOID_BLOSSOM_PLANKS);
            event.accept(ModBlocks.VOID_BLOSSOM_STAIRS);
            event.accept(ModBlocks.VOID_BLOSSOM_SLAB);
            event.accept(ModBlocks.VOID_BLOSSOM_TRAPDOOR);
            event.accept(ModBlocks.VOID_BLOSSOM_DOOR);
            event.accept(ModBlocks.VOID_BLOSSOM_FENCE);
            event.accept(ModBlocks.VOID_BLOSSOM_FENCE_GATE);
            event.accept(ModBlocks.VOID_BLOSSOM_PRESSURE_PLATE);
            event.accept(ModBlocks.VOID_BLOSSOM_BUTTON);
            event.accept(ModItems.VOID_BLOSSOM_SIGN);
            event.accept(ModItems.VOID_BLOSSOM_HANGING_SIGN);
            event.accept(ModItems.VOID_BLOSSOM_BOAT);
            event.accept(ModItems.VOID_BLOSSOM_CHEST_BOAT);
            //GHOSTWOOD WOOD
            event.accept(ModBlocks.GHOSTWOOD_SAPLING);
            event.accept(ModBlocks.GHOSTWOOD_LEAVES);
            event.accept(ModBlocks.GHOSTWOOD_LOG);
            event.accept(ModBlocks.GHOSTWOOD_WOOD);
            event.accept(ModBlocks.STRIPPED_GHOSTWOOD_LOG);
            event.accept(ModBlocks.STRIPPED_GHOSTWOOD_WOOD);
            event.accept(ModBlocks.GHOSTWOOD_PLANKS);
            event.accept(ModBlocks.GHOSTWOOD_STAIRS);
            event.accept(ModBlocks.GHOSTWOOD_SLAB);
            event.accept(ModBlocks.GHOSTWOOD_TRAPDOOR);
            event.accept(ModBlocks.GHOSTWOOD_DOOR);
            event.accept(ModBlocks.GHOSTWOOD_FENCE);
            event.accept(ModBlocks.GHOSTWOOD_FENCE_GATE);
            event.accept(ModBlocks.GHOSTWOOD_PRESSURE_PLATE);
            event.accept(ModBlocks.GHOSTWOOD_BUTTON);
            event.accept(ModItems.GHOSTWOOD_SIGN);
            event.accept(ModItems.GHOSTWOOD_HANGING_SIGN);
            event.accept(ModItems.GHOSTWOOD_BOAT);
            event.accept(ModItems.GHOSTWOOD_CHEST_BOAT);
            //MAHOGANY WOOD
            event.accept(ModBlocks.MAHOGANY_SAPLING);
            event.accept(ModBlocks.MAHOGANY_LEAVES);
            event.accept(ModBlocks.MAHOGANY_LOG);
            event.accept(ModBlocks.MAHOGANY_WOOD);
            event.accept(ModBlocks.STRIPPED_MAHOGANY_LOG);
            event.accept(ModBlocks.STRIPPED_MAHOGANY_WOOD);
            event.accept(ModBlocks.MAHOGANY_PLANKS);
            event.accept(ModBlocks.MAHOGANY_STAIRS);
            event.accept(ModBlocks.MAHOGANY_SLAB);
            event.accept(ModBlocks.MAHOGANY_TRAPDOOR);
            event.accept(ModBlocks.MAHOGANY_DOOR);
            event.accept(ModBlocks.MAHOGANY_FENCE);
            event.accept(ModBlocks.MAHOGANY_FENCE_GATE);
            event.accept(ModBlocks.MAHOGANY_PRESSURE_PLATE);
            event.accept(ModBlocks.MAHOGANY_BUTTON);
            event.accept(ModItems.MAHOGANY_SIGN);
            event.accept(ModItems.MAHOGANY_HANGING_SIGN);
            event.accept(ModItems.MAHOGANY_BOAT);
            event.accept(ModItems.MAHOGANY_CHEST_BOAT);
            //OCEANIC WOOD
            event.accept(ModBlocks.OCEANIC_SAPLING);
            event.accept(ModBlocks.OCEANIC_LEAVES);
            event.accept(ModBlocks.OCEANIC_LOG);
            event.accept(ModBlocks.OCEANIC_WOOD);
            event.accept(ModBlocks.STRIPPED_OCEANIC_LOG);
            event.accept(ModBlocks.STRIPPED_OCEANIC_WOOD);
            event.accept(ModBlocks.OCEANIC_PLANKS);
            event.accept(ModBlocks.OCEANIC_STAIRS);
            event.accept(ModBlocks.OCEANIC_SLAB);
            event.accept(ModBlocks.OCEANIC_TRAPDOOR);
            event.accept(ModBlocks.OCEANIC_DOOR);
            event.accept(ModBlocks.OCEANIC_FENCE);
            event.accept(ModBlocks.OCEANIC_FENCE_GATE);
            event.accept(ModBlocks.OCEANIC_PRESSURE_PLATE);
            event.accept(ModBlocks.OCEANIC_BUTTON);
            event.accept(ModItems.OCEANIC_SIGN);
            event.accept(ModItems.OCEANIC_HANGING_SIGN);
            event.accept(ModItems.OCEANIC_BOAT);
            event.accept(ModItems.OCEANIC_CHEST_BOAT);
            //QUARTZWOOD WOOD
            event.accept(ModBlocks.QUARTZWOOD_SAPLING);
            event.accept(ModBlocks.QUARTZWOOD_LEAVES);
            event.accept(ModBlocks.QUARTZWOOD_LOG);
            event.accept(ModBlocks.QUARTZWOOD_WOOD);
            event.accept(ModBlocks.STRIPPED_QUARTZWOOD_LOG);
            event.accept(ModBlocks.STRIPPED_QUARTZWOOD_WOOD);
            event.accept(ModBlocks.QUARTZWOOD_PLANKS);
            event.accept(ModBlocks.QUARTZWOOD_STAIRS);
            event.accept(ModBlocks.QUARTZWOOD_SLAB);
            event.accept(ModBlocks.QUARTZWOOD_TRAPDOOR);
            event.accept(ModBlocks.QUARTZWOOD_DOOR);
            event.accept(ModBlocks.QUARTZWOOD_FENCE);
            event.accept(ModBlocks.QUARTZWOOD_FENCE_GATE);
            event.accept(ModBlocks.QUARTZWOOD_PRESSURE_PLATE);
            event.accept(ModBlocks.QUARTZWOOD_BUTTON);
            event.accept(ModItems.QUARTZWOOD_SIGN);
            event.accept(ModItems.QUARTZWOOD_HANGING_SIGN);
            event.accept(ModItems.QUARTZWOOD_BOAT);
            event.accept(ModItems.QUARTZWOOD_CHEST_BOAT);
            //VAMPIRIC WOOD
            event.accept(ModBlocks.VAMPIRIC_SAPLING);
            event.accept(ModBlocks.VAMPIRIC_LEAVES);
            event.accept(ModBlocks.VAMPIRIC_LOG);
            event.accept(ModBlocks.VAMPIRIC_WOOD);
            event.accept(ModBlocks.STRIPPED_VAMPIRIC_LOG);
            event.accept(ModBlocks.STRIPPED_VAMPIRIC_WOOD);
            event.accept(ModBlocks.VAMPIRIC_PLANKS);
            event.accept(ModBlocks.VAMPIRIC_STAIRS);
            event.accept(ModBlocks.VAMPIRIC_SLAB);
            event.accept(ModBlocks.VAMPIRIC_TRAPDOOR);
            event.accept(ModBlocks.VAMPIRIC_DOOR);
            event.accept(ModBlocks.VAMPIRIC_FENCE);
            event.accept(ModBlocks.VAMPIRIC_FENCE_GATE);
            event.accept(ModBlocks.VAMPIRIC_PRESSURE_PLATE);
            event.accept(ModBlocks.VAMPIRIC_BUTTON);
            event.accept(ModItems.VAMPIRIC_SIGN);
            event.accept(ModItems.VAMPIRIC_HANGING_SIGN);
            event.accept(ModItems.VAMPIRIC_BOAT);
            event.accept(ModItems.VAMPIRIC_CHEST_BOAT);
            //WILLOW WOOD
            event.accept(ModBlocks.WILLOW_SAPLING);
            event.accept(ModBlocks.WILLOW_LEAVES);
            event.accept(ModBlocks.WILLOW_LOG);
            event.accept(ModBlocks.WILLOW_WOOD);
            event.accept(ModBlocks.STRIPPED_WILLOW_LOG);
            event.accept(ModBlocks.STRIPPED_WILLOW_WOOD);
            event.accept(ModBlocks.WILLOW_PLANKS);
            event.accept(ModBlocks.WILLOW_STAIRS);
            event.accept(ModBlocks.WILLOW_SLAB);
            event.accept(ModBlocks.WILLOW_TRAPDOOR);
            event.accept(ModBlocks.WILLOW_DOOR);
            event.accept(ModBlocks.WILLOW_FENCE);
            event.accept(ModBlocks.WILLOW_FENCE_GATE);
            event.accept(ModBlocks.WILLOW_PRESSURE_PLATE);
            event.accept(ModBlocks.WILLOW_BUTTON);
            event.accept(ModItems.WILLOW_SIGN);
            event.accept(ModItems.WILLOW_HANGING_SIGN);
            event.accept(ModItems.WILLOW_BOAT);
            event.accept(ModItems.WILLOW_CHEST_BOAT);
            //BLACKWOOD WOOD
            event.accept(ModBlocks.BLACKWOOD_SAPLING);
            event.accept(ModBlocks.BLACKWOOD_LEAVES);
            event.accept(ModBlocks.BLACKWOOD_LOG);
            event.accept(ModBlocks.BLACKWOOD_WOOD);
            event.accept(ModBlocks.STRIPPED_BLACKWOOD_LOG);
            event.accept(ModBlocks.STRIPPED_BLACKWOOD_WOOD);
            event.accept(ModBlocks.BLACKWOOD_PLANKS);
            event.accept(ModBlocks.BLACKWOOD_STAIRS);
            event.accept(ModBlocks.BLACKWOOD_SLAB);
            event.accept(ModBlocks.BLACKWOOD_TRAPDOOR);
            event.accept(ModBlocks.BLACKWOOD_DOOR);
            event.accept(ModBlocks.BLACKWOOD_FENCE);
            event.accept(ModBlocks.BLACKWOOD_FENCE_GATE);
            event.accept(ModBlocks.BLACKWOOD_PRESSURE_PLATE);
            event.accept(ModBlocks.BLACKWOOD_BUTTON);
            event.accept(ModItems.BLACKWOOD_SIGN);
            event.accept(ModItems.BLACKWOOD_HANGING_SIGN);
            event.accept(ModItems.BLACKWOOD_BOAT);
            event.accept(ModItems.BLACKWOOD_CHEST_BOAT);
            //WALNUT WOOD
            event.accept(ModBlocks.WALNUT_SAPLING);
            event.accept(ModBlocks.WALNUT_LEAVES);
            event.accept(ModBlocks.WALNUT_LOG);
            event.accept(ModBlocks.WALNUT_WOOD);
            event.accept(ModBlocks.STRIPPED_WALNUT_LOG);
            event.accept(ModBlocks.STRIPPED_WALNUT_WOOD);
            event.accept(ModBlocks.WALNUT_PLANKS);
            event.accept(ModBlocks.WALNUT_STAIRS);
            event.accept(ModBlocks.WALNUT_SLAB);
            event.accept(ModBlocks.WALNUT_TRAPDOOR);
            event.accept(ModBlocks.WALNUT_DOOR);
            event.accept(ModBlocks.WALNUT_FENCE);
            event.accept(ModBlocks.WALNUT_FENCE_GATE);
            event.accept(ModBlocks.WALNUT_PRESSURE_PLATE);
            event.accept(ModBlocks.WALNUT_BUTTON);
            event.accept(ModItems.WALNUT_SIGN);
            event.accept(ModItems.WALNUT_HANGING_SIGN);
            event.accept(ModItems.WALNUT_BOAT);
            event.accept(ModItems.WALNUT_CHEST_BOAT);
            //HEARTWOOD WOOD
            event.accept(ModBlocks.HEARTWOOD_SAPLING);
            event.accept(ModBlocks.HEARTWOOD_LEAVES);
            event.accept(ModBlocks.HEARTWOOD_LOG);
            event.accept(ModBlocks.HEARTWOOD_WOOD);
            event.accept(ModBlocks.STRIPPED_HEARTWOOD_LOG);
            event.accept(ModBlocks.STRIPPED_HEARTWOOD_WOOD);
            event.accept(ModBlocks.HEARTWOOD_PLANKS);
            event.accept(ModBlocks.HEARTWOOD_STAIRS);
            event.accept(ModBlocks.HEARTWOOD_SLAB);
            event.accept(ModBlocks.HEARTWOOD_TRAPDOOR);
            event.accept(ModBlocks.HEARTWOOD_DOOR);
            event.accept(ModBlocks.HEARTWOOD_FENCE);
            event.accept(ModBlocks.HEARTWOOD_FENCE_GATE);
            event.accept(ModBlocks.HEARTWOOD_PRESSURE_PLATE);
            event.accept(ModBlocks.HEARTWOOD_BUTTON);
            event.accept(ModItems.HEARTWOOD_SIGN);
            event.accept(ModItems.HEARTWOOD_HANGING_SIGN);
            event.accept(ModItems.HEARTWOOD_BOAT);
            event.accept(ModItems.HEARTWOOD_CHEST_BOAT);
            //SUNRISE WOOD
            event.accept(ModBlocks.SUNRISE_SAPLING);
            event.accept(ModBlocks.SUNRISE_LEAVES);
            event.accept(ModBlocks.SUNRISE_LOG);
            event.accept(ModBlocks.SUNRISE_WOOD);
            event.accept(ModBlocks.STRIPPED_SUNRISE_LOG);
            event.accept(ModBlocks.STRIPPED_SUNRISE_WOOD);
            event.accept(ModBlocks.SUNRISE_PLANKS);
            event.accept(ModBlocks.SUNRISE_STAIRS);
            event.accept(ModBlocks.SUNRISE_SLAB);
            event.accept(ModBlocks.SUNRISE_TRAPDOOR);
            event.accept(ModBlocks.SUNRISE_DOOR);
            event.accept(ModBlocks.SUNRISE_FENCE);
            event.accept(ModBlocks.SUNRISE_FENCE_GATE);
            event.accept(ModBlocks.SUNRISE_PRESSURE_PLATE);
            event.accept(ModBlocks.SUNRISE_BUTTON);
            event.accept(ModItems.SUNRISE_SIGN);
            event.accept(ModItems.SUNRISE_HANGING_SIGN);
            event.accept(ModItems.SUNRISE_BOAT);
            event.accept(ModItems.SUNRISE_CHEST_BOAT);
            //ERROR WOOD
            event.accept(ModBlocks.ERROR_SAPLING);
            event.accept(ModBlocks.ERROR_LEAVES);
            event.accept(ModBlocks.ERROR_LOG);
            event.accept(ModBlocks.ERROR_WOOD);
            event.accept(ModBlocks.STRIPPED_ERROR_LOG);
            event.accept(ModBlocks.STRIPPED_ERROR_WOOD);
            event.accept(ModBlocks.ERROR_PLANKS);
            event.accept(ModBlocks.ERROR_STAIRS);
            event.accept(ModBlocks.ERROR_SLAB);
            event.accept(ModBlocks.ERROR_TRAPDOOR);
            event.accept(ModBlocks.ERROR_DOOR);
            event.accept(ModBlocks.ERROR_FENCE);
            event.accept(ModBlocks.ERROR_FENCE_GATE);
            event.accept(ModBlocks.ERROR_PRESSURE_PLATE);
            event.accept(ModBlocks.ERROR_BUTTON);
            event.accept(ModItems.ERROR_SIGN);
            event.accept(ModItems.ERROR_HANGING_SIGN);
            event.accept(ModItems.ERROR_BOAT);
            event.accept(ModItems.ERROR_CHEST_BOAT);
            //CYAN WOOD
            event.accept(ModBlocks.CYAN_SAPLING);
            event.accept(ModBlocks.CYAN_LEAVES);
            event.accept(ModBlocks.CYAN_LOG);
            event.accept(ModBlocks.CYAN_WOOD);
            event.accept(ModBlocks.STRIPPED_CYAN_LOG);
            event.accept(ModBlocks.STRIPPED_CYAN_WOOD);
            event.accept(ModBlocks.CYAN_PLANKS);
            event.accept(ModBlocks.CYAN_STAIRS);
            event.accept(ModBlocks.CYAN_SLAB);
            event.accept(ModBlocks.CYAN_TRAPDOOR);
            event.accept(ModBlocks.CYAN_DOOR);
            event.accept(ModBlocks.CYAN_FENCE);
            event.accept(ModBlocks.CYAN_FENCE_GATE);
            event.accept(ModBlocks.CYAN_PRESSURE_PLATE);
            event.accept(ModBlocks.CYAN_BUTTON);
            event.accept(ModItems.CYAN_SIGN);
            event.accept(ModItems.CYAN_HANGING_SIGN);
            event.accept(ModItems.CYAN_BOAT);
            event.accept(ModItems.CYAN_CHEST_BOAT);
        }
    }
}
