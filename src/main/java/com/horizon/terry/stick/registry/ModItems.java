package com.horizon.terry.stick.registry;

import com.horizon.terry.stick.Stick;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WAND = registerItem("wand",
            new Item(new Item.Settings()));
    public static final Item BROOM_STICK = registerItem("broom_stick",
            new Item(new Item.Settings()));
    public static Item registerItem(String name, Item item, ItemGroup... itemGroups) {
        //将物品注册
        Item registriedItem = Registry.register(Registries.ITEM, new Identifier(Stick.MOD_ID,name),item);
        //将物品加入物品栏
        /*for(ItemGroup itemGroup: itemGroups) {
            RegistryKey<ItemGroup> itemGroupKey = RegistryKey.of((RegistryKey<? extends Registry<ItemGroup>>) Registries.REGISTRIES, new Identifier(name));
            ItemGroupEvents.modifyEntriesEvent(itemGroupKey).register(entries -> entries.add(registriedItem));
        }*/

        return registriedItem;
    }

    public static void registerModItems() {
        Stick.LOGGER.debug("Registering mod items for" + Stick.MOD_ID);
    }
}
