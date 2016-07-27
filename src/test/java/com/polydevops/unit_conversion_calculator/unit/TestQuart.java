package com.polydevops.unit_conversion_calculator.unit;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by connor on 5/25/16.
 */
public class TestQuart {
    
    private Quart quart;

    @Before
    public void before() {
        quart = new Quart(1);
    }

    @Test
    public void testConvertToTeaspoons() {
        final double expected = 192;
        final double actual = quart.convertToTeaspoons().getValue();
        assertEquals(expected, actual, .001);
    }

    @Test
    public void testConvertToTablespoons() {
        final double expected = 64;
        final double actual = quart.convertToTablespoons().getValue();
        assertEquals(expected, actual, .001);
    }

    @Test
    public void testConvertToCups() {
        final double expected = 4;
        final double actual = quart.convertToCups().getValue();
        assertEquals(expected, actual, .001);
    }

    @Test
    public void testConvertToPints() {
        final double expected = 2;
        final double actual = quart.convertToPints().getValue();
        assertEquals(expected, actual, .001);
    }

    @Test
    public void testConvertToQuarts() {
        final double expected = 1;
        final double actual = quart.convertToQuarts().getValue();
        assertEquals(expected, actual, .001);
    }
}
