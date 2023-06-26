import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int maxIncreasingDumbbellsSum(ArrayList<Integer> rack, int n) {
        // Write your code here.
        int[][] dp = new int[n][n+1];
        for(int[] row :dp){
            Arrays.fill(row,-1);
        }
        return fun(dp,rack,0,-1);
    }
    static int fun(int[][] dp,ArrayList<Integer> arr,int i,int p){
        if(i == arr.size()) return 0;
        if(dp[i][p+1] !=-1) return dp[i][p+1];

        if(p == -1 || arr.get(i)>arr.get(p)){
            return dp[i][p+1] = Math.max(fun(dp,arr,i+1,p) , arr.get(i)+fun(dp,arr,i+1,i));
        }
        return dp[i][p+1] = fun(dp,arr,i+1,p);
    }
}