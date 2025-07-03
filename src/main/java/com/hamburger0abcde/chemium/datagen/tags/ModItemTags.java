package com.hamburger0abcde.chemium.datagen.tags;


import com.hamburger0abcde.chemium.Chemium;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    // Ingots Tag
    public static final TagKey<Item> ALUMINIUM_TAG = create("ingots/aluminium");
    public static final TagKey<Item> BERYLLIUM_TAG = create("ingots/beryllium");
    public static final TagKey<Item> BLACK_ARSENIC_TAG = create("ingots/arsenic/black");
    public static final TagKey<Item> BLACK_PHOSPHORUS_TAG = create("ingots/phosphorus/black");
    public static final TagKey<Item> BORON_TAG = create("ingots/boron");
    public static final TagKey<Item> CADMIUM_TAG = create("ingots/cadmium");
    public static final TagKey<Item> CALCIUM_TAG = create("ingots/calcium");
    public static final TagKey<Item> CESIUM_TAG = create("ingots/cesium");
    public static final TagKey<Item> CHROMIUM_TAG = create("ingots/chromium");
    public static final TagKey<Item> COBALT_TAG = create("ingots/cobalt");
    public static final TagKey<Item> GALLIUM_TAG = create("ingots/gallium");
    public static final TagKey<Item> GERMANIUM_TAG = create("ingots/germanium");
    public static final TagKey<Item> GRAY_ARSENIC_TAG = create("ingots/arsenic/gray");
    public static final TagKey<Item> INDIUM_TAG = create("ingots/indium");
    public static final TagKey<Item> IODINE_TAG = create("ingots/iodine");
    public static final TagKey<Item> LITHIUM_TAG = create("ingots/lithium");
    public static final TagKey<Item> MAGNESIUM_TAG = create("ingots/magnesium");
    public static final TagKey<Item> MANGANESE_TAG = create("ingots/manganese");
    public static final TagKey<Item> MOLYBDENUM_TAG = create("ingots/molybdenum");
    public static final TagKey<Item> NICKEL_TAG = create("ingots/nickel");
    public static final TagKey<Item> NIOBIUM_TAG = create("ingots/niobium");
    public static final TagKey<Item> PALLADIUM_TAG = create("ingots/palladium");
    public static final TagKey<Item> POTASSIUM_TAG = create("ingots/potassium");
    public static final TagKey<Item> RED_PHOSPHORUS_TAG = create("ingots/phosphorus/red");
    public static final TagKey<Item> RHODIUM_TAG = create("ingots/rhodium");
    public static final TagKey<Item> RUBIDIUM_TAG = create("ingots/rubidium");
    public static final TagKey<Item> RUTHENIUM_TAG = create("ingots/ruthenium");
    public static final TagKey<Item> SCANDIUM_TAG = create("ingots/scandium");
    public static final TagKey<Item> SELENIUM_TAG = create("ingots/selenium");
    public static final TagKey<Item> SILICON_TAG = create("ingots/silicon");
    public static final TagKey<Item> SILVER_TAG = create("ingots/silver");
    public static final TagKey<Item> SODIUM_TAG = create("ingots/sodium");
    public static final TagKey<Item> STEEL_TAG = create("ingots/steel");
    public static final TagKey<Item> STRONTIUM_TAG = create("ingots/strontium");
    public static final TagKey<Item> SULFUR_TAG = create("ingots/sulfur");
    public static final TagKey<Item> TECHNETIUM_TAG = create("ingots/technetium");
    public static final TagKey<Item> TELLURIUM_TAG = create("ingots/tellurium");
    public static final TagKey<Item> TIN_TAG = create("ingots/tin");
    public static final TagKey<Item> TITANIUM_TAG = create("ingots/titanium");
    public static final TagKey<Item> VANADIUM_TAG = create("ingots/vanadium");
    public static final TagKey<Item> VIOLET_PHOSPHORUS_TAG = create("ingots/phosphorus/violet");
    public static final TagKey<Item> YELLOW_ARSENIC_TAG = create("ingots/arsenic/yellow");
    public static final TagKey<Item> YELLOW_PHOSPHORUS_TAG = create("ingots/phosphorus/yellow");
    public static final TagKey<Item> YTTRIUM_TAG = create("ingots/yttrium");
    public static final TagKey<Item> ZINC_TAG = create("ingots/zinc");
    public static final TagKey<Item> ZIRCONIUM_TAG = create("ingots/zirconium");

    private static TagKey<Item> create(String path) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(Chemium.MODID, path);

        return ItemTags.create(location);
    }
}
