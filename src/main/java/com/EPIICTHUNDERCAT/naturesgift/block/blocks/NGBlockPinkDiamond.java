package com.epiicthundercat.naturesgift.block.blocks;

import com.epiicthundercat.naturesgift.Misc.NGAchievement;
import com.epiicthundercat.naturesgift.block.NGBlock;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NGBlockPinkDiamond extends NGBlock {

	public NGBlockPinkDiamond(String name, Material material) {
		super(name, material);
		this.setHardness(3.0F);
	}

	@Override
	public void onBlockPlacedBy(final World w, final BlockPos coord, final IBlockState bs,
			final EntityLivingBase placer, final ItemStack src) {
		super.onBlockPlacedBy(w, coord, bs, placer, src);
		// Once Player Places
		if (placer instanceof EntityPlayer) {
			((EntityPlayer) placer).addStat(NGAchievement.SOPINK, 1);
		}
	}
	
}
