package teamwork.strivers.a2z.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static List<String> generateParanthesis(int n){
        List<String> list = new ArrayList<>();
        helper(0,0,list,n, "");
        return list;
    }

    private static void helper(int open, int close, List<String> list, int n, String str) {
        if(n*2 == str.length()){
            list.add(str);
            return;
        }
        if(open<n){
            helper(open+1, close, list, n, str+'(');
        }
        if(close<open){
            helper(open, close+1, list, n, str+')');
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParanthesis(3));
    }
}
