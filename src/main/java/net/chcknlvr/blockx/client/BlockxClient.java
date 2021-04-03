package net.chcknlvr.blockx.client;

import net.chcknlvr.blockx.Blockx;
import net.chcknlvr.blockx.entity.DarkZombieRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class BlockxClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(Blockx.DARK_ZOMBIE, (dispatcher, context) -> {
            return new DarkZombieRenderer(dispatcher);
        });
    }
}
