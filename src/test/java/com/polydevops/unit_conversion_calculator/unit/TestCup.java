package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.UnitType;
import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by connor on 5/25/16.
 */
public class TestCup {

    private Cup cup;

    @Test
    public void testGetUnitType() {
        final String expectedUnitType = UnitType.CUP;
        final String actualUnitType = new Cup(1).getUnitType();
        assertEquals(expectedUnitType, actualUnitType);
    }

    @Test(expected = InvalidConversionException.class)
    public void testConvertToGrams() throws InvalidConversionException {
        cup = new Cup(1);

        // this call should fail
        cup.convertToGrams().getValue();
    }

    @Test(expected = InvalidConversionException.class)
    public void testConvertToOunces() throws InvalidConversionException {
        cup = new Cup(1);

        // this call should fail
        cup.convertToOunces().getValue();
    }

    @Test
    public void testConvertToMilliliters() {
        double expectedMilliliters;
        double actualMilliliters;

        // test value 1
        cup = new Cup(1);
        expectedMilliliters = 236.588;
        actualMilliliters = cup.convertToMilliliters().getValue();
        assertEquals(expectedMilliliters, actualMilliliters, .001);

        // test value 2.5
        cup = new Cup(2.5);
        expectedMilliliters = 591.471;
        actualMilliliters = cup.convertToMilliliters().getValue();
        assertEquals(expectedMilliliters, actualMilliliters, .001);
    }

    @Test
    public void testConvertToLiters() {
        double expectedLiters;
        double actualLiters;

        // test value 1
        cup = new Cup(1);
        expectedLiters = 0.236588;
        actualLiters = cup.convertToLiters().getValue();
        assertEquals(expectedLiters, actualLiters, .001);

        // test value 2.5
        cup = new Cup(2.5);
        expectedLiters = 0.591471;
        actualLiters = cup.convertToLiters().getValue();
        assertEquals(expectedLiters, actualLiters, .001);
    }

    @Test
    public void testConvertToTeaspoons() {
        double expectedTeaspoons;
        double actualTeaspoons;

        // test value 1
        cup = new Cup(1);

        expectedTeaspoons = 48;
        actualTeaspoons = cup.convertToTeaspoons().getValue();
        assertEquals(expectedTeaspoons, actualTeaspoons, .001);

        // test value 2.5
        cup = new Cup(2.5);

        expectedTeaspoons = 120;
        actualTeaspoons = cup.convertToTeaspoons().getValue();
        assertEquals(expectedTeaspoons, actualTeaspoons, .001);
    }

    @Test
    public void testConvertToTablespoons() {
        double expectedTablespoons;
        double actualTablespoons;

        // test value 1
        cup = new Cup(1);

        expectedTablespoons = 16;
        actualTablespoons = cup.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);

        // test value 2.5
        cup = new Cup(2.5);

        expectedTablespoons = 40;
        actualTablespoons = cup.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);
    }

    @Test
    public void testConvertToCups() {
        double expectedCups;
        double actualCups;

        // test value 1
        cup = new Cup(1);

        expectedCups = 1;
        actualCups = cup.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);

        // test value 2.5
        cup = new Cup(2.5);
        expectedCups = 2.5;
        actualCups = cup.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);
    }

    @Test
    public void testConvertToPints() {
        double expectedPints;
        double actualPints;

        // test value 1
        cup = new Cup(1);

        expectedPints = 0.5;
        actualPints = cup.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);

        // test value 2
        cup = new Cup(2.5);

        expectedPints = 1.25;
        actualPints = cup.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);
    }

    @Test
    public void testConvertToQuarts() {
        double expectedQuarts;
        double actualQuarts;

        // test value 1
        cup = new Cup(1);

        expectedQuarts = 0.25;
        actualQuarts = cup.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);

        // test value 2.5
        cup = new Cup(2.5);

        expectedQuarts = 0.625;
        actualQuarts = cup.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);
    }

    @Test
    public void testConvertToFluidOunces() {
        double expectedFluidOunces;
        double actualFluidOunces;

        // test value 1
        cup = new Cup(1);
        expectedFluidOunces = 8;
        actualFluidOunces = cup.convertToFluidOunces().getValue();
        assertEquals(expectedFluidOunces, actualFluidOunces, .001);

        // test value 2.5
        cup = new Cup(2.5);
        expectedFluidOunces = 20;
        actualFluidOunces = cup.convertToFluidOunces().getValue();
        assertEquals(expectedFluidOunces, actualFluidOunces, .001);
    }
}
