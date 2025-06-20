package com.striver.a2z.stacksandqueues.preinpost;

import org.junit.Assert;
import org.junit.Test;

public class InfixToPostfixTest {
    InfixToPostfix i = new InfixToPostfix();

    @Test
    public void test1(){
        Assert.assertEquals("abcd^e-fgh*+^*+i-", i.infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
    }
}
