import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minSumPath(int[][] grid) {
    	// Write your code here.
        int r = grid.length;
        int c = grid[0].length;
        int[][] dp = new int[r][c];
        for(int[] row :dp) Arrays.fill(row,-1);
        return fun(dp,grid,r-1,c-1);
    }
    static int fun(int[][] dp,int[][] grid, int i,int j ){
        if(i==0 && j==0) return grid[0][0];
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = grid[i][j] +Math.min(fun(dp,grid,i-1,j),fun(dp,grid,i,j-1));
    }
}