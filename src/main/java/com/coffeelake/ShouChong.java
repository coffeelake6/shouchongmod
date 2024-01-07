package com.coffeelake;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShouChong implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("shouchong");


	public static final Item yeshou = Registry.register(Registry.ITEM , new Identifier("114514","yeshou"),
			new Item(new FabricItemSettings()));
	@Override
	public void onInitialize() {
	}
}