import java.io.*;
import java.util.* ;

public class MajorityElement {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		int i = 0;
		int[] f = new int[n];
		HashMap<Integer,Integer> m = new HashMap<>();

		for(;i<n;i++){
			if(m.containsKey(arr[i])) m.put(arr[i],m.get(arr[i])+1);
			else m.put(arr[i],1);
		}
		for(Map.Entry<Integer,Integer> entry : m.entrySet()){
			int a = entry.getValue();
			if(a>n/2) return entry.getKey();
		}
		return -1;
	}
}