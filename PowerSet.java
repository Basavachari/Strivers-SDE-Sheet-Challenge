import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		// WRITE YOUR CODE HERE
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		backtrack(arr, 0 ,new ArrayList<>(),ans);
		return ans;
	}
	static void backtrack(ArrayList<Integer> arr, int i ,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans){
		if(i == arr.size()){
			ans.add(new ArrayList<>(temp));
			return;
		}
		temp.add(arr.get(i));
		backtrack(arr,i+1,temp,ans);
		temp.remove(temp.size()-1);
		backtrack(arr,i+1,temp,ans);
	}
}

