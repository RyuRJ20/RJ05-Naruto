
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rjsnaruto.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.rjsnaruto.block.ICePortalBlock;
import net.mcreator.rjsnaruto.RjsNarutoMod;

public class RjsNarutoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RjsNarutoMod.MODID);
	public static final RegistryObject<Block> I_CE_PORTAL = REGISTRY.register("i_ce_portal", () -> new ICePortalBlock());
}
