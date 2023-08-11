
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rjsnaruto.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.rjsnaruto.RjsNarutoMod;

public class RjsNarutoModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, RjsNarutoMod.MODID);
	public static final RegistryObject<ParticleType<?>> LIGHTNING = REGISTRY.register("lightning", () -> new SimpleParticleType(false));
}
