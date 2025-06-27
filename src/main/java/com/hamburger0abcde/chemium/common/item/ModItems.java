package com.hamburger0abcde.chemium.common.item;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.hamburger0abcde.chemium.Chemium.MODID;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(MODID);

    public static final DeferredItem<Item> ALUMINIUM_INGOT = ITEMS.register(
            "aluminium_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> BERYLLIUM_INGOT = ITEMS.register(
            "beryllium_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> BLACK_PHOSPHORUS_INGOT = ITEMS.register(
            "black_phosphorus_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> BORON_INGOT = ITEMS.register(
            "boron_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> CALCIUM_INGOT = ITEMS.register(
            "calcium_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> CHROMIUM_INGOT = ITEMS.register(
            "chromium_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> COBALT_INGOT = ITEMS.register(
            "cobalt_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> GALLIUM_INGOT = ITEMS.register(
            "gallium_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> GERMANIUM_INGOT = ITEMS.register(
            "germanium_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> LITHIUM_INGOT = ITEMS.register(
            "lithium_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> MAGNESIUM_INGOT = ITEMS.register(
            "magnesium_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> MANGANESE_INGOT = ITEMS.register(
            "manganese_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> NICKEL_INGOT = ITEMS.register(
            "nickel_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> POTASSIUM_INGOT = ITEMS.register(
            "potassium_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> RED_PHOSPHORUS_INGOT = ITEMS.register(
            "red_phosphorus_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> SCANDIUM_INGOT = ITEMS.register(
            "scandium_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> SILICON_INGOT = ITEMS.register(
            "silicon_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> SODIUM_INGOT = ITEMS.register(
            "sodium_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register(
            "steel_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> SULFUR_INGOT = ITEMS.register(
            "sulfur_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> TITANIUM_INGOT = ITEMS.register(
            "titanium_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> VANADIUM_INGOT = ITEMS.register(
            "vanadium_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> VIOLET_PHOSPHORUS_INGOT = ITEMS.register(
            "violet_phosphorus_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> YELLOW_PHOSPHORUS_INGOT = ITEMS.register(
            "yellow_phosphorus_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> ZINC_INGOT = ITEMS.register(
            "zinc_ingot",
            () -> new IngotItem(new Item.Properties())
    );
}
