import java.util.*;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		// Collection.sort()
		if(n==1) return 0;
		int i = 0;
		int j = 1;
		int ans = 1;
		while(j<n){
			if(!arr.get(j).equals(arr.get(i))){
				i = j;
				ans++;
			}
			j++;
		}
		return ans;
	}
}