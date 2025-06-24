package com.hamburger0abcde.chemium.common.item;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.hamburger0abcde.chemium.Chemium.MODID;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(MODID);

    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register(
            "steel_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> LITHIUM_INGOT = ITEMS.register(
            "lithium_ingot",
            () -> new IngotItem(new Item.Properties())
    );
    public static final DeferredItem<Item> BERYLLIUM_INGOT = ITEMS.register(
            "beryllium_ingot",
            () -> new IngotItem(new Item.Properties())
    );
}
