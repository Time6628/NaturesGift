package com.epiicthundercat.naturesgift.item.Tools;

import com.epiicthundercat.naturesgift.Misc.NGCreativeTabs;
import com.epiicthundercat.naturesgift.init.NGItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class NGNatureHoe extends ItemHoe{

	public NGNatureHoe(String name, ToolMaterial material) {
		super(material);
		setRegistryName(name.toLowerCase());
		setUnlocalizedName(name.toLowerCase());
		addToItems(this);
		this.setCreativeTab(NGCreativeTabs.NGTools);
	}
	

	private void addToItems(Item item) {

		NGItems.items.add(item);

	}
	

}
