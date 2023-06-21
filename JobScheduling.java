import java.util.*;
import java.io.*;

public class Solution {
    public static int jobScheduling(int[][] jobs) {
        // Write your code here

        Arrays.sort(jobs, (a, b) -> (b[1] - a[1]));
        // System.out.println(jobs[0][1]);
        int ans = 0;
        int n = jobs.length;
        boolean[] res = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = Math.min(n - 1, jobs[i][0] - 1); j >= 0; j--) {
                if (res[j] == false) {
                    res[j] = true;
                    ans += jobs[i][1];
                    break;
                }
            }
        }
        return ans;
    }
}
