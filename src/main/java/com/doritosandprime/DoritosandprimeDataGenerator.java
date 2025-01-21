package com.doritosandprime;

import com.doritosandprime.data.provider.DoritosandprimeEnglishLanguageProvider;
import com.doritosandprime.data.provider.DoritosandprimeModelProvider;
import com.doritosandprime.data.provider.DoritosandprimeRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DoritosandprimeDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(DoritosandprimeModelProvider::new);
		pack.addProvider(DoritosandprimeEnglishLanguageProvider::new);
		pack.addProvider(DoritosandprimeRecipeProvider::new);
	}
}
