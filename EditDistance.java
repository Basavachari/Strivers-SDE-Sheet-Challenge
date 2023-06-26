import java.util.*;
public class Solution {

    public static int editDistance(String str1, String str2) {
        //Your code goes here
        int n1 = str1.length();
        int n2 = str2.length();
        int[][] dp = new int[n1][n2];
        for(int[] row :dp){
            Arrays.fill(row,-1);
        }
        return fun(dp,str1,str2,n1-1,n2-1);
    }
    static int fun(int[][] dp,String s1,String s2,int i,int j){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j] != -1) return dp[i][j]; 
        if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] = fun(dp,s1,s2,i-1,j-1);
        else 
        return dp[i][j] =  1+Math.min(fun(dp,s1,s2,i-1,j-1) , Math.min(fun(dp,s1,s2,i-1,j),fun(dp,s1,s2,i,j-1) ) );
    } 
}