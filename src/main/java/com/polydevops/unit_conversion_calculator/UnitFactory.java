package com.polydevops.unit_conversion_calculator;

import com.polydevops.unit_conversion_calculator.unit.*;

/**
 * Creates a Unit with specified @param{unitAmount} from specified @param{unitType}
 */
public class UnitFactory {

    public static Unit getUnit(final UnitType unitType, final double unitAmount) throws Exception {
        switch (unitType) {
            case GRAMS:
                return new Gram(unitAmount);
            case OUNCES:
                return new Ounce(unitAmount);
            case MILLILITERS:
                return new Milliliter(unitAmount);
            case LITERS:
                return new Liter(unitAmount);
            case TEASPOONS:
                return new Teaspoon(unitAmount);
            case TABLESPOONS:
                return new Tablespoon(unitAmount);
            case CUPS:
                return new Cup(unitAmount);
            case PINTS:
                return new Pint(unitAmount);
            case QUARTS:
                return new Quart(unitAmount);
            case FLUID_OZ:
                return new FluidOunce(unitAmount);
            default:
                throw new Exception("Invalid Unit Type");
        }
    }
}
