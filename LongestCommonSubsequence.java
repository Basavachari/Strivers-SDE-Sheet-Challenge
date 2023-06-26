import java.util.*;
public class Solution {

	public static int lcs(String s, String t) {
		//Your code goes here
		int l1 = s.length();
		int l2 = t.length();
		int[][] dp = new int[l1+1][l2+1];
		for(int[] row :dp){
			Arrays.fill(row,-1);
		}
		int ans = -1;
		for(int i = 0;i<=l1;i++){
			dp[i][0] = 0;
		}
		for(int i = 0;i<=l2;i++){
			dp[0][i] = 0;
		}

		for(int i1 = 1;i1<=l1;i1++){
			for(int i2 = 1;i2<=l2;i2++){
				if(s.charAt(i1-1) == t.charAt(i2-1)){
					dp[i1][i2] = 1 + dp[i1-1][i2-1];
				}
				else{
					dp[i1][i2] = Math.max(dp[i1-1][i2], dp[i1][i2-1]);

				}
			}
		}
		return dp[l1][l2];
		// return fun(s,t,dp,s.length()-1,t.length()-1);
    }
	static int fun(String s,String t,int[][] dp,int i1,int i2){
		if(i1<0 || i2<0){
			return 0;
		}
		if(dp[i1][i2] != -1){
			return dp[i1][i2];
		}
		if(s.charAt(i1) == t.charAt(i2)){
			return dp[i1][i2] = 1+fun(s,t,dp,i1-1,i2-1);
		}
		return dp[i1][i2] = Math.max(fun(s,t,dp,i1-1,i2),fun(s,t,dp,i1,i2-1));
	}

}	