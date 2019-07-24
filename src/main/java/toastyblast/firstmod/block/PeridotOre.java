package toastyblast.firstmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PeridotOre extends Block {
    public PeridotOre() {
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setSoundType(SoundType.STONE);
        setHardness(6);
        setHarvestLevel("pickaxe", 3);
    }
}
