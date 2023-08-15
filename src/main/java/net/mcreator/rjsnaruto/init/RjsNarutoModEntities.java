
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rjsnaruto.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.rjsnaruto.entity.TestFireDragonEntity;
import net.mcreator.rjsnaruto.entity.NuibariEntity;
import net.mcreator.rjsnaruto.entity.LightningballEntity;
import net.mcreator.rjsnaruto.entity.KunaiEntity;
import net.mcreator.rjsnaruto.entity.KibaEntity;
import net.mcreator.rjsnaruto.entity.Gunbai1Entity;
import net.mcreator.rjsnaruto.entity.GreatLightningballEntity;
import net.mcreator.rjsnaruto.entity.FireballsummonEntity;
import net.mcreator.rjsnaruto.entity.FireballEntity;
import net.mcreator.rjsnaruto.entity.FireDragonTestEntity;
import net.mcreator.rjsnaruto.entity.FirballTestEntity;
import net.mcreator.rjsnaruto.entity.CinderTechniqueEntity;
import net.mcreator.rjsnaruto.entity.CapybaraEntity;
import net.mcreator.rjsnaruto.RjsNarutoMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RjsNarutoModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, RjsNarutoMod.MODID);
	public static final RegistryObject<EntityType<NuibariEntity>> NUIBARI = register("projectile_nuibari",
			EntityType.Builder.<NuibariEntity>of(NuibariEntity::new, MobCategory.MISC).setCustomClientFactory(NuibariEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CapybaraEntity>> CAPYBARA = register("capybara",
			EntityType.Builder.<CapybaraEntity>of(CapybaraEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CapybaraEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FirballTestEntity>> FIRBALL_TEST = register("projectile_firball_test",
			EntityType.Builder.<FirballTestEntity>of(FirballTestEntity::new, MobCategory.MISC).setCustomClientFactory(FirballTestEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LightningballEntity>> LIGHTNINGBALL = register("projectile_lightningball",
			EntityType.Builder.<LightningballEntity>of(LightningballEntity::new, MobCategory.MISC).setCustomClientFactory(LightningballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KibaEntity>> KIBA = register("projectile_kiba",
			EntityType.Builder.<KibaEntity>of(KibaEntity::new, MobCategory.MISC).setCustomClientFactory(KibaEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FireballEntity>> FIREBALL = register("projectile_fireball",
			EntityType.Builder.<FireballEntity>of(FireballEntity::new, MobCategory.MISC).setCustomClientFactory(FireballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KunaiEntity>> KUNAI = register("projectile_kunai",
			EntityType.Builder.<KunaiEntity>of(KunaiEntity::new, MobCategory.MISC).setCustomClientFactory(KunaiEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CinderTechniqueEntity>> CINDER_TECHNIQUE = register("projectile_cinder_technique", EntityType.Builder.<CinderTechniqueEntity>of(CinderTechniqueEntity::new, MobCategory.MISC)
			.setCustomClientFactory(CinderTechniqueEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TestFireDragonEntity>> TEST_FIRE_DRAGON = register("projectile_test_fire_dragon",
			EntityType.Builder.<TestFireDragonEntity>of(TestFireDragonEntity::new, MobCategory.MISC).setCustomClientFactory(TestFireDragonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FireDragonTestEntity>> FIRE_DRAGON_TEST = register("fire_dragon_test", EntityType.Builder.<FireDragonTestEntity>of(FireDragonTestEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireDragonTestEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FireballsummonEntity>> FIREBALLSUMMON = register("fireballsummon", EntityType.Builder.<FireballsummonEntity>of(FireballsummonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireballsummonEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GreatLightningballEntity>> GREAT_LIGHTNINGBALL = register("projectile_great_lightningball", EntityType.Builder.<GreatLightningballEntity>of(GreatLightningballEntity::new, MobCategory.MISC)
			.setCustomClientFactory(GreatLightningballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Gunbai1Entity>> GUNBAI_1 = register("projectile_gunbai_1",
			EntityType.Builder.<Gunbai1Entity>of(Gunbai1Entity::new, MobCategory.MISC).setCustomClientFactory(Gunbai1Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CapybaraEntity.init();
			FireDragonTestEntity.init();
			FireballsummonEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CAPYBARA.get(), CapybaraEntity.createAttributes().build());
		event.put(FIRE_DRAGON_TEST.get(), FireDragonTestEntity.createAttributes().build());
		event.put(FIREBALLSUMMON.get(), FireballsummonEntity.createAttributes().build());
	}
}
