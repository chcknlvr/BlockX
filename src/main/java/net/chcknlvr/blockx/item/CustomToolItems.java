package net.chcknlvr.blockx.item;

import net.minecraft.item.*;

public class CustomToolItems {
    public static class CustomFireproofPickaxeItem extends PickaxeItem {
        public CustomFireproofPickaxeItem(TungstenMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings.fireproof());
        }
    }

    public static class CustomFireproofAxeItem extends AxeItem {
        public CustomFireproofAxeItem(TungstenMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings.fireproof());
        }
    }

    public static class CustomFireproofHoeItem extends HoeItem {
        public CustomFireproofHoeItem(TungstenMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings.fireproof());
        }
    }

    public static class CustomFireproofSwordItem extends SwordItem {
        public CustomFireproofSwordItem(TungstenMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings.fireproof());
        }
    }

    public static class CustomFireproofShovelItem extends ShovelItem {
        public CustomFireproofShovelItem(TungstenMaterial material, float attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings.fireproof());
        }
    }
}
