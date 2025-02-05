package net.tsckey.dodo;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.tsckey.dodo.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Antha implements ModInitializer {
	public static final String MOD_ID = "antha";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}