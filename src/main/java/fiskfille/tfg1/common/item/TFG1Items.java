package fiskfille.tfg1.common.item;

import fiskfille.tf.common.item.armor.ItemTransformerArmor;
import fiskfille.tf.common.registry.TFItemRegistry;
import fiskfille.tfg1.common.item.armor.ItemOptimusPrimeArmor;
import fiskfille.tfg1.common.item.armor.ItemStarscreamArmor;

public class TFG1Items {
	public static ItemTransformerArmor optimusPrimeHelmet;
	public static ItemTransformerArmor optimusPrimeChestplate;
	public static ItemTransformerArmor optimusPrimeLeggings;
	public static ItemTransformerArmor optimusPrimeBoots;

	public static ItemTransformerArmor starscreamHelmet;
	public static ItemTransformerArmor starscreamChestplate;
	public static ItemTransformerArmor starscreamLeggings;
	public static ItemTransformerArmor starscreamBoots;

	public static void register() {
		optimusPrimeHelmet = new ItemOptimusPrimeArmor(0);
		optimusPrimeChestplate = new ItemOptimusPrimeArmor(1);
		optimusPrimeLeggings = new ItemOptimusPrimeArmor(2);
		optimusPrimeBoots = new ItemOptimusPrimeArmor(3);

		starscreamHelmet = new ItemStarscreamArmor(0);
		starscreamChestplate = new ItemStarscreamArmor(1);
		starscreamLeggings = new ItemStarscreamArmor(2);
		starscreamBoots = new ItemStarscreamArmor(3);

		TFItemRegistry.registerItem(optimusPrimeHelmet, "Optimus Prime Head");
		TFItemRegistry.registerItem(optimusPrimeChestplate, "Optimus Prime Torso");
		TFItemRegistry.registerItem(optimusPrimeLeggings, "Optimus Prime Legs");
		TFItemRegistry.registerItem(optimusPrimeBoots, "Optimus Prime Feet");

		TFItemRegistry.registerItem(starscreamHelmet, "Starscream Head");
		TFItemRegistry.registerItem(starscreamChestplate, "Starscream Torso");
		TFItemRegistry.registerItem(starscreamLeggings, "Starscream Legs");
		TFItemRegistry.registerItem(starscreamBoots, "Starscream Feet");
	}
}
