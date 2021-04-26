package net.chcknlvr.blockx;

import net.chcknlvr.blockx.ItemGroup.ItemGroup;
import net.chcknlvr.blockx.block.RegisterBlocks;
import net.chcknlvr.blockx.configuredFeatures.Ores;
import net.chcknlvr.blockx.item.RegisterArmorItems;
import net.chcknlvr.blockx.item.RegisterItems;
import net.fabricmc.api.ModInitializer;

public class Blockx implements ModInitializer {
    public static final String MODID = "blockx";
    @Override
    public void onInitialize() {
        ItemGroup.register();
        Ores.register();
        RegisterItems.register();
        RegisterArmorItems.register();
        RegisterBlocks.register();
    }

}
