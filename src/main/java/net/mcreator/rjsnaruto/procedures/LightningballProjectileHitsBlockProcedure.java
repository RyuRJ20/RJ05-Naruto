package net.mcreator.rjsnaruto.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.rjsnaruto.init.RjsNarutoModParticleTypes;

public class LightningballProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
			entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
			entityToSpawn.setVisualOnly(false);
			_level.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (RjsNarutoModParticleTypes.LIGHTNING.get()), x, y, z, 5, 3, 3, 3, 1);
	}
}
