package com.horizon.terry.stick.registry;

import com.horizon.terry.stick.Stick;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    private static final ItemGroup STICK = FabricItemGroup.builder()
            .displayName(Text.translatable("itemgroup.stick.wand"))
            .icon(() -> new ItemStack(ModItems.WAND))
            .build();

    public static ItemGroup registerItemGroup() {
        ItemGroup registriedItemGroup = Registry.register(Registries.ITEM_GROUP, new Identifier(Stick.MOD_ID,"Stick"),STICK);

        return registriedItemGroup;
    }

    public static void registerModItemGroup() {
        Stick.LOGGER.debug("Registering mod item group for" + Stick.MOD_ID);
    }
}
