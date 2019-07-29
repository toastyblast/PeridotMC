package toastyblast.firstmod.item;

import net.minecraft.item.ItemSword;
import toastyblast.firstmod.FirstMod;

public class ItemPeridotSword extends ItemSword {
    public ItemPeridotSword(ToolMaterial mat) {
        super(mat);
        setCreativeTab(FirstMod.PERIDOT_TAB);
    }
}
