package com.striver.a2z.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class MaximumSumSubArray {
    public List<Integer> maximumSubArraySum(int[] arr) {
        // code here
        List<Integer> list = new ArrayList<>();
        int currStart = 0, maxStart = 0, maxEnd = 0;
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
                maxStart = currStart;
                maxEnd = i;
            }
            if (currSum <= 0) {
                currSum = 0;
                currStart = i + 1;
            }

        }
        for (int i = maxStart; i < maxEnd + 1; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
