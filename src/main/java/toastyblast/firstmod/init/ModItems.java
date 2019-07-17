package toastyblast.firstmod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import toastyblast.firstmod.FirstMod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import toastyblast.firstmod.RegUtil;

@ObjectHolder(FirstMod.MODID)
public class ModItems {
    public static final Item PERIDOT = null;

    @Mod.EventBusSubscriber(modid = FirstMod.MODID)
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            final Item[] items = {
                    RegUtil.setItemName(new Item(), "peridot").setCreativeTab(CreativeTabs.MISC)
            };

            event.getRegistry().registerAll(items);
        }
    }

    // ...
}
