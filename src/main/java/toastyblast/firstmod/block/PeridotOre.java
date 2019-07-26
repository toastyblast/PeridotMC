package toastyblast.firstmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import toastyblast.firstmod.FirstMod;

public class PeridotOre extends Block {
    public PeridotOre() {
        super(Material.ROCK);
        setSoundType(SoundType.STONE);
        // This sets the block only harvestable by using a diamond pickaxe (or better). Worse tools will cause nothing to be dropped.
        setHarvestLevel("pickaxe", 3);
        // Sets how long it takes for the block to be harvested by the tool that can harvest it. Worse tools will take longer, automatically calculated by Minecraft itself.
        setHardness(6);

        // Set it to be in our custom tab.
        setCreativeTab(FirstMod.PERIDOT_TAB);
        // Also add the ore to the creative Building Blocks tab. NOT POSSIBLE AS OF THIS VERSION OF MC (1.12.2)/FORGE!!!
//        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
