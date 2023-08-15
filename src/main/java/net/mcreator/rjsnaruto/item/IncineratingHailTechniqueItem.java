
package net.mcreator.rjsnaruto.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.rjsnaruto.procedures.IncineratingHailTechniqueRightclickedProcedure;
import net.mcreator.rjsnaruto.procedures.IncineratingHailTechniqueLivingEntityIsHitWithItemProcedure;
import net.mcreator.rjsnaruto.init.RjsNarutoModTabs;

public class IncineratingHailTechniqueItem extends Item {
	public IncineratingHailTechniqueItem() {
		super(new Item.Properties().tab(RjsNarutoModTabs.TAB_NARUTO_ABILITIES).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		IncineratingHailTechniqueRightclickedProcedure.execute(world, x, y, z);
		return ar;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		IncineratingHailTechniqueLivingEntityIsHitWithItemProcedure.execute(entity, sourceentity);
		return retval;
	}
}
