package com.polydevops.unit_conversion_calculator;

import com.polydevops.unit_conversion_calculator.unit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test Suite for Unit Tests
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestUnitConversionCalculator.class,
        TestTeaspoon.class,
        TestTablespoon.class,
        TestCup.class,
        TestPint.class,
        TestQuart.class
})
public class TestSuite {

}
