package fiskfille.tfg1.common.transformer;

import fiskfille.tf.common.motion.TFMotionManager;
import fiskfille.tf.common.transformer.base.TransformerTruck;
import fiskfille.tf.helper.TFVectorHelper;
import fiskfille.tfg1.TFG1;
import fiskfille.tfg1.common.item.TFG1Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;

import java.util.concurrent.ThreadLocalRandom;

public class TransformerOptimusPrime extends TransformerTruck {
	public TransformerOptimusPrime() {
		super("Optimus Prime");
	}

	@Override
	public Item getHelmet() {
		return TFG1Items.optimusPrimeHelmet;
	}

	@Override
	public Item getChestplate() {
		return TFG1Items.optimusPrimeChestplate;
	}

	@Override
	public Item getLeggings() {
		return TFG1Items.optimusPrimeLeggings;
	}

	@Override
	public Item getBoots() {
		return TFG1Items.optimusPrimeBoots;
	}

	@Override
	public boolean hasStealthForce() {
		return false;
	}

	@Override
	public void updateMovement(EntityPlayer player) {
		TFMotionManager.motion(player, 40, 60, 0, 30, false, true, false);
	}

	@Override
	public float getHeightOffset() {
		return -0.1F;
	}

	@Override
	public boolean onJump(EntityPlayer player) {
		player.motionY += 0.225D;
		return true;
	}

	@Override
	public void doNitroParticles(EntityPlayer player) {
		final ThreadLocalRandom random = ThreadLocalRandom.current();

		for(int i = 0; i < 4; ++i) {
			final Vec3 side = TFVectorHelper.getBackSideCoords(player, 0.225, i < 2, -0.3, false);
			player.worldObj.spawnParticle(
							"smoke",
							side.xCoord,
							side.yCoord + 0.825F,
							side.zCoord,
							(random.nextFloat() - 0.5F) / 10F,
							(random.nextFloat() - 0.5F) / 10F + 0.05F,
							(random.nextFloat() - 0.5F) / 10F
			);
		}
	}

	@Override
	public ResourceLocation getTransformationSound(int altMode) {
		return altMode == -1 ? TFG1.soundRobot : TFG1.soundVehicle;
	}
}
