package toastyblast.firstmod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import toastyblast.firstmod.block.BlockPeridotOre;
import toastyblast.firstmod.init.ModBlocks;
import toastyblast.firstmod.item.*;
import toastyblast.firstmod.material.PeridotMaterials;

@EventBusSubscriber(modid = FirstMod.MODID)
public final class EventSubscriber {
    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
                RegUtil.setBlockName(new BlockPeridotOre(), "peridot_ore")
        };

        event.getRegistry().registerAll(blocks);
    }

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                RegUtil.setItemName(new ItemPeridot(), "peridot"),
                RegUtil.setItemName(new ItemPeridotPickaxe(PeridotMaterials.PERIDOT_TOOL), "peridot_pickaxe"),
                RegUtil.setItemName(new ItemPeridotSword(PeridotMaterials.PERIDOT_TOOL), "peridot_sword"),
                // FIXME: Axe swing speed is extremely high (4.0f + the float given below. Fix this).
//                RegUtil.setItemName(new ItemPeridotAxe(PeridotMaterials.PERIDOT_TOOL, 9.0f, 0.5F), "peridot_axe"),
                RegUtil.setItemName(new ItemPeridotSpade(PeridotMaterials.PERIDOT_TOOL), "peridot_spade"),
                RegUtil.setItemName(new ItemPeridotHoe(PeridotMaterials.PERIDOT_TOOL), "peridot_hoe")
        };

        final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.PERIDOT_ORE).setRegistryName(ModBlocks.PERIDOT_ORE.getRegistryName())
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
}
