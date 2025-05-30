package com.striver.a2z.basic.math;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsPrimeTest {
    IsPrime isPrime = new IsPrime();

    @Test
    public void test1(){
        assertTrue(isPrime.isPrime(19));
    }

    @Test
    public void test2(){
        assertTrue(isPrime.isPrime(53));
    }

    @Test
    public void test3(){
        assertFalse(isPrime.isPrime(534));
    }
}
