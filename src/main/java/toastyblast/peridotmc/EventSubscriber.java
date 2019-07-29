package toastyblast.peridotmc;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import toastyblast.peridotmc.block.BlockPeridotOre;
import toastyblast.peridotmc.init.ModBlocks;
import toastyblast.peridotmc.item.*;
import toastyblast.peridotmc.material.PeridotMaterials;

@EventBusSubscriber(modid = PeridotMC.MODID)
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
                // Axes are a little different. Their base attack speed is 4.0f. So, to make a speed lower than that, pass a negative number. 4.0f - 3.0f for instance makes the attack speed 1.0, for instance.
                RegUtil.setItemName(new ItemPeridotAxe(PeridotMaterials.PERIDOT_TOOL, 9.0f, -2.9f), "peridot_axe"),
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
