package com.epiicthundercat.naturesgift.item;

import com.epiicthundercat.naturesgift.Misc.NGCreativeTabs;
import com.epiicthundercat.naturesgift.init.NGItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class NGItemFood extends ItemFood{

	public NGItemFood(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setRegistryName(name.toLowerCase());
		this.setUnlocalizedName(name.toLowerCase());
		this.setCreativeTab(NGCreativeTabs.NGFood);
		addToItems(this);
	}

	private void addToItems(Item item) {

	NGItems.items.add(item);
		
		
	}}
	