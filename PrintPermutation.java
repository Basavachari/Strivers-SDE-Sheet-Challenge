import java.util.* ;
import java.io.*; 
public class PrintPermutation {
    public static List<String> findPermutations(String s) {
        // Write your code here.
        List<String> ans = new ArrayList<>();
        fun(s,ans,"");
        return ans;
    }
    static void fun(String s, List<String> ans, String temp){
        if(s.length() == 0){
            ans.add(temp.toString());
        }
        for(int i = 0;i<s.length();i++){
            fun(s.substring(0,i)+s.substring(i+1, s.length()) , ans, temp+s.charAt(i));
        }
        return ;
    }
}