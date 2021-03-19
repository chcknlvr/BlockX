package blockx.blockx;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {
    public static final ArmorMaterial TUNGSTEN_ARMOR_MATERIAL = new tungstenArmorMaterial();
    public static final Item TUNGSTEN_HELMET = new ArmorItem(TUNGSTEN_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Blockx.BLOCKX));
    public static final Item TUNGSTEN_CHESTPLATE = new ArmorItem(TUNGSTEN_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Blockx.BLOCKX));
    public static final Item TUNGSTEN_LEGGINGS = new ArmorItem(TUNGSTEN_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Blockx.BLOCKX));
    public static final Item TUNGSTEN_BOOTS = new ArmorItem(TUNGSTEN_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Blockx.BLOCKX));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_helmet"), TUNGSTEN_HELMET);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_chestplate"), TUNGSTEN_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_leggings"), TUNGSTEN_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_boots"), TUNGSTEN_BOOTS);
    }
}

