package net.nerovaii.test;

import net.fabricmc.api.ModInitializer;

import net.nerovaii.test.item.ModItemGroup;
import net.nerovaii.test.item.Moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Nerovaiitest implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.RegisterItemGroup();
		Moditems.registerModitems();
	}

}