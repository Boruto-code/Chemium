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
                            .title(Component.translatable("itemGroup.chemium"))
                            .withTabsBefore(CreativeModeTabs.COMBAT)
                            .icon(() -> STEEL_INGOT.get().getDefaultInstance())
                            .displayItems((parameters, output) -> {
                                output.accept(ALUMINIUM_INGOT.get());
                                output.accept(BERYLLIUM_INGOT.get());
                                output.accept(BLACK_PHOSPHORUS_INGOT.get());
                                output.accept(BORON_INGOT.get());
                                output.accept(LITHIUM_INGOT.get());
                                output.accept(MAGNESIUM_INGOT.get());
                                output.accept(RED_PHOSPHORUS_INGOT.get());
                                output.accept(SILICON_INGOT.get());
                                output.accept(SODIUM_INGOT.get());
                                output.accept(STEEL_INGOT.get());
                                output.accept(VIOLET_PHOSPHORUS_INGOT.get());
                                output.accept(YELLOW_PHOSPHORUS_INGOT.get());
                            }).build()
            );
}
