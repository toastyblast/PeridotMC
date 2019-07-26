package toastyblast.firstmod.item;

import net.minecraft.item.ItemSpade;
import toastyblast.firstmod.FirstMod;

public class ItemPeridotSpade extends ItemSpade {
    public ItemPeridotSpade(ToolMaterial mat) {
        super(mat);
        setCreativeTab(FirstMod.PERIDOT_TAB);
    }
}
