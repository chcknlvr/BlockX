package net.chcknlvr.blockx.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterBlocks {
    public static void register() {
        //Register Blocks
        Registry.register(Registry.BLOCK, new Identifier("blockx", "wolframite"), Blocks.WOLFRAMITE);
        Registry.register(Registry.BLOCK, new Identifier("blockx", "tungsten_block"), Blocks.TUNGSTEN_BLOCK);
        //Register BlockItems
        Registry.register(Registry.ITEM, new Identifier("blockx", "wolframite"), new BlockItem(Blocks.WOLFRAMITE, new FabricItemSettings().fireproof()));
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_block"), new BlockItem(Blocks.TUNGSTEN_BLOCK, new FabricItemSettings().fireproof()));
    }
}
