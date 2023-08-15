
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rjsnaruto.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.rjsnaruto.client.renderer.TestFireDragonRenderer;
import net.mcreator.rjsnaruto.client.renderer.LightningballRenderer;
import net.mcreator.rjsnaruto.client.renderer.KibaRenderer;
import net.mcreator.rjsnaruto.client.renderer.Gunbai1Renderer;
import net.mcreator.rjsnaruto.client.renderer.GreatLightningballRenderer;
import net.mcreator.rjsnaruto.client.renderer.FireballsummonRenderer;
import net.mcreator.rjsnaruto.client.renderer.FireballRenderer;
import net.mcreator.rjsnaruto.client.renderer.FireDragonTestRenderer;
import net.mcreator.rjsnaruto.client.renderer.FirballTestRenderer;
import net.mcreator.rjsnaruto.client.renderer.CapybaraRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RjsNarutoModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RjsNarutoModEntities.NUIBARI.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RjsNarutoModEntities.CAPYBARA.get(), CapybaraRenderer::new);
		event.registerEntityRenderer(RjsNarutoModEntities.FIRBALL_TEST.get(), FirballTestRenderer::new);
		event.registerEntityRenderer(RjsNarutoModEntities.LIGHTNINGBALL.get(), LightningballRenderer::new);
		event.registerEntityRenderer(RjsNarutoModEntities.KIBA.get(), KibaRenderer::new);
		event.registerEntityRenderer(RjsNarutoModEntities.FIREBALL.get(), FireballRenderer::new);
		event.registerEntityRenderer(RjsNarutoModEntities.KUNAI.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RjsNarutoModEntities.CINDER_TECHNIQUE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RjsNarutoModEntities.TEST_FIRE_DRAGON.get(), TestFireDragonRenderer::new);
		event.registerEntityRenderer(RjsNarutoModEntities.FIRE_DRAGON_TEST.get(), FireDragonTestRenderer::new);
		event.registerEntityRenderer(RjsNarutoModEntities.FIREBALLSUMMON.get(), FireballsummonRenderer::new);
		event.registerEntityRenderer(RjsNarutoModEntities.GREAT_LIGHTNINGBALL.get(), GreatLightningballRenderer::new);
		event.registerEntityRenderer(RjsNarutoModEntities.GUNBAI_1.get(), Gunbai1Renderer::new);
	}
}
