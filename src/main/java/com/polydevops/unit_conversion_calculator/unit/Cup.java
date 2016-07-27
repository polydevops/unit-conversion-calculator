package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import com.polydevops.unit_conversion_calculator.UnitGroup;
import com.polydevops.unit_conversion_calculator.UnitType;

/**
 * US Customary Cup
 */
public class Cup extends Unit {

    public Cup(double amount) {
        super(amount);
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.CUPS;
    }

    @Override
    public UnitGroup getUnitGroup() {
        return UnitGroup.VOLUME;
    }

    @Override
    public Gram convertToGrams() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Cups to Grams.");
    }

    @Override
    public Ounce convertToOunces() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Cups to Ounces.");
    }

    @Override
    public Milliliter convertToMilliliters() {
        final double millilitersToCupsRatio = 236.588;
        return new Milliliter(value * millilitersToCupsRatio);
    }

    @Override
    public Liter convertToLiters() {
        final double litersToCupsRatio = .236588;
        return new Liter(value * litersToCupsRatio);
    }

    @Override
    public Teaspoon convertToTeaspoons() {
        final double teaspoonsToCupsRatio = 48.0;
        return new Teaspoon(value * teaspoonsToCupsRatio);
    }

    @Override
    public Tablespoon convertToTablespoons() {
        final double tablespoonsToCupsRatio = 16.0;
        return new Tablespoon(value * tablespoonsToCupsRatio);
    }

    @Override
    public Cup convertToCups() {
        return this;
    }

    @Override
    public Pint convertToPints() {
        final double pintsToCupsRatio = .5;
        return new Pint(value * pintsToCupsRatio);
    }

    @Override
    public Quart convertToQuarts() {
        final double quartsToCupsRatio = .25;
        return new Quart(value * quartsToCupsRatio);
    }

    @Override
    public FluidOunce convertToFluidOunces() {
        final double fluidOuncesToCupsRatio = 8;
        return new FluidOunce(value * fluidOuncesToCupsRatio);
    }
}
