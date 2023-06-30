import java.util.* ;
import java.io.*; 
public class Solution {
    public static int romanToInt(String s) {
        // Write your code here
        // int i = 0;
        int sum = 0;
        Hashtable<Character, Integer> table = new Hashtable<>();
        table.put('I',1);
        table.put('V',5);
        table.put('X',10);
        table.put('L',50);
        table.put('C',100);
        table.put('D',500);
        table.put('M',1000);
    int i=0;
        for(i = s.length()-1;i>0;i--){
            if(table.get(s.charAt(i)) > table.get(s.charAt(i-1)) ){
                sum += table.get(s.charAt(i)) - table.get(s.charAt(i-1));
                i--;
            }else{
            sum += table.get(s.charAt(i));
            }
        }if(i==0){
        sum+= table.get(s.charAt(0));
        }
        return sum;
        
    }
}