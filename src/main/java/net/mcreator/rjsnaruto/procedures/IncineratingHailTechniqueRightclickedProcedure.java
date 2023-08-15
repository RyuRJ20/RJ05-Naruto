package net.mcreator.rjsnaruto.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.rjsnaruto.init.RjsNarutoModEntities;
import net.mcreator.rjsnaruto.entity.FireballsummonEntity;

public class IncineratingHailTechniqueRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) (3); index0++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new FireballsummonEntity(RjsNarutoModEntities.FIREBALLSUMMON.get(), _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
