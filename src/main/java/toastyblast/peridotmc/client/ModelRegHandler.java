package toastyblast.peridotmc.client;

import toastyblast.peridotmc.PeridotMC;
import toastyblast.peridotmc.init.ModBlocks;
import toastyblast.peridotmc.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = PeridotMC.MODID)
public class ModelRegHandler {
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(ModItems.PERIDOT, 0);
        registerModel(ModItems.PERIDOT_PICKAXE, 0);
        registerModel(ModItems.PERIDOT_SWORD, 0);
        registerModel(ModItems.PERIDOT_AXE, 0);
        registerModel(ModItems.PERIDOT_SPADE, 0);
        registerModel(ModItems.PERIDOT_HOE, 0);
        registerModel(Item.getItemFromBlock(ModBlocks.PERIDOT_ORE), 0);
    }

    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
