package com.polydevops.unit_conversion_calculator.unit;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by connor on 5/25/16.
 */
public class TestCup {

    private Cup cup;

    @Before
    public void before() {
        cup = new Cup(1);
    }

    @Test
    public void testConvertToTeaspoons() {
        final double expected = 48;
        final double actual = cup.convertToTeaspoons().getValue();
        assertEquals(expected, actual, .001);
    }

    @Test
    public void testConvertToTablespoons() {
        final double expected = 16;
        final double actual = cup.convertToTablespoons().getValue();
        assertEquals(expected, actual, .001);
    }

    @Test
    public void testConvertToCups() {
        final double expected = 1;
        final double actual = cup.convertToCups().getValue();
        assertEquals(expected, actual, .001);
    }

    @Test
    public void testConvertToPints() {
        final double expected = .5;
        final double actual = cup.convertToPints().getValue();
        assertEquals(expected, actual, .001);
    }

    @Test
    public void testConvertToQuarts() {
        final double expected = .25;
        final double actual = cup.convertToQuarts().getValue();
        assertEquals(expected, actual, .001);
    }
}
