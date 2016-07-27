package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import com.polydevops.unit_conversion_calculator.UnitGroup;
import com.polydevops.unit_conversion_calculator.UnitType;

public abstract class Unit {

    protected double value;

    public Unit(final double amount) {
        value = amount;
    }

    public abstract UnitType getUnitType();
    public abstract UnitGroup getUnitGroup();

    public abstract Gram convertToGrams() throws InvalidConversionException;
    public abstract Ounce convertToOunces() throws InvalidConversionException;

    public abstract Milliliter convertToMilliliters() throws InvalidConversionException;
    public abstract Liter convertToLiters() throws InvalidConversionException;

    public abstract Teaspoon convertToTeaspoons() throws InvalidConversionException;
    public abstract Tablespoon convertToTablespoons() throws InvalidConversionException;
    public abstract Cup convertToCups() throws InvalidConversionException;
    public abstract Pint convertToPints() throws InvalidConversionException;
    public abstract Quart convertToQuarts() throws InvalidConversionException;
    public abstract FluidOunce convertToFluidOunces() throws InvalidConversionException;

    public double getValue() {
        return value;
    }

    public Unit convertTo(UnitType toUnit) {
        final UnitType fromUnit = getUnitType();

        // since a UnitType.PIECE is nondeterministic ('piece' has no defined measurement)
        // we just return the instance
        if (fromUnit == UnitType.PIECE) {
            return this;
        }

        if (fromUnit == toUnit) {
            return this;
        }

        try {
            switch (toUnit) {
                case GRAMS:
                    return convertToGrams();
                case OUNCES:
                    return convertToOunces();
                case MILLILITERS:
                    return convertToMilliliters();
                case LITERS:
                    return convertToLiters();
                case TEASPOONS:
                    return convertToTeaspoons();
                case TABLESPOONS:
                    return convertToTablespoons();
                case CUPS:
                    return convertToCups();
                case PINTS:
                    return convertToPints();
                case QUARTS:
                    return convertToQuarts();
                case FLUID_OZ:
                    return convertToFluidOunces();
                default:
                    // TODO
                    return null;
            }
        } catch (InvalidConversionException e) {
            // TODO
            e.printStackTrace();
            return null;
        }
    }


}
