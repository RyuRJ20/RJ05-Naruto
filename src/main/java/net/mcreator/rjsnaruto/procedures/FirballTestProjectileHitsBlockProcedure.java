package net.mcreator.rjsnaruto.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class FirballTestProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 7, Explosion.BlockInteraction.DESTROY);
		world.setBlock(new BlockPos(x + 1, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 2, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 3, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 2, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 3, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z + 1), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z + 2), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z + 3), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z - 1), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z - 2), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z - 3), Blocks.FIRE.defaultBlockState(), 3);
	}
}
