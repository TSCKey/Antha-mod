package net.tsckey.dodo.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tsckey.dodo.Antha;
import net.tsckey.dodo.entity.custom.AnthaStaffProjectileEntity;

public class ModEntities {
    public static final EntityType<AnthaStaffProjectileEntity> Antha_Staff = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Antha.MOD_ID, "antha_staff"),
            EntityType.Builder.<AnthaStaffProjectileEntity>create(AnthaStaffProjectileEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 1.15f).build());



    public static void registerModEntities() {
        Antha.LOGGER.info("Registering Mod Entities for " + Antha.MOD_ID);

    }
}
