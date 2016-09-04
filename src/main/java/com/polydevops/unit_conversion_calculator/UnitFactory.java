package com.polydevops.unit_conversion_calculator;

import com.polydevops.unit_conversion_calculator.unit.*;

/**
 * Creates a Unit with specified @param{unitAmount} from specified @param{unitType}
 */
public class UnitFactory implements IUnitFactory {

    public Unit getUnit(final String unitType, final double unitAmount) {
        switch (unitType) {
            case UnitType.GRAM:
                return new Gram(unitAmount);
            case UnitType.OUNCE:
                return new Ounce(unitAmount);
            case UnitType.MILLILITER:
                return new Milliliter(unitAmount);
            case UnitType.LITER:
                return new Liter(unitAmount);
            case UnitType.TEASPOON:
                return new Teaspoon(unitAmount);
            case UnitType.TABLESPOON:
                return new Tablespoon(unitAmount);
            case UnitType.CUP:
                return new Cup(unitAmount);
            case UnitType.PINT:
                return new Pint(unitAmount);
            case UnitType.QUART:
                return new Quart(unitAmount);
            case UnitType.FLUID_OUNCE:
                return new FluidOunce(unitAmount);
            default:
                return null;
        }
    }
}
