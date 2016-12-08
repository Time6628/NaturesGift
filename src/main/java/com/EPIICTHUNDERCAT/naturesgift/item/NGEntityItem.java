package com.epiicthundercat.naturesgift.item;

import com.epiicthundercat.naturesgift.Misc.NGCreativeTabs;
import com.epiicthundercat.naturesgift.init.NGItems;

import net.minecraft.item.Item;

public class NGEntityItem extends Item{
	
	public NGEntityItem(String name) {
		this.setRegistryName(name.toLowerCase());
		this.setUnlocalizedName(name.toLowerCase());
		this.setCreativeTab(NGCreativeTabs.NGSpecial);
		addToItems(this);
	}


	private void addToItems(Item item) {
		NGItems.items.add(item);
	}

}