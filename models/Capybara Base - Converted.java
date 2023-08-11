// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Capybara Base - Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "capybara_base - converted"), "main");
	private final ModelPart bb_main;

	public Capybara Base - Converted(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(2, 4).addBox(1.0F, -4.0F, 2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1, 3).addBox(-11.0F, -6.0F, 2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1, 3).addBox(-11.0F, -6.0F, -5.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(2.0F, -15.0F, -3.0F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 3).addBox(9.0F, -15.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(2, 4).addBox(1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -14.0F, 3.0F, 0.4363F, -0.6981F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -14.0F, -3.0F, -0.3107F, -0.6358F, 0.4957F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -8.0F, -4.0F, 14.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		return LayerDefinition.create(meshdefinition, 8, 8);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}