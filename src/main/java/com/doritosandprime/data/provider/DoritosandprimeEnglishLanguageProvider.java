package com.doritosandprime.data.provider;

import com.doritosandprime.Doritosandprime;
import com.doritosandprime.init.ItemGroupInit;
import com.doritosandprime.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class DoritosandprimeEnglishLanguageProvider extends FabricLanguageProvider {

    public DoritosandprimeEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if(text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            Doritosandprime.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ItemInit.dorito, "Dorito");
        translationBuilder.add(ItemInit.prime, "Prime Bottle");
        addText(translationBuilder, ItemGroupInit.GROUP_TITLE, "Doritos and Prime"); // if it errors out, change this value to MOD_GROUP
        translationBuilder.add(ItemInit.feastables, "Feastables Chocolate");
        translationBuilder.add(ItemInit.lunchly, "Lunchly");
    }
}
