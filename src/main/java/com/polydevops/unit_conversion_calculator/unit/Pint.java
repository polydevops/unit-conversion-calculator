package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import com.polydevops.unit_conversion_calculator.UnitGroup;
import com.polydevops.unit_conversion_calculator.UnitType;

public class Pint extends Unit {

    public Pint(double unitAmount) {
        super(unitAmount);
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.PINTS;
    }

    @Override
    public UnitGroup getUnitGroup() {
        return UnitGroup.VOLUME;
    }

    @Override
    public Gram convertToGrams() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Pints to Grams.");
    }

    @Override
    public Ounce convertToOunces() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Pints to Ounces.");
    }

    @Override
    public Milliliter convertToMilliliters() {
        final double millilitersToPintsRatio = 473.176;
        return new Milliliter(value * millilitersToPintsRatio);
    }

    @Override
    public Liter convertToLiters() {
        final double litersToPintsRatio = .4731776;
        return new Liter(value * litersToPintsRatio);
    }

    @Override
    public Teaspoon convertToTeaspoons() {
        final double teaspoonsToPintsRatio = 96.0;
        return new Teaspoon(value * teaspoonsToPintsRatio);
    }

    @Override
    public Tablespoon convertToTablespoons() {
        final double tablespoonsToPintsRatio = 32.0;
        return new Tablespoon(value * tablespoonsToPintsRatio);
    }

    @Override
    public Cup convertToCups() {
        final double cupsToPintsRatio = 2;
        return new Cup(value * cupsToPintsRatio);
    }

    @Override
    public Pint convertToPints() {
        return this;
    }

    @Override
    public Quart convertToQuarts() {
        final double quartsToPintsRatio = .5;
        return new Quart(value * quartsToPintsRatio);
    }

    @Override
    public FluidOunce convertToFluidOunces() {
        final double fluidOuncesToPintsRatio = 16.0;
        return new FluidOunce(value * fluidOuncesToPintsRatio);
    }
}
