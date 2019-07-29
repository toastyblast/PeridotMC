package toastyblast.peridotmc.item;

import net.minecraft.item.ItemSpade;
import toastyblast.peridotmc.PeridotMC;

public class ItemPeridotSpade extends ItemSpade {
    public ItemPeridotSpade(ToolMaterial mat) {
        super(mat);
        setCreativeTab(PeridotMC.PERIDOT_TAB);
    }
}
