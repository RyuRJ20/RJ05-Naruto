
package net.mcreator.rjsnaruto.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TabItem1Item extends Item {
	public TabItem1Item() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}
}
