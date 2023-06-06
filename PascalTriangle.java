// import java.io.*;
// import java.util.* ;

import java.util.ArrayList;
public class PascalTriangle {
    
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
           ArrayList<ArrayList<Long>> ans = new ArrayList<>();
           for(int i = 1;i<=n;i++){
               ArrayList<Long> temp = new ArrayList<>();
               long val = 1;
               temp.add(val);
               for(int j = 1;j<i;j++){
                   val *= (i-j);
                   val /= j;
                   temp.add(val);
               }
               ans.add(temp);
           }
           return ans;
}
}
