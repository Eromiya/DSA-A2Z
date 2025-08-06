package teamwork.strivers.a2z.recursion;

public class PowOfXAndN {
    public static double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n<0){
            return 1.0/calculatePower(x, n*-1);
        }
        return calculatePower(x, n);
    }
    public static double calculatePower(double x, int n){
        if(n==0){
            return 1;
        }
        double half = n * calculatePower(x, n/2);
        if(n%2==0){
            return half*half;
        }
        return n*half*half;
    }
    public static void main(String[] args) {
        System.out.println(myPow(2.00, 10));
    }
}
