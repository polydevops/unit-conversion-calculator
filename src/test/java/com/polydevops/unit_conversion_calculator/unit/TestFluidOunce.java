package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.UnitType;
import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by connor on 9/4/16.
 */
public class TestFluidOunce {

    private FluidOunce fluidOunce;

    @Test
    public void testGetUnitType() {
        final UnitType expectedUnitType = UnitType.FLUID_OZ;
        final UnitType actualUnitType = new FluidOunce(1).getUnitType();
        assertEquals(expectedUnitType, actualUnitType);
    }

    @Test(expected = InvalidConversionException.class)
    public void testConvertToGrams() throws InvalidConversionException {
        fluidOunce = new FluidOunce(1);

        // this call should fail
        fluidOunce.convertToGrams().getValue();
    }

    @Test(expected = InvalidConversionException.class)
    public void testConvertToOunces() throws InvalidConversionException {
        fluidOunce = new FluidOunce(1);

        // this call should fail
        fluidOunce.convertToOunces().getValue();
    }

    @Test
    public void testConvertToMilliliters() {
        double expectedMilliliters;
        double actualMilliliters;

        // test value 1
        fluidOunce = new FluidOunce(1);
        expectedMilliliters = 29.5735;
        actualMilliliters = fluidOunce.convertToMilliliters().getValue();
        assertEquals(expectedMilliliters, actualMilliliters, .001);

        // test value 2.5
        fluidOunce = new FluidOunce(2.5);
        expectedMilliliters = 73.9338;
        actualMilliliters = fluidOunce.convertToMilliliters().getValue();
        assertEquals(expectedMilliliters, actualMilliliters, .001);
    }

    @Test
    public void testConvertToLiters() {
        double expectedLiters;
        double actualLiters;

        // test value 1
        fluidOunce = new FluidOunce(1);
        expectedLiters = 0.0295735;
        actualLiters = fluidOunce.convertToLiters().getValue();
        assertEquals(expectedLiters, actualLiters, .001);

        // test value 2.5
        fluidOunce = new FluidOunce(2.5);
        expectedLiters = 0.0739338;
        actualLiters = fluidOunce.convertToLiters().getValue();
        assertEquals(expectedLiters, actualLiters, .001);
    }

    @Test
    public void testConvertToTeaspoons() {
        double expectedTeaspoons;
        double actualTeaspoons;

        // test value 1
        fluidOunce = new FluidOunce(1);

        expectedTeaspoons = 6;
        actualTeaspoons = fluidOunce.convertToTeaspoons().getValue();
        assertEquals(expectedTeaspoons, actualTeaspoons, .001);

        // test value 2.5
        fluidOunce = new FluidOunce(2.5);

        expectedTeaspoons = 15;
        actualTeaspoons = fluidOunce.convertToTeaspoons().getValue();
        assertEquals(expectedTeaspoons, actualTeaspoons, .001);
    }

    @Test
    public void testConvertToTablespoons() {
        double expectedTablespoons;
        double actualTablespoons;

        // test value 1
        fluidOunce = new FluidOunce(1);

        expectedTablespoons = 2;
        actualTablespoons = fluidOunce.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);

        // test value 2.5
        fluidOunce = new FluidOunce(2.5);

        expectedTablespoons = 5;
        actualTablespoons = fluidOunce.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);
    }

    @Test
    public void testConvertToCups() {
        double expectedCups;
        double actualCups;

        // test value 1
        fluidOunce = new FluidOunce(1);

        expectedCups = 0.125;
        actualCups = fluidOunce.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);

        // test value 2.5
        fluidOunce = new FluidOunce(2.5);
        expectedCups = 0.3125;
        actualCups = fluidOunce.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);
    }

    @Test
    public void testConvertToPints() {
        double expectedPints;
        double actualPints;

        // test value 1
        fluidOunce = new FluidOunce(1);

        expectedPints = 0.0625;
        actualPints = fluidOunce.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);

        // test value 2
        fluidOunce = new FluidOunce(2.5);

        expectedPints = 0.15625;
        actualPints = fluidOunce.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);
    }

    @Test
    public void testConvertToQuarts() {
        double expectedQuarts;
        double actualQuarts;

        // test value 1
        fluidOunce = new FluidOunce(1);

        expectedQuarts = 0.03125;
        actualQuarts = fluidOunce.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);

        // test value 2.5
        fluidOunce = new FluidOunce(2.5);

        expectedQuarts = 0.078125;
        actualQuarts = fluidOunce.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);
    }

    @Test
    public void testConvertToFluidOunces() {
        double expectedFluidOunces;
        double actualFluidOunces;

        // test value 1
        fluidOunce = new FluidOunce(1);
        expectedFluidOunces = 1;
        actualFluidOunces = fluidOunce.convertToFluidOunces().getValue();
        assertEquals(expectedFluidOunces, actualFluidOunces, .001);

        // test value 2.5
        fluidOunce = new FluidOunce(2.5);
        expectedFluidOunces = 2.5;
        actualFluidOunces = fluidOunce.convertToFluidOunces().getValue();
        assertEquals(expectedFluidOunces, actualFluidOunces, .001);
    }
}
