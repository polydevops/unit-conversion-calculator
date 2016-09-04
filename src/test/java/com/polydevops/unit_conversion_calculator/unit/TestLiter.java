package com.polydevops.unit_conversion_calculator.unit;

import com.polydevops.unit_conversion_calculator.UnitType;
import com.polydevops.unit_conversion_calculator.throwable.InvalidConversionException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by connor on 9/4/16.
 */
public class TestLiter {

    private Liter liter;

    @Test
    public void testGetUnitType() {
        final UnitType expectedUnitType = UnitType.LITERS;
        final UnitType actualUnitType = new Liter(1).getUnitType();
        assertEquals(expectedUnitType, actualUnitType);
    }

    @Test(expected = InvalidConversionException.class)
    public void testConvertToGrams() throws InvalidConversionException {
        liter = new Liter(1);

        // this call should fail
        liter.convertToGrams().getValue();
    }

    @Test(expected = InvalidConversionException.class)
    public void testConvertToOunces() throws InvalidConversionException {
        liter = new Liter(1);

        // this call should fail
        liter.convertToOunces().getValue();
    }

    @Test
    public void testConvertToMilliliters() {
        double expectedMilliliters;
        double actualMilliliters;

        // test value 1
        liter = new Liter(1);
        expectedMilliliters = 1000;
        actualMilliliters = liter.convertToMilliliters().getValue();
        assertEquals(expectedMilliliters, actualMilliliters, .001);

        // test value 2.5
        liter = new Liter(2.5);
        expectedMilliliters = 2500;
        actualMilliliters = liter.convertToMilliliters().getValue();
        assertEquals(expectedMilliliters, actualMilliliters, .001);
    }

    @Test
    public void testConvertToLiters() {
        double expectedLiters;
        double actualLiters;

        // test value 1
        liter = new Liter(1);
        expectedLiters = 1;
        actualLiters = liter.convertToLiters().getValue();
        assertEquals(expectedLiters, actualLiters, .001);

        // test value 2.5
        liter = new Liter(2.5);
        expectedLiters = 2.5;
        actualLiters = liter.convertToLiters().getValue();
        assertEquals(expectedLiters, actualLiters, .001);
    }

    @Test
    public void testConvertToTeaspoons() {
        double expectedTeaspoons;
        double actualTeaspoons;

        // test value 1
        liter = new Liter(1);

        expectedTeaspoons = 202.884;
        actualTeaspoons = liter.convertToTeaspoons().getValue();
        assertEquals(expectedTeaspoons, actualTeaspoons, .001);

        // test value 2.5
        liter = new Liter(2.5);

        expectedTeaspoons = 507.21;
        actualTeaspoons = liter.convertToTeaspoons().getValue();
        assertEquals(expectedTeaspoons, actualTeaspoons, .001);
    }

    @Test
    public void testConvertToTablespoons() {
        double expectedTablespoons;
        double actualTablespoons;

        // test value 1
        liter = new Liter(1);

        expectedTablespoons = 67.628;
        actualTablespoons = liter.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);

        // test value 2.5
        liter = new Liter(2.5);

        expectedTablespoons = 169.07;
        actualTablespoons = liter.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);
    }

    @Test
    public void testConvertToCups() {
        double expectedCups;
        double actualCups;

        // test value 1
        liter = new Liter(1);

        expectedCups = 4.22675;
        actualCups = liter.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);

        // test value 2.5
        liter = new Liter(2.5);
        expectedCups = 10.5669;
        actualCups = liter.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);
    }

    @Test
    public void testConvertToPints() {
        double expectedPints;
        double actualPints;

        // test value 1
        liter = new Liter(1);

        expectedPints = 2.11338;
        actualPints = liter.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);

        // test value 2
        liter = new Liter(2.5);

        expectedPints = 5.28344;
        actualPints = liter.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);
    }

    @Test
    public void testConvertToQuarts() {
        double expectedQuarts;
        double actualQuarts;

        // test value 1
        liter = new Liter(1);

        expectedQuarts = 1.05669;
        actualQuarts = liter.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);

        // test value 2.5
        liter = new Liter(2.5);

        expectedQuarts = 2.64172;
        actualQuarts = liter.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);
    }

    @Test
    public void testConvertToFluidOunces() {
        double expectedFluidOunces;
        double actualFluidOunces;

        // test value 1
        liter = new Liter(1);
        expectedFluidOunces = 33.814;
        actualFluidOunces = liter.convertToFluidOunces().getValue();
        assertEquals(expectedFluidOunces, actualFluidOunces, .001);

        // test value 2.5
        liter = new Liter(2.5);
        expectedFluidOunces = 84.5351;
        actualFluidOunces = liter.convertToFluidOunces().getValue();
        assertEquals(expectedFluidOunces, actualFluidOunces, .001);
    }
}
