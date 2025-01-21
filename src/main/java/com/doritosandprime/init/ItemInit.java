package com.doritosandprime.init;

import com.doritosandprime.Doritosandprime;
import com.doritosandprime.list.FoodList;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;

public class ItemInit {
    public static final Item prime = register("prime",
            new Item(new Item.Settings().food(FoodList.prime_component).rarity(Rarity.EPIC)));

    public static final Item dorito = register("dorito",
            new Item(new Item.Settings().food(FoodList.dorito_component).rarity(Rarity.EPIC)));

    public static final Item feastables = register("feastables",
            new Item(new Item.Settings().food(FoodList.feastables_component).rarity(Rarity.EPIC)));

    public static final Item lunchly = register("lunchly",
            new Item(new Item.Settings().food(FoodList.lunchly_component).rarity(Rarity.EPIC)));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, Doritosandprime.id(name), item);
    }

    public static void load() {}
}