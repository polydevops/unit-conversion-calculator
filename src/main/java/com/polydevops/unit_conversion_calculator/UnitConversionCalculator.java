package com.polydevops.unit_conversion_calculator;

import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import com.polydevops.unit_conversion_calculator.unit.Unit;

import java.util.ArrayList;
import java.util.List;

/**
 * Calculator for converting units
 */
public class UnitConversionCalculator {

    private final IUnitFactory unitFactory;

    private List<IUnitFactory> customUnitFactories;

    public UnitConversionCalculator() {
        unitFactory = new UnitFactory();
        customUnitFactories = new ArrayList<>();
    }

    public void addUnitFactory(IUnitFactory customUnitFactory) {
        customUnitFactories.add(customUnitFactory);
    }

    public double convert(final double unitAmount, final String fromUnit, final String toUnit) throws InvalidConversionException {
        final Unit unit = unitFactory.getUnit(fromUnit, unitAmount);

        if (unit == null) {
            return convertUnitFromCustomFactory(unitAmount, fromUnit, toUnit);
        } else {
            return unit.convertTo(toUnit).getValue();
        }
    }

    private double convertUnitFromCustomFactory(final double unitAmount, final String fromUnit, final String toUnit) throws InvalidConversionException {
        for (IUnitFactory customUnitFactory: customUnitFactories) {
            final Unit unit = customUnitFactory.getUnit(fromUnit, unitAmount);
            if (unit != null) {
                return unit.convertTo(toUnit).getValue();
            }
        }
        return 0;
    }
}
