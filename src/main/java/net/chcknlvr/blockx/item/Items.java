package net.chcknlvr.blockx.item;

import net.chcknlvr.blockx.Blockx;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;

public class Items {
    //Tools
    public static ToolItem TUNGSTEN_SWORD = new Blockx.CustomFireproofSwordItem(TungstenMaterial.INSTANCE, 10, -3.0F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem TUNGSTEN_SHOVEL = new Blockx.CustomFireproofShovelItem(TungstenMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TUNGSTEN_PICKAXE = new Blockx.CustomFireproofPickaxeItem(TungstenMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TUNGSTEN_AXE = new Blockx.CustomFireproofAxeItem(TungstenMaterial.INSTANCE, 15, -3.5F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TUNGSTEN_HOE = new Blockx.CustomFireproofHoeItem(TungstenMaterial.INSTANCE, -9, 0.0F, new Item.Settings().group(ItemGroup.TOOLS));
    //Items
    public static final Item TUNGSTEN_SCRAP = new FireProofItem(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item TUNGSTEN_INGOT = new FireProofItem(new FabricItemSettings().group(ItemGroup.MISC));
}
