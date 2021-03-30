package chcknlvr.blockx

import net.minecraft.item.ArmorMaterial
import chcknlvr.blockx.tungstenArmorMaterial
import net.minecraft.item.ArmorItem
import chcknlvr.blockx.RegisterItems
import net.minecraft.entity.EquipmentSlot
import chcknlvr.blockx.Blockx
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object RegisterItems {
    val TUNGSTEN_ARMOR_MATERIAL: ArmorMaterial = tungstenArmorMaterial()
    @JvmField
    val TUNGSTEN_HELMET: Item =
        ArmorItem(TUNGSTEN_ARMOR_MATERIAL, EquipmentSlot.HEAD, Item.Settings().group(Blockx.BLOCKX).fireproof())
    @JvmField
    val TUNGSTEN_CHESTPLATE: Item =
        ArmorItem(TUNGSTEN_ARMOR_MATERIAL, EquipmentSlot.CHEST, Item.Settings().group(Blockx.BLOCKX).fireproof())
    @JvmField
    val TUNGSTEN_LEGGINGS: Item =
        ArmorItem(TUNGSTEN_ARMOR_MATERIAL, EquipmentSlot.LEGS, Item.Settings().group(Blockx.BLOCKX).fireproof())
    @JvmField
    val TUNGSTEN_BOOTS: Item =
        ArmorItem(TUNGSTEN_ARMOR_MATERIAL, EquipmentSlot.FEET, Item.Settings().group(Blockx.BLOCKX).fireproof())

    @JvmStatic
    fun register() {
        Registry.register(Registry.ITEM, Identifier("blockx", "tungsten_helmet"), TUNGSTEN_HELMET)
        Registry.register(Registry.ITEM, Identifier("blockx", "tungsten_chestplate"), TUNGSTEN_CHESTPLATE)
        Registry.register(Registry.ITEM, Identifier("blockx", "tungsten_leggings"), TUNGSTEN_LEGGINGS)
        Registry.register(Registry.ITEM, Identifier("blockx", "tungsten_boots"), TUNGSTEN_BOOTS)
    }
}