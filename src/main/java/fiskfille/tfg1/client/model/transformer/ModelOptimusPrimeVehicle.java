package fiskfille.tfg1.client.model.transformer;

import fiskfille.tf.client.model.tools.ModelRendererTF;
import fiskfille.tf.client.model.transformer.vehicle.ModelVehicleBase;
import fiskfille.tf.common.data.TFData;
import fiskfille.tf.common.tick.ClientTickHandler;
import fiskfille.tf.helper.TFHelper;
import fiskfille.tf.helper.TFRenderHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ModelOptimusPrimeVehicle extends ModelVehicleBase {
	final ModelRendererTF armConnector1;
	final ModelRendererTF armConnector2;
	final ModelRendererTF crotchPiece1;
	final ModelRendererTF crotchPiece2;
	final ModelRendererTF crotchPiece3;
	final ModelRendererTF elbowJoint1;
	final ModelRendererTF elbowJoint2;
	final ModelRendererTF footBase1;
	final ModelRendererTF footBase2;
	final ModelRendererTF grill;
	final ModelRendererTF hand1;
	final ModelRendererTF hand2;
	final ModelRendererTF leftLegIndent1;
	final ModelRendererTF leftLegIndent2;
	final ModelRendererTF leftLegIndentFrame1;
	final ModelRendererTF leftLegIndentFrame2;
	final ModelRendererTF leftLegIndentFrame3;
	final ModelRendererTF leftLegIndentFrame4;
	final ModelRendererTF leftLegIndentFrame5;
	final ModelRendererTF leftLegIndentFrame6;
	final ModelRendererTF leftLegVent1;
	final ModelRendererTF leftLegVent2;
	final ModelRendererTF leftLegVent3;
	final ModelRendererTF leftLegVent4;
	final ModelRendererTF leftLegVent5;
	final ModelRendererTF leftLegVent6;
	final ModelRendererTF leftLegVent7;
	final ModelRendererTF legPipe1;
	final ModelRendererTF legPipe2;
	final ModelRendererTF lowerArm1;
	final ModelRendererTF lowerArm2;
	final ModelRendererTF lowerFootExtension1;
	final ModelRendererTF lowerFootExtension2;
	final ModelRendererTF lowerLeg1;
	final ModelRendererTF lowerLeg2;
	final ModelRendererTF rightLegIndent1;
	final ModelRendererTF rightLegIndent2;
	final ModelRendererTF rightLegIndentFrame1;
	final ModelRendererTF rightLegIndentFrame2;
	final ModelRendererTF rightLegIndentFrame3;
	final ModelRendererTF rightLegIndentFrame4;
	final ModelRendererTF rightLegIndentFrame5;
	final ModelRendererTF rightLegIndentFrame6;
	final ModelRendererTF rightLegVent1;
	final ModelRendererTF rightLegVent2;
	final ModelRendererTF rightLegVent3;
	final ModelRendererTF rightLegVent4;
	final ModelRendererTF rightLegVent5;
	final ModelRendererTF rightLegVent6;
	final ModelRendererTF rightLegVent7;
	final ModelRendererTF smokeStack1;
	final ModelRendererTF smokeStack2;
	final ModelRendererTF toeBase1;
	final ModelRendererTF toeBase2;
	final ModelRendererTF toeExtension1;
	final ModelRendererTF toeExtension2;
	final ModelRendererTF torso;
	final ModelRendererTF torsoConnector;
	final ModelRendererTF torsoFront1;
	final ModelRendererTF torsoFront2;
	final ModelRendererTF torsoFrontUpper1;
	final ModelRendererTF torsoFrontUpper2;
	final ModelRendererTF torsoSide1;
	final ModelRendererTF torsoSide2;
	final ModelRendererTF torsoTop;
	final ModelRendererTF upperArm1;
	final ModelRendererTF upperArm2;
	final ModelRendererTF upperArmPiece1;
	final ModelRendererTF upperArmPiece2;
	final ModelRendererTF upperFootExtension1;
	final ModelRendererTF upperFootExtension2;
	final ModelRendererTF upperLeg1;
	final ModelRendererTF upperLeg2;
	final ModelRendererTF upperLegBack1;
	final ModelRendererTF upperLegBack2;
	final ModelRendererTF upperLegTile1;
	final ModelRendererTF upperLegTile2;
	final ModelRendererTF upperLights1;
	final ModelRendererTF upperLights2;
	final ModelRendererTF waist;
	final ModelRendererTF waistPanel1;
	final ModelRendererTF waistPanel2;
	final ModelRendererTF wheel1;
	final ModelRendererTF wheel2;
	final ModelRendererTF wheel3;
	final ModelRendererTF wheel4;
	final ModelRendererTF wheel5;
	final ModelRendererTF wheel6;
	final ModelRendererTF windshield1;
	final ModelRendererTF windshield2;

	public ModelOptimusPrimeVehicle() {
		textureWidth = 64;
		textureHeight = 128;

		torso = new ModelRendererTF(this, 24, 17);
		torso.setRotationPoint(0, -1.3F, 0);
		torso.addBox(-3.5F, -4, -2.7F, 7, 4, 5, 0);

		upperArm2 = new ModelRendererTF(this, 0, 20);
		upperArm2.mirror = true;
		upperArm2.setRotationPoint(0.9F, 0.2F, 0);
		upperArm2.addBox(0, -1.5F, -1.5F, 3, 4, 3, 0);

		wheel4 = new ModelRendererTF(this, 48, 0);
		wheel4.mirror = true;
		wheel4.setRotationPoint(0.9F, 3.3F, -0.4F);
		wheel4.addBox(0, -1.5F, -1.5F, 2, 3, 3, 0);

		rightLegIndentFrame5 = new ModelRendererTF(this, 0, 12);
		rightLegIndentFrame5.setRotationPoint(-1.5F, 6, -0.25F);
		rightLegIndentFrame5.addBox(-0.5F, -2, -1, 1, 5, 1, 0);

		torsoSide2 = new ModelRendererTF(this, 54, 2);
		torsoSide2.setRotationPoint(3.4F, -3, -2.3F);
		torsoSide2.addBox(-0.5F, -2, 0, 1, 4, 4, 0);

		torsoFrontUpper2 = new ModelRendererTF(this, 43, 17);
		torsoFrontUpper2.mirror = true;
		torsoFrontUpper2.setRotationPoint(-0.04F, -2.27F, -0.1F);
		torsoFrontUpper2.addBox(-2, -0.5F, -1, 4, 1, 1, 0);
		setRotateAngle(torsoFrontUpper2, 0.4363323129985824F, 0, -0.03490658503988659F);

		leftLegVent2 = new ModelRendererTF(this, 36, 14);
		leftLegVent2.mirror = true;
		leftLegVent2.setRotationPoint(0, -1.7F, -0.2F);
		leftLegVent2.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(leftLegVent2, 1.0471975511965976F, 0, 0);

		leftLegVent6 = new ModelRendererTF(this, 36, 14);
		leftLegVent6.mirror = true;
		leftLegVent6.setRotationPoint(0, -0.1F, -0.2F);
		leftLegVent6.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(leftLegVent6, 1.0471975511965976F, 0, 0);

		leftLegIndentFrame3 = new ModelRendererTF(this, 14, 13);
		leftLegIndentFrame3.setRotationPoint(1.5F, 2, 0.25F);
		leftLegIndentFrame3.addBox(-0.5F, -1, -1, 1, 3, 1, 0);

		lowerLeg1 = new ModelRendererTF(this, 0, 0);
		lowerLeg1.setRotationPoint(0.1F, 4.3F, -1.05F);
		lowerLeg1.addBox(-2, 0, -1.25F, 4, 9, 3, 0);

		legPipe1 = new ModelRendererTF(this, 32, 14);
		legPipe1.setRotationPoint(-1.9F, 0, 0);
		legPipe1.addBox(-1, -1, -0.5F, 1, 2, 1, 0);

		rightLegIndentFrame3 = new ModelRendererTF(this, 14, 13);
		rightLegIndentFrame3.mirror = true;
		rightLegIndentFrame3.setRotationPoint(1.5F, 2, 0.25F);
		rightLegIndentFrame3.addBox(-0.5F, -1, -1, 1, 3, 1, 0);

		rightLegIndent2 = new ModelRendererTF(this, 14, 7);
		rightLegIndent2.setRotationPoint(0, 5.9F, -0.05F);
		rightLegIndent2.addBox(-1, -2, -1, 2, 5, 1, 0);

		crotchPiece1 = new ModelRendererTF(this, 8, 28);
		crotchPiece1.setRotationPoint(0, -1.7F, -0.3F);
		crotchPiece1.addBox(-1, -3, -2, 2, 3, 4, 0);

		crotchPiece3 = new ModelRendererTF(this, 6, 27);
		crotchPiece3.setRotationPoint(0, 0.65F, -0.65F);
		crotchPiece3.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(crotchPiece3, -0.7853981633974483F, 0, 0);

		leftLegIndent2 = new ModelRendererTF(this, 14, 7);
		leftLegIndent2.mirror = true;
		leftLegIndent2.setRotationPoint(0, 5.9F, -0.05F);
		leftLegIndent2.addBox(-1, -2, -1, 2, 5, 1, 0);

		upperArmPiece1 = new ModelRendererTF(this, 17, 32);
		upperArmPiece1.setRotationPoint(-2.5F, 2.51F, -0.31F);
		upperArmPiece1.addBox(-0.5F, 0, -1.5F, 1, 1, 3, 0);
		setRotateAngle(upperArmPiece1, 0.593411945678072F, 0, 0);

		torsoSide1 = new ModelRendererTF(this, 54, 2);
		torsoSide1.setRotationPoint(-3.4F, -3, -2.3F);
		torsoSide1.addBox(-0.5F, -2, 0, 1, 4, 4, 0);

		upperFootExtension2 = new ModelRendererTF(this, 0, 18);
		upperFootExtension2.mirror = true;
		upperFootExtension2.setRotationPoint(0, -0.54F, 0.85F);
		upperFootExtension2.addBox(-2, -1, -1, 4, 1, 1, 0);
		setRotateAngle(upperFootExtension2, 0.45378560551852565F, 0, 0);

		windshield2 = new ModelRendererTF(this, 40, 8);
		windshield2.mirror = true;
		windshield2.setRotationPoint(0, 0, -0.15F);
		windshield2.addBox(-1.5F, -1.5F, -1, 3, 3, 1, 0);

		upperArm1 = new ModelRendererTF(this, 0, 20);
		upperArm1.setRotationPoint(-0.9F, 0.2F, 0);
		upperArm1.addBox(-3, -1.5F, -1.5F, 3, 4, 3, 0);

		legPipe2 = new ModelRendererTF(this, 32, 14);
		legPipe2.mirror = true;
		legPipe2.setRotationPoint(1.9F, 0, 0);
		legPipe2.addBox(0, -1, -0.5F, 1, 2, 1, 0);

		leftLegVent7 = new ModelRendererTF(this, 36, 14);
		leftLegVent7.mirror = true;
		leftLegVent7.setRotationPoint(0, 0.3F, -0.2F);
		leftLegVent7.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(leftLegVent7, 1.0471975511965976F, 0, 0);

		upperLegBack1 = new ModelRendererTF(this, 24, 0);
		upperLegBack1.setRotationPoint(0, 2.5F, -0.5F);
		upperLegBack1.addBox(-1, -2.5F, 0, 2, 5, 1, 0);

		leftLegIndentFrame6 = new ModelRendererTF(this, 0, 12);
		leftLegIndentFrame6.setRotationPoint(1.5F, 6, -0.25F);
		leftLegIndentFrame6.addBox(-0.5F, -2, -1, 1, 5, 1, 0);

		hand2 = new ModelRendererTF(this, 0, 31);
		hand2.mirror = true;
		hand2.setRotationPoint(0, 2.7F, 0);
		hand2.addBox(-1, 0, -1, 2, 2, 2, 0);

		rightLegIndent1 = new ModelRendererTF(this, 20, 7);
		rightLegIndent1.setRotationPoint(0, 3, 0.35F);
		rightLegIndent1.addBox(-1, -2, -1, 2, 3, 1, 0);

		rightLegVent2 = new ModelRendererTF(this, 36, 14);
		rightLegVent2.setRotationPoint(0, -1.7F, -0.2F);
		rightLegVent2.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(rightLegVent2, 1.0471975511965976F, 0, 0);

		lowerLeg2 = new ModelRendererTF(this, 0, 0);
		lowerLeg2.mirror = true;
		lowerLeg2.setRotationPoint(-0.1F, 4.3F, -1.05F);
		lowerLeg2.addBox(-2, 0, -1.25F, 4, 9, 3, 0);

		hand1 = new ModelRendererTF(this, 0, 31);
		hand1.setRotationPoint(0, 2.7F, 0);
		hand1.addBox(-1, 0, -1, 2, 2, 2, 0);

		elbowJoint2 = new ModelRendererTF(this, 0, 27);
		elbowJoint2.mirror = true;
		elbowJoint2.setRotationPoint(1.5F, 0.4F, 0);
		elbowJoint2.addBox(-1, 0, -1, 2, 2, 2, 0);

		torsoFrontUpper1 = new ModelRendererTF(this, 43, 17);
		torsoFrontUpper1.setRotationPoint(0.05F, -2.27F, -0.1F);
		torsoFrontUpper1.addBox(-2, -0.5F, -1, 4, 1, 1, 0);
		setRotateAngle(torsoFrontUpper1, 0.4363323129985824F, 0, 0.03490658503988659F);

		upperLeg2 = new ModelRendererTF(this, 14, 0);
		upperLeg2.mirror = true;
		upperLeg2.setRotationPoint(2, -2, -1);
		upperLeg2.addBox(-1.5F, 0, -1.5F, 3, 5, 2, 0);
		setRotateAngle(upperLeg2, 1.5707963267948966F, 0, 0);

		waistPanel2 = new ModelRendererTF(this, 24, 14);
		waistPanel2.mirror = true;
		waistPanel2.setRotationPoint(2.3F, -0.8F, -2.08F);
		waistPanel2.addBox(-1.2F, -1, -1, 3, 2, 1, 0);
		setRotateAngle(waistPanel2, 0, -0.08726646259971647F, 0);

		rightLegIndentFrame1 = new ModelRendererTF(this, 4, 12);
		rightLegIndentFrame1.setRotationPoint(0, 0.5F, 0.25F);
		rightLegIndentFrame1.addBox(-2, -0.5F, -1, 4, 1, 1, 0);

		rightLegVent4 = new ModelRendererTF(this, 36, 14);
		rightLegVent4.setRotationPoint(0, -0.9F, -0.2F);
		rightLegVent4.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(rightLegVent4, 1.0471975511965976F, 0, 0);

		torsoConnector = new ModelRendererTF(this, 22, 8);
		torsoConnector.setRotationPoint(0, -2.3F, 0);
		torsoConnector.addBox(-3.5F, -2, -2, 7, 2, 4, 0);

		leftLegVent1 = new ModelRendererTF(this, 36, 14);
		leftLegVent1.mirror = true;
		leftLegVent1.setRotationPoint(0, -2.1F, -0.2F);
		leftLegVent1.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(leftLegVent1, 1.0471975511965976F, 0, 0);

		leftLegVent5 = new ModelRendererTF(this, 36, 14);
		leftLegVent5.mirror = true;
		leftLegVent5.setRotationPoint(0, -0.5F, -0.2F);
		leftLegVent5.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(leftLegVent5, 1.0471975511965976F, 0, 0);

		waistPanel1 = new ModelRendererTF(this, 24, 14);
		waistPanel1.setRotationPoint(-2.3F, -0.8F, -2.08F);
		waistPanel1.addBox(-1.8F, -1, -1, 3, 2, 1, 0);
		setRotateAngle(waistPanel1, 0, 0.08726646259971647F, 0);

		wheel5 = new ModelRendererTF(this, 48, 0);
		wheel5.setRotationPoint(-0.9F, 6.9F, -0.4F);
		wheel5.addBox(-2, -1.5F, -1.5F, 2, 3, 3, 0);

		leftLegVent4 = new ModelRendererTF(this, 36, 14);
		leftLegVent4.mirror = true;
		leftLegVent4.setRotationPoint(0, -0.9F, -0.2F);
		leftLegVent4.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(leftLegVent4, 1.0471975511965976F, 0, 0);

		rightLegIndentFrame6 = new ModelRendererTF(this, 0, 12);
		rightLegIndentFrame6.mirror = true;
		rightLegIndentFrame6.setRotationPoint(1.5F, 6, -0.25F);
		rightLegIndentFrame6.addBox(-0.5F, -2, -1, 1, 5, 1, 0);

		upperLegTile2 = new ModelRendererTF(this, 18, 14);
		upperLegTile2.mirror = true;
		upperLegTile2.setRotationPoint(0, 5, -1.3F);
		upperLegTile2.addBox(-1, -2, -0.5F, 2, 2, 1, 0);
		setRotateAngle(upperLegTile2, -0.08726646259971647F, 0.0017453292519943296F, 0);

		toeExtension2 = new ModelRendererTF(this, 18, 17);
		toeExtension2.mirror = true;
		toeExtension2.setRotationPoint(0, -0.04F, 0.35F);
		toeExtension2.addBox(-1.5F, -1, -1, 3, 1, 2, 0);
		setRotateAngle(toeExtension2, 0.45378560551852565F, 0, 0);

		elbowJoint1 = new ModelRendererTF(this, 0, 27);
		elbowJoint1.setRotationPoint(-1.5F, 0.4F, 0);
		elbowJoint1.addBox(-1, 0, -1, 2, 2, 2, 0);

		lowerFootExtension2 = new ModelRendererTF(this, 4, 16);
		lowerFootExtension2.mirror = true;
		lowerFootExtension2.setRotationPoint(0, -0.1F, -0.5F);
		lowerFootExtension2.addBox(-2, -1, -0.5F, 4, 1, 1, 0);

		torsoFront1 = new ModelRendererTF(this, 44, 12);
		torsoFront1.setRotationPoint(-1.79F, -2.2F, -2);
		torsoFront1.addBox(-2, -2, -1, 4, 4, 1, 0);
		setRotateAngle(torsoFront1, 0, 0.17453292519943295F, 0);

		rightLegVent6 = new ModelRendererTF(this, 36, 14);
		rightLegVent6.setRotationPoint(0, -0.1F, -0.2F);
		rightLegVent6.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(rightLegVent6, 1.0471975511965976F, 0, 0);

		leftLegIndentFrame2 = new ModelRendererTF(this, 14, 13);
		leftLegIndentFrame2.mirror = true;
		leftLegIndentFrame2.setRotationPoint(-1.5F, 2, 0.25F);
		leftLegIndentFrame2.addBox(-0.5F, -1, -1, 1, 3, 1, 0);

		wheel1 = new ModelRendererTF(this, 48, 0);
		wheel1.setRotationPoint(-2.8F, -0.6F, 0);
		wheel1.addBox(-2, -1.5F, -1.5F, 2, 3, 3, 0);

		leftLegIndentFrame1 = new ModelRendererTF(this, 4, 12);
		leftLegIndentFrame1.mirror = true;
		leftLegIndentFrame1.setRotationPoint(0, 0.5F, 0.25F);
		leftLegIndentFrame1.addBox(-2, -0.5F, -1, 4, 1, 1, 0);

		armConnector1 = new ModelRendererTF(this, 23, 26);
		armConnector1.setRotationPoint(0, -3.7F, 2);
		armConnector1.addBox(-1, -1, -1, 1, 3, 2, 0);

		lowerFootExtension1 = new ModelRendererTF(this, 4, 16);
		lowerFootExtension1.setRotationPoint(0, -0.1F, -0.5F);
		lowerFootExtension1.addBox(-2, -1, -0.5F, 4, 1, 1, 0);

		smokeStack2 = new ModelRendererTF(this, 48, 6);
		smokeStack2.mirror = true;
		smokeStack2.setRotationPoint(2.4F, -1, -1);
		smokeStack2.addBox(0, -3, -0.5F, 1, 5, 1, 0);

		lowerArm1 = new ModelRendererTF(this, 12, 20);
		lowerArm1.setRotationPoint(0, 3.6F, 0.3F);
		lowerArm1.addBox(-1.5F, 0, -1.5F, 3, 5, 3, 0);
		setRotateAngle(lowerArm1, -1.5707963267948966F, 0, 0);

		wheel6 = new ModelRendererTF(this, 48, 0);
		wheel6.mirror = true;
		wheel6.setRotationPoint(0.9F, 6.9F, -0.4F);
		wheel6.addBox(0, -1.5F, -1.5F, 2, 3, 3, 0);

		armConnector2 = new ModelRendererTF(this, 23, 26);
		armConnector2.mirror = true;
		armConnector2.setRotationPoint(0, -3.7F, 2);
		armConnector2.addBox(0, -1, -1, 1, 3, 2, 0);

		toeBase1 = new ModelRendererTF(this, 10, 18);
		toeBase1.setRotationPoint(0, 0, -0.8F);
		toeBase1.addBox(-1.5F, -0.5F, -1, 3, 1, 1, 0);

		upperLegBack2 = new ModelRendererTF(this, 24, 0);
		upperLegBack2.setRotationPoint(0, 2.5F, -0.5F);
		upperLegBack2.addBox(-1, -2.5F, 0, 2, 5, 1, 0);

		rightLegVent5 = new ModelRendererTF(this, 36, 14);
		rightLegVent5.setRotationPoint(0, -0.5F, -0.2F);
		rightLegVent5.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(rightLegVent5, 1.0471975511965976F, 0, 0);

		toeExtension1 = new ModelRendererTF(this, 18, 17);
		toeExtension1.setRotationPoint(0, -0.04F, 0.35F);
		toeExtension1.addBox(-1.5F, -1, -1, 3, 1, 2, 0);
		setRotateAngle(toeExtension1, 0.45378560551852565F, 0, 0);

		rightLegVent3 = new ModelRendererTF(this, 36, 14);
		rightLegVent3.setRotationPoint(0, -1.3F, -0.2F);
		rightLegVent3.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(rightLegVent3, 1.0471975511965976F, 0, 0);

		upperFootExtension1 = new ModelRendererTF(this, 0, 18);
		upperFootExtension1.setRotationPoint(0, -0.54F, 0.85F);
		upperFootExtension1.addBox(-2, -1, -1, 4, 1, 1, 0);
		setRotateAngle(upperFootExtension1, 0.45378560551852565F, 0, 0);

		windshield1 = new ModelRendererTF(this, 40, 8);
		windshield1.setRotationPoint(0, 0, -0.15F);
		windshield1.addBox(-1.5F, -1.5F, -1, 3, 3, 1, 0);

		rightLegIndentFrame4 = new ModelRendererTF(this, 4, 14);
		rightLegIndentFrame4.setRotationPoint(0, 4.34F, -0.89F);
		rightLegIndentFrame4.addBox(-2, -1, -0.5F, 4, 1, 1, 0);
		setRotateAngle(rightLegIndentFrame4, -0.7504915783575618F, 0, 0);

		leftLegIndent1 = new ModelRendererTF(this, 20, 7);
		leftLegIndent1.mirror = true;
		leftLegIndent1.setRotationPoint(0, 3, 0.35F);
		leftLegIndent1.addBox(-1, -2, -1, 2, 3, 1, 0);

		rightLegVent1 = new ModelRendererTF(this, 36, 14);
		rightLegVent1.setRotationPoint(0, -2.1F, -0.2F);
		rightLegVent1.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(rightLegVent1, 1.0471975511965976F, 0, 0);

		crotchPiece2 = new ModelRendererTF(this, 16, 28);
		crotchPiece2.setRotationPoint(0, -0.3F, 0);
		crotchPiece2.addBox(-1, 0, -1, 2, 1, 3, 0);

		grill = new ModelRendererTF(this, 29, 26);
		grill.setRotationPoint(0, -1.8F, -2.2F);
		grill.addBox(-1.5F, -2, -1, 3, 4, 1, 0);

		wheel2 = new ModelRendererTF(this, 48, 0);
		wheel2.mirror = true;
		wheel2.setRotationPoint(2.8F, -0.6F, 0);
		wheel2.addBox(0, -1.5F, -1.5F, 2, 3, 3, 0);

		footBase1 = new ModelRendererTF(this, 4, 16);
		footBase1.setRotationPoint(0, 2.5F, -0.9F);
		footBase1.addBox(-2, -0.5F, -1, 4, 1, 1, 0);
		setRotateAngle(footBase1, -1.5707963267948966F, 0, 0);

		upperLights2 = new ModelRendererTF(this, 43, 19);
		upperLights2.mirror = true;
		upperLights2.setRotationPoint(0.5F, 0.2F, -0.3F);
		upperLights2.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(upperLights2, -0.6632251157578453F, 0, 0);

		toeBase2 = new ModelRendererTF(this, 10, 18);
		toeBase2.mirror = true;
		toeBase2.setRotationPoint(0, 0, -0.8F);
		toeBase2.addBox(-1.5F, -0.5F, -1, 3, 1, 1, 0);

		torsoFront2 = new ModelRendererTF(this, 44, 12);
		torsoFront2.mirror = true;
		torsoFront2.setRotationPoint(1.79F, -2.2F, -2);
		torsoFront2.addBox(-2, -2, -1, 4, 4, 1, 0);
		setRotateAngle(torsoFront2, 0, -0.17453292519943295F, 0);

		leftLegIndentFrame4 = new ModelRendererTF(this, 4, 14);
		leftLegIndentFrame4.mirror = true;
		leftLegIndentFrame4.setRotationPoint(0, 4.34F, -0.89F);
		leftLegIndentFrame4.addBox(-2, -1, -0.5F, 4, 1, 1, 0);
		setRotateAngle(leftLegIndentFrame4, -0.7504915783575618F, 0, 0);

		upperLeg1 = new ModelRendererTF(this, 14, 0);
		upperLeg1.setRotationPoint(-2, -2, -1);
		upperLeg1.addBox(-1.5F, 0, -1.5F, 3, 5, 2, 0);
		setRotateAngle(upperLeg1, 1.5707963267948966F, 0, 0);

		smokeStack1 = new ModelRendererTF(this, 48, 6);
		smokeStack1.setRotationPoint(-2.4F, -1, -1);
		smokeStack1.addBox(-1, -3, -0.5F, 1, 5, 1, 0);

		upperLights1 = new ModelRendererTF(this, 43, 19);
		upperLights1.setRotationPoint(-0.5F, 0.2F, -0.3F);
		upperLights1.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(upperLights1, -0.6632251157578453F, 0, 0);

		lowerArm2 = new ModelRendererTF(this, 12, 20);
		lowerArm2.mirror = true;
		lowerArm2.setRotationPoint(0, 3.6F, 0.3F);
		lowerArm2.addBox(-1.5F, 0, -1.5F, 3, 5, 3, 0);
		setRotateAngle(lowerArm2, -1.5707963267948966F, 0, 0);

		footBase2 = new ModelRendererTF(this, 4, 16);
		footBase2.mirror = true;
		footBase2.setRotationPoint(0, 2.5F, -0.9F);
		footBase2.addBox(-2, -0.5F, -1, 4, 1, 1, 0);
		setRotateAngle(footBase2, -1.5707963267948966F, 0, 0);

		rightLegIndentFrame2 = new ModelRendererTF(this, 14, 13);
		rightLegIndentFrame2.setRotationPoint(-1.5F, 2, 0.25F);
		rightLegIndentFrame2.addBox(-0.5F, -1, -1, 1, 3, 1, 0);

		leftLegVent3 = new ModelRendererTF(this, 36, 14);
		leftLegVent3.mirror = true;
		leftLegVent3.setRotationPoint(0, -1.3F, -0.2F);
		leftLegVent3.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(leftLegVent3, 1.0471975511965976F, 0, 0);

		rightLegVent7 = new ModelRendererTF(this, 36, 14);
		rightLegVent7.setRotationPoint(0, 0.3F, -0.2F);
		rightLegVent7.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
		setRotateAngle(rightLegVent7, 1.0471975511965976F, 0, 0);

		upperLegTile1 = new ModelRendererTF(this, 18, 14);
		upperLegTile1.setRotationPoint(0, 5, -1.3F);
		upperLegTile1.addBox(-1, -2, -0.5F, 2, 2, 1, 0);
		setRotateAngle(upperLegTile1, -0.08726646259971647F, 0.0017453292519943296F, 0);

		waist = new ModelRendererTF(this, 30, 0);
		waist.setRotationPoint(0, 23.1F, -4.6F);
		waist.addBox(-3, -5, -1.5F, 6, 5, 3, 0);

		torsoTop = new ModelRendererTF(this, 32, 26);
		torsoTop.setRotationPoint(0, -4.5F, 2.3F);
		torsoTop.addBox(-3.5F, -0.5F, -5, 7, 3, 5, 0);

		leftLegIndentFrame5 = new ModelRendererTF(this, 0, 12);
		leftLegIndentFrame5.mirror = true;
		leftLegIndentFrame5.setRotationPoint(-1.5F, 6, -0.25F);
		leftLegIndentFrame5.addBox(-0.5F, -2, -1, 1, 5, 1, 0);

		upperArmPiece2 = new ModelRendererTF(this, 17, 32);
		upperArmPiece2.mirror = true;
		upperArmPiece2.setRotationPoint(2.5F, 2.51F, -0.31F);
		upperArmPiece2.addBox(-0.5F, 0, -1.5F, 1, 1, 3, 0);
		setRotateAngle(upperArmPiece2, 0.593411945678072F, 0, 0);

		wheel3 = new ModelRendererTF(this, 48, 0);
		wheel3.setRotationPoint(-0.9F, 3.3F, -0.4F);
		wheel3.addBox(-2, -1.5F, -1.5F, 2, 3, 3, 0);

		torsoConnector.addChild(torso);
		armConnector2.addChild(upperArm2);
		lowerLeg2.addChild(wheel4);
		lowerLeg1.addChild(rightLegIndentFrame5);
		torso.addChild(torsoSide2);
		torsoFront2.addChild(torsoFrontUpper2);
		leftLegIndent2.addChild(leftLegVent2);
		leftLegIndent2.addChild(leftLegVent6);
		lowerLeg2.addChild(leftLegIndentFrame3);
		upperLeg1.addChild(lowerLeg1);
		lowerLeg1.addChild(legPipe1);
		lowerLeg1.addChild(rightLegIndentFrame3);
		lowerLeg1.addChild(rightLegIndent2);
		waist.addChild(crotchPiece1);
		crotchPiece2.addChild(crotchPiece3);
		lowerLeg2.addChild(leftLegIndent2);
		upperArm1.addChild(upperArmPiece1);
		torso.addChild(torsoSide1);
		lowerFootExtension2.addChild(upperFootExtension2);
		torsoFront2.addChild(windshield2);
		armConnector1.addChild(upperArm1);
		lowerLeg2.addChild(legPipe2);
		leftLegIndent2.addChild(leftLegVent7);
		upperLeg1.addChild(upperLegBack1);
		lowerLeg2.addChild(leftLegIndentFrame6);
		lowerArm2.addChild(hand2);
		lowerLeg1.addChild(rightLegIndent1);
		rightLegIndent2.addChild(rightLegVent2);
		upperLeg2.addChild(lowerLeg2);
		lowerArm1.addChild(hand1);
		upperArm2.addChild(elbowJoint2);
		torsoFront1.addChild(torsoFrontUpper1);
		waist.addChild(upperLeg2);
		waist.addChild(waistPanel2);
		lowerLeg1.addChild(rightLegIndentFrame1);
		rightLegIndent2.addChild(rightLegVent4);
		waist.addChild(torsoConnector);
		leftLegIndent2.addChild(leftLegVent1);
		leftLegIndent2.addChild(leftLegVent5);
		waist.addChild(waistPanel1);
		lowerLeg1.addChild(wheel5);
		leftLegIndent2.addChild(leftLegVent4);
		lowerLeg1.addChild(rightLegIndentFrame6);
		upperLeg2.addChild(upperLegTile2);
		toeBase2.addChild(toeExtension2);
		upperArm1.addChild(elbowJoint1);
		footBase2.addChild(lowerFootExtension2);
		torso.addChild(torsoFront1);
		rightLegIndent2.addChild(rightLegVent6);
		lowerLeg2.addChild(leftLegIndentFrame2);
		waist.addChild(wheel1);
		lowerLeg2.addChild(leftLegIndentFrame1);
		torso.addChild(armConnector1);
		footBase1.addChild(lowerFootExtension1);
		upperArm2.addChild(smokeStack2);
		elbowJoint1.addChild(lowerArm1);
		lowerLeg2.addChild(wheel6);
		torso.addChild(armConnector2);
		footBase1.addChild(toeBase1);
		upperLeg2.addChild(upperLegBack2);
		rightLegIndent2.addChild(rightLegVent5);
		toeBase1.addChild(toeExtension1);
		rightLegIndent2.addChild(rightLegVent3);
		lowerFootExtension1.addChild(upperFootExtension1);
		torsoFront1.addChild(windshield1);
		lowerLeg1.addChild(rightLegIndentFrame4);
		lowerLeg2.addChild(leftLegIndent1);
		rightLegIndent2.addChild(rightLegVent1);
		crotchPiece1.addChild(crotchPiece2);
		waist.addChild(grill);
		waist.addChild(wheel2);
		rightLegIndent2.addChild(footBase1);
		torsoFrontUpper2.addChild(upperLights2);
		footBase2.addChild(toeBase2);
		torso.addChild(torsoFront2);
		lowerLeg2.addChild(leftLegIndentFrame4);
		waist.addChild(upperLeg1);
		upperArm1.addChild(smokeStack1);
		torsoFrontUpper1.addChild(upperLights1);
		elbowJoint2.addChild(lowerArm2);
		leftLegIndent2.addChild(footBase2);
		lowerLeg1.addChild(rightLegIndentFrame2);
		leftLegIndent2.addChild(leftLegVent3);
		rightLegIndent2.addChild(rightLegVent7);
		upperLeg1.addChild(upperLegTile1);
		torso.addChild(torsoTop);
		lowerLeg2.addChild(leftLegIndentFrame5);
		upperArm2.addChild(upperArmPiece2);
		lowerLeg1.addChild(wheel3);

		for(final ModelRendererTF modelRenderer : new ModelRendererTF[]{wheel1, wheel2, wheel3, wheel4, wheel5, wheel6}) {
			modelRenderer.setScale(0.9F, 0.9F, 0.9F);
		}

		setInitPose();
	}

	@Override
	public void render(ItemStack itemstack) {
		TFRenderHelper.setupRenderLayers(itemstack, waist);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, float scale, Entity entity) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ticks, rotationYaw, rotationPitch, scale, entity);
		setToInitPose();

		if(entity instanceof EntityPlayer) {
			final EntityPlayer player = (EntityPlayer) entity;
			final float wheelSpinSpeed = (TFData.FORWARD_VELOCITY.get(player) < 0 ? -limbSwing : limbSwing) * 0.8F;

			for(final ModelRenderer modelRenderer : new ModelRenderer[]{wheel1, wheel2, wheel3, wheel4, wheel5, wheel6}) {
				modelRenderer.rotateAngleX = wheelSpinSpeed % ((float) Math.PI);
			}

			waist.rotateAngleX = -(float) (TFRenderHelper.getMotionY(player) + (player == Minecraft.getMinecraft().thePlayer && player.onGround ? 0.0784000015258789 : 0));
			waist.rotateAngleY = -(float) Math.toRadians(TFHelper.median(player.renderYawOffset - player.rotationYaw, player.prevRenderYawOffset - player.prevRotationYaw, ClientTickHandler.renderTick));
		}
	}
}
