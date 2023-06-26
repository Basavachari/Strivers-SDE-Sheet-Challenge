import java.util.*;

public class Solution {

	public static int longestIncreasingSubsequence(int arr[]) {
		// Your code goes here
		int n = arr.length;
		
		int[] dp = new int[n];
		// for(int row[]: dp)
		Arrays.fill(dp, 1);
		for (int i = 0; i < n; i++) {
			for (int p = 0; p < i; p++) {
				if (arr[p] < arr[i])
					dp[i] = Math.max(dp[i], 1 + dp[p]);
			}
		}
		int ans = -1;
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, dp[i]);
		}
		return ans;
		// return fun(arr,dp,0,-1);
	}

	static int fun(int[] arr, int[][] dp, int i, int pre) {
		if (i == arr.length)
			return 0;
		if (dp[i][pre + 1] != -1)
			return dp[i][pre + 1];
		int notake = fun(arr, dp, i + 1, pre);
		int take = 0;
		if (pre == -1 || arr[i] > arr[pre]) {
			take = 1 + fun(arr, dp, i + 1, i);
		}
		return dp[i][pre + 1] = Math.max(take, notake);
	}

}