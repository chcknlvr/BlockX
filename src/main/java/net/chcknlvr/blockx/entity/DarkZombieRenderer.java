package net.chcknlvr.blockx.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class DarkZombieRenderer extends MobEntityRenderer<DarkZombieEntity, DarkZombieModel> {

    public DarkZombieRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new DarkZombieModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(DarkZombieEntity entity) {
        return new Identifier("blockx", "textures/entity/cube/cube.png");
    }
}
