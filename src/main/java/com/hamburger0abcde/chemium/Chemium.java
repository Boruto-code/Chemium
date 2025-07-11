package com.hamburger0abcde.chemium;

import com.hamburger0abcde.chemium.client.creativetab.ModCreativeModeTabs;
import com.hamburger0abcde.chemium.common.item.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.NeoForge;

import java.util.HashMap;
import java.util.Map;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Chemium.MODID)
public class Chemium
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "chemium";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    private static final Map<Item, String> ELEMENT_SYMBOLS = new HashMap<>();
    private static final Map<Item, Double> MELTING_POINTS = new HashMap<>();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public Chemium(IEventBus modEventBus, ModContainer modContainer)
    {
        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        ModItems.ITEMS.register(modEventBus);
        ModCreativeModeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        modEventBus.addListener(this::setupElementSymbols);
        modEventBus.addListener(this::setupMeltingPoints);
    }

    private void setupElementSymbols(FMLCommonSetupEvent event) {
        // Elements
        ELEMENT_SYMBOLS.put(ModItems.LITHIUM_INGOT.get(), "Li");
        ELEMENT_SYMBOLS.put(ModItems.BERYLLIUM_INGOT.get(), "Be");
        ELEMENT_SYMBOLS.put(ModItems.BORON_INGOT.get(), "B");
        ELEMENT_SYMBOLS.put(Items.COAL, "C");
        ELEMENT_SYMBOLS.put(Items.DIAMOND, "C");
        ELEMENT_SYMBOLS.put(ModItems.SODIUM_INGOT.get(), "Na");
        ELEMENT_SYMBOLS.put(ModItems.MAGNESIUM_INGOT.get(), "Mg");
        ELEMENT_SYMBOLS.put(ModItems.ALUMINIUM_INGOT.get(), "Al");
        ELEMENT_SYMBOLS.put(ModItems.SILICON_INGOT.get(), "Si");
        ELEMENT_SYMBOLS.put(ModItems.BLACK_PHOSPHORUS_INGOT.get(), "P");
        ELEMENT_SYMBOLS.put(ModItems.RED_PHOSPHORUS_INGOT.get(), "P");
        ELEMENT_SYMBOLS.put(ModItems.VIOLET_PHOSPHORUS_INGOT.get(), "P");
        ELEMENT_SYMBOLS.put(ModItems.YELLOW_PHOSPHORUS_INGOT.get(), "P");
        ELEMENT_SYMBOLS.put(ModItems.SULFUR_INGOT.get(), "S");
        ELEMENT_SYMBOLS.put(ModItems.POTASSIUM_INGOT.get(), "K");
        ELEMENT_SYMBOLS.put(ModItems.CALCIUM_INGOT.get(), "Ca");
        ELEMENT_SYMBOLS.put(ModItems.SCANDIUM_INGOT.get(), "Sc");
        ELEMENT_SYMBOLS.put(ModItems.TITANIUM_INGOT.get(), "Ti");
        ELEMENT_SYMBOLS.put(ModItems.VANADIUM_INGOT.get(), "V");
        ELEMENT_SYMBOLS.put(ModItems.CHROMIUM_INGOT.get(), "Cr");
        ELEMENT_SYMBOLS.put(ModItems.MANGANESE_INGOT.get(), "Mn");
        ELEMENT_SYMBOLS.put(Items.IRON_INGOT, "Fe");
        ELEMENT_SYMBOLS.put(ModItems.COBALT_INGOT.get(), "Co");
        ELEMENT_SYMBOLS.put(ModItems.NICKEL_INGOT.get(), "Ni");
        ELEMENT_SYMBOLS.put(Items.COPPER_INGOT, "Cu");
        ELEMENT_SYMBOLS.put(ModItems.ZINC_INGOT.get(), "Zn");
        ELEMENT_SYMBOLS.put(ModItems.GALLIUM_INGOT.get(), "Ga");
        ELEMENT_SYMBOLS.put(ModItems.GERMANIUM_INGOT.get(), "Ge");
        ELEMENT_SYMBOLS.put(ModItems.BLACK_ARSENIC_INGOT.get(), "As");
        ELEMENT_SYMBOLS.put(ModItems.GRAY_ARSENIC_INGOT.get(), "As");
        ELEMENT_SYMBOLS.put(ModItems.YELLOW_ARSENIC_INGOT.get(), "As");
        ELEMENT_SYMBOLS.put(ModItems.SELENIUM_INGOT.get(), "Se");
        ELEMENT_SYMBOLS.put(ModItems.RUBIDIUM_INGOT.get(), "Rb");
        ELEMENT_SYMBOLS.put(ModItems.STRONTIUM_INGOT.get(), "Sr");
        ELEMENT_SYMBOLS.put(ModItems.YTTRIUM_INGOT.get(), "Y");
        ELEMENT_SYMBOLS.put(ModItems.ZIRCONIUM_INGOT.get(), "Zr");
        ELEMENT_SYMBOLS.put(ModItems.NIOBIUM_INGOT.get(), "Nb");
        ELEMENT_SYMBOLS.put(ModItems.MOLYBDENUM_INGOT.get(), "Mo");
        ELEMENT_SYMBOLS.put(ModItems.TECHNETIUM_INGOT.get(), "Tc");
        ELEMENT_SYMBOLS.put(ModItems.RUTHENIUM_INGOT.get(), "Ru");
        ELEMENT_SYMBOLS.put(ModItems.RHODIUM_INGOT.get(), "Rh");
        ELEMENT_SYMBOLS.put(ModItems.PALLADIUM_INGOT.get(), "Pd");
        ELEMENT_SYMBOLS.put(ModItems.SILVER_INGOT.get(), "Ag");
        ELEMENT_SYMBOLS.put(ModItems.CADMIUM_INGOT.get(), "Cd");
        ELEMENT_SYMBOLS.put(ModItems.INDIUM_INGOT.get(), "In");
        ELEMENT_SYMBOLS.put(ModItems.TIN_INGOT.get(), "Sn");
        ELEMENT_SYMBOLS.put(ModItems.ANTIMONY_INGOT.get(), "Sb");
        ELEMENT_SYMBOLS.put(ModItems.TELLURIUM_INGOT.get(), "Te");
        ELEMENT_SYMBOLS.put(ModItems.IODINE_INGOT.get(), "I");
        ELEMENT_SYMBOLS.put(ModItems.CESIUM_INGOT.get(), "Cs");
        ELEMENT_SYMBOLS.put(ModItems.BARIUM_INGOT.get(), "Ba");
        ELEMENT_SYMBOLS.put(Items.GOLD_INGOT, "Au");

        ELEMENT_SYMBOLS.put(Items.EMERALD, "Be₃Al₂(SiO₃)₆");

        // Glass
        ELEMENT_SYMBOLS.put(Items.GLASS, "Na₂O·CaO·6SiO₂");
        ELEMENT_SYMBOLS.put(Items.GRAY_STAINED_GLASS, "Na₂O·CaO·6SiO₂");
        ELEMENT_SYMBOLS.put(Items.BLACK_STAINED_GLASS, "Na₂O·CaO·6SiO₂");
    }

    private void setupMeltingPoints(FMLCommonSetupEvent event) {
        MELTING_POINTS.put(ModItems.LITHIUM_INGOT.get(), 180.5);
        MELTING_POINTS.put(ModItems.BERYLLIUM_INGOT.get(), 1278.0);
        MELTING_POINTS.put(ModItems.BORON_INGOT.get(), 2076.0);
        MELTING_POINTS.put(ModItems.SODIUM_INGOT.get(), 97.72);
        MELTING_POINTS.put(ModItems.MAGNESIUM_INGOT.get(), 648.8);
        MELTING_POINTS.put(ModItems.ALUMINIUM_INGOT.get(), 660.0);
        MELTING_POINTS.put(ModItems.SILICON_INGOT.get(), 1414.1);
        MELTING_POINTS.put(ModItems.RED_PHOSPHORUS_INGOT.get(), 590.0);
        MELTING_POINTS.put(ModItems.VIOLET_PHOSPHORUS_INGOT.get(), 590.0);
        MELTING_POINTS.put(ModItems.YELLOW_PHOSPHORUS_INGOT.get(), 44.1);
        MELTING_POINTS.put(ModItems.SULFUR_INGOT.get(), 112.8);
        MELTING_POINTS.put(ModItems.POTASSIUM_INGOT.get(), 63.25);
        MELTING_POINTS.put(ModItems.CALCIUM_INGOT.get(), 839.0);
        MELTING_POINTS.put(ModItems.SCANDIUM_INGOT.get(), 1541.0);
        MELTING_POINTS.put(ModItems.TITANIUM_INGOT.get(), 1668.0);
        MELTING_POINTS.put(ModItems.VANADIUM_INGOT.get(), 1917.0);
        MELTING_POINTS.put(ModItems.CHROMIUM_INGOT.get(), 1907.0);
        MELTING_POINTS.put(ModItems.MANGANESE_INGOT.get(), 1244.0);
        MELTING_POINTS.put(Items.IRON_INGOT, 1539.0);
        MELTING_POINTS.put(ModItems.COBALT_INGOT.get(), 1500.0);
        MELTING_POINTS.put(ModItems.NICKEL_INGOT.get(), 1453.0);
        MELTING_POINTS.put(Items.COPPER_INGOT, 1083.4);
        MELTING_POINTS.put(ModItems.ZINC_INGOT.get(), 419.53);
        MELTING_POINTS.put(ModItems.GALLIUM_INGOT.get(), 29.76);
        MELTING_POINTS.put(ModItems.GERMANIUM_INGOT.get(), 937.0);
        MELTING_POINTS.put(ModItems.BLACK_ARSENIC_INGOT.get(), 817.0);
        MELTING_POINTS.put(ModItems.GRAY_ARSENIC_INGOT.get(), 817.0);
        MELTING_POINTS.put(ModItems.YELLOW_ARSENIC_INGOT.get(), 817.0);
        MELTING_POINTS.put(ModItems.SELENIUM_INGOT.get(), 220.5);
        MELTING_POINTS.put(ModItems.RUBIDIUM_INGOT.get(), 38.89);
        MELTING_POINTS.put(ModItems.STRONTIUM_INGOT.get(), 769.0);
        MELTING_POINTS.put(ModItems.YTTRIUM_INGOT.get(), 1522.0);
        MELTING_POINTS.put(ModItems.ZIRCONIUM_INGOT.get(), 1852.0);
        MELTING_POINTS.put(ModItems.NIOBIUM_INGOT.get(), 2468.0);
        MELTING_POINTS.put(ModItems.MOLYBDENUM_INGOT.get(), 2622.0);
        MELTING_POINTS.put(ModItems.TECHNETIUM_INGOT.get(), 2172.0);
        MELTING_POINTS.put(ModItems.RUTHENIUM_INGOT.get(), 2334.0);
        MELTING_POINTS.put(ModItems.RHODIUM_INGOT.get(), 1966.0);
        MELTING_POINTS.put(ModItems.PALLADIUM_INGOT.get(), 1555.0);
        MELTING_POINTS.put(ModItems.SILVER_INGOT.get(), 961.93);
        MELTING_POINTS.put(ModItems.CADMIUM_INGOT.get(), 321.0);
        MELTING_POINTS.put(ModItems.INDIUM_INGOT.get(), 156.51);
        MELTING_POINTS.put(ModItems.TIN_INGOT.get(), 231.89);
        MELTING_POINTS.put(ModItems.ANTIMONY_INGOT.get(), 630.5);
        MELTING_POINTS.put(ModItems.TELLURIUM_INGOT.get(), 452.0);
        MELTING_POINTS.put(ModItems.IODINE_INGOT.get(), 113.0);
        MELTING_POINTS.put(ModItems.CESIUM_INGOT.get(), 28.5);
        MELTING_POINTS.put(ModItems.BARIUM_INGOT.get(), 725.0);
    }

    @SubscribeEvent
    public void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        Item item = stack.getItem();

        if (ELEMENT_SYMBOLS.containsKey(stack.getItem())) {
            String symbol = ELEMENT_SYMBOLS.get(item);

            if (symbol != null && !symbol.isEmpty()) {
                event.getToolTip().add(Component.literal(symbol)
                        .withStyle(ChatFormatting.GOLD, ChatFormatting.ITALIC));
            }
        }
        if (MELTING_POINTS.containsKey(stack.getItem())) {
            double meltingPoint = MELTING_POINTS.get(item);

            ChatFormatting color = ChatFormatting.YELLOW;
            if (meltingPoint > 2000) {
                color = ChatFormatting.RED;
            } else if (meltingPoint < 500 && meltingPoint > 0) {
                color = ChatFormatting.AQUA;
            } else if (meltingPoint <= 0) {
                color = ChatFormatting.DARK_BLUE;
            }

            Component meltingPointText = Component
                    .translatable("tooltip.chemium.melting_point")
                    .append(": " + meltingPoint + "°C")
                    .withStyle(color, ChatFormatting.ITALIC);

            event.getToolTip().add(meltingPointText);
        }
    }
}
