import java.util.ArrayList;

public class Find_duplicate_in_array{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        // Collections.sort(arr);
        int[] f = new int[n];
        for(int i =0 ;i<n;i++){
            // if(arr.get(i) == arr.get(i+1) )return arr.get(i);
            if(f[arr.get(i)] > 0 ) return arr.get(i);
            f[arr.get(i)]++; 
        }
        return 0;
    }
}
