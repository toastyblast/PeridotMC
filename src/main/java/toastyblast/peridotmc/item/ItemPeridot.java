package toastyblast.peridotmc.item;

import net.minecraft.item.Item;
import toastyblast.peridotmc.PeridotMC;

public class ItemPeridot extends Item {
    public ItemPeridot() {
        setCreativeTab(PeridotMC.PERIDOT_TAB);
        // Also add the ore to the creative Misc. tab. NOT POSSIBLE AS OF THIS VERSION OF MC (1.12.2)/FORGE!!!
//        setCreativeTab(CreativeTabs.MISC);
    }
}
