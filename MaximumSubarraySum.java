import java.util.* ;
import java.io.*; 

public class MaximumSubarraySum {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long max = Integer.MIN_VALUE;
		long sum = 0;
		for(int i = 0;i<n;i++){
			sum += arr[i];
			if(sum < 0 ) sum = 0;
			max = max>sum ? max : sum;
		}
		return max;
	}

}
