
package net.mcreator.rjsnaruto.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.rjsnaruto.entity.FireDragonTestEntity;
import net.mcreator.rjsnaruto.client.model.Modeldragontest_Converted;

public class FireDragonTestRenderer extends MobRenderer<FireDragonTestEntity, Modeldragontest_Converted<FireDragonTestEntity>> {
	public FireDragonTestRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldragontest_Converted(context.bakeLayer(Modeldragontest_Converted.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<FireDragonTestEntity, Modeldragontest_Converted<FireDragonTestEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("rjs_naruto:textures/entities/fireballtransparent.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FireDragonTestEntity entity) {
		return new ResourceLocation("rjs_naruto:textures/entities/fireballtransparent.png");
	}
}
