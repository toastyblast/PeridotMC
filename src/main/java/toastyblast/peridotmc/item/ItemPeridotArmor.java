package toastyblast.peridotmc.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import toastyblast.peridotmc.PeridotMC;

public class ItemPeridotArmor extends ItemArmor {
    public ItemPeridotArmor(ArmorMaterial mat, EntityEquipmentSlot eqpSlot) {
        super (mat, 0, eqpSlot);
        setCreativeTab(PeridotMC.PERIDOT_TAB);
    }
}
