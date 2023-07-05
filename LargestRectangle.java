import java.util.ArrayList;
import java.util.Stack;

public class Solution {
  public static int largestRectangle(ArrayList < Integer > heights) {
    // Write your code here.
    int n = heights.size();
        Stack<Integer> st = new Stack<>();
        int leftSmall[] = new int[n];
        int rightSmall[] = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights.get(st.peek()) >= heights.get(i)) {
                st.pop();
            }

            if (st.isEmpty()) leftSmall[i] = 0;
            else leftSmall[i] = st.peek() + 1;
            st.push(i);
        }
        while (!st.isEmpty()) st.pop();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights.get(st.peek()) >= heights.get(i)) {
                st.pop();
            }

            if (st.isEmpty()) rightSmall[i] = n - 1;
            else rightSmall[i] = st.peek() - 1;
            st.push(i);
        }        
        int maxA = 0;
        for (int i = 0; i < n; i++) {
            maxA = Math.max(maxA, heights.get(i) * (rightSmall[i] - leftSmall[i] + 1));
        }
        return maxA;

  }
}