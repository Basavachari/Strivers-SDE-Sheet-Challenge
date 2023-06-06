import java.util.* ;
import java.io.*; 
public class SubsetSum {
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> ans = new ArrayList<>();
        fun(num, ans,0,0);
        Collections.sort(ans);
        return ans;
    }
    public static void fun(int num[],ArrayList<Integer> ans,int sum,int i){
        if(i==num.length){
            ans.add(sum);
            return; 
        }
        fun(num,ans,sum+num[i],i+1);
        fun(num,ans,sum,i+1);
    }

}