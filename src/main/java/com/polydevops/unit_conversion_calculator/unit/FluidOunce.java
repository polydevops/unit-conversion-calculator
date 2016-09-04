package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.UnitGroup;
import com.polydevops.unit_conversion_calculator.UnitType;
import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;

/**
 * US
 */
public class FluidOunce extends Unit {

    public FluidOunce(double amount) {
        super(amount);
    }

    @Override
    public String getUnitType() {
        return UnitType.FLUID_OUNCE;
    }

    @Override
    public String getUnitGroup() {
        return UnitGroup.VOLUME;
    }

    @Override
    public Gram convertToGrams() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Fluid Ounces to Grams.");
    }

    @Override
    public Ounce convertToOunces() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Fluid Ounces to Grams.");
    }

    @Override
    public Milliliter convertToMilliliters() {
        final double millitersToFluidOuncesRatio = 29.5735;
        return new Milliliter(value * millitersToFluidOuncesRatio);
    }

    @Override
    public Liter convertToLiters() {
        final double litersToFluidOuncesRatio = .0295735;
        return new Liter(value * litersToFluidOuncesRatio);
    }

    @Override
    public Teaspoon convertToTeaspoons() {
        final double teaspoonsToFluidOuncesRatio = 6.0;
        return new Teaspoon(value * teaspoonsToFluidOuncesRatio);
    }

    @Override
    public Tablespoon convertToTablespoons() {
        final double tablespoonsToFluidOuncesRatio = 2;
        return new Tablespoon(value * tablespoonsToFluidOuncesRatio);
    }

    @Override
    public Cup convertToCups() {
        final double cupsToFluidOuncesRatio = .125;
        return new Cup(value * cupsToFluidOuncesRatio);
    }

    @Override
    public Pint convertToPints() {
        final double pintsToFluidOuncesRatio = .0625;
        return new Pint(value * pintsToFluidOuncesRatio);
    }

    @Override
    public Quart convertToQuarts() {
        final double quartsToFluidOuncesRatio = .03125;
        return new Quart(value * quartsToFluidOuncesRatio);
    }

    @Override
    public FluidOunce convertToFluidOunces() {
        return this;
    }
}
