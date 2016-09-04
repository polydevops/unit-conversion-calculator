package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.UnitType;
import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTeaspoon {

    private Teaspoon teaspoon;

    @Test
    public void testGetUnitType() {
        final String expectedUnitType = UnitType.TEASPOON;
        final String actualUnitType = new Teaspoon(1).getUnitType();
        assertEquals(expectedUnitType, actualUnitType);
    }

    @Test(expected = InvalidConversionException.class)
    public void testConvertToGrams() throws InvalidConversionException {
        teaspoon = new Teaspoon(1);

        // this call should fail
        teaspoon.convertToGrams().getValue();
    }

    @Test(expected = InvalidConversionException.class)
    public void testConvertToOunces() throws InvalidConversionException {
        teaspoon = new Teaspoon(1);

        // this call should fail
        teaspoon.convertToOunces().getValue();
    }

    @Test
    public void testConvertToMilliliters() {
        double expectedMilliliters;
        double actualMilliliters;

        // test value 1
        teaspoon = new Teaspoon(1);
        expectedMilliliters = 4.92892;
        actualMilliliters = teaspoon.convertToMilliliters().getValue();
        assertEquals(expectedMilliliters, actualMilliliters, .001);

        // test value 2.5
        teaspoon = new Teaspoon(2.5);
        expectedMilliliters = 12.3223;
        actualMilliliters = teaspoon.convertToMilliliters().getValue();
        assertEquals(expectedMilliliters, actualMilliliters, .001);
    }

    @Test
    public void testConvertToLiters() {
        double expectedLiters;
        double actualLiters;

        // test value 1
        teaspoon = new Teaspoon(1);
        expectedLiters = 0.00492892;
        actualLiters = teaspoon.convertToLiters().getValue();
        assertEquals(expectedLiters, actualLiters, .001);

        // test value 2.5
        teaspoon = new Teaspoon(2.5);
        expectedLiters = 0.0123223;
        actualLiters = teaspoon.convertToLiters().getValue();
        assertEquals(expectedLiters, actualLiters, .001);
    }

    @Test
    public void testConvertToTeaspoons() {
        double expectedTeaspoons;
        double actualTeaspoons;

        // test value 1
        teaspoon = new Teaspoon(1);

        expectedTeaspoons = 1;
        actualTeaspoons = teaspoon.convertToTeaspoons().getValue();
        assertEquals(expectedTeaspoons, actualTeaspoons, .001);

        // test value 2.5
        teaspoon = new Teaspoon(2.5);

        expectedTeaspoons = 2.5;
        actualTeaspoons = teaspoon.convertToTeaspoons().getValue();
        assertEquals(expectedTeaspoons, actualTeaspoons, .001);
    }

    @Test
    public void testConvertToTablespoons() {
        double expectedTablespoons;
        double actualTablespoons;

        // test value 1
        teaspoon = new Teaspoon(1);

        expectedTablespoons = .333333;
        actualTablespoons = teaspoon.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);

        // test value 2.5
        teaspoon = new Teaspoon(2.5);

        expectedTablespoons = .833333;
        actualTablespoons = teaspoon.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);
    }

    @Test
    public void testConvertToCups() {
        double expectedCups;
        double actualCups;

        // test value 1
        teaspoon = new Teaspoon(1);

        expectedCups = 0.0208333;
        actualCups = teaspoon.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);

        // test value 2.5
        teaspoon = new Teaspoon(2.5);
        expectedCups = 0.0513429;
        actualCups = teaspoon.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);
    }

    @Test
    public void testConvertToPints() {
        double expectedPints;
        double actualPints;

        // test value 1
        teaspoon = new Teaspoon(1);

        expectedPints = 0.0104167;
        actualPints = teaspoon.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);

        // test value 2
        teaspoon = new Teaspoon(2.5);

        expectedPints = 0.0260417;
        actualPints = teaspoon.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);
    }

    @Test
    public void testConvertToQuarts() {
        double expectedQuarts;
        double actualQuarts;

        // test value 1
        teaspoon = new Teaspoon(1);

        expectedQuarts = 0.00520833;
        actualQuarts = teaspoon.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);

        // test value 2.5
        teaspoon = new Teaspoon(2.5);

        expectedQuarts = 0.0130208;
        actualQuarts = teaspoon.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);
    }

    @Test
    public void testConvertToFluidOunces() {
        double expectedFluidOunces;
        double actualFluidOunces;

        // test value 1
        teaspoon = new Teaspoon(1);
        expectedFluidOunces = 0.166667;
        actualFluidOunces = teaspoon.convertToFluidOunces().getValue();
        assertEquals(expectedFluidOunces, actualFluidOunces, .001);

        // test value 2.5
        teaspoon = new Teaspoon(2.5);
        expectedFluidOunces = 0.416667;
        actualFluidOunces = teaspoon.convertToFluidOunces().getValue();
        assertEquals(expectedFluidOunces, actualFluidOunces, .001);
    }
}
