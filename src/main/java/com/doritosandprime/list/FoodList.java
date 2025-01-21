package com.doritosandprime.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public static final FoodComponent prime_component = new FoodComponent.Builder()
            .nutrition(20)
            .saturationModifier(2.5F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20 * 60, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20 * 60, 10), 0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 30, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 120, 1), 1.0F)
            .build();

    public static final FoodComponent dorito_component = new FoodComponent.Builder()
            .nutrition(20)
            .saturationModifier(2.5F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 120, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 60, 1), 1.0F)
            .build();

    public static final FoodComponent feastables_component = new FoodComponent.Builder()
            .nutrition(25)
            .saturationModifier(2.5F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20 * 30, 1), 1.0F)
            .build();

    public static final FoodComponent lunchly_component = new FoodComponent.Builder()
            .nutrition(12)
            .saturationModifier(1.5F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 15, 1), 0.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20 * 20, 1), 0.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20 * 20, 1), 0.8F)
            .build();
}
