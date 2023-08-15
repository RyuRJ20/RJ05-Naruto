
package net.mcreator.rjsnaruto.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.rjsnaruto.procedures.ElementSkinFireRightclickedProcedure;
import net.mcreator.rjsnaruto.procedures.ElementSkinFireOnPlayerStoppedUsingProcedure;
import net.mcreator.rjsnaruto.init.RjsNarutoModTabs;

public class ElementSkinFireItem extends Item {
	public ElementSkinFireItem() {
		super(new Item.Properties().tab(RjsNarutoModTabs.TAB_NARUTO_ABILITIES).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ElementSkinFireRightclickedProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ElementSkinFireOnPlayerStoppedUsingProcedure.execute(entity, itemstack);
		return retval;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		ElementSkinFireOnPlayerStoppedUsingProcedure.execute(entity, itemstack);
	}
}
