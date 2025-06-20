package com.striver.a2z.string.medium;

import org.junit.Assert;
import org.junit.Test;

public class StringToInteger_8Test {
    StringToInteger_8 s = new StringToInteger_8();

    @Test
    public void test1(){
        Assert.assertEquals(0, s.myAtoi("+-12"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(12, s.myAtoi("+12"));
    }

    @Test
    public void test3(){
        Assert.assertEquals(12, s.myAtoi("   +12"));
    }

    @Test
    public void test4(){
        Assert.assertEquals(1337, s.myAtoi("1337c0d3"));
    }
}
