package net.mcreator.rjsnaruto.procedures;

import net.minecraft.world.entity.Entity;

public class FireballsummonPlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
	}
}
