
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rjsnaruto.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RjsNarutoModTabs {
	public static CreativeModeTab TAB_NARUTO_CARDS;
	public static CreativeModeTab TAB_NARUTO_ABILITIES;
	public static CreativeModeTab TAB_WEAPONS;
	public static CreativeModeTab TAB_BLOCKS;

	public static void load() {
		TAB_NARUTO_CARDS = new CreativeModeTab("tabnaruto_cards") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RjsNarutoModItems.TAB_ITEM_1.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_NARUTO_ABILITIES = new CreativeModeTab("tabnaruto_abilities") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RjsNarutoModItems.TAB.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_WEAPONS = new CreativeModeTab("tabweapons") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RjsNarutoModItems.KUBUKIRIBOCHO.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BLOCKS = new CreativeModeTab("tabblocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RjsNarutoModBlocks.UCHIHA_BLACK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
