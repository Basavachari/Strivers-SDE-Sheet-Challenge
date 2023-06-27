import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int k) {
		// Write your code here.
		// int ans = 0;
		// for(int i = 0;i<arr.size();i++){
		// 	int Xor= 0;
		// 	for(int j = i;j<arr.size();j++){
		// 		Xor = Xor ^ arr.get(j);
		// 		if(Xor == x) ans++;
		// 	}
		// }
		// return ans;
		int n = arr.size(); //size of the given array.
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>(); //declaring the map.
        mpp.put(xr, 1); //setting the value of 0.
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            // prefix XOR till index i:
            xr = xr ^ arr.get(i);

            //By formula: x = xr^k:
            int x = xr ^ k;

            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }
            if (mpp.containsKey(xr)) {
                mpp.put(xr, mpp.get(xr) + 1);
            } else {
                mpp.put(xr, 1);
            }
        }
        return cnt;
	}
}