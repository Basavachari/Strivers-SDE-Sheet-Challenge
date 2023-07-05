import java.util.*;
import java.io.*;

import java.util.Stack;

public class pair {
    int x;
    int y;

    pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Solution {

    static Stack<pair> st;

    static class MinStack {

        // Constructor
        MinStack() {
            // Write your code here.
            st = new Stack<>();

        }

        // Function to add another element equal to num at the top of stack.
        void push(int num) {
            // Write your code here.
            int min;
            if (st.isEmpty())
                min = num;
            else {
                min = Math.min(st.peek().y, min);
            }
            st.push(new pair(num, min));
        }

        // Function to remove the top element of the stack.
        int pop() {
            // Write your code here.
            pair t = st.pop();
            return t.x;
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
            // Write your code here.
            return st.peek().x;
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            // Write your code here.
            return st.peek().y;
        }
    }
}