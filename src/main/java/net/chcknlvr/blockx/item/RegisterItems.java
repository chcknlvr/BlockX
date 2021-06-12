package net.chcknlvr.blockx.item;

import net.chcknlvr.blockx.Blockx;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {
    public static void register() {
        //Register Items
        Registry.register(Registry.ITEM, new Identifier(Blockx.MODID, "tungsten_scrap"), Items.TUNGSTEN_SCRAP);
        Registry.register(Registry.ITEM, new Identifier(Blockx.MODID, "tungsten_ingot"), Items.TUNGSTEN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Blockx.MODID, "tungsten_sword"), Items.TUNGSTEN_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Blockx.MODID, "tungsten_shovel"), Items.TUNGSTEN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Blockx.MODID, "tungsten_pickaxe"), Items.TUNGSTEN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Blockx.MODID, "tungsten_axe"), Items.TUNGSTEN_AXE);
        Registry.register(Registry.ITEM, new Identifier(Blockx.MODID, "tungsten_hoe"), Items.TUNGSTEN_HOE);
    }
}
