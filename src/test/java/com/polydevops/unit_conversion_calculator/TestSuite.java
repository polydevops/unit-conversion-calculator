package com.polydevops.unit_conversion_calculator;

import com.polydevops.unit_conversion_calculator.unit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test Suite for Unit Tests
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestMilliliter.class,
        TestLiter.class,
        TestTeaspoon.class,
        TestTablespoon.class,
        TestCup.class,
        TestPint.class,
        TestQuart.class,
        TestFluidOunce.class
})
public class TestSuite {

}
