package net.chcknlvr.blockx.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class FireproofBlockItem extends BlockItem {
    public FireproofBlockItem(Block block, Settings settings) {
        super(block, settings.fireproof());
    }
}
