package chcknlvr.blockx;

import net.minecraft.item.Item;

public class FireProofItem extends Item {
    public FireProofItem(Settings settings) {
        super(settings.fireproof());
    }
}