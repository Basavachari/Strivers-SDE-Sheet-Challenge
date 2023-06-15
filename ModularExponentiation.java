import java.io.*;
import java.util.* ;

public class ModularExponentiation {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.   
        long ans = 1;
        long y = x;
        while(n>0){
            if(n%2!=0){
                ans = ( ans%m * y %m)%m; 
            }
            y = (y%m *y%m )%m;
            n = n>>1;
        }
        return (int) (ans%m);
    }
}