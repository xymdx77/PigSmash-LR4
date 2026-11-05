package ru.college.pigsmash;

import net.fabricmc.api.ModInitializer;
import net.minecraft.world.item.CreativeModeTabs;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class PigSmash implements ModInitializer {
	@Override
	public void onInitialize() {
		// 1. Инициализируем предметы
		ModItems.initialize();

		// 2. Добавляем предмет в творческую вкладку (строго в главном классе!)
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(entries -> {
			entries.accept(ModItems.KIRKA_KUVALDA);
		});
	}
}