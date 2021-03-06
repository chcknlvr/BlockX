package net.chcknlvr.blockx.item;

import net.chcknlvr.blockx.Blockx;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterArmorItems {
    public static final ArmorMaterial TUNGSTEN_ARMOR_MATERIAL = new TungstenArmorMaterial();
    public static final Item TUNGSTEN_HELMET = new ArmorItem(TUNGSTEN_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().fireproof());
    public static final Item TUNGSTEN_CHESTPLATE = new ArmorItem(TUNGSTEN_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().fireproof());
    public static final Item TUNGSTEN_LEGGINGS = new ArmorItem(TUNGSTEN_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().fireproof());
    public static final Item TUNGSTEN_BOOTS = new ArmorItem(TUNGSTEN_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().fireproof());
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(Blockx.MODID, "tungsten_helmet"), TUNGSTEN_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Blockx.MODID, "tungsten_chestplate"), TUNGSTEN_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Blockx.MODID, "tungsten_leggings"), TUNGSTEN_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Blockx.MODID, "tungsten_boots"), TUNGSTEN_BOOTS);
    }
}
