package com.striver.a2z.contest.june22;

import com.striver.a2z.contest.jun22.Q1CheckIfPrimeFreq;
import org.junit.Assert;
import org.junit.Test;

public class Q1CheckIfPrimeFreqTest {
    Q1CheckIfPrimeFreq q1 =  new Q1CheckIfPrimeFreq();

    @Test
    public void test1(){
        int[] arr = {1,2,3,4,5};
        Assert.assertFalse( q1.checkPrimeFrequency(arr));
    }
    @Test
    public void test2(){
        int[] arr = {1,2,3,4,5, 4};
        Assert.assertFalse( q1.checkPrimeFrequency(arr));
    }

}
