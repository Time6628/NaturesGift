package com.epiicthundercat.naturesgift.proxy;

import com.epiicthundercat.naturesgift.Misc.ParticleLeaf;
import com.epiicthundercat.naturesgift.init.NGBlocks;
import com.epiicthundercat.naturesgift.init.NGItems;
import com.epiicthundercat.naturesgift.ngmobs.entities.EntityAgaricShot;
import com.epiicthundercat.naturesgift.ngmobs.entities.EntityNatureBeam;
import com.epiicthundercat.naturesgift.ngmobs.render.RenderEntityAgaricShot;
import com.epiicthundercat.naturesgift.ngmobs.render.RenderEntityNatureBeam;
import com.epiicthundercat.naturesgift.util.NGEntityRegistry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	private static final Minecraft MC = Minecraft.getMinecraft();

	public void preInit(FMLPreInitializationEvent preEvent) {
		super.preInit(preEvent);
		NGEntityRegistry.initModels();

	}

	public void init(FMLInitializationEvent event) {
		super.init(event);

	}

	@Override
	public void registerRenders(FMLInitializationEvent event) {
		NGItems.registerRender(event);
		NGBlocks.registerRender(event);
	}

	public static void playSound(ISound sound) {
		MC.getSoundHandler().playSound(sound);
	}

	public static void stopSound(ISound sound) {
		MC.getSoundHandler().stopSound(sound);
	}

	@Override
	public void spawnParticleLeaf(World world, double x, double y, double z, double vx, double vy, double vz, double r,
			double g, double b) {
		ParticleLeaf particle = new ParticleLeaf(world, x, y, z, vx, vy, vz, r, g, b);
		Minecraft.getMinecraft().effectRenderer.addEffect(particle);

	}

	@Override
	public void registerEntities(FMLPreInitializationEvent preEvent) {
		super.registerEntities(preEvent);

		RenderingRegistry.registerEntityRenderingHandler(EntityNatureBeam.class,
				new IRenderFactory<EntityNatureBeam>() {
					@Override
					public RenderEntityNatureBeam createRenderFor(RenderManager manager) {
						return new RenderEntityNatureBeam(manager, NGItems.NATUREBEAM);
					}
				});

		RenderingRegistry.registerEntityRenderingHandler(EntityAgaricShot.class,
				new IRenderFactory<EntityAgaricShot>() {
					@Override
					public RenderEntityAgaricShot createRenderFor(RenderManager manager) {
						return new RenderEntityAgaricShot(manager, NGItems.AGARIC_SHOT);
					}
				});
	}

}
