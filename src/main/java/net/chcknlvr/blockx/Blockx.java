package net.chcknlvr.blockx;

import net.chcknlvr.blockx.block.Blocks;
import net.chcknlvr.blockx.configuredFeatures.Ores;
import net.chcknlvr.blockx.item.Items;
import net.chcknlvr.blockx.item.RegisterArmorItems;
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

        //Register Items
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_scrap"), Items.TUNGSTEN_SCRAP);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_ingot"), Items.TUNGSTEN_INGOT);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_sword"), Items.TUNGSTEN_SWORD);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_shovel"), Items.TUNGSTEN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_pickaxe"), Items.TUNGSTEN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_axe"), Items.TUNGSTEN_AXE);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_hoe"), Items.TUNGSTEN_HOE);
        //Register Blocks and BlockItems
        Registry.register(Registry.BLOCK, new Identifier("blockx", "wolframite"), Blocks.WOLFRAMITE);
        Registry.register(Registry.ITEM, new Identifier("blockx", "wolframite_block"), new BlockItem(Blocks.WOLFRAMITE, new FabricItemSettings().group(Blockx.BLOCKX).fireproof()));
        Registry.register(Registry.BLOCK, new Identifier("blockx", "tungsten_block"), Blocks.TUNGSTEN_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_block"), new BlockItem(Blocks.TUNGSTEN_BLOCK, new FabricItemSettings().group(Blockx.BLOCKX).fireproof()));

        Ores.register();
        RegisterArmorItems.register();

    }

    public static class CustomFireproofPickaxeItem extends PickaxeItem {
        public CustomFireproofPickaxeItem(TungstenMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings.fireproof());
        }
    }

    public static class CustomFireproofAxeItem extends AxeItem {
        public CustomFireproofAxeItem(TungstenMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings.fireproof());
        }
    }

    public static class CustomFireproofHoeItem extends HoeItem {
        public CustomFireproofHoeItem(TungstenMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings.fireproof());
        }
    }

    public static class CustomFireproofSwordItem extends SwordItem {
        public CustomFireproofSwordItem(TungstenMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings.fireproof());
        }
    }

    public static class CustomFireproofShovelItem extends ShovelItem {
        public CustomFireproofShovelItem(TungstenMaterial material, float attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings.fireproof());
        }
    }

}
