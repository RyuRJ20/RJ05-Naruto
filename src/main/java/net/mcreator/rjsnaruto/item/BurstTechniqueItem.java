
package net.mcreator.rjsnaruto.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.rjsnaruto.procedures.BurstTechniqueOnPlayerStoppedUsingProcedure;
import net.mcreator.rjsnaruto.procedures.BurstTechniqueLivingEntityIsHitWithItemProcedure;
import net.mcreator.rjsnaruto.init.RjsNarutoModTabs;

public class BurstTechniqueItem extends Item {
	public BurstTechniqueItem() {
		super(new Item.Properties().tab(RjsNarutoModTabs.TAB_NARUTO_ABILITIES).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		BurstTechniqueOnPlayerStoppedUsingProcedure.execute(entity, itemstack);
		return retval;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		BurstTechniqueLivingEntityIsHitWithItemProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
		return retval;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		BurstTechniqueOnPlayerStoppedUsingProcedure.execute(entity, itemstack);
		return retval;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		BurstTechniqueOnPlayerStoppedUsingProcedure.execute(entity, itemstack);
	}
}
