import java.util.* ;
import java.io.*; 

public class Solution {
	public static int matrixMultiplication(int[] arr , int N) {
		// Write your code here
		int[][] dp = new int[N][N];
		for(int[] row : dp){
			Arrays.fill(row,-1);
		}
		return fun(dp,arr, 1,N-1);
	}
	static int fun(int[][] dp,int[] arr , int i ,int j){
		if(i==j) return 0;
		if(dp[i][j] != -1) return dp[i][j];
		int mini = Integer.MAX_VALUE; 
		for(int k = i;k<j;k++){
			int steps = arr[i-1]*arr[k]*arr[j] + fun(dp,arr, i,k) + fun(dp,arr, k+1,j);
			mini = Math.min(mini, steps);
		}
		return dp[i][j] = mini;
	}
}
