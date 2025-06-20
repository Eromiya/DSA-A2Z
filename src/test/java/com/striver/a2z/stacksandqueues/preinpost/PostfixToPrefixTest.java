package com.striver.a2z.stacksandqueues.preinpost;

import org.junit.Assert;
import org.junit.Test;

public class PostfixToPrefixTest {
    PostfixToPrefix p = new PostfixToPrefix();

    @Test
    public void test1(){
        Assert.assertEquals("*-A/BC-/AKL", p.postToPre("ABC/-AK/L-*"));
    }
}
