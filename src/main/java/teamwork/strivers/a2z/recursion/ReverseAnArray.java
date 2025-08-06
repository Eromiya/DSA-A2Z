package teamwork.strivers.a2z.recursion;

import java.util.Arrays;

public class ReverseAnArray {
    public static int[] reverseArray(int[] arr){
        return check(arr, 0, arr.length-1);
    }

    private static int[] check(int[] arr, int start, int end) {
        if(start>=end){
            return arr;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return check(arr, start+1, end-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5, 6};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

}
