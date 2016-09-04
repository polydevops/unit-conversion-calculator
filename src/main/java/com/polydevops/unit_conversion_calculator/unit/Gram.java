package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.UnitGroup;
import com.polydevops.unit_conversion_calculator.UnitType;
import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;

public class Gram extends Unit {

    public Gram(double amount) {
        super(amount);
    }

    @Override
    public String getUnitType() {
        return UnitType.GRAM;
    }

    @Override
    public String getUnitGroup() {
        return UnitGroup.MASS;
    }

    @Override
    public Gram convertToGrams() {
        return this;
    }

    @Override
    public Ounce convertToOunces() {
        final double ouncesToGramsRatio = 0.035274;
        return new Ounce(value * ouncesToGramsRatio);
    }

    @Override
    public Milliliter convertToMilliliters() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Grams to Milliliters.");
    }

    @Override
    public Liter convertToLiters() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Grams to Liters.");
    }

    @Override
    public Teaspoon convertToTeaspoons() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Grams to Teaspoons.");
    }

    @Override
    public Tablespoon convertToTablespoons() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Grams to Tablespoons.");
    }

    @Override
    public Cup convertToCups() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Grams to Cups.");
    }

    @Override
    public Pint convertToPints() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Grams to Pints.");
    }

    @Override
    public Quart convertToQuarts() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Grams to Quarts.");
    }

    @Override
    public FluidOunce convertToFluidOunces() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Grams to Fluid Ounces.");
    }
}
