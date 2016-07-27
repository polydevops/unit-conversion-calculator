package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import com.polydevops.unit_conversion_calculator.UnitGroup;
import com.polydevops.unit_conversion_calculator.UnitType;

public class Teaspoon extends Unit {

    public Teaspoon(final double amount) {
        super(amount);
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.TEASPOONS;
    }

    @Override
    public UnitGroup getUnitGroup() {
        return UnitGroup.VOLUME;
    }

    @Override
    public Gram convertToGrams() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Teaspoons to Grams.");
    }

    @Override
    public Ounce convertToOunces() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Teaspoons to Ounces.");
    }

    @Override
    public Milliliter convertToMilliliters() {
        final double millilitersToTeaspoonsRatio = 4.92892;
        return new Milliliter(value * millilitersToTeaspoonsRatio);
    }

    @Override
    public Liter convertToLiters() {
        final double litersToTeaspoonsRatio = .00492892;
        return new Liter(value * litersToTeaspoonsRatio);
    }

    @Override
    public Teaspoon convertToTeaspoons() {
        return this;
    }

    @Override
    public Tablespoon convertToTablespoons() {
        final double tablespoonsToTeaspoonsRatio = .333333;
        return new Tablespoon(value * tablespoonsToTeaspoonsRatio);
    }

    @Override
    public Cup convertToCups() {
        final double cupsToTeaspoonsRatio = .0208333;
        return new Cup(value * cupsToTeaspoonsRatio);
    }

    @Override
    public Pint convertToPints() {
        final double pintsToTeaspoonsRatio = .0104167;
        return new Pint(value * pintsToTeaspoonsRatio);
    }

    @Override
    public Quart convertToQuarts() {
        final double quartsToTeaspoonsRatio = .00520833;
        return new Quart(value * quartsToTeaspoonsRatio);
    }

    @Override
    public FluidOunce convertToFluidOunces() throws InvalidConversionException {
        final double fluidOuncesToTeaspoonsRatio = 0.166667;
        return new FluidOunce(value * fluidOuncesToTeaspoonsRatio);
    }
}
