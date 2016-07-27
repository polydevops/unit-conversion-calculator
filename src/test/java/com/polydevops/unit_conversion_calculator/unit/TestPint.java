package com.polydevops.unit_conversion_calculator.unit;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by connor on 5/25/16.
 */
public class TestPint {

    private Pint pint;

    @Before
    public void before() {
        pint = new Pint(1);
    }

    @Test
    public void testConvertToTeaspoons() {
        final double expected = 96;
        final double actual = pint.convertToTeaspoons().getValue();
        assertEquals(expected, actual, .001);
    }

    @Test
    public void testConvertToTablespoons() {
        final double expected = 32;
        final double actual = pint.convertToTablespoons().getValue();
        assertEquals(expected, actual, .001);
    }

    @Test
    public void testConvertToCups() {
        final double expected = 2;
        final double actual = pint.convertToCups().getValue();
        assertEquals(expected, actual, .001);
    }

    @Test
    public void testConvertToPints() {
        final double expected = 1;
        final double actual = pint.convertToPints().getValue();
        assertEquals(expected, actual, .001);
    }

    @Test
    public void testConvertToQuarts() {
        final double expected = .5;
        final double actual = pint.convertToQuarts().getValue();
        assertEquals(expected, actual, .001);
    }
}
