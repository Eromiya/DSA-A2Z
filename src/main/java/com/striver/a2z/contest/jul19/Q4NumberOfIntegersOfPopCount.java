package com.striver.a2z.contest.jul19;

import java.util.ArrayList;
import java.util.List;

public class Q4NumberOfIntegersOfPopCount {
//    public List<String> validStrings(int n) {
//        List<String> result = new ArrayList<>();
//        generateBinaryStrings1("", n, result);
//        return result;
//    }
public static void main(String[] args) {

    System.out.println(popcountDepth(15, 2));
}

    public static long popcountDepth(long n, int k) {
        long count =0;
        if(k==0){
            return 1;
        }
        for(long i=2;i<=n;i++){
            if(Long.bitCount(i) == k){
                count++;
            }
        }
        return count;
    }

    public static long popcountDepth1(long n, int k) {
        long[] count = {0};
        generateBinaryStrings1("", n, 0, k, count, 0);
        return count[0];
    }
    public static void generateBinaryStrings1(String sb, long n, int sum, int k, long[] count, int ind){
        if(ind == n){
            return;
        }
        if(sum == k){
            count[0]+=1;
        }
        generateBinaryStrings1(sb+"0", n, sum, k, count, ind+1);
        generateBinaryStrings1(sb+"1", n, sum+1, k, count, ind+1);

    }
}
