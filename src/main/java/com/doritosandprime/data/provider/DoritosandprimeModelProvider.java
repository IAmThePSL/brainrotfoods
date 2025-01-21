package com.doritosandprime.data.provider;

import com.doritosandprime.Doritosandprime;
import com.doritosandprime.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

import java.util.concurrent.CompletableFuture;

public class DoritosandprimeModelProvider extends FabricModelProvider {

    public DoritosandprimeModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.dorito, Models.GENERATED);
        itemModelGenerator.register(ItemInit.feastables, Models.GENERATED);
        itemModelGenerator.register(ItemInit.prime, Models.GENERATED);
        itemModelGenerator.register(ItemInit.lunchly, Models.GENERATED);
    }
}
