package toastyblast.peridotmc.item;

import net.minecraft.item.ItemSword;
import toastyblast.peridotmc.PeridotMC;

public class ItemPeridotSword extends ItemSword {
    public ItemPeridotSword(ToolMaterial mat) {
        super(mat);
        setCreativeTab(PeridotMC.PERIDOT_TAB);
    }
}
