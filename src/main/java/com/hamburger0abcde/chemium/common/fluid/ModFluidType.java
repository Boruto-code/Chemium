package com.hamburger0abcde.chemium.common.fluid;

import net.minecraft.sounds.SoundEvents;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;

import java.util.function.Consumer;

public class ModFluidType extends FluidType {
    public ModFluidType(int viscosity, int temperature) {
        super(FluidType.Properties.create()
                .viscosity(viscosity)
                .temperature(temperature)
                .motionScale(0.014)
                .canSwim(false)
                .canDrown(false)
                .supportsBoating(false)
                .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY));
    }


}
