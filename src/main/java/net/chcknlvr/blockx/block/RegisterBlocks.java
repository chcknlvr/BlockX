package net.chcknlvr.blockx.block;

import net.chcknlvr.blockx.Blockx;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterBlocks {
    public static void register() {
        //Register Blocks
        Registry.register(Registry.BLOCK, new Identifier(Blockx.MODID, "wolframite"), Blocks.WOLFRAMITE);
        Registry.register(Registry.BLOCK, new Identifier(Blockx.MODID, "tungsten_block"), Blocks.TUNGSTEN_BLOCK);
        //Register BlockItems
        Registry.register(Registry.ITEM, new Identifier(Blockx.MODID, "wolframite"), new FireproofBlockItem(Blocks.WOLFRAMITE, new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Blockx.MODID, "tungsten_block"), new FireproofBlockItem(Blocks.TUNGSTEN_BLOCK, new FabricItemSettings()));
    }
}
