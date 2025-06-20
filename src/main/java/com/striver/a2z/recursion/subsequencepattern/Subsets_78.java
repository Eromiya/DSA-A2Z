package com.striver.a2z.recursion.subsequencepattern;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> in = new ArrayList<>();
        List<List<Integer>> out = new ArrayList<>();
        generateSubsets(out,0, in, nums);
        return out;
    }
    public  void generateSubsets(List<List<Integer>>  out, int ind, List<Integer> in, int[] nums){
        out.add(new ArrayList<>(in));
        for(int i=ind; i<nums.length;i++) {
            in.add(nums[ind]);
            generateSubsets(out, ind+1, in, nums);
            in.remove(in.size()-1);
        }
    }
}
