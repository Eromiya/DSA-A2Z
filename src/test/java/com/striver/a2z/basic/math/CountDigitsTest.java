package com.striver.a2z.basic.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDigitsTest {
    CountDigits countDigits = new CountDigits();

    @Test
    public void test1(){
        assertEquals(5, countDigits.countDigits(12345));
    }
    @Test
    public void test2(){
        assertEquals(6, countDigits.countDigits(123000));
    }
}
