package ru.college.pigsmash;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;

public class ModItems {
    public static final Item KIRKA_KUVALDA = new PickaxeItem(Tiers.IRON, new Item.Properties().stacksTo(1));

    public static void initialize() {
        Registry.register(
                BuiltInRegistries.ITEM,
                ResourceLocation.fromNamespaceAndPath("pigsmash", "kirka_kuvalda"),
                KIRKA_KUVALDA
        );
    }
}