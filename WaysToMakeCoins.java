import java.util.*;
public class Solution {

	public static long countWaysToMakeChange(int denominations[], int value){
        //write your code here	
		int n = denominations.length;
		long[][] dp = new long[n][value+1];
		for(long[] row : dp)
			Arrays.fill(row,-1);
		return fun(dp,denominations,value,n-1);

	}
	static long fun(long[][] dp,int[] arr,int t,int i){
		if(i==0){
			if(t%arr[0] ==0)
				return 1;
			return 0;
		}
		if(dp[i][t]!=-1) return dp[i][t];
		long nottake = fun(dp,arr, t,i-1);
		long take = 0;
		if(arr[i]<= t){
			take = fun(dp,arr,t-arr[i] ,i);
		}
		return dp[i][t] = take+ nottake;
	}
	
}