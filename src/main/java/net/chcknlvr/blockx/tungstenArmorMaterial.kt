package net.chcknlvr.blockx

import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ArmorMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents

class tungstenArmorMaterial : ArmorMaterial {
    override fun getDurability(slot: EquipmentSlot): Int {
        return BASE_DURABILITY[slot.entitySlotId] * 100
    }

    override fun getProtectionAmount(slot: EquipmentSlot): Int {
        return PROTECTION_VALUES[slot.entitySlotId]
    }

    override fun getEnchantability(): Int {
        return 30
    }

    override fun getEquipSound(): SoundEvent {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE
    }

    override fun getRepairIngredient(): Ingredient {
        return Ingredient.ofItems(Blockx.TUNGSTEN_INGOT)
    }

    override fun getName(): String {
        return "tungsten"
    }

    override fun getToughness(): Float {
        return 5.0f
    }

    override fun getKnockbackResistance(): Float {
        return 0.0f
    } // In which A is helmet, B chestplate, C leggings and D boots.

    // For reference, Leather uses {1, 2, 3, 1}, and Diamond/Netherite {3, 6, 8, 3}
    companion object {
        private val BASE_DURABILITY = intArrayOf(13, 15, 16, 11)
        private val PROTECTION_VALUES = intArrayOf(4, 7, 9, 4)
    }
}