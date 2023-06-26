import java.util.Arrays;

public class Solution {
	public static int cutRod(int price[], int n) {
		// Write your code here.
		int [][] dp =new int[n][n+1];
		for(int[] row : dp){
			Arrays.fill(row, -1);
		}
		return fun(dp,price,n,n-1);
	}
	static int fun(int[][] dp,int[] price,int l ,int i ){
		if(i==0) return l*price[0];
		int take = Integer.MIN_VALUE;
		if(dp[i][l] != -1) return dp[i][l];
		if(i+1 <= l){
			take = price[i] + fun(dp,price,l-i-1 ,i);
		}
		int nottake =fun(dp,price,l,i-1);
		return dp[i][l] = Math.max(take ,nottake);
	}

}
