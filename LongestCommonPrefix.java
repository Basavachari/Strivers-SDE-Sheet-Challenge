import java.util.*;
public class Solution {
	public static String longestCommonPrefix(String[] arr, int n) {

		Arrays.sort(arr);
		String ans = "";
		String first = arr[0];
		String last = arr[n-1];
		for(int i = 0;i<first.length();i++){
			if(first.charAt(i) != last.charAt(i)) return ans;
			ans = ans + first.charAt(i);
		}
	return ans;
	}


}
