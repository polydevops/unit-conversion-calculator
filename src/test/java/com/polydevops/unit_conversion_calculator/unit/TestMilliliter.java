package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.UnitType;
import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by connor on 9/4/16.
 */
public class TestMilliliter {

    private Milliliter milliliter;

    @Test
    public void testGetUnitType() {
        final UnitType expectedUnitType = UnitType.MILLILITERS;
        final UnitType actualUnitType = new Milliliter(1).getUnitType();
        assertEquals(expectedUnitType, actualUnitType);
    }

    @Test(expected = InvalidConversionException.class)
    public void testConvertToGrams() throws InvalidConversionException {
        milliliter = new Milliliter(1);

        // this call should fail
        milliliter.convertToGrams().getValue();
    }

    @Test(expected = InvalidConversionException.class)
    public void testConvertToOunces() throws InvalidConversionException {
        milliliter = new Milliliter(1);

        // this call should fail
        milliliter.convertToOunces().getValue();
    }

    @Test
    public void testConvertToMilliliters() {
        double expectedMilliliters;
        double actualMilliliters;

        // test value 1
        milliliter = new Milliliter(1);
        expectedMilliliters = 1;
        actualMilliliters = milliliter.convertToMilliliters().getValue();
        assertEquals(expectedMilliliters, actualMilliliters, .001);

        // test value 2.5
        milliliter = new Milliliter(2.5);
        expectedMilliliters = 2.5;
        actualMilliliters = milliliter.convertToMilliliters().getValue();
        assertEquals(expectedMilliliters, actualMilliliters, .001);
    }

    @Test
    public void testConvertToLiters() {
        double expectedLiters;
        double actualLiters;

        // test value 1
        milliliter = new Milliliter(1);
        expectedLiters = 0.001;
        actualLiters = milliliter.convertToLiters().getValue();
        assertEquals(expectedLiters, actualLiters, .001);

        // test value 2.5
        milliliter = new Milliliter(2.5);
        expectedLiters = 0.0025;
        actualLiters = milliliter.convertToLiters().getValue();
        assertEquals(expectedLiters, actualLiters, .001);
    }

    @Test
    public void testConvertToTeaspoons() {
        double expectedTeaspoons;
        double actualTeaspoons;

        // test value 1
        milliliter = new Milliliter(1);

        expectedTeaspoons = 0.202884;
        actualTeaspoons = milliliter.convertToTeaspoons().getValue();
        assertEquals(expectedTeaspoons, actualTeaspoons, .001);

        // test value 2.5
        milliliter = new Milliliter(2.5);

        expectedTeaspoons = 0.507211;
        actualTeaspoons = milliliter.convertToTeaspoons().getValue();
        assertEquals(expectedTeaspoons, actualTeaspoons, .001);
    }

    @Test
    public void testConvertToTablespoons() {
        double expectedTablespoons;
        double actualTablespoons;

        // test value 1
        milliliter = new Milliliter(1);

        expectedTablespoons = 0.067628;
        actualTablespoons = milliliter.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);

        // test value 2.5
        milliliter = new Milliliter(2.5);

        expectedTablespoons = 0.16907;
        actualTablespoons = milliliter.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);
    }

    @Test
    public void testConvertToCups() {
        double expectedCups;
        double actualCups;

        // test value 1
        milliliter = new Milliliter(1);

        expectedCups = 0.00422675;
        actualCups = milliliter.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);

        // test value 2.5
        milliliter = new Milliliter(2.5);
        expectedCups = 0.0105669;
        actualCups = milliliter.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);
    }

    @Test
    public void testConvertToPints() {
        double expectedPints;
        double actualPints;

        // test value 1
        milliliter = new Milliliter(1);

        expectedPints = 0.00211338;
        actualPints = milliliter.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);

        // test value 2
        milliliter = new Milliliter(2.5);

        expectedPints = 0.00528344;
        actualPints = milliliter.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);
    }

    @Test
    public void testConvertToQuarts() {
        double expectedQuarts;
        double actualQuarts;

        // test value 1
        milliliter = new Milliliter(1);

        expectedQuarts = 0.00105669;
        actualQuarts = milliliter.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);

        // test value 2.5
        milliliter = new Milliliter(2.5);

        expectedQuarts = 0.00264172;
        actualQuarts = milliliter.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);
    }

    @Test
    public void testConvertToFluidOunces() {
        double expectedFluidOunces;
        double actualFluidOunces;

        // test value 1
        milliliter = new Milliliter(1);
        expectedFluidOunces = 0.033814;
        actualFluidOunces = milliliter.convertToFluidOunces().getValue();
        assertEquals(expectedFluidOunces, actualFluidOunces, .001);

        // test value 2.5
        milliliter = new Milliliter(2.5);
        expectedFluidOunces = 0.0845351;
        actualFluidOunces = milliliter.convertToFluidOunces().getValue();
        assertEquals(expectedFluidOunces, actualFluidOunces, .001);
    }
}
