package net.chcknlvr.blockx.block;

import net.chcknlvr.blockx.Blockx;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterBlocks {
    public static void register() {
        //Register Blocks
        Registry.register(Registry.BLOCK, new Identifier("blockx", "wolframite"), Blocks.WOLFRAMITE);
        Registry.register(Registry.BLOCK, new Identifier("blockx", "tungsten_block"), Blocks.TUNGSTEN_BLOCK);
        //Register BlockItems
        Registry.register(Registry.ITEM, new Identifier("blockx", "wolframite"), new FireproofBlockItem(Blocks.WOLFRAMITE, new FabricItemSettings().group(Blockx.BLOCKX)));
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_block"), new FireproofBlockItem(Blocks.TUNGSTEN_BLOCK, new FabricItemSettings().group(Blockx.BLOCKX)));
    }
}
