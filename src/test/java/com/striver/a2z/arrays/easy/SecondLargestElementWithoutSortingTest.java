package com.striver.a2z.arrays.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecondLargestElementWithoutSortingTest {
    SecondLargestElementWithoutSorting sec = new SecondLargestElementWithoutSorting();

    @Test
    public void test1(){
        int[] arr = {10,3,5,6,77,0,100};
        assertEquals(77, sec.secondLargest(arr));
    }
}
