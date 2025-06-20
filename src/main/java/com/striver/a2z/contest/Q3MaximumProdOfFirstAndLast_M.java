package com.striver.a2z.contest;

import java.util.ArrayList;
import java.util.List;

public class Q3MaximumProdOfFirstAndLast_M {
    public long maximumProduct(int[] nums, int m) {
        long[] res = new long[1];
        res[0] = Long.MIN_VALUE;
        List<Integer> temp = new ArrayList<>();
        findMax(res, nums, m, 0, temp, 1);
        return res[0];
    }

    public void findMax(long[] res, int[] nums, int m, int ind, List<Integer> temp, long curr){
        if (temp.size() + (nums.length - ind) < m) return;

        if(temp.size()==m){
            if(res[0]<curr){
                res[0] = curr;
            }
            return;
        }
        for(int i=ind; i<nums.length;i++) {
            temp.add(nums[i]);
            curr = (long)temp.get(0) * (long)temp.get(temp.size()-1);
            findMax(res, nums, m, i+1, temp, curr);
            temp.remove(temp.size()-1);
        }
    }
}
