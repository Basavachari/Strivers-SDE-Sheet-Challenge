import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int m, int n) {

		// Write your code here.
		int[][] dp = new int[m][n];
		for(int[] row : dp)
			Arrays.fill(row,-1);
		return recursive(dp,0,0,m,n);
	}
	static int recursive(int[][] dp ,int i,int j ,int m ,int n){
		if(i==m-1 && j==n-1) return 1;
		if(i>=m || j>=n) return 0;
		if(dp[i][j]!=-1) return dp[i][j];
		return dp[i][j] = recursive(dp,i+1,j,m,n) + recursive(dp,i,j+1,m,n);
	}
}