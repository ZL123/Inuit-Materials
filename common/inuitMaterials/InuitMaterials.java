package inuitMaterials;

import inuitMaterials.block.ModBlocks;
import inuitMaterials.config.ConfigLoader;
import inuitMaterials.entity.ModEntities;
import inuitMaterials.inventory.CreativeTabIM;
import inuitMaterials.item.ModItems;
import inuitMaterials.lib.Reference;
import inuitMaterials.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER, dependencies = Reference.DEPENDENCIES)
public class InuitMaterials {
	
	@Instance(Reference.MOD_ID)
	public static InuitMaterials instance;
	
	@SidedProxy(clientSide = "inuitMaterials.proxy.ClientProxy", serverSide = "inuitMaterials.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs tabInuitMaterials = new CreativeTabIM("inuitMaterials");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ConfigLoader.init(event);
		
		ModBlocks.init();
		
		ModItems.init();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		proxy.doRendering();
		
		ModEntities.load();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		
	}
	
}
