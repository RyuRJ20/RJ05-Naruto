
package net.mcreator.rjsnaruto.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.rjsnaruto.init.RjsNarutoModTabs;

public class NarutoCard11Item extends Item {
	public NarutoCard11Item() {
		super(new Item.Properties().tab(RjsNarutoModTabs.TAB_NARUTO_CARDS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
