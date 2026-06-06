package com.utofarman.zozi;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import com.utofarman.zozi.entity.ZoziEntity;

public class ZoziEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(
            ForgeRegistries.ENTITY_TYPES, ZoziMod.MOD_ID);

    public static final RegistryObject<EntityType<ZoziEntity>> ZOZI = ENTITIES.register("zozi",
            () -> EntityType.Builder.of(ZoziEntity::new, MobCategory.CREATURE)
                    .sized(0.6F, 1.8F)
                    .build("zozi"));
}
