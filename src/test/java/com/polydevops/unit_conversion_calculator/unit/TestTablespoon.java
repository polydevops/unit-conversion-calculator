package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.UnitType;
import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TestTablespoon {

    private Tablespoon tablespoon;

    @Test
    public void testGetUnitType() {
        final String expectedUnitType = UnitType.TABLESPOON;
        final String actualUnitType = new Tablespoon(1).getUnitType();
        assertEquals(expectedUnitType, actualUnitType);
    }

    @Test(expected = InvalidConversionException.class)
    public void testConvertToGrams() throws InvalidConversionException {
        tablespoon = new Tablespoon(1);

        // this call should fail
        tablespoon.convertToGrams().getValue();
    }

    @Test(expected = InvalidConversionException.class)
    public void testConvertToOunces() throws InvalidConversionException {
        tablespoon = new Tablespoon(1);

        // this call should fail
        tablespoon.convertToOunces().getValue();
    }

    @Test
    public void testConvertToMilliliters() {
        double expectedMilliliters;
        double actualMilliliters;

        // test value 1
        tablespoon = new Tablespoon(1);
        expectedMilliliters = 14.7868;
        actualMilliliters = tablespoon.convertToMilliliters().getValue();
        assertEquals(expectedMilliliters, actualMilliliters, .001);

        // test value 2.5
        tablespoon = new Tablespoon(2.5);
        expectedMilliliters = 36.9669;
        actualMilliliters = tablespoon.convertToMilliliters().getValue();
        assertEquals(expectedMilliliters, actualMilliliters, .001);
    }

    @Test
    public void testConvertToLiters() {
        double expectedLiters;
        double actualLiters;

        // test value 1
        tablespoon = new Tablespoon(1);
        expectedLiters = 0.0147868;
        actualLiters = tablespoon.convertToLiters().getValue();
        assertEquals(expectedLiters, actualLiters, .001);

        // test value 2.5
        tablespoon = new Tablespoon(2.5);
        expectedLiters = 0.0369669;
        actualLiters = tablespoon.convertToLiters().getValue();
        assertEquals(expectedLiters, actualLiters, .001);
    }

    @Test
    public void testConvertToTeaspoons() {
        double expectedTeaspoons;
        double actualTeaspoons;

        // test value 1
        tablespoon = new Tablespoon(1);

        expectedTeaspoons = 3;
        actualTeaspoons = tablespoon.convertToTeaspoons().getValue();
        assertEquals(expectedTeaspoons, actualTeaspoons, .001);

        // test value 2.5
        tablespoon = new Tablespoon(2.5);

        expectedTeaspoons = 7.5;
        actualTeaspoons = tablespoon.convertToTeaspoons().getValue();
        assertEquals(expectedTeaspoons, actualTeaspoons, .001);
    }

    @Test
    public void testConvertToTablespoons() {
        double expectedTablespoons;
        double actualTablespoons;

        // test value 1
        tablespoon = new Tablespoon(1);

        expectedTablespoons = 1;
        actualTablespoons = tablespoon.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);

        // test value 2.5
        tablespoon = new Tablespoon(2.5);

        expectedTablespoons = 2.5;
        actualTablespoons = tablespoon.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);
    }

    @Test
    public void testConvertToCups() {
        double expectedCups;
        double actualCups;

        // test value 1
        tablespoon = new Tablespoon(1);
        expectedCups = .0625;
        actualCups = tablespoon.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);

        // test value 2.5
        tablespoon = new Tablespoon(2.5);
        expectedCups = 0.15625;
        actualCups = tablespoon.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);
    }

    @Test
    public void testConvertToPints() {
        double expectedPints;
        double actualPints;

        // test value 1
        tablespoon = new Tablespoon(1);

        expectedPints = 0.03125;
        actualPints = tablespoon.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);

        // test value 2
        tablespoon = new Tablespoon(2.5);

        expectedPints = 0.078125;
        actualPints = tablespoon.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);
    }

    @Test
    public void testConvertToQuarts() {
        double expectedQuarts;
        double actualQuarts;

        // test value 1
        tablespoon = new Tablespoon(1);

        expectedQuarts = 0.015625;
        actualQuarts = tablespoon.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);

        // test value 2.5
        tablespoon = new Tablespoon(2.5);

        expectedQuarts = 0.0390625;
        actualQuarts = tablespoon.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);
    }

    @Test
    public void testConvertToFluidOunces() {
        double expectedFluidOunces;
        double actualFluidOunces;

        // test value 1
        tablespoon = new Tablespoon(1);
        expectedFluidOunces = 0.5;
        actualFluidOunces = tablespoon.convertToFluidOunces().getValue();
        assertEquals(expectedFluidOunces, actualFluidOunces, .001);

        // test value 2.5
        tablespoon = new Tablespoon(2.5);
        expectedFluidOunces = 1.25;
        actualFluidOunces = tablespoon.convertToFluidOunces().getValue();
        assertEquals(expectedFluidOunces, actualFluidOunces, .001);
    }
}
