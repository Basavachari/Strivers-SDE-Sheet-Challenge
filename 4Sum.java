import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
      // Write your code here.
      Arrays.sort(arr);
      for(int i = 0;i<n-3;i++){
        for(int j=i+1;j<n-2;j++){
          int k = j+1;
          int l = n-1;
          while(k<l){
            int sum = arr[i]+arr[j]+arr[k]+arr[l];
            if(sum == target) return "Yes";
            if(sum>target) l--;
            else k++;

          }
        }
      }
      return "No";
  }
}
