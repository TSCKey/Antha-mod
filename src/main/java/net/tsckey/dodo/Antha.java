package net.tsckey.dodo;

import net.fabricmc.api.ModInitializer;


import net.tsckey.dodo.entity.ModEntities;
import net.tsckey.dodo.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Antha implements ModInitializer {
	public static final String MOD_ID = "antha";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModEntities.registerModEntities();
	}
}