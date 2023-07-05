import java.util.Stack;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		if(stack.empty()) return;
		int num = stack.pop();
		sortStack(stack);
		insetInSort(stack,num);
	}
	static void insetInSort(Stack<Integer> st,int num){
		if(st.empty() || st.peek() <num){
			st.push(num);
			return;
		}
		int temp = st.pop();
		insetInSort(st, num);
		st.push(temp);
	}

}