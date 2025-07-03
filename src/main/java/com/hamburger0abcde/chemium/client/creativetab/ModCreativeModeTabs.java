package com.hamburger0abcde.chemium.client.creativetab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.hamburger0abcde.chemium.Chemium.MODID;
import static com.hamburger0abcde.chemium.common.item.ModItems.*;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEMENT_TAB =
            CREATIVE_MODE_TABS.register(
                    "element_tab", () -> CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup.chemium.element"))
                            .withTabsBefore(CreativeModeTabs.COMBAT)
                            .icon(() -> STEEL_INGOT.get().getDefaultInstance())
                            .displayItems((parameters, output) -> {
                                output.accept(ALUMINIUM_INGOT.get());
                                output.accept(ANTIMONY_INGOT.get());
                                output.accept(BARIUM_INGOT.get());
                                output.accept(BERYLLIUM_INGOT.get());
                                output.accept(BLACK_ARSENIC_INGOT.get());
                                output.accept(BLACK_PHOSPHORUS_INGOT.get());
                                output.accept(BORON_INGOT.get());
                                output.accept(CADMIUM_INGOT.get());
                                output.accept(CALCIUM_INGOT.get());
                                output.accept(CESIUM_INGOT.get());
                                output.accept(CHROMIUM_INGOT.get());
                                output.accept(COBALT_INGOT.get());
                                output.accept(GALLIUM_INGOT.get());
                                output.accept(GERMANIUM_INGOT.get());
                                output.accept(GRAY_ARSENIC_INGOT.get());
                                output.accept(INDIUM_INGOT.get());
                                output.accept(IODINE_INGOT.get());
                                output.accept(LITHIUM_INGOT.get());
                                output.accept(MAGNESIUM_INGOT.get());
                                output.accept(MANGANESE_INGOT.get());
                                output.accept(MOLYBDENUM_INGOT.get());
                                output.accept(NICKEL_INGOT.get());
                                output.accept(NIOBIUM_INGOT.get());
                                output.accept(PALLADIUM_INGOT.get());
                                output.accept(POTASSIUM_INGOT.get());
                                output.accept(RED_PHOSPHORUS_INGOT.get());
                                output.accept(RHODIUM_INGOT.get());
                                output.accept(RUBIDIUM_INGOT.get());
                                output.accept(RUTHENIUM_INGOT.get());
                                output.accept(SCANDIUM_INGOT.get());
                                output.accept(SELENIUM_INGOT.get());
                                output.accept(SILICON_INGOT.get());
                                output.accept(SILVER_INGOT.get());
                                output.accept(SODIUM_INGOT.get());
                                output.accept(STEEL_INGOT.get());
                                output.accept(STRONTIUM_INGOT.get());
                                output.accept(SULFUR_INGOT.get());
                                output.accept(TECHNETIUM_INGOT.get());
                                output.accept(TELLURIUM_INGOT.get());
                                output.accept(TIN_INGOT.get());
                                output.accept(TITANIUM_INGOT.get());
                                output.accept(VANADIUM_INGOT.get());
                                output.accept(VIOLET_PHOSPHORUS_INGOT.get());
                                output.accept(YELLOW_ARSENIC_INGOT.get());
                                output.accept(YELLOW_PHOSPHORUS_INGOT.get());
                                output.accept(YTTRIUM_INGOT.get());
                                output.accept(ZINC_INGOT.get());
                                output.accept(ZIRCONIUM_INGOT.get());
                            }).build()
            );
}
