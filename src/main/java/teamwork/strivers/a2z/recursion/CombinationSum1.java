package teamwork.strivers.a2z.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    public static void main(String[] args) {
        int[] arr = {2,3,4};
        System.out.println(findCombinationSum1(arr, 7).toString());
    }

    private static List<List<Integer>> findCombinationSum1(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        combinationSum1(0, arr, result, in, target);
        return result;
    }

    private static void combinationSum1(int ind, int[] arr, List<List<Integer>> result, List<Integer> in, int target) {
        if(target == 0) {
            result.add(new ArrayList<>(in));
            return;
        }
        if(target<0){
            return;
        }
        for(int i = ind; i<arr.length;i++){
            in.add(arr[i]);
            combinationSum1(i, arr, result, in, target-arr[i]);
            in.remove(in.size()-1);
        }
    }
}
