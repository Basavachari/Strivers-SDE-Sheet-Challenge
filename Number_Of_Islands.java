public class Number_Of_Islands 
{
    public static int getTotalIslands(int[][] mat) 
	{
        //Your code goes here

        int c = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] == 1){
                    c++;
                    dfs(mat,i,j);
                }
            }
        }
        return c++;
    }
    public static void dfs(int[][] mat,int x,int y){
        if( x<0 || y<0 || x>=mat.length || y>= mat.length ||mat[x][y] != 1 ){
            return ;
        }
        mat[x][y] = -1;
        dfs(mat,x-1,y-1);
        dfs(mat,x-1,y);
        dfs(mat,x-1,y+1);
        
        dfs(mat,x,y+1);
        dfs(mat,x+1,y+1);
        dfs(mat,x+1,y);
        dfs(mat,x+1,y-1);
        dfs(mat,x-1,y);


    }
}