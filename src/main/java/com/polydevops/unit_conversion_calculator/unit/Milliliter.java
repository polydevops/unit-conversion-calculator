package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.UnitGroup;
import com.polydevops.unit_conversion_calculator.UnitType;
import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;

public class Milliliter extends Unit {

    public Milliliter(double amount) {
        super(amount);
    }

    @Override
    public java.lang.String getUnitType() {
        return UnitType.MILLILITER;
    }

    @Override
    public String getUnitGroup() {
        return UnitGroup.VOLUME;
    }

    @Override
    public Gram convertToGrams() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Milliliters to Grams.");
    }

    @Override
    public Ounce convertToOunces() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Milliliters to Ounces.");
    }

    @Override
    public Milliliter convertToMilliliters() {
        return this;
    }

    @Override
    public Liter convertToLiters() {
        final double litersToMillilitersRatio = 0.001;
        return new Liter(value * litersToMillilitersRatio);
    }

    @Override
    public Teaspoon convertToTeaspoons() {
        final double teaspoonsToMillilitersRatio = 0.202884;
        return new Teaspoon(value * teaspoonsToMillilitersRatio);
    }

    @Override
    public Tablespoon convertToTablespoons() {
        final double tablespoonsToMillilitersRatio = .067628;
        return new Tablespoon(value * tablespoonsToMillilitersRatio);
    }

    @Override
    public Cup convertToCups() {
        final double cupsToMillilitersRatio = .00422675;
        return new Cup(value * cupsToMillilitersRatio);
    }

    @Override
    public Pint convertToPints() {
        final double pintsToMillilitersRatio = .00211338;
        return new Pint(value * pintsToMillilitersRatio);
    }

    @Override
    public Quart convertToQuarts() {
        final double quartsToMillilitersRatio = .00105669;
        return new Quart(value * quartsToMillilitersRatio);
    }

    @Override
    public FluidOunce convertToFluidOunces() {
        final double fluidOuncesToMillilitersRatio = 0.033814;
        return new FluidOunce(value * fluidOuncesToMillilitersRatio);
    }
}
