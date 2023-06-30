public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int l = 1;
        int h = m;
        int mid = l + (h-l)/2;
        while(l<=h){
            mid = l + (h-l)/2;
            if(multiply(mid, n,m) == 1) return mid;
            if(multiply(mid,n,m) == 2) h = mid-1;
            else l = mid+1;
        }
        return -1;
    }
    public static int multiply(int number,int power,int m){
        long ans = 1;
        for(int i = 0;i<power;i++){
            ans*= number;
            if(ans>m) return 2;
        }
        if(ans == m) return 1;
        return 0;
    }
}
