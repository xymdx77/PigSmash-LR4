package ru.college.pigsmash;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.Level;

public class KirkaKuvaldaItem extends Item {
    public KirkaKuvaldaItem() {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        // Проверка: если это НЕ наша кирка, ничего не делаем
        if (!stack.is(ModItems.KIRKA_KUVALDA)) {
            return InteractionResultHolder.pass(stack);
        }

        // Если это наша кирка, выводим сообщение
        if (!level.isClientSide) {
            player.sendSystemMessage(Component.literal("Ррррраааа! Кувалда в деле!"));
        }

        return InteractionResultHolder.success(stack);
    }
}