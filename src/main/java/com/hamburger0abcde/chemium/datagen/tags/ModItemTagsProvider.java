package com.hamburger0abcde.chemium.datagen.tags;

import com.hamburger0abcde.chemium.Chemium;
import com.hamburger0abcde.chemium.common.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(
            PackOutput output,
            CompletableFuture<HolderLookup.Provider> lookupProvider,
            CompletableFuture<TagLookup<Block>> blockTags,
            ExistingFileHelper existingFileHelper
    ) {
        super(output, lookupProvider, blockTags, Chemium.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModItemTags.ALUMINIUM_TAG).add(ModItems.ALUMINIUM_INGOT.get());
        tag(ModItemTags.BERYLLIUM_TAG).add(ModItems.BERYLLIUM_INGOT.get());
        tag(ModItemTags.BLACK_ARSENIC_TAG).add(ModItems.BLACK_ARSENIC_INGOT.get());
        tag(ModItemTags.BLACK_PHOSPHORUS_TAG).add(ModItems.BLACK_PHOSPHORUS_INGOT.get());
        tag(ModItemTags.BORON_TAG).add(ModItems.BORON_INGOT.get());
        tag(ModItemTags.CADMIUM_TAG).add(ModItems.CADMIUM_INGOT.get());
        tag(ModItemTags.CALCIUM_TAG).add(ModItems.CALCIUM_INGOT.get());
        tag(ModItemTags.CESIUM_TAG).add(ModItems.CESIUM_INGOT.get());
        tag(ModItemTags.CHROMIUM_TAG).add(ModItems.CHROMIUM_INGOT.get());
        tag(ModItemTags.COBALT_TAG).add(ModItems.COBALT_INGOT.get());
        tag(ModItemTags.GALLIUM_TAG).add(ModItems.GALLIUM_INGOT.get());
        tag(ModItemTags.GERMANIUM_TAG).add(ModItems.GERMANIUM_INGOT.get());
        tag(ModItemTags.GRAY_ARSENIC_TAG).add(ModItems.GRAY_ARSENIC_INGOT.get());
        tag(ModItemTags.INDIUM_TAG).add(ModItems.INDIUM_INGOT.get());
        tag(ModItemTags.IODINE_TAG).add(ModItems.IODINE_INGOT.get());
        tag(ModItemTags.LITHIUM_TAG).add(ModItems.LITHIUM_INGOT.get());
        tag(ModItemTags.MAGNESIUM_TAG).add(ModItems.MAGNESIUM_INGOT.get());
        tag(ModItemTags.MANGANESE_TAG).add(ModItems.MANGANESE_INGOT.get());
        tag(ModItemTags.MOLYBDENUM_TAG).add(ModItems.MOLYBDENUM_INGOT.get());
        tag(ModItemTags.NICKEL_TAG).add(ModItems.NICKEL_INGOT.get());
        tag(ModItemTags.NIOBIUM_TAG).add(ModItems.NIOBIUM_INGOT.get());
        tag(ModItemTags.PALLADIUM_TAG).add(ModItems.PALLADIUM_INGOT.get());
        tag(ModItemTags.POTASSIUM_TAG).add(ModItems.POTASSIUM_INGOT.get());
        tag(ModItemTags.RED_PHOSPHORUS_TAG).add(ModItems.RED_PHOSPHORUS_INGOT.get());
        tag(ModItemTags.RHODIUM_TAG).add(ModItems.RHODIUM_INGOT.get());
        tag(ModItemTags.RUBIDIUM_TAG).add(ModItems.RUBIDIUM_INGOT.get());
        tag(ModItemTags.RUTHENIUM_TAG).add(ModItems.RUTHENIUM_INGOT.get());
        tag(ModItemTags.SCANDIUM_TAG).add(ModItems.SCANDIUM_INGOT.get());
        tag(ModItemTags.SELENIUM_TAG).add(ModItems.SELENIUM_INGOT.get());
        tag(ModItemTags.SILICON_TAG).add(ModItems.SILICON_INGOT.get());
        tag(ModItemTags.SILVER_TAG).add(ModItems.SILVER_INGOT.get());
        tag(ModItemTags.SODIUM_TAG).add(ModItems.SODIUM_INGOT.get());
        tag(ModItemTags.STEEL_TAG).add(ModItems.STEEL_INGOT.get());
        tag(ModItemTags.STRONTIUM_TAG).add(ModItems.STRONTIUM_INGOT.get());
        tag(ModItemTags.SULFUR_TAG).add(ModItems.SULFUR_INGOT.get());
        tag(ModItemTags.TECHNETIUM_TAG).add(ModItems.TECHNETIUM_INGOT.get());
        tag(ModItemTags.TELLURIUM_TAG).add(ModItems.TELLURIUM_INGOT.get());
        tag(ModItemTags.TIN_TAG).add(ModItems.TIN_INGOT.get());
        tag(ModItemTags.TITANIUM_TAG).add(ModItems.TITANIUM_INGOT.get());
        tag(ModItemTags.VANADIUM_TAG).add(ModItems.VANADIUM_INGOT.get());
        tag(ModItemTags.VIOLET_PHOSPHORUS_TAG).add(ModItems.VIOLET_PHOSPHORUS_INGOT.get());
        tag(ModItemTags.YELLOW_ARSENIC_TAG).add(ModItems.YELLOW_ARSENIC_INGOT.get());
        tag(ModItemTags.YELLOW_PHOSPHORUS_TAG).add(ModItems.YELLOW_PHOSPHORUS_INGOT.get());
        tag(ModItemTags.YTTRIUM_TAG).add(ModItems.YTTRIUM_INGOT.get());
        tag(ModItemTags.ZINC_TAG).add(ModItems.ZINC_INGOT.get());
        tag(ModItemTags.ZIRCONIUM_TAG).add(ModItems.ZIRCONIUM_INGOT.get());
    }
}
