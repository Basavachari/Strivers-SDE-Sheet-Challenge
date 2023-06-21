import java.util.*;

public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
        //Write your code here
        int n = start.size();
        List<List<Integer>> act = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> a = new ArrayList<>();
            a.add(start.get(i));
            a.add(end.get(i));
            act.add(a);
        }
        Collections.sort(act,(a,b)-> (a.get(1)-b.get(1)));
        int e = act.get(0).get(1);
        int ans = 1;
        for(int i =1;i<n;i++){
            if(e <= act.get(i).get(0) ){
                ans++;
                e = act.get(i).get(1);
            }
        }
        return ans;
    }
}
