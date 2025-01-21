package com.doritosandprime.init;

import com.doritosandprime.Doritosandprime;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ItemGroupInit {
    public static final Text GROUP_TITLE = Text.translatable("itemGroup." + Doritosandprime.MOD_ID + ".mod-group");
    public static final ItemGroup MOD_GROUP = register("mod-group", FabricItemGroup.builder()
            .displayName(GROUP_TITLE)
            .icon(ItemInit.dorito::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(Doritosandprime.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());

    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, Doritosandprime.id(name), itemGroup);
    }

    public static void load() {}
}
