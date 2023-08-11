
package net.mcreator.rjsnaruto.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.rjsnaruto.world.inventory.NarutoMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class NarutoScreen extends AbstractContainerScreen<NarutoMenu> {
	private final static HashMap<String, Object> guistate = NarutoMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_chakra_control;
	Button button_kenjutsu;

	public NarutoScreen(NarutoMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 267;
		this.imageHeight = 166;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("rjs_naruto:textures/screens/naruto.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, new TranslatableComponent("gui.rjs_naruto.naruto.label_skills"), 11, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_chakra_control = new Button(this.leftPos + 10, this.topPos + 25, 98, 20, new TranslatableComponent("gui.rjs_naruto.naruto.button_chakra_control"), e -> {
		});
		guistate.put("button:button_chakra_control", button_chakra_control);
		this.addRenderableWidget(button_chakra_control);
		button_kenjutsu = new Button(this.leftPos + 10, this.topPos + 52, 67, 20, new TranslatableComponent("gui.rjs_naruto.naruto.button_kenjutsu"), e -> {
		});
		guistate.put("button:button_kenjutsu", button_kenjutsu);
		this.addRenderableWidget(button_kenjutsu);
	}
}
