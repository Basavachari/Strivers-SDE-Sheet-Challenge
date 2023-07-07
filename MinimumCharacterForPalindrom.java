
public class Solution {

    public static int minCharsforPalindrome(String str) {
        //Write your code here
        int n = str.length();
        int i =0; int j = n-1;
        int ans = 0;
        int temp = j;
        while(i<j){
            if(str.charAt(i)== str.charAt(j)){
                i++;j--;
            }
            else{
                ans++;
                i = 0;temp--;
                j = temp;
            }
        }
        return ans;
    }

}