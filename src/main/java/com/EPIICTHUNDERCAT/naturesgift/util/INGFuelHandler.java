package com.epiicthundercat.naturesgift.util;

import com.EPIICTHUNDERCAT.naturesgift.init.NGItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class INGFuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() == NGItems.HEAVY_BRANCH)
			return 800;
		else{
		return 0;
		}
	}

}
