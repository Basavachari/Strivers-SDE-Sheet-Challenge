import java.util.ArrayList;

import java.util.*;
public class Solution {
	public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {
		// Write your code here.
		int[][] dp = new int[n][w+1];
		for(int[] row : dp)
			Arrays.fill(row , -1);
		return fun(dp,values,weights, n-1,w);

	}
	static int fun(int[][] dp,ArrayList<Integer> values, ArrayList<Integer> weights, int i, int w){
		if(i == 0){
			if(weights.get(0) <= w) return values.get(0);
			else return 0;
		}
		if(dp[i][w] != -1) return dp[i][w];
		int nottake = fun(dp,values,weights,i-1,w);
		int take = Integer.MIN_VALUE;
		if(weights.get(i) <= w){
			take = values.get(i) + fun(dp,values,weights,i-1,w-weights.get(i));
		}
		return dp[i][w] = Math.max(take,nottake);
	}
}