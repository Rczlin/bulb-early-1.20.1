package com.rlint;

import com.rlint.register.MySoundEvent;
import com.rlint.register.RegistriesBlocks;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BulbEarly implements ModInitializer {
	public static final String MOD_ID = "bulb-early";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

//		LOGGER.info("Hello Fabric world!");
		RegistriesBlocks.RegistriesBlocks();
		MySoundEvent.registerSounds();
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(content->content.addAfter(Blocks.DROPPER,RegistriesBlocks.COPPER_BULB));
	}
}