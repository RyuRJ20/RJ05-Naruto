
package net.mcreator.rjsnaruto.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.rjsnaruto.procedures.FlameResistanceTechniqueRightclickedOnBlockProcedure;
import net.mcreator.rjsnaruto.procedures.FlameResistanceTechniquePlayerFinishesUsingItemProcedure;
import net.mcreator.rjsnaruto.init.RjsNarutoModTabs;

public class FlameResistanceTechniqueItem extends Item {
	public FlameResistanceTechniqueItem() {
		super(new Item.Properties().tab(RjsNarutoModTabs.TAB_NARUTO_ABILITIES).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		FlameResistanceTechniqueRightclickedOnBlockProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		FlameResistanceTechniquePlayerFinishesUsingItemProcedure.execute(entity, itemstack);
		return retval;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		FlameResistanceTechniquePlayerFinishesUsingItemProcedure.execute(entity, itemstack);
	}
}
