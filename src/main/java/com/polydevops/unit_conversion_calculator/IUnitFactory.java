package com.polydevops.unit_conversion_calculator;

import com.polydevops.unit_conversion_calculator.unit.Unit;

/**
 * Abstract unit factory
 */
public interface IUnitFactory {
    Unit getUnit(final String unitType, final double unitAmount);
}
