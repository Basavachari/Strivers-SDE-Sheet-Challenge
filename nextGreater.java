import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
		// return new int[]{1,1};
		int[] ans = new int[n];
		Arrays.fill(ans,-1);
		// for(int i =0;i<n;i++){
		// 	for(int j = i+1;j<n;j++){
		// 		if(arr[i]<arr[j]){
		// 			ans[i] = arr[j];
		// 			break;
		// 		}
		// 	}
		// }
		/* O(n^2) time so try to implememet stack and get less time*/
		Stack<Integer> st = new Stack<>();
		for(int i = n-1;i>=0;i--){
			// pop the elements that are of lesser than arr[i]
			while(st.isEmpty() == false && st.peek() <=arr[i]) st.pop();
			if(st.isEmpty() == false){
				ans[i] = st.peek();
			}
			st.push(arr[i]);
		}


		return ans;
	}

}
