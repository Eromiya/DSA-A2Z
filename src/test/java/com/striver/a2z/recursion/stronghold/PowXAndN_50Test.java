package com.striver.a2z.recursion.stronghold;

import com.striver.a2z.recursion.stronghold.PowXAndN_50;
import org.junit.Assert;
import org.junit.Test;

public class PowXAndN_50Test {
    PowXAndN_50 p = new PowXAndN_50();
    @Test
    public void test1(){
        Assert.assertEquals(1.00, p.myPow(1,1), 1);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1024.0000, p.myPow(2.0000,10), 1);
    }
    @Test
    public void test3(){
        Assert.assertEquals(0.25000, p.myPow(2.00000,-2), 1);
    }

    @Test
    public void test4(){
        Assert.assertEquals(0.2000, p.myPow(2.00,-200000000), 1);
    }
}
