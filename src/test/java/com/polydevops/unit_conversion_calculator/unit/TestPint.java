package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.UnitType;
import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by connor on 5/25/16.
 */
public class TestPint {

    private Pint pint;

    @Test
    public void testGetUnitType() {
        final String expectedUnitType = UnitType.PINT;
        final String actualUnitType = new Pint(1).getUnitType();
        assertEquals(expectedUnitType, actualUnitType);
    }

    @Test(expected = InvalidConversionException.class)
    public void testConvertToGrams() throws InvalidConversionException {
        pint = new Pint(1);

        // this call should fail
        pint.convertToGrams().getValue();
    }

    @Test(expected = InvalidConversionException.class)
    public void testConvertToOunces() throws InvalidConversionException {
        pint = new Pint(1);

        // this call should fail
        pint.convertToOunces().getValue();
    }

    @Test
    public void testConvertToMilliliters() {
        double expectedMilliliters;
        double actualMilliliters;

        // test value 1
        pint = new Pint(1);
        expectedMilliliters = 473.176;
        actualMilliliters = pint.convertToMilliliters().getValue();
        assertEquals(expectedMilliliters, actualMilliliters, .001);

        // test value 2.5
        pint = new Pint(2.5);
        expectedMilliliters = 1182.94;
        actualMilliliters = pint.convertToMilliliters().getValue();
        assertEquals(expectedMilliliters, actualMilliliters, .001);
    }

    @Test
    public void testConvertToLiters() {
        double expectedLiters;
        double actualLiters;

        // test value 1
        pint = new Pint(1);
        expectedLiters = 0.473176;
        actualLiters = pint.convertToLiters().getValue();
        assertEquals(expectedLiters, actualLiters, .001);

        // test value 2.5
        pint = new Pint(2.5);
        expectedLiters = 1.18294;
        actualLiters = pint.convertToLiters().getValue();
        assertEquals(expectedLiters, actualLiters, .001);
    }

    @Test
    public void testConvertToTeaspoons() {
        double expectedTeaspoons;
        double actualTeaspoons;

        // test value 1
        pint = new Pint(1);

        expectedTeaspoons = 96;
        actualTeaspoons = pint.convertToTeaspoons().getValue();
        assertEquals(expectedTeaspoons, actualTeaspoons, .001);

        // test value 2.5
        pint = new Pint(2.5);

        expectedTeaspoons = 240;
        actualTeaspoons = pint.convertToTeaspoons().getValue();
        assertEquals(expectedTeaspoons, actualTeaspoons, .001);
    }

    @Test
    public void testConvertToTablespoons() {
        double expectedTablespoons;
        double actualTablespoons;

        // test value 1
        pint = new Pint(1);

        expectedTablespoons = 32;
        actualTablespoons = pint.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);

        // test value 2.5
        pint = new Pint(2.5);

        expectedTablespoons = 80;
        actualTablespoons = pint.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);
    }

    @Test
    public void testConvertToCups() {
        double expectedCups;
        double actualCups;

        // test value 1
        pint = new Pint(1);

        expectedCups = 2;
        actualCups = pint.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);

        // test value 2.5
        pint = new Pint(2.5);
        expectedCups = 5;
        actualCups = pint.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);
    }

    @Test
    public void testConvertToPints() {
        double expectedPints;
        double actualPints;

        // test value 1
        pint = new Pint(1);

        expectedPints = 1;
        actualPints = pint.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);

        // test value 2
        pint = new Pint(2.5);

        expectedPints = 2.5;
        actualPints = pint.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);
    }

    @Test
    public void testConvertToQuarts() {
        double expectedQuarts;
        double actualQuarts;

        // test value 1
        pint = new Pint(1);

        expectedQuarts = .5;
        actualQuarts = pint.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);

        // test value 2.5
        pint = new Pint(2.5);

        expectedQuarts = 1.25;
        actualQuarts = pint.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);
    }

    @Test
    public void testConvertToFluidOunces() {
        double expectedFluidOunces;
        double actualFluidOunces;

        // test value 1
        pint = new Pint(1);
        expectedFluidOunces = 16;
        actualFluidOunces = pint.convertToFluidOunces().getValue();
        assertEquals(expectedFluidOunces, actualFluidOunces, .001);

        // test value 2.5
        pint = new Pint(2.5);
        expectedFluidOunces = 40;
        actualFluidOunces = pint.convertToFluidOunces().getValue();
        assertEquals(expectedFluidOunces, actualFluidOunces, .001);
    }
}
