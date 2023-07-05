import java.util.*;
public class Solution {
    public static boolean isValidParenthesis(String expression) {
        // Write your code here.

        Stack<Character> st = new Stack<>();
        for(int i = 0;i<expression.length();i++){
            char c = expression.charAt(i);
            if(c == '(' || c == '{' ||c == '['){
                st.push(c);
            }
            else{
                if(st.empty()) return false;
                char temp = st.peek();
                st.pop();
                if(c == ')' && temp!= '(') return false;
                if(c == ']' && temp!= '[') return false;
                if(c == '}' && temp!= '{') return false;
            }
        }
        return st.empty();
    }
}