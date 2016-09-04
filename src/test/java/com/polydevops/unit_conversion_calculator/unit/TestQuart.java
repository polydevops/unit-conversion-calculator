package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.UnitType;
import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by connor on 5/25/16.
 */
public class TestQuart {
    
    private Quart quart;

    @Test
    public void testGetUnitType() {
        final UnitType expectedUnitType = UnitType.QUARTS;
        final UnitType actualUnitType = new Quart(1).getUnitType();
        assertEquals(expectedUnitType, actualUnitType);
    }

    @Test(expected = InvalidConversionException.class)
    public void testConvertToGrams() throws InvalidConversionException {
        quart = new Quart(1);

        // this call should fail
        quart.convertToGrams().getValue();
    }

    @Test(expected = InvalidConversionException.class)
    public void testConvertToOunces() throws InvalidConversionException {
        quart = new Quart(1);

        // this call should fail
        quart.convertToOunces().getValue();
    }

    @Test
    public void testConvertToMilliliters() {
        double expectedMilliliters;
        double actualMilliliters;

        // test value 1
        quart = new Quart(1);
        expectedMilliliters = 946.353;
        actualMilliliters = quart.convertToMilliliters().getValue();
        assertEquals(expectedMilliliters, actualMilliliters, .001);

        // test value 2.5
        quart = new Quart(2.5);
        expectedMilliliters = 2365.882;
        actualMilliliters = quart.convertToMilliliters().getValue();
        assertEquals(expectedMilliliters, actualMilliliters, .001);
    }

    @Test
    public void testConvertToLiters() {
        double expectedLiters;
        double actualLiters;

        // test value 1
        quart = new Quart(1);
        expectedLiters = 0.946353;
        actualLiters = quart.convertToLiters().getValue();
        assertEquals(expectedLiters, actualLiters, .001);

        // test value 2.5
        quart = new Quart(2.5);
        expectedLiters = 2.36588;
        actualLiters = quart.convertToLiters().getValue();
        assertEquals(expectedLiters, actualLiters, .001);
    }

    @Test
    public void testConvertToTeaspoons() {
        double expectedTeaspoons;
        double actualTeaspoons;

        // test value 1
        quart = new Quart(1);

        expectedTeaspoons = 192;
        actualTeaspoons = quart.convertToTeaspoons().getValue();
        assertEquals(expectedTeaspoons, actualTeaspoons, .001);

        // test value 2.5
        quart = new Quart(2.5);

        expectedTeaspoons = 480;
        actualTeaspoons = quart.convertToTeaspoons().getValue();
        assertEquals(expectedTeaspoons, actualTeaspoons, .001);
    }

    @Test
    public void testConvertToTablespoons() {
        double expectedTablespoons;
        double actualTablespoons;

        // test value 1
        quart = new Quart(1);

        expectedTablespoons = 64;
        actualTablespoons = quart.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);

        // test value 2.5
        quart = new Quart(2.5);

        expectedTablespoons = 160;
        actualTablespoons = quart.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);
    }

    @Test
    public void testConvertToCups() {
        double expectedCups;
        double actualCups;

        // test value 1
        quart = new Quart(1);

        expectedCups = 4;
        actualCups = quart.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);

        // test value 2.5
        quart = new Quart(2.5);
        expectedCups = 10;
        actualCups = quart.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);
    }

    @Test
    public void testConvertToPints() {
        double expectedPints;
        double actualPints;

        // test value 1
        quart = new Quart(1);

        expectedPints = 2;
        actualPints = quart.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);

        // test value 2
        quart = new Quart(2.5);

        expectedPints = 5;
        actualPints = quart.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);
    }

    @Test
    public void testConvertToQuarts() {
        double expectedQuarts;
        double actualQuarts;

        // test value 1
        quart = new Quart(1);

        expectedQuarts = 1;
        actualQuarts = quart.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);

        // test value 2.5
        quart = new Quart(2.5);

        expectedQuarts = 2.5;
        actualQuarts = quart.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);
    }

    @Test
    public void testConvertToFluidOunces() {
        double expectedFluidOunces;
        double actualFluidOunces;

        // test value 1
        quart = new Quart(1);
        expectedFluidOunces = 32;
        actualFluidOunces = quart.convertToFluidOunces().getValue();
        assertEquals(expectedFluidOunces, actualFluidOunces, .001);

        // test value 2.5
        quart = new Quart(2.5);
        expectedFluidOunces = 80;
        actualFluidOunces = quart.convertToFluidOunces().getValue();
        assertEquals(expectedFluidOunces, actualFluidOunces, .001);
    }
}
