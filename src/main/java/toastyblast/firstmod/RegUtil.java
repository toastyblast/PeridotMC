package toastyblast.firstmod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public final class RegUtil {
    private RegUtil() { throw new UnsupportedOperationException(); }

    public static Item setItemName(Item item, String name) {
        return item.setRegistryName(FirstMod.MODID, name).setUnlocalizedName(FirstMod.MODID + "." + name);
    }

    public static Block setBlockName(Block block, String name) {
        return block.setRegistryName(name).setUnlocalizedName(FirstMod.MODID + "." + name);
    }

    // ...
}
