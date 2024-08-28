package net.nerovaii.test.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nerovaii.test.Nerovaiitest;

public class Moditems {

    public static final Item JOINT = registerItem("joint", new Item(new FabricItemSettings()));
    public static final Item HIGH_MUSHROOM = registerItem("high_mushroom", new Item(new FabricItemSettings()));

    private static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries) {
        entries.add(JOINT);
        entries.add(HIGH_MUSHROOM);
    }

    public static final Item WEED = registerItem("weed", new Item(new FabricItemSettings()));
    public static final Item NORTHERN_KRIPPY = registerItem("northern_krippy", new Item(new FabricItemSettings()));

    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {
        entries.add(WEED);
        entries.add(NORTHERN_KRIPPY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Nerovaiitest.MOD_ID, name ), item);
    }

    public static void registerModitems() {
        Nerovaiitest.LOGGER.info("Registering Moditems for" + Nerovaiitest.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(Moditems::addItemsToNaturalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(Moditems::addItemsToFoodAndDrinkItemGroup);
    }
}
