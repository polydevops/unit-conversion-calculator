package com.polydevops.unit_conversion_calculator;

import com.polydevops.unit_conversion_calculator.unit.Unit;

/**
 * Calculator for converting units
 */
public class UnitConversionCalculator {


    public static double convert(final double unitAmount, final UnitType fromUnit, final UnitType toUnit) {
        final Unit unit = UnitFactory.getUnit(fromUnit, unitAmount);
        return unit.convertTo(toUnit).getValue();
    }
}
