package com.striver.a2z.stacksandqueues.preinpost;

import org.junit.Assert;
import org.junit.Test;

public class InfixToPrefixTest {
    InfixToPrefix i = new InfixToPrefix();

    @Test
    public void test1(){
        Assert.assertEquals("*-a/bc-/akl", i.convertInfixToPrefix("(a-b/c)*(a/k-l)"));
    }
}
