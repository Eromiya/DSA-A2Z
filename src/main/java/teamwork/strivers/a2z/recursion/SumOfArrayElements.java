package teamwork.strivers.a2z.recursion;

public class SumOfArrayElements {
    static int i=0;
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sumOfElements(arr));
    }

    private static int sumOfElements(int[] arr) {
        if(i>=arr.length){
            return 0;
        }

        return arr[i++] + sumOfElements(arr);
    }

}
