package toastyblast.firstmod;

import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import toastyblast.firstmod.tabs.PeridotTab;

@Mod(modid = FirstMod.MODID, name = FirstMod.NAME, version = FirstMod.VERSION, acceptedMinecraftVersions = FirstMod.MC_VERSION)
public class FirstMod {
    public static final String MODID = "firstmod";
    public static final String NAME = "First Mod";
    public static final String VERSION = "0.0.1";
    public static final String MC_VERSION = "[1.12.2]";

    public static final Logger LOGGER = LogManager.getLogger(FirstMod.MODID);

    public static final CreativeTabs PERIDOT_TAB = new PeridotTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // ...
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info(FirstMod.NAME + "says hi!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // ...
    }

    // ...
}