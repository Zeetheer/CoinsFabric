package net.zeetheer.coins.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zeetheer.coins.Coins;

public class ModItemGroups {
    public static final ItemGroup COIN_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Coins.MOD_ID, "coin"), FabricItemGroup.builder().displayName(Text.translatable("itemGroup.coin")).icon(() -> new ItemStack(ModItems.IRON_COIN)).entries((displayContext, entries) -> {
        entries.add(ModItems.STONE_COIN);
        entries.add(ModItems.DEEPSLATE_COIN);
        entries.add(ModItems.NETHERRACK_COIN);
        entries.add(ModItems.IRON_COIN);
        entries.add(ModItems.COAL_COIN);
        entries.add(ModItems.COPPER_COIN);
        entries.add(ModItems.LAPIS_LAZULI_COIN);
        entries.add(ModItems.REDSTONE_COIN);
        entries.add(ModItems.GOLD_COIN);
        entries.add(ModItems.DIAMOND_COIN);
        entries.add(ModItems.EMERALD_COIN);
        entries.add(ModItems.NETHER_QUARTZ_COIN);
        entries.add(ModItems.NETHERITE_COIN);
    }).build());


    public static void registerItemGroups() {
        Coins.LOGGER.info("Registering Item Groups for " + Coins.MOD_ID);
    }
}
