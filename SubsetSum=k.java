import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        int[][] dp = new int[n][k+1];
        for(int[] row :dp){
            Arrays.fill(row, -1);
        }
        return fun(dp,arr,n-1,k);
    }
    static boolean fun(int[][] dp,int[] arr, int i ,int k){
        if(k==0 ) return true;
        if(i==0 ) return arr[0] == k;
        if(dp[i][k] != -1) {
            if(dp[i][k]==0 ) return false;
                return true;
        }
        boolean nottake = fun(dp,arr,i-1,k);
        boolean take = false;
        if(arr[i] <=k){
            take = fun(dp,arr, i-1,k-arr[i]);
        }
        if(take|| nottake) dp[i][k] = 1;
        else dp[i][k] = 0;
        return  take|| nottake;
    }
}
