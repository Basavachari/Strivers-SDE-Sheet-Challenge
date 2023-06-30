import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[][] board = new int[n][n];
        helper(ans,board,0);
        return ans;
    }
    public static void helper(ArrayList<ArrayList<Integer>> ans ,int[][]board,int col){
        if(col == board.length){
            save(ans,board);
            return;
        }
        for(int r = 0;r<board.length;r++){
            if(issafe(board,r,col)){
                board[r][col] = 1;
                helper(ans,board,col+1);
                board[r][col] = 0;
            }
        }
    }
    static boolean issafe(int[][] board,int row,int col){
        //horizontal
        for(int i = 0;i<board.length;i++){
            if(board[row][i] == 1) return false;
        }
        //vertical
        for(int i=0;i<board.length;i++){
            if(board[i][col]== 1) return false;
        }
        //Diagonolly
        //upper left
        for(int c=col,r=row;c>=0 && r>=0;r--,c--){
            if(board[r][c]==1) return false;
        }
        //upper right
        for(int c=col,r=row;c<board.length && r>=0;r--,c++){
            if(board[r][c]==1) return false;
        }
        //bottom left
        for(int c=col,r=row;c>=0 && r<board.length;r++,c--){
            if(board[r][c]==1) return false;
        }
        //bottom right
        for(int c=col,r=row;c<board.length && r<board.length;r++,c++){
            if(board[r][c]==1) return false;
        }
        return true;
    }
    static void save(ArrayList<ArrayList<Integer>> ans ,int[][]board){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int[] row : board){
            for(int e : row){
                temp.add(e);
            }
            // ans.add(Arrays.asList(row));
        }
        ans.add(temp);
        return;
    }
}