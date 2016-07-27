package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import com.polydevops.unit_conversion_calculator.UnitGroup;
import com.polydevops.unit_conversion_calculator.UnitType;

/**
 * Created by connor on 5/25/16.
 */
public class Tablespoon extends Unit {

    public Tablespoon(final double amount) {
        super(amount);
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.TABLESPOONS;
    }

    @Override
    public UnitGroup getUnitGroup() {
        return UnitGroup.VOLUME;
    }

    @Override
    public Gram convertToGrams() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Tablespoons to Grams.");
    }

    @Override
    public Ounce convertToOunces() throws InvalidConversionException {
        throw new InvalidConversionException("Cannot convert from Tablespoons to Ounces.");
    }

    @Override
    public Milliliter convertToMilliliters() {
        final double millilitersToTablespoonsRatio = 14.7868;
        return new Milliliter(value * millilitersToTablespoonsRatio);
    }

    @Override
    public Liter convertToLiters() {
        final double litersToTablespoonsRatio = .0147868;
        return new Liter(value * litersToTablespoonsRatio);
    }

    @Override
    public Teaspoon convertToTeaspoons() {
        final int teaspoonsToTablespoonsRatio = 3;
        return new Teaspoon(value * teaspoonsToTablespoonsRatio);
    }

    @Override
    public Tablespoon convertToTablespoons() {
        return this;
    }

    @Override
    public Cup convertToCups() {
        final double cupsToTablespoonsRatio = .0625;
        return new Cup(value * cupsToTablespoonsRatio);
    }

    @Override
    public Pint convertToPints() {
        final double pintsToTablespoonsRatio = .03125;
        return new Pint(value * pintsToTablespoonsRatio);
    }

    @Override
    public Quart convertToQuarts() {
        final double quartsToTablespoonsRatio = .015625;
        return new Quart(value * quartsToTablespoonsRatio);
    }

    @Override
    public FluidOunce convertToFluidOunces() {
        final double fluidOuncesToTablespoonsRatio = .5;
        return new FluidOunce(value * fluidOuncesToTablespoonsRatio);
    }
}
