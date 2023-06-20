import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr, int n, int k) {
		// Write your code here.

		// int ans = 0;
		// for(int i = )
		int i = 0;
		int j = 0;
		int ans = 0;
		int flip = 0;
		for(i =0;i<n;i++){

			if(arr.get(i)==0){
				flip ++;
			}
			while(flip > k){
				if(arr.get(j) == 0){
					flip--;
				}
				j++;
			}
			ans = Math.max(ans, i-j+1);
		}
		return ans;
	}
}