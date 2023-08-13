
package net.mcreator.rjsnaruto.client.gui;

import net.mcreator.rjsnaruto.network.RjsNarutoModVariables;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.util.FormattedCharSink;
import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

import java.awt.*;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ChakraOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Pre event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
			int w = event.getWindow().getGuiScaledWidth();
			int h = event.getWindow().getGuiScaledHeight();
			int posX = w;
			int posY = h;
			Level world = null;
			double x = 0;
			double y = 0;
			double z = 0;
			Player entity = Minecraft.getInstance().player;
			double chakra = (entity.getCapability(RjsNarutoModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RjsNarutoModVariables.PlayerVariables())).chakra;
			double maxchakra = (entity.getCapability(RjsNarutoModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RjsNarutoModVariables.PlayerVariables())).maxchakra;


			if (entity != null) {
				world = entity.level;
				x = entity.getX();
				y = entity.getY();
				z = entity.getZ();
			}

			
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.enableBlend();
			RenderSystem.setShader(GameRenderer::getPositionTexShader);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.setShaderColor(1, 1, 1, 1);

			int barv = (int)(149-(chakra/maxchakra)*149d);

			Minecraft.getInstance().font.drawShadow(event.getMatrixStack(), new TextComponent(chakra+"/"+maxchakra), posX - 90, 15, 16777215);

			RenderSystem.setShaderTexture(0, new ResourceLocation("rjs_naruto:textures/screens/chakrabar.png"));
			Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX - 180 + barv + 3,  25, 0, 0, 147-barv, 6, 147-barv, 6);


			RenderSystem.setShaderTexture(0, new ResourceLocation("rjs_naruto:textures/screens/chakra_guif.png"));
			Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX - 180, 20, 0, 0, 160, 16, 160, 16);



			RenderSystem.depthMask(true);
			RenderSystem.defaultBlendFunc();
			RenderSystem.enableDepthTest();
			RenderSystem.disableBlend();
			RenderSystem.setShaderColor(1, 1, 1, 1);
		}
	}
}
