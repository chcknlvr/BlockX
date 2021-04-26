package net.chcknlvr.blockx.item;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {
    public static void register() {
        //Register Items
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_scrap"), Items.TUNGSTEN_SCRAP);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_ingot"), Items.TUNGSTEN_INGOT);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_sword"), Items.TUNGSTEN_SWORD);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_shovel"), Items.TUNGSTEN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_pickaxe"), Items.TUNGSTEN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_axe"), Items.TUNGSTEN_AXE);
        Registry.register(Registry.ITEM, new Identifier("blockx", "tungsten_hoe"), Items.TUNGSTEN_HOE);
    }
}
