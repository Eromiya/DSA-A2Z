package teamwork.strivers.a2z.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,1};
        System.out.println(findSubset1(arr).toString());
    }

    private static List<List<Integer>> findSubset1(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        Arrays.sort(arr);
        subset1(0, arr, result, in);
        return result;
    }

    private static void subset1(int ind, int[] arr, List<List<Integer>> result, List<Integer> in) {
        result.add(new ArrayList<>(in));
        for(int i = ind; i<arr.length;i++){
            if(i>ind && arr[i] == arr[i-1]){
                continue;
            }
            in.add(arr[i]);
            subset1(i+1, arr, result, in);
            in.remove(in.size()-1);
        }
    }
}
