import java.util.* ;

public class PairSum{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == s){
                    ans.add(new int[]{arr[i],arr[j]});
                }
            }
        }
        return ans;
    }
}
