package toastyblast.peridotmc;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public final class RegUtil {
    private RegUtil() { throw new UnsupportedOperationException(); }

    public static Item setItemName(Item item, String name) {
        return item.setRegistryName(PeridotMC.MODID, name).setUnlocalizedName(PeridotMC.MODID + "." + name);
    }

    public static Block setBlockName(Block block, String name) {
        return block.setRegistryName(name).setUnlocalizedName(PeridotMC.MODID + "." + name);
    }

    // ...
}
