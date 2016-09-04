package com.polydevops.unit_conversion_calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUnitConversionCalculator {

    private UnitConversionCalculator calculator;

    @Before
    public void before() {
        calculator = new UnitConversionCalculator();
    }

    @Test
    public void testConvertTeaspoonsToTablespoons() {
        final double expected = .333;
        final double actual = calculator.convert(1, UnitType.TEASPOON, UnitType.TABLESPOON);
        assertEquals(expected, actual, .001);
    }
}
