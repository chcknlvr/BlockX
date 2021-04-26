package net.chcknlvr.blockx.ItemGroup;

import net.chcknlvr.blockx.Blockx;
import net.chcknlvr.blockx.block.Blocks;
import net.chcknlvr.blockx.item.Items;
import net.chcknlvr.blockx.item.RegisterArmorItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroup {
    public static void register() {
        final net.minecraft.item.ItemGroup BLOCKX = FabricItemGroupBuilder.create(
            new Identifier(Blockx.MODID, "blockx"))
            .icon(() -> new ItemStack(Items.TUNGSTEN_INGOT))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Items.TUNGSTEN_SWORD));
                stacks.add(new ItemStack(Items.TUNGSTEN_AXE));
                stacks.add(new ItemStack(Items.TUNGSTEN_PICKAXE));
                stacks.add(new ItemStack(Items.TUNGSTEN_SHOVEL));
                stacks.add(new ItemStack(Items.TUNGSTEN_HOE));
                stacks.add(new ItemStack(Blocks.WOLFRAMITE));
                stacks.add(new ItemStack(Blocks.TUNGSTEN_BLOCK));
                stacks.add(new ItemStack(Items.TUNGSTEN_INGOT));
                stacks.add(new ItemStack(Items.TUNGSTEN_SCRAP));
                stacks.add(new ItemStack(RegisterArmorItems.TUNGSTEN_HELMET));
                stacks.add(new ItemStack(RegisterArmorItems.TUNGSTEN_CHESTPLATE));
                stacks.add(new ItemStack(RegisterArmorItems.TUNGSTEN_LEGGINGS));
                stacks.add(new ItemStack(RegisterArmorItems.TUNGSTEN_BOOTS));
            })
            .build();}

}
