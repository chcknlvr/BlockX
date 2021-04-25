package net.chcknlvr.blockx;

import net.chcknlvr.blockx.block.Blocks;
import net.chcknlvr.blockx.block.RegisterBlocks;
import net.chcknlvr.blockx.configuredFeatures.Ores;
import net.chcknlvr.blockx.item.Items;
import net.chcknlvr.blockx.item.RegisterArmorItems;
import net.chcknlvr.blockx.item.RegisterItems;
import net.chcknlvr.blockx.item.TungstenMaterial;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blockx implements ModInitializer {
    public static final String MODID = "blockx";

    //Item Groups
    public static final ItemGroup BLOCKX = FabricItemGroupBuilder.create(
            new Identifier(MODID, "blockx"))
            .icon(() -> new ItemStack(Items.TUNGSTEN_INGOT))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Items.TUNGSTEN_SWORD));
                stacks.add(new ItemStack(Items.TUNGSTEN_AXE));
                stacks.add(new ItemStack(Items.TUNGSTEN_PICKAXE));
                stacks.add(new ItemStack(Items.TUNGSTEN_SHOVEL));
                stacks.add(new ItemStack(Items.TUNGSTEN_HOE));
                stacks.add(new ItemStack(Blocks.WOLFRAMITE));
                stacks.add(new ItemStack(Items.TUNGSTEN_INGOT));
                stacks.add(new ItemStack(Items.TUNGSTEN_SCRAP));
                stacks.add(new ItemStack(RegisterArmorItems.TUNGSTEN_HELMET));
                stacks.add(new ItemStack(RegisterArmorItems.TUNGSTEN_CHESTPLATE));
                stacks.add(new ItemStack(RegisterArmorItems.TUNGSTEN_LEGGINGS));
                stacks.add(new ItemStack(RegisterArmorItems.TUNGSTEN_BOOTS));
            })
            .build();

    @Override
    public void onInitialize() {
        Ores.register();
        RegisterItems.register();
        RegisterArmorItems.register();
        RegisterBlocks.register();
    }

}
