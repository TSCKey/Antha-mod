package net.tsckey.dodo.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.tsckey.dodo.Antha;

import net.minecraft.registry.Registry;

public class ModItems {
    public static final Item Antha_Head = registerItem("antha_head", new Item(new Item.Settings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Antha.MOD_ID, name), item);
    }



    public static void registerModItems() {
        Antha.LOGGER.info("Registering Mod Items for " + Antha.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(Antha_Head);
        });
    }
}
