package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import com.polydevops.unit_conversion_calculator.UnitGroup;
import com.polydevops.unit_conversion_calculator.UnitType;

public class Ounce extends Unit {

    public Ounce(double amount) {
        super(amount);
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.OUNCES;
    }

    @Override
    public UnitGroup getUnitGroup() {
        return UnitGroup.MASS;
    }

    @Override
    public Gram convertToGrams() {
        final double gramsToOuncesRatio = 28.3495;
        return new Gram(value * gramsToOuncesRatio);
    }

    @Override
    public Ounce convertToOunces() {
        return this;
    }

    @Override
    public Milliliter convertToMilliliters() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Ounces to Milliliters.");
    }

    @Override
    public Liter convertToLiters() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Ounces to Liters.");
    }

    @Override
    public Teaspoon convertToTeaspoons() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Ounces to Teaspoons.");
    }

    @Override
    public Tablespoon convertToTablespoons() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Ounces to Tablespoons.");
    }

    @Override
    public Cup convertToCups() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Ounces to Cups.");
    }

    @Override
    public Pint convertToPints() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Ounces to Pints.");
    }

    @Override
    public Quart convertToQuarts() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Ounces to Quarts.");
    }

    @Override
    public FluidOunce convertToFluidOunces() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Ounces to Fluid Ounces.");
    }
}
