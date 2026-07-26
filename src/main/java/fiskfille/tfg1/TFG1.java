package fiskfille.tfg1;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fiskfille.tfg1.common.proxy.CommonProxy;

@Mod(
				acceptedMinecraftVersions = "[1.7.10]",
				dependencies = "required-after:transformers@[0.7.0,)",
				modid = TFG1.MODID,
				name = TFG1.name,
				version = Tags.VERSION
)
public class TFG1 {
	public static final String MODID = "transformersg1";
	public static final String name = "Transformers Mod: G1 Edition";

	@SidedProxy(
					clientSide = "fiskfille.tfg1.common.proxy.ClientProxy",
					serverSide = "fiskfille.tfg1.common.proxy.CommonProxy"
	)
	public static CommonProxy proxy;

	@Instance(TFG1.MODID)
	public static TFG1 instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}
}
