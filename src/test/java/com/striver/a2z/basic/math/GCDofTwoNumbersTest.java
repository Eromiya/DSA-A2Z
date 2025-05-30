package com.striver.a2z.basic.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GCDofTwoNumbersTest {
    GCDofTwoNumbers gcd = new GCDofTwoNumbers();

    @Test
    public void test1(){
        assertEquals(12, gcd.gcd(48, 180));
    }

    @Test
    public void test2(){
        assertEquals(6, gcd.gcd(48, 18));
    }

}
