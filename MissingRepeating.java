import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int[] ans = new int[2];
        int[] f = new int[n];
        for(int i : arr){
            f[i-1]++;
        }
        for(int i=0;i<n;i++){
            if(f[i]==0) ans[0]=i+1;
            else if(f[i]==2) ans[1]=i+1;
        }
        return ans;
    }
}