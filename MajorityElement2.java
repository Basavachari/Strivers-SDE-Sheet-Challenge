import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class MajorityElement2 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int n = arr.size();
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> m = new HashMap<>();
        for(Integer i : arr){
            if(m.containsKey(i)){
                m.put(i, m.get(i)+1);
            }
            else{
                m.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> e : m.entrySet()){
            if(e.getValue() > n/3) ans.add(e.getKey());
        }
        return ans;
    }
}