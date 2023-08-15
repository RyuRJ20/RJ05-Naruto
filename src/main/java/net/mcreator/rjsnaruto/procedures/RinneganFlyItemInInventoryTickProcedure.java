package net.mcreator.rjsnaruto.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.rjsnaruto.init.RjsNarutoModItems;

public class RinneganFlyItemInInventoryTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RjsNarutoModItems.RINNEGAN_FLY.get())) : false) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = (true);
				_player.onUpdateAbilities();
			}
		} else {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = (false);
				_player.onUpdateAbilities();
			}
			if (entity instanceof Player _player) {
				_player.getAbilities().flying = (false);
				_player.onUpdateAbilities();
			}
		}
	}
}
