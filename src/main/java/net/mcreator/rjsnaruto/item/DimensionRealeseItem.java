
package net.mcreator.rjsnaruto.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.rjsnaruto.procedures.DimensionRealeseRightclickedProcedure;
import net.mcreator.rjsnaruto.procedures.DimensionRealeseEntitySwingsItemProcedure;
import net.mcreator.rjsnaruto.init.RjsNarutoModTabs;

public class DimensionRealeseItem extends Item {
	public DimensionRealeseItem() {
		super(new Item.Properties().tab(RjsNarutoModTabs.TAB_NARUTO_ABILITIES).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 30;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		DimensionRealeseRightclickedProcedure.execute(entity);
		return ar;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		DimensionRealeseEntitySwingsItemProcedure.execute(entity);
		return retval;
	}
}
