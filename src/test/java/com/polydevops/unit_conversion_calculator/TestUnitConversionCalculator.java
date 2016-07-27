package com.polydevops.unit_conversion_calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUnitConversionCalculator {

    @Before
    public void before() {

    }

    @Test
    public void testConvertTeaspoonsToTablespoons() {
        final double expected = .333;
        final double actual = UnitConversionCalculator.convert(1, UnitType.TEASPOONS, UnitType.TABLESPOONS);
        assertEquals(expected, actual, .001);
    }
}
