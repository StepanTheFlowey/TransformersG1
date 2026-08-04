package fiskfille.tfg1.common.transformer;

import fiskfille.tf.common.transformer.base.TransformerJet;
import fiskfille.tfg1.TFG1;
import fiskfille.tfg1.common.item.TFG1Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class TransformerStarscream extends TransformerJet {
	public TransformerStarscream() {
		super("Starscream");
	}

	@Override
	public Item getHelmet() {
		return TFG1Items.starscreamHelmet;
	}

	@Override
	public Item getChestplate() {
		return TFG1Items.starscreamChestplate;
	}

	@Override
	public Item getLeggings() {
		return TFG1Items.starscreamLeggings;
	}

	@Override
	public Item getBoots() {
		return TFG1Items.starscreamBoots;
	}

	@Override
	public boolean onJump(EntityPlayer player) {
		player.motionY += 0.2D;
		return true;
	}

	@Override
	public ResourceLocation getTransformationSound(int altMode) {
		return altMode == -1 ? TFG1.soundRobot : TFG1.soundVehicle;
	}
}
