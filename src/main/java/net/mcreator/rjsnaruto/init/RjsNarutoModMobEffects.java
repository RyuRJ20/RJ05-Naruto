
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rjsnaruto.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.rjsnaruto.potion.FlyMobEffect;
import net.mcreator.rjsnaruto.RjsNarutoMod;

public class RjsNarutoModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, RjsNarutoMod.MODID);
	public static final RegistryObject<MobEffect> FLY = REGISTRY.register("fly", () -> new FlyMobEffect());
}
