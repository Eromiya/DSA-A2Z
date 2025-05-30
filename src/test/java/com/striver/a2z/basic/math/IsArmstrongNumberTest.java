package com.striver.a2z.basic.math;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsArmstrongNumberTest {
    IsArmstrongNumber isArmstrongNumber = new IsArmstrongNumber();

    @Test
    public void test1(){
        assertTrue(isArmstrongNumber.isArmstrongNumber(153));
    }

    @Test
    public void test2(){
        assertFalse(isArmstrongNumber.isArmstrongNumber(1534));
    }
}
