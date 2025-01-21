package com.doritosandprime.data.provider;

import com.doritosandprime.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class DoritosandprimeRecipeProvider extends FabricRecipeProvider {

    public DoritosandprimeRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemInit.dorito, 4)
                .input('W', Items.WHEAT)
                .input('B', Items.BLAZE_POWDER)
                .input('G', Items.GOLD_NUGGET)
                .pattern("WBW")
                .pattern(" G ")
                .pattern("WBW")
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemInit.prime)
                .input('B', Items.GLASS_BOTTLE)
                .input('W', Items.WATER_BUCKET)
                .input('S', Items.SUGAR)
                .pattern(" S ")
                .pattern(" W ")
                .pattern(" B ")
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(Items.GLASS_BOTTLE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemInit.feastables)
                .input('C', Items.COCOA_BEANS)
                .input('S', Items.SUGAR)
                .input('W', Items.WHEAT)
                .pattern("C C")
                .pattern(" S ")
                .pattern(" W ")
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemInit.lunchly)
                .input('D', ItemInit.prime)
                .input('F', ItemInit.feastables)
                .input('P', Items.PAPER)
                .pattern("PPP")
                .pattern("PDP")
                .pattern("PFP")
                .criterion(hasItem(ItemInit.feastables), conditionsFromItem(ItemInit.feastables))
                .criterion(hasItem(ItemInit.prime), conditionsFromItem(ItemInit.prime))
                .offerTo(exporter);
    }
}
