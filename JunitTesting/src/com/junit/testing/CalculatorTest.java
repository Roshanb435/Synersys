package com.junit.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}
