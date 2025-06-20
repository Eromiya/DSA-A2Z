package com.striver.a2z.string.easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveOuterParanthesis_1021Test {
    RemoveOuterParanthesis_1021 r = new RemoveOuterParanthesis_1021();

    @Test
    public void test1(){
        Assert.assertEquals("()()()", r.removeOuterParanthesis("(()())(())"));
    }

    @Test
    public void test2(){
        Assert.assertEquals("()()()()(())", r.removeOuterParanthesis("(()())(())(()(()))"));
    }
}
