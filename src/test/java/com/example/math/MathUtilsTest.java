package com.example.math;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @Before
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @Test
    public void testAdd() {
        assertEquals("The add method should add two numbers", 5, mathUtils.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals("The subtract method should subtract two numbers", 1, mathUtils.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals("The multiply method should multiply two numbers", 6, mathUtils.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals("The divide method should divide two numbers", 2.0, mathUtils.divide(4, 2), 0.001);
        assertEquals("Division by zero should return -1.0", -1.0, mathUtils.divide(4, 0), 0.001);
    }

    @After
    public void tearDown() {
        mathUtils = null;
    }
}


