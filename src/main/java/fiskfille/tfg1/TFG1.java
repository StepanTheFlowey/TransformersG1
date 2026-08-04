package fiskfille.tfg1;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fiskfille.tfg1.common.proxy.CommonProxy;
import net.minecraft.util.ResourceLocation;

@Mod(
				acceptedMinecraftVersions = "[1.7.10]",
				dependencies = "required-after:transformers@[0.7.6,)",
				modid = TFG1.MODID,
				name = "Transformers Mod: G1 Edition",
				version = Tags.VERSION
)
public class TFG1 {
	public static final ResourceLocation soundRobot = new ResourceLocation(TFG1.MODID, "transform_robot");
	public static final ResourceLocation soundVehicle = new ResourceLocation(TFG1.MODID, "transform_vehicle");
	public static final String MODID = "transformersg1";

	@SidedProxy(
					clientSide = "fiskfille.tfg1.common.proxy.ClientProxy",
					serverSide = "fiskfille.tfg1.common.proxy.CommonProxy"
	)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}
}
