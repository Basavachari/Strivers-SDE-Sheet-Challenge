import java.util.*;
public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        int i = 1;
        int j = 0;
        int ans = 1;
        int temp = 1;
        Arrays.sort(at);
        Arrays.sort(dt);
        while(i<n && j<n){
            if(at[i] <=dt[j]){
                temp++;
                i++;
            }
            else if(at[i] > dt[j]){
                temp--;
                j++;
            }
            if(temp> ans){
                ans = temp;
            }
        }
        return ans;
    }
}