package net.mcreator.rjsnaruto.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.rjsnaruto.init.RjsNarutoModParticleTypes;

public class LightningballWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (RjsNarutoModParticleTypes.LIGHTNING.get()), x, y, z, 30, 3, 3, 3, 1);
	}
}
