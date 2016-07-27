package com.polydevops.unit_conversion_calculator.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTeaspoon {

    @Test
    public void testConvertToTablespoons() {
        final Teaspoon teaspoon = new Teaspoon(1);

        final double expectedTablespoons = .333333;
        final double actualTablespoons = teaspoon.convertToTablespoons().getValue();
        assertEquals(expectedTablespoons, actualTablespoons, .001);
    }

    @Test
    public void testConvertToCups() {
        final Teaspoon teaspoon = new Teaspoon(1);

        final double expectedCups = 0.0208333;
        final double actualCups = teaspoon.convertToCups().getValue();
        assertEquals(expectedCups, actualCups, .001);
    }

    @Test
    public void testConvertToPints() {
        final Teaspoon teaspoon = new Teaspoon(1);

        final double expectedPints = 0.0104167;
        final double actualPints = teaspoon.convertToPints().getValue();
        assertEquals(expectedPints, actualPints, .001);
    }

    @Test
    public void testConvertToQuarts() {
        final Teaspoon teaspoon = new Teaspoon(1);

        final double expectedQuarts = 0.00520833;
        final double actualQuarts = teaspoon.convertToQuarts().getValue();
        assertEquals(expectedQuarts, actualQuarts, .001);
    }
}
