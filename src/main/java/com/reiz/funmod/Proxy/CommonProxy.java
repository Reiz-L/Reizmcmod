package com.reiz.funmod.Proxy;

import com.reiz.funmod.blocksInit.BlockInit;
import com.reiz.funmod.item.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event){
		new	BlockInit();
	}
	public void init(FMLInitializationEvent event){
		
	}
	public void postInit(FMLPostInitializationEvent event){
		
	}
}