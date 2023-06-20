import java.util.* ;
import java.io.*; 

public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

	    // Write your code here.
		int i = 0;
		Arrays.sort(arr);

		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

		for(i = 0;i<n-2;i++){
			if(i>0 && arr[i] == arr[i-1]) continue;
			int l = i+1;
			int r = n-1;
			// int sum = arr[i];
			while(l<r){
				int sum = arr[i]+arr[l]+arr[r];
				if(sum<K){
					l++;
				}
				else if(sum>K){
					r--;
				}
				else {
					ans.add(new ArrayList<>(Arrays.asList(arr[i],arr[r],arr[l])));
					while (l < r && arr[l] == arr[l+1]) l++;
					while (l < r && arr[r] == arr[r-1]) r--;
					l++;
					r--;
				}
			}
		}
		return ans;
	}
}
