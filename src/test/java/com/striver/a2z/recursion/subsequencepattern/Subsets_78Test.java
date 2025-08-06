package com.striver.a2z.recursion.subsequencepattern;

import org.junit.Test;

public class Subsets_78Test {
    Subsets_78 s = new Subsets_78();

    @Test
    public void test1(){
        int[] nums = {1,2,3};
        System.out.println(s.subsets(nums).toString());
    }

    @Test
    public void test2(){
        int[] nums = {1,2,2};
        System.out.println(s.subsets(nums).toString());
    }
}
