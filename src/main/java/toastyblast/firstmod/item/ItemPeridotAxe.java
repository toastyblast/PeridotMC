package toastyblast.firstmod.item;

import net.minecraft.item.ItemAxe;
import toastyblast.firstmod.FirstMod;

public class ItemPeridotAxe extends ItemAxe {
    public ItemPeridotAxe(ToolMaterial mat) {
        super(mat);
    }

    // Constructor to allow custom attack damage and speeds for axe.
    public ItemPeridotAxe(ToolMaterial mat, float dam, float spd) {
        super(mat, dam, spd);
        setCreativeTab(FirstMod.PERIDOT_TAB);
    }
}
