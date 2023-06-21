import java.awt.List;
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
	{
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        fun(arr,ans,k,0,new ArrayList<>());
        return ans;
    }
    public static void fun(ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> ans,int sum,int i,ArrayList<Integer> temp ){
        if(sum == 0 && i == arr.size()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(i<arr.size()){
            temp.add(arr.get(i));
            fun(arr,ans,sum-arr.get(i),i+1,temp);
            temp.remove(temp.size()-1);
            fun(arr,ans,sum,i+1,temp);
        }
            
        
    }
}