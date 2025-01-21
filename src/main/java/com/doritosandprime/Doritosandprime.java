package com.doritosandprime;

import com.doritosandprime.init.ItemGroupInit;
import com.doritosandprime.init.ItemInit;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Doritosandprime implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("doritosandprime");
	public static final String MOD_ID = "doritosandprime";

	@Override
	public void onInitialize() {
		LOGGER.info("Loading...");
		ItemInit.load();
		ItemGroupInit.load();

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.addAfter(Items.PUMPKIN_PIE, ItemInit.dorito);
			entries.addBefore(Items.MILK_BUCKET, ItemInit.prime);
			entries.addAfter(ItemInit.dorito, ItemInit.feastables);
			entries.addAfter(ItemInit.feastables, ItemInit.lunchly);
		});
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}