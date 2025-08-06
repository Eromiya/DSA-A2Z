package com.striver.a2z.basic.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseNumberTest {
    ReverseNumber reverseNumber = new ReverseNumber();

    @Test
    public void test1(){
        assertEquals(123, reverseNumber.reverseNumber(321));
    }

    @Test
    public void test2(){
        assertEquals(-989898, reverseNumber.reverseNumber(-898989));
    }
}
