package chcknlvr.blockx;


import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blockx implements ModInitializer {
    //Items
    public static final Item TUNGSTEN_SCRAP = new FireProofItem(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item TUNGSTEN_INGOT = new FireProofItem(new FabricItemSettings().group(ItemGroup.MISC));
    public static ToolItem TUNGSTEN_SWORD = new CustomFireproofSwordItem(TungstenMaterial.INSTANCE, 10, -3.0F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem TUNGSTEN_SHOVEL = new CustomFireproofShovelItem(TungstenMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TUNGSTEN_PICKAXE = new CustomFireproofPickaxeItem(TungstenMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TUNGSTEN_AXE = new CustomFireproofAxeItem(TungstenMaterial.INSTANCE, 15, -3.5F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TUNGSTEN_HOE = new CustomFireproofHoeItem(TungstenMaterial.INSTANCE, -9, 0.0F, new Item.Settings().group(ItemGroup.TOOLS));
    //Blocks
    public static final Block WOLFRAMITE = new Block(FabricBlockSettings.of(Material.METAL).strength(45.0f));
    public static final Block TUNGSTEN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(45.0f));

    //Item Groups
    public static final ItemGroup BLOCKX = FabricItemGroupBuilder.create(
            new Identifier("blockx", "blockx"))
            .icon(() -> new ItemStack(Blockx.TUNGSTEN_INGOT))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Blockx.TUNGSTEN_SWORD));
                stacks.add(new ItemStack(Blockx.TUNGSTEN_AXE));
                stacks.add(new ItemStack(Blockx.TUNGSTEN_PICKAXE));
                stacks.add(new ItemStack(Blockx.TUNGSTEN_SHOVEL));
                stacks.add(new ItemStack(Blockx.TUNGSTEN_HOE));
                stacks.add(new ItemStack(Blockx.WOLFRAMITE));
                stacks.add(new ItemStack(Blockx.TUNGSTEN_INGOT));
                stacks.add(new ItemStack(RegisterArmorItems.TUNGSTEN_HELMET));
                stacks.add(new ItemStack(RegisterArmorItems.TUNGSTEN_CHESTPLATE));
                stacks.add(new ItemStack(RegisterArmorItems.TUNGSTEN_LEGGINGS));
                stacks.add(new ItemStack(RegisterArmorItems.TUNGSTEN_BOOTS));
            })
            .build();

    @Override
    public void onInitialize() {
        //Register Items
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_scrap"), TUNGSTEN_SCRAP);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_ingot"), TUNGSTEN_INGOT);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_sword"), TUNGSTEN_SWORD);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_shovel"), TUNGSTEN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_pickaxe"), TUNGSTEN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_axe"), TUNGSTEN_AXE);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_hoe"), TUNGSTEN_HOE);
        //Register Blocks and BlockItems
        Registry.register(Registry.BLOCK, new Identifier("blockx", "wolframite"), WOLFRAMITE);
        Registry.register(Registry.ITEM, new Identifier("blockx", "wolframite_block"), new BlockItem(WOLFRAMITE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.BLOCK, new Identifier("blockx", "tungsten_block"), TUNGSTEN_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_block"), new BlockItem(TUNGSTEN_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));

        Ores.oreRegister();
        RegisterArmorItems.register();

    }

    public static class CustomFireproofPickaxeItem extends PickaxeItem {
        public CustomFireproofPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings.fireproof());
        }
    }

    public static class CustomFireproofAxeItem extends AxeItem {
        public CustomFireproofAxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings.fireproof());
        }
    }

    public static class CustomFireproofHoeItem extends HoeItem {
        public CustomFireproofHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings.fireproof());
        }
    }
    public static class CustomFireproofSwordItem extends SwordItem {
        public CustomFireproofSwordItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings.fireproof());
        }
    }
    public static class CustomFireproofShovelItem extends ShovelItem {
        public CustomFireproofShovelItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings.fireproof());
        }
    }
}
