
package net.mcreator.rjsnaruto.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.rjsnaruto.entity.FireballsummonEntity;
import net.mcreator.rjsnaruto.client.model.fireballsmall;

public class FireballsummonRenderer extends MobRenderer<FireballsummonEntity, fireballsmall<FireballsummonEntity>> {
	public FireballsummonRenderer(EntityRendererProvider.Context context) {
		super(context, new fireballsmall(context.bakeLayer(fireballsmall.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<FireballsummonEntity, fireballsmall<FireballsummonEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("rjs_naruto:textures/entities/fireball.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FireballsummonEntity entity) {
		return new ResourceLocation("rjs_naruto:textures/entities/fireball.png");
	}
}
