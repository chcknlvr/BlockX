package net.chcknlvr.blockx

import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient

class TungstenMaterial : ToolMaterial {
    override fun getDurability(): Int {
        return 5000
    }

    override fun getMiningSpeedMultiplier(): Float {
        return 20.0f
    }

    override fun getAttackDamage(): Float {
        return 10.0f
    }

    override fun getMiningLevel(): Int {
        return 5
    }

    override fun getEnchantability(): Int {
        return 30
    }

    override fun getRepairIngredient(): Ingredient {
        return Ingredient.ofItems(Blockx.TUNGSTEN_INGOT)
    }

    companion object {
        @JvmField
        val INSTANCE = TungstenMaterial()
    }
}