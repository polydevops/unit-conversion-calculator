package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.UnitGroup;
import com.polydevops.unit_conversion_calculator.UnitType;
import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;

public class Liter extends Unit {
    public Liter(double amount) {
        super(amount);
    }

    @Override
    public String getUnitType() {
        return UnitType.LITER;
    }

    @Override
    public String getUnitGroup() {
        return UnitGroup.VOLUME;
    }

    @Override
    public Gram convertToGrams() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Liters to Grams.");
    }

    @Override
    public Ounce convertToOunces() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Liters to Ounces.");
    }

    @Override
    public Milliliter convertToMilliliters() {
        final double millilitersToLitersRatio = 1000;
        return new Milliliter(value * millilitersToLitersRatio);
    }

    @Override
    public Liter convertToLiters() {
        return this;
    }

    @Override
    public Teaspoon convertToTeaspoons() {
        final double teaspoonsToLitersRatio = 202.884;
        return new Teaspoon(value * teaspoonsToLitersRatio);
    }

    @Override
    public Tablespoon convertToTablespoons() {
        final double tablespoonsToLitersRatio = 67.628;
        return new Tablespoon(value * tablespoonsToLitersRatio);
    }

    @Override
    public Cup convertToCups() {
        final double cupsToLitersRatio = 4.22675;
        return new Cup(value * cupsToLitersRatio);
    }

    @Override
    public Pint convertToPints() {
        final double pintsToLitersRatio = 2.11338;
        return new Pint(value * pintsToLitersRatio);
    }

    @Override
    public Quart convertToQuarts() {
        final double quartsToLitersRatio = 1.05669;
        return new Quart(value * quartsToLitersRatio);
    }

    @Override
    public FluidOunce convertToFluidOunces() {
        final double fluidOuncesToLitersRatio = 33.814;
        return new FluidOunce(value * fluidOuncesToLitersRatio);
    }
}
