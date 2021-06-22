package net.chcknlvr.blockx;

import net.chcknlvr.blockx.ItemGroup.ItemGroup;
import net.chcknlvr.blockx.block.RegisterBlocks;
import net.chcknlvr.blockx.features.Ores;
import net.chcknlvr.blockx.item.RegisterArmorItems;
import net.chcknlvr.blockx.item.RegisterItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class Blockx implements ModInitializer {
    public static final String MODID = "blockx";

    public static Identifier id(String path) {
        return new Identifier(MODID, path);
    }
    @Override
    public void onInitialize() {
        ItemGroup.register();
        RegisterItems.register();
        RegisterArmorItems.register();
        RegisterBlocks.register();
        Ores.register();
    }

}
