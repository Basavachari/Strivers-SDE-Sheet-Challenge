import java.util.* ;
import java.io.*; 
public class Sort012 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int[] map = new int[3];
        for(int i = 0;i<arr.length;i++){
            map[arr[i]]++;
        }
        int j = 0;
        // int i = 0;
        for(int i = 0;i<map[0];i++) arr[i]=0;
        // j++;
        for(int i = map[0];i<map[0]+map[1];i++) arr[i]=1;
        // j++;
        for(int i = map[0]+map[1];i<map[2]+map[0]+map[1];i++) arr[i]=2;


        
    }
}