package net.chcknlvr.blockx.item;

import net.minecraft.item.Item;

public class FireProofItem extends Item {

    public FireProofItem(Settings settings) {
        super(settings.fireproof());
    }
}