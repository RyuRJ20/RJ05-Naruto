
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rjsnaruto.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.rjsnaruto.block.UchihaYellowBlock;
import net.mcreator.rjsnaruto.block.UchihaWhiteBlock;
import net.mcreator.rjsnaruto.block.UchihaRedBlock;
import net.mcreator.rjsnaruto.block.UchihaPurpleBlock;
import net.mcreator.rjsnaruto.block.UchihaPinkBlock;
import net.mcreator.rjsnaruto.block.UchihaOrangeBlock;
import net.mcreator.rjsnaruto.block.UchihaMagentaBlock;
import net.mcreator.rjsnaruto.block.UchihaLimeBlock;
import net.mcreator.rjsnaruto.block.UchihaLightgrayBlock;
import net.mcreator.rjsnaruto.block.UchihaLightblueBlock;
import net.mcreator.rjsnaruto.block.UchihaGreenBlock;
import net.mcreator.rjsnaruto.block.UchihaGrayBlock;
import net.mcreator.rjsnaruto.block.UchihaCyanBlock;
import net.mcreator.rjsnaruto.block.UchihaBrownBlock;
import net.mcreator.rjsnaruto.block.UchihaBlueBlock;
import net.mcreator.rjsnaruto.block.UchihaBlackBlock;
import net.mcreator.rjsnaruto.block.ICePortalBlock;
import net.mcreator.rjsnaruto.RjsNarutoMod;

public class RjsNarutoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RjsNarutoMod.MODID);
	public static final RegistryObject<Block> I_CE_PORTAL = REGISTRY.register("i_ce_portal", () -> new ICePortalBlock());
	public static final RegistryObject<Block> UCHIHA_BLACK = REGISTRY.register("uchiha_black", () -> new UchihaBlackBlock());
	public static final RegistryObject<Block> UCHIHA_BLUE = REGISTRY.register("uchiha_blue", () -> new UchihaBlueBlock());
	public static final RegistryObject<Block> UCHIHA_BROWN = REGISTRY.register("uchiha_brown", () -> new UchihaBrownBlock());
	public static final RegistryObject<Block> UCHIHA_CYAN = REGISTRY.register("uchiha_cyan", () -> new UchihaCyanBlock());
	public static final RegistryObject<Block> UCHIHA_GRAY = REGISTRY.register("uchiha_gray", () -> new UchihaGrayBlock());
	public static final RegistryObject<Block> UCHIHA_GREEN = REGISTRY.register("uchiha_green", () -> new UchihaGreenBlock());
	public static final RegistryObject<Block> UCHIHA_LIGHTBLUE = REGISTRY.register("uchiha_lightblue", () -> new UchihaLightblueBlock());
	public static final RegistryObject<Block> UCHIHA_LIGHTGRAY = REGISTRY.register("uchiha_lightgray", () -> new UchihaLightgrayBlock());
	public static final RegistryObject<Block> UCHIHA_LIME = REGISTRY.register("uchiha_lime", () -> new UchihaLimeBlock());
	public static final RegistryObject<Block> UCHIHA_MAGENTA = REGISTRY.register("uchiha_magenta", () -> new UchihaMagentaBlock());
	public static final RegistryObject<Block> UCHIHA_ORANGE = REGISTRY.register("uchiha_orange", () -> new UchihaOrangeBlock());
	public static final RegistryObject<Block> UCHIHA_PINK = REGISTRY.register("uchiha_pink", () -> new UchihaPinkBlock());
	public static final RegistryObject<Block> UCHIHA_PURPLE = REGISTRY.register("uchiha_purple", () -> new UchihaPurpleBlock());
	public static final RegistryObject<Block> UCHIHA_RED = REGISTRY.register("uchiha_red", () -> new UchihaRedBlock());
	public static final RegistryObject<Block> UCHIHA_WHITE = REGISTRY.register("uchiha_white", () -> new UchihaWhiteBlock());
	public static final RegistryObject<Block> UCHIHA_YELLOW = REGISTRY.register("uchiha_yellow", () -> new UchihaYellowBlock());
}
