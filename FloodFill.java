public class FloodFill
{
    public static int[][] floodFill(int[][] image, int x, int y, int newColor)
    {
        // Write your code here
        int c = image[x][y];
        fun(image,x,y,newColor,c);
        return image;
    }
    static void fun(int[][] image,int x,int y, int n,int o){
        if(x<0 || y<0 ||x == image.length || y == image[0].length || image[x][y] ==n || image[x][y] !=o) return ;
        if(image[x][y] == o) 
        {
            image[x][y] = n;
            fun(image,x+1,y,n,o);
            fun(image,x-1,y,n,o);
            fun(image,x,y-1,n,o);
            fun(image,x,y+1,n,o);

        }
    }
}

