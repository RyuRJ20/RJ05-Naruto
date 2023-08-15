
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rjsnaruto.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.rjsnaruto.client.model.fireballsmall;
import net.mcreator.rjsnaruto.client.model.Modelfireball;
import net.mcreator.rjsnaruto.client.model.Modeldragontest_Converted;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RjsNarutoModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldragontest_Converted.LAYER_LOCATION, Modeldragontest_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelfireball.LAYER_LOCATION, Modelfireball::createBodyLayer);
		event.registerLayerDefinition(fireballsmall.LAYER_LOCATION, fireballsmall::createBodyLayer);
	}
}
