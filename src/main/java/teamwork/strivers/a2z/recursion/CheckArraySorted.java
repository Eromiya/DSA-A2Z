package teamwork.strivers.a2z.recursion;

import java.util.Arrays;

public class CheckArraySorted {
    public static boolean checkSorted(int[] arr){
        return check(arr, 1);
    }

    private static boolean check(int[] arr, int start) {
        if(start>=arr.length){
            return true;
        }
        if(arr[start]<arr[start-1]){
            return false;
        }
        return check(arr, start+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7, 6};
        System.out.println(checkSorted(arr));
    }
}
