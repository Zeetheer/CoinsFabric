package net.zeetheer.coins;

import net.fabricmc.api.ModInitializer;

import net.zeetheer.coins.item.ModItemGroups;
import net.zeetheer.coins.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Coins implements ModInitializer {
	public static final String MOD_ID = "coins";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}