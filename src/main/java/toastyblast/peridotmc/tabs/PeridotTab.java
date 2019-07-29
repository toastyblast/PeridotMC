package toastyblast.peridotmc.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import toastyblast.peridotmc.PeridotMC;
import toastyblast.peridotmc.init.ModItems;

public class PeridotTab extends CreativeTabs {
    public PeridotTab() {
        super(PeridotMC.MODID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.PERIDOT);
    }
}
