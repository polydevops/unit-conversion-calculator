package com.polydevops.unit_conversion_calculator.unit;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TestTablespoon {

    private Tablespoon tablespoon;

    @Before
    public void before() {
        tablespoon = new Tablespoon(1);
    }

    @Test
    public void testConvertToTeaspoons() {
        final double expected = 3;
        final double actual = tablespoon.convertToTeaspoons().getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertToTablespoons() {
        final double expected = 1;
        final double actual = tablespoon.convertToTablespoons().getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertToCups() {
        final double expected = 0.0625;
        final double actual = tablespoon.convertToCups().getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertToPints() {
        final double expected = 0.03125;
        final double actual = tablespoon.convertToPints().getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertToQuarts() {
        final double expected = 0.015625;
        final double actual = tablespoon.convertToQuarts().getValue();
    }
}
