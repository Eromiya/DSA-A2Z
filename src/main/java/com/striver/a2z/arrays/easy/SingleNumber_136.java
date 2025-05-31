package com.striver.a2z.arrays.easy;

/**
 * Given a non-empty array of integers arr,
 * every element appears twice except for one.
 * Find that single one.
 *
 * Key Logic :- XOR  (^)
 */
public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}
