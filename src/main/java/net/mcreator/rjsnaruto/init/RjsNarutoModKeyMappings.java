
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rjsnaruto.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.rjsnaruto.network.NarutoGUIMessage;
import net.mcreator.rjsnaruto.RjsNarutoMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RjsNarutoModKeyMappings {
	public static final KeyMapping NARUTO_GUI = new KeyMapping("key.rjs_naruto.naruto_gui", GLFW.GLFW_KEY_C, "key.categories.ui");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(NARUTO_GUI);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == NARUTO_GUI.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						RjsNarutoMod.PACKET_HANDLER.sendToServer(new NarutoGUIMessage(0, 0));
						NarutoGUIMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
