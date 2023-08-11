
package net.mcreator.rjsnaruto.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.rjsnaruto.procedures.FlyEffectStartedappliedProcedure;

public class FlyMobEffect extends MobEffect {
	public FlyMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13312);
	}

	@Override
	public String getDescriptionId() {
		return "effect.rjs_naruto.fly";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		FlyEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FlyEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
