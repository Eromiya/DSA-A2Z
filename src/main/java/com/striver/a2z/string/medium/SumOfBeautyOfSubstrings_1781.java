package com.striver.a2z.string.medium;

public class SumOfBeautyOfSubstrings_1781 {
    public int beautySum(String s) {

        int sum = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int[] freq = new int[26];
            for (int j = 1; j < len; j++) {
                char ch = s.charAt(j);
                freq[ch - 'a']++;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {

                        if (freq[k] < min) {
                            min = freq[k];
                        }
                        if (freq[k] > max) {
                            max = freq[k];
                        }

                    }
                }
                sum += max - min;
            }

        }
        return sum;
    }
}
