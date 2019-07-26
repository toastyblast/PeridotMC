package toastyblast.firstmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import toastyblast.firstmod.FirstMod;

public class PeridotOre extends Block {
    public PeridotOre() {
        super(Material.ROCK);
        setCreativeTab(FirstMod.PERIDOT_TAB);
        setSoundType(SoundType.STONE);
        setHardness(6);
        setHarvestLevel("pickaxe", 3);
    }
}
