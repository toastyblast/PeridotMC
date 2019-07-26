package toastyblast.firstmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import toastyblast.firstmod.FirstMod;

public class ItemPeridot extends Item {
    public ItemPeridot() {
        setCreativeTab(FirstMod.PERIDOT_TAB);
        // Also add the ore to the creative Misc. tab. NOT POSSIBLE AS OF THIS VERSION OF MC (1.12.2)/FORGE!!!
//        setCreativeTab(CreativeTabs.MISC);
    }
}
