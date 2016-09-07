package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.UnitType;
import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;

public abstract class Unit {

    protected double value;

    public Unit(final double amount) {
        value = amount;
    }

    public abstract String getUnitType();

    public abstract String getUnitGroup();

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

    public Unit convertTo(java.lang.String toUnit) throws InvalidConversionException {
        final String fromUnit = getUnitType();

        if (fromUnit.equals(toUnit)) {
            return this;
        }

        switch (toUnit) {
            case UnitType.GRAM:
                return convertToGrams();
            case UnitType.OUNCE:
                return convertToOunces();
            case UnitType.MILLILITER:
                return convertToMilliliters();
            case UnitType.LITER:
                return convertToLiters();
            case UnitType.TEASPOON:
                return convertToTeaspoons();
            case UnitType.TABLESPOON:
                return convertToTablespoons();
            case UnitType.CUP:
                return convertToCups();
            case UnitType.PINT:
                return convertToPints();
            case UnitType.QUART:
                return convertToQuarts();
            case UnitType.FLUID_OUNCE:
                return convertToFluidOunces();
            default:
                return null;
        }
    }
}
