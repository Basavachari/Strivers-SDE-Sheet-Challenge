import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int n = prices.size();
        int i = 0;
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(i =0;i<n;i++){
            int a = prices.get(i);
            min = Math.min(min,a);
            ans = Math.max(ans,a-min);
        }
        return ans;
    }
}