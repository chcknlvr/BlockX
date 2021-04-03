package net.chcknlvr.blockx.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class DarkZombieEntity extends HostileEntity {
    public DarkZombieEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }
}
