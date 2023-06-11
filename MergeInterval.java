import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/
class Interval {
    int start, finish;
    public Interval(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}
public class MergeInterval {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        // fitst we gona sort the intervals based on 1st element
        Arrays.sort(intervals , new Comparator<Interval>() {
            public int compare(Interval i,Interval j){
                return i.start - j.start;
            }
        });
        List<Interval> ans = new ArrayList<>();
        
        for(Interval i : intervals){
            // if 2 doesnot exists in intervel then add the interval itself
            if(ans.isEmpty() || i.start > ans.get(ans.size()-1).finish ){
                ans.add(i);
            }
            // else add the max value;
            else {
                Interval temp = ans.get(ans.size()-1); 
                temp.finish = Math.max(temp.finish, i.finish);
                ans.set(ans.size()-1,temp);
            }
        }
        return ans;

    }
}
