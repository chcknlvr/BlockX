package net.chcknlvr.blockx.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;

public class Items {
    //Tools
    public static ToolItem TUNGSTEN_SWORD = new CustomToolItems.CustomFireproofSwordItem(TungstenMaterial.INSTANCE, 10, -3.0F, new Item.Settings());
    public static ToolItem TUNGSTEN_SHOVEL = new CustomToolItems.CustomFireproofShovelItem(TungstenMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings());
    public static ToolItem TUNGSTEN_PICKAXE = new CustomToolItems.CustomFireproofPickaxeItem(TungstenMaterial.INSTANCE, 1, -2.8F, new Item.Settings());
    public static ToolItem TUNGSTEN_AXE = new CustomToolItems.CustomFireproofAxeItem(TungstenMaterial.INSTANCE, 15, -3.5F, new Item.Settings());
    public static ToolItem TUNGSTEN_HOE = new CustomToolItems.CustomFireproofHoeItem(TungstenMaterial.INSTANCE, -9, 0.0F, new Item.Settings());
    //Items
    public static final Item TUNGSTEN_SCRAP = new FireProofItem(new FabricItemSettings());
    public static final Item TUNGSTEN_INGOT = new FireProofItem(new FabricItemSettings());
}
