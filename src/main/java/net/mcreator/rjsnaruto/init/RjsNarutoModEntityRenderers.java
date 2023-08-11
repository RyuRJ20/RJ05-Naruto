
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rjsnaruto.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.rjsnaruto.client.renderer.FirballTestRenderer;
import net.mcreator.rjsnaruto.client.renderer.CapybaraRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RjsNarutoModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RjsNarutoModEntities.NUIBARI.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RjsNarutoModEntities.CAPYBARA.get(), CapybaraRenderer::new);
		event.registerEntityRenderer(RjsNarutoModEntities.FIRBALL_TEST.get(), FirballTestRenderer::new);
	}
}
