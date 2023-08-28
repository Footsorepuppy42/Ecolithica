
package net.mcreator.ecolithica.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AqualilyItemItem extends Item {
	public AqualilyItemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
