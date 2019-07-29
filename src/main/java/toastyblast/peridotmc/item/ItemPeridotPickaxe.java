package toastyblast.peridotmc.item;

import net.minecraft.item.ItemPickaxe;
import toastyblast.peridotmc.PeridotMC;

public class ItemPeridotPickaxe extends ItemPickaxe {
    public ItemPeridotPickaxe(ToolMaterial mat) {
        super(mat);
        setCreativeTab(PeridotMC.PERIDOT_TAB);
    }
}
