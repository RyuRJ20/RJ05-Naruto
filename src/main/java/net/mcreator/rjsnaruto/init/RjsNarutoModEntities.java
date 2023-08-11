
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

import net.mcreator.rjsnaruto.entity.NuibariEntity;
import net.mcreator.rjsnaruto.entity.FirballTestEntity;
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

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CapybaraEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CAPYBARA.get(), CapybaraEntity.createAttributes().build());
	}
}
