// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldragontest_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dragontest_converted"), "main");
	private final ModelPart group2;
	private final ModelPart group3;
	private final ModelPart group8;
	private final ModelPart group13;
	private final ModelPart group16;
	private final ModelPart group17;
	private final ModelPart group20;
	private final ModelPart group21;

	public Modeldragontest_Converted(ModelPart root) {
		this.group2 = root.getChild("group2");
		this.group3 = root.getChild("group3");
		this.group8 = root.getChild("group8");
		this.group13 = root.getChild("group13");
		this.group16 = root.getChild("group16");
		this.group17 = root.getChild("group17");
		this.group20 = root.getChild("group20");
		this.group21 = root.getChild("group21");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition group2 = partdefinition.addOrReplaceChild("group2",
				CubeListBuilder.create().texOffs(0, 11)
						.addBox(3.0F, -10.0F, -8.0F, 21.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-13.0F, -19.0F, -10.0F, 16.0F, 21.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(15.0F, 7.0F, -8.0F, 6.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition cube_r1 = group2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 13).addBox(14.0F, -20.0F, 3.0F, 2.0F, 2.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r2 = group2
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 13).addBox(10.0F, -20.0F, -5.0F, 2.0F, 2.0F, 13.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r3 = group2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 11).addBox(-19.0F, 0.0F, 0.0F, 16.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group3 = partdefinition.addOrReplaceChild("group3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition cube_r4 = group3.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(11.0F, -7.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(12.0F, -9.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group4 = group3.addOrReplaceChild("group4", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = group4.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(7.0F, -6.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(8.0F, -8.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group5 = group3.addOrReplaceChild("group5", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = group5.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(4.0F, -6.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.0F, -8.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group6 = group3.addOrReplaceChild("group6", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = group6.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(2.0F, -6.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.0F, -8.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group7 = group3.addOrReplaceChild("group7", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r8 = group7.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(-1.0F, -6.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(0.0F, -8.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group8 = partdefinition.addOrReplaceChild("group8", CubeListBuilder.create(),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition cube_r9 = group8.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(12.0F, -9.0F, 10.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(11.0F, -7.0F, 9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group9 = group8.addOrReplaceChild("group9", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r10 = group9.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(8.0F, -8.0F, 10.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(7.0F, -6.0F, 9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group10 = group8.addOrReplaceChild("group10", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = group10.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(3.0F, -8.0F, 10.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(2.0F, -6.0F, 9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group11 = group8.addOrReplaceChild("group11", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r12 = group11.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(0.0F, -8.0F, 10.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-1.0F, -6.0F, 9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group12 = group8.addOrReplaceChild("group12", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r13 = group12.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(5.0F, -8.0F, 10.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(4.0F, -6.0F, 9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group13 = partdefinition.addOrReplaceChild("group13", CubeListBuilder.create(),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition cube_r14 = group13.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 1).addBox(-30.0F, -23.0F, 7.0F, 17.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.3491F, 0.3927F));

		PartDefinition cube_r15 = group13.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 1).addBox(-26.0F, -24.0F, 2.0F, 17.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, -0.3491F, 0.3927F));

		PartDefinition cube_r16 = group13.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(8.0F, -14.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(9.0F, -12.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(7.0F, -17.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group14 = group13.addOrReplaceChild("group14", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r17 = group14.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(4.0F, -14.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.0F, -12.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(3.0F, -17.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group15 = group13.addOrReplaceChild("group15", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r18 = group15.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(1.0F, -14.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(2.0F, -12.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(2.0F, -17.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group16 = partdefinition.addOrReplaceChild("group16", CubeListBuilder.create(),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition cube_r19 = group16.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(0, 3)
						.addBox(7.0F, -17.0F, 4.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(9.0F, -14.0F, 5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group17 = partdefinition.addOrReplaceChild("group17", CubeListBuilder.create(),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition cube_r20 = group17.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(8.0F, -13.0F, 9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(9.0F, -11.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(7.0F, -16.0F, 8.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group18 = group17.addOrReplaceChild("group18", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r21 = group18.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(4.0F, -13.0F, 9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.0F, -11.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(3.0F, -16.0F, 8.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group19 = group17.addOrReplaceChild("group19", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r22 = group19.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(0.0F, -13.0F, 9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(1.0F, -11.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-1.0F, -16.0F, 8.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group20 = partdefinition.addOrReplaceChild("group20", CubeListBuilder.create(),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition cube_r23 = group20.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(12.0F, -9.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(11.0F, -7.0F, 4.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group21 = partdefinition.addOrReplaceChild("group21", CubeListBuilder.create(),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition cube_r24 = group21.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(12.0F, -9.0F, 10.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(11.0F, -7.0F, 9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group = group21.addOrReplaceChild("group", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r25 = group.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(12.0F, -9.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(11.0F, -7.0F, 4.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 0.3927F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		group2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		group3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		group8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		group13.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		group16.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		group17.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		group20.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		group21.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}