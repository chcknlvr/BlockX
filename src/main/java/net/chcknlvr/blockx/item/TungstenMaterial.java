package net.chcknlvr.blockx.item;

import net.chcknlvr.blockx.Blockx;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TungstenMaterial implements ToolMaterial {
    public static final TungstenMaterial INSTANCE = new TungstenMaterial();
    @Override
    public int getDurability() {
        return 5000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 20;
    }

    @Override
    public float getAttackDamage() {
        return 10;
    }

    @Override
    public int getMiningLevel() {
        return 6;
    }

    @Override
    public int getEnchantability() {
        return 50;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.TUNGSTEN_INGOT);
    }
}