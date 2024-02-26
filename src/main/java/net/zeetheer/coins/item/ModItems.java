package net.zeetheer.coins.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zeetheer.coins.Coins;

public class ModItems {
    public static final Item STONE_COIN = regeisterItem("stone_coin", new Item(new FabricItemSettings()));
    public static final Item DEEPSLATE_COIN = regeisterItem("deepslate_coin", new Item(new FabricItemSettings()));
    public static final Item NETHERRACK_COIN = regeisterItem("netherrack_coin", new Item(new FabricItemSettings()));
    public static final Item IRON_COIN = regeisterItem("iron_coin", new Item(new FabricItemSettings()));
    public static final Item COAL_COIN = regeisterItem("coal_coin", new Item(new FabricItemSettings()));
    public static final Item COPPER_COIN = regeisterItem("copper_coin", new Item(new FabricItemSettings()));
    public static final Item LAPIS_LAZULI_COIN = regeisterItem("lapis_lazuli_coin", new Item(new FabricItemSettings()));
    public static final Item REDSTONE_COIN = regeisterItem("redstone_coin", new Item(new FabricItemSettings()));
    public static final Item GOLD_COIN = regeisterItem("gold_coin", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_COIN = regeisterItem("diamond_coin", new Item(new FabricItemSettings()));
    public static final Item EMERALD_COIN = regeisterItem("emerald_coin", new Item(new FabricItemSettings()));
    public static final Item NETHER_QUARTZ_COIN = regeisterItem("nether_quartz_coin", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_COIN = regeisterItem("netherite_coin", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(STONE_COIN);
        entries.add(DEEPSLATE_COIN);
        entries.add(NETHERRACK_COIN);
        entries.add(IRON_COIN);
        entries.add(COAL_COIN);
        entries.add(COPPER_COIN);
        entries.add(LAPIS_LAZULI_COIN);
        entries.add(REDSTONE_COIN);
        entries.add(GOLD_COIN);
        entries.add(DIAMOND_COIN);
        entries.add(EMERALD_COIN);
        entries.add(NETHER_QUARTZ_COIN);
        entries.add(NETHERITE_COIN);
    }

    public static Item regeisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Coins.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Coins.LOGGER.info("Registering Mod Items for " + Coins.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
