package ru.college.pigsmash;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ModItems {
    // Используем наш новый класс KirkaKuvaldaItem
    public static final Item KIRKA_KUVALDA = new KirkaKuvaldaItem();

    public static void initialize() {
        // 1. Регистрируем предмет
        Registry.register(
                BuiltInRegistries.ITEM,
                ResourceLocation.fromNamespaceAndPath("pigsmash", "kirka_kuvalda"),
                KIRKA_KUVALDA
        );

        // 2. Добавляем в творческую вкладку
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(entries -> {
            entries.accept(KIRKA_KUVALDA);
        });
    }
}