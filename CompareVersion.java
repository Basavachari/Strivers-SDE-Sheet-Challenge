import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int compareVersions(String a, String b) 
    {
        // Write your code here
        int n = a.length();
        int m = b.length();
        int i =0;
        int j =0;
        while(i<n && j<m){
            if(a.charAt(i) == '0') 
                while(i<n && a.charAt(i) =='0') i++;
            if(b.charAt(j) == '0') 
                while(j<m && b.charAt(j) =='0') j++;
            int num1 = 0;
            int num2 = 0;
            while((i<n) && a.chatAt(i)!='.')
                num1 = num1*10 + (a.charAt(i++)-'0');
            while(j<m && b.chatAt(j)!='.')
                num2 = num2*10 + (b.charAt(j++)-'0');
            if(num1>num2) return 1;
            else if(num1<num2) return -1;
            i++;
            j++;  
        }
        return 0;
    }
}