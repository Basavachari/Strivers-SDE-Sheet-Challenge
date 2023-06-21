import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount)
    {
        // Write your code here.
        int ans =0;
        int[] coins = new int[]{1,2,5,10,20,50,100,500,1000};
        int i =8;
        while(amount>0 && i>=0){
            if(amount < coins[i]){
                i--;
                continue;
            }
            ans = ans + amount/coins[i];
            amount = amount % coins[i];
        }
    return ans;
    }
}
