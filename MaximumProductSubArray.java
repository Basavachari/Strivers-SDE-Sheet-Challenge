import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		// Write your code here.

		int ans = Integer.MIN_VALUE;
		int pre = 1;
		int suf = 1;
		for(int i = 0;i<n;i++){
			if(pre == 0) pre = 1;
			if(suf == 0) suf = 1;
			pre = pre*arr.get(i);
			suf = suf*arr.get(n-i-1);
			ans = Math.max(ans,Math.max(pre,suf));
		}
		return ans;
	}
}