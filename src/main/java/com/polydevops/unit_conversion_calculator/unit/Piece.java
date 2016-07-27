package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import com.polydevops.unit_conversion_calculator.UnitGroup;
import com.polydevops.unit_conversion_calculator.UnitType;

/**
 * Created by connor on 5/29/16.
 */
public class Piece extends Unit {

    public Piece(double amount) {
        super(amount);
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.PIECE;
    }

    @Override
    public UnitGroup getUnitGroup() {
        return UnitGroup.NONDETERMINISTIC;
    }

    @Override
    public Gram convertToGrams() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Pieces to Grams");
    }

    @Override
    public Ounce convertToOunces() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Pieces to Ounces");
    }

    @Override
    public Milliliter convertToMilliliters() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Pieces to Milliliters.");
    }

    @Override
    public Liter convertToLiters() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Pieces to Liters.");
    }

    @Override
    public Teaspoon convertToTeaspoons() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Pieces to Teaspoons.");
    }

    @Override
    public Tablespoon convertToTablespoons() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Pieces to Tablespoons.");
    }

    @Override
    public Cup convertToCups() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Pieces to Cups.");
    }

    @Override
    public Pint convertToPints() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Pieces to Pints.");
    }

    @Override
    public Quart convertToQuarts() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Pieces to Quarts.");
    }

    @Override
    public FluidOunce convertToFluidOunces() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Pieces to Fluid Ounces");
    }
}
