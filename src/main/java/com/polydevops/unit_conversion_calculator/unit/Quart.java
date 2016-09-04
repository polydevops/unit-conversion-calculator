package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import com.polydevops.unit_conversion_calculator.UnitGroup;
import com.polydevops.unit_conversion_calculator.UnitType;

/**
 * Created by connor on 5/25/16.
 */
public class Quart extends Unit {

    public Quart(double unitAmount) {
        super(unitAmount);
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.QUARTS;
    }

    @Override
    public UnitGroup getUnitGroup() {
        return UnitGroup.VOLUME;
    }

    @Override
    public Gram convertToGrams() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Quarts to Grams.");
    }

    @Override
    public Ounce convertToOunces() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Quarts to Ounces.");
    }

    @Override
    public Milliliter convertToMilliliters() {
        final double millilitersToQuartsRatio = 946.353;
        return new Milliliter(value * millilitersToQuartsRatio);
    }

    @Override
    public Liter convertToLiters() {
        final double litersToQuartsRatio = .946353;
        return new Liter(value * litersToQuartsRatio);
    }

    @Override
    public Teaspoon convertToTeaspoons() {
        final double teaspoonsToQuartsRatio = 192.0;
        return new Teaspoon(value * teaspoonsToQuartsRatio);
    }

    @Override
    public Tablespoon convertToTablespoons() {
        final double tablespoonsToQuartsRatio = 64.0;
        return new Tablespoon(value * tablespoonsToQuartsRatio);
    }

    @Override
    public Cup convertToCups() {
        final double cupsToQuartsRatio = 4.0;
        return new Cup(value * cupsToQuartsRatio);
    }

    @Override
    public Pint convertToPints() {
        final double pintsToQuartsRatio = 2.0;
        return new Pint(value * pintsToQuartsRatio);
    }

    @Override
    public Quart convertToQuarts() {
        return this;
    }

    @Override
    public FluidOunce convertToFluidOunces() {
        final double fluidOuncesToQuartsRatio = 32.0;
        return new FluidOunce(value * fluidOuncesToQuartsRatio);
    }
}
