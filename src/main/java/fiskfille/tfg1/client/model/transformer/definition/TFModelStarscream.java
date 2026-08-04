package fiskfille.tfg1.client.model.transformer.definition;

import fiskfille.tf.client.model.tools.ModelRendererTF;
import fiskfille.tf.client.model.transformer.ModelTransformerBase;
import fiskfille.tf.client.model.transformer.definition.TransformerModel;
import fiskfille.tf.client.model.transformer.vehicle.ModelVehicleBase;
import fiskfille.tfg1.TFG1;
import fiskfille.tfg1.client.model.transformer.ModelStarscream;
import fiskfille.tfg1.client.model.transformer.ModelStarscreamVehicle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nonnull;

public class TFModelStarscream extends TransformerModel {
	private final ModelStarscream model = new ModelStarscream();
	private final ModelStarscream modelItem = new ModelStarscream();
	private final ModelStarscreamVehicle vehicle = new ModelStarscreamVehicle();

	@Override
	public ModelTransformerBase getMainModel() {
		return model;
	}

	@Override
	@Nonnull
	public ModelVehicleBase getVehicleModel() {
		return vehicle;
	}

	@Override
	public ModelRendererTF[] getFeet() {
		return new ModelRendererTF[]{model.footBase1, model.footBase2};
	}

	@Override
	public ModelRendererTF[] getLegs() {
		return new ModelRendererTF[]{model.upperLeg1, model.upperLeg2};
	}

	@Override
	public ModelRendererTF getLowerArm() {
		return model.rightArm3;
	}

	@Override
	public ModelRendererTF getUpperArm() {
		return model.rightArm1;
	}

	@Override
	public ModelRendererTF getBody() {
		return model.torso;
	}

	@Override
	public ModelRendererTF getHead() {
		return model.head;
	}

	@Override
	public float getFootHeight() {
		return 1.25F;
	}

	@Override
	public void renderItem(EntityPlayer player, ItemStack stack) {
		GL11.glTranslatef(0.1F, -0.05F, 0.05F);
	}

	@Override
	public void renderCape(EntityPlayer player) {
		GL11.glTranslatef(0.18F, 0, -0.01F);
	}

	@Override
	public void renderFirstPersonArm(EntityPlayer player) {
		GL11.glTranslatef(0, -0.05F, 0.15F);
	}

	@Override
	public ResourceLocation getTexture(Entity entity, String suffix) {
		return new ResourceLocation(TFG1.MODID, String.format("textures/models/starscream/starscream%s.png", suffix));
	}

	@Override
	public ModelTransformerBase getItemInventoryModel() {
		return modelItem;
	}
}
