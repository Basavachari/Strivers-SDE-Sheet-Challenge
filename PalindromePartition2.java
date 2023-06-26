import java.util.* ;
import java.io.*;
import java.lang.Math;
public class Solution {

	public static int palindromePartitioning(String str) {
	    // Write your code here
		int n = str.length();
		int[] dp = new int[n];
		Arrays.fill(dp,-1);
		return fun(dp,str,0)-1; 
	}
	static boolean isPalindrome(int i, int j, String s) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) return false;
			i++;
			j--;
		}
    	return true;
	}
	static int fun(int[] dp,String s, int i){
		if(i==s.length()) return 0;
		if(dp[i] != -1) return dp[i];
		int Min = Integer.MAX_VALUE;
		int cost = 0;
		for(int j =i;j<s.length();j++){
			if(isPalindrome(i,j,s)){
				 cost = 1 + fun(dp,s,j+1);
			}
			Min = Math.min(cost,Min);
		}
		return dp[i] = Min;
	}
}
