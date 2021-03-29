package chcknlvr.blockx;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class tungstenArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[]{4, 7, 9, 4};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 100;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Blockx.TUNGSTEN_INGOT);
    }

    @Override
    public String getName() {
        return "tungsten";
    }

    @Override
    public float getToughness() {
        return 5.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F;
    }

    // In which A is helmet, B chestplate, C leggings and D boots.
    // For reference, Leather uses {1, 2, 3, 1}, and Diamond/Netherite {3, 6, 8, 3}
}
