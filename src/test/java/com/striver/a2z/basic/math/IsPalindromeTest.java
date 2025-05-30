package com.striver.a2z.basic.math;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsPalindromeTest {
    IsPalindrome isPalindrome = new IsPalindrome();

    @Test
    public void test1(){
        assertTrue(isPalindrome.isPalindrome(1234321));
    }

    @Test
    public void test2(){
        assertFalse(isPalindrome.isPalindrome(12343210));
    }
}
