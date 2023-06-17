import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class LongestSubArraySum {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		int ans = 0;
		int i = 0;
		for(i = 0;i<arr.size();i++){
			int sum = 0;
			for(int j =i;j<arr.size();j++){
				sum += arr.get(j);
				if(sum == 0){
					ans = ans > (j - i +1) ? ans : (j-i+1) ;
				}
			}
		}
		return ans;

        // another approch id prefix sum array

        // int ans = 0;
        // int sum = 0;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i = 0;i<arr.size();i++){
        //     sum += arr.get(i);
        //     if(sum == 0){
        //         ans = i+1;
        //     }
        //     else{
        //         if(map.containsKey(sum)){
        //             ans = ans > (i - map.get(sum)) ? ans : (i - map.get(sum));
        //         }
        //         else{
        //             map.put(sum,i);
        //         }
        //     }
        // }
        // return ans;
            
	}
}