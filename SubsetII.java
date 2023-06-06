import java.util.* ;
import java.io.*; 
public class SubsetII {
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        // Write your code here..
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        fun(arr,n,0,ans,new ArrayList<>());
        return ans;
    }
    static void fun(int[] arr, int n,int ind, ArrayList<ArrayList<Integer>> ans, List<Integer> temp){
        ans.add(new ArrayList<>(temp));
        for(int i = ind;i<n;i++ ){
            if(i!=ind && arr[i] == arr[i-1]) continue;
            else{
                temp.add(arr[i]);
                fun(arr,n,i+1,ans,temp);
                temp.remove(temp.size()-1);
                // fun(ans,n,i+1,ans,temp);
            }
        }
    }

}