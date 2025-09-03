package com.wakeb;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @Test
    public void testAddPositive(){
        int sum = Calculator.add(4,7);

        assertEquals(sum, 11);
    }

    @Test
    public void testAddNegative(){
        int sum = Calculator.add(-4,7);
        assertEquals(sum, 3);
    }

    @Test
    public void testSubtractPositive(){
        int sum = Calculator.subtract(4,7);
        assertEquals(sum, -3);
    }
}


