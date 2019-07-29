package toastyblast.peridotmc.item;

import net.minecraft.item.ItemHoe;
import toastyblast.peridotmc.PeridotMC;

public class ItemPeridotHoe extends ItemHoe {
    public ItemPeridotHoe(ToolMaterial mat) {
        super(mat);
        setCreativeTab(PeridotMC.PERIDOT_TAB);
    }
}
