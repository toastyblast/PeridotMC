package toastyblast.peridotmc.material;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import toastyblast.peridotmc.PeridotMC;

public class PeridotMaterials {
    public static final Item.ToolMaterial PERIDOT_TOOL = EnumHelper.addToolMaterial(PeridotMC.MODID + ".peridot", 3, 3122, 11.0f, 4f, 15);
    public static final ItemArmor.ArmorMaterial PERIDOT_ARMOR = EnumHelper.addArmorMaterial(PeridotMC.MODID + ":peridot_armor", PeridotMC.MODID + ":peridot", 38, new int[]{4, 6, 8, 4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0f);
}
