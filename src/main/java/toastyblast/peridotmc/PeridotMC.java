package toastyblast.peridotmc;

import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import toastyblast.peridotmc.tabs.PeridotTab;

@Mod(modid = PeridotMC.MODID, name = PeridotMC.NAME, version = PeridotMC.VERSION, acceptedMinecraftVersions = PeridotMC.MC_VERSION)
public class PeridotMC {
    public static final String MODID = "peridotmc";
    public static final String NAME = "Peridot MC";
    public static final String VERSION = "0.1.5";
    public static final String MC_VERSION = "[1.12.2]";

    public static final Logger LOGGER = LogManager.getLogger(PeridotMC.MODID);

    public static final CreativeTabs PERIDOT_TAB = new PeridotTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // ...
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info(PeridotMC.NAME + "says hi!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // ...
    }

    // ...
}