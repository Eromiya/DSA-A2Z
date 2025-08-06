package teamwork.strivers.a2z.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args) {
        int[] arr = {4,3,2};
        System.out.println(findCombinationSum3(arr, 7));
    }

    private static List<List<Integer>> findCombinationSum3(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        Arrays.sort(arr);
        combinationSum3(0, arr, result, in, target);
        return result;
    }

    private static void combinationSum3(int ind, int[] arr, List<List<Integer>> result, List<Integer> in, int target) {
        if(target == 0) {
            result.add(new ArrayList<>(in));
            return;
        }
        if(target<0){
            return;
        }
        for(int i = ind; i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]){
                continue;
            }
            if(target-arr[i] <0){
                break;
            }
            in.add(arr[i]);
            combinationSum3(i+1, arr, result, in, target-arr[i]);
            in.remove(in.size()-1);
        }
    }
}
