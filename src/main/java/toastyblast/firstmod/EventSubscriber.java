package toastyblast.firstmod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import toastyblast.firstmod.block.PeridotBlock;
import toastyblast.firstmod.init.ModBlocks;

@EventBusSubscriber(modid = FirstMod.MODID)
public final class EventSubscriber {
    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
                RegUtil.setBlockName(new PeridotBlock(), "peridot_block").setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
        };

        event.getRegistry().registerAll(blocks);
    }

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                RegUtil.setItemName(new Item(), "peridot").setCreativeTab(CreativeTabs.MISC)
        };

        final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.PERIDOT_BLOCK).setRegistryName(ModBlocks.PERIDOT_BLOCK.getRegistryName())
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
}