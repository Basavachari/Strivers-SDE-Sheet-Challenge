import java.util.* ;
import java.io.*; 
public class Stack {

    // Define the data members.
    static Queue<Integer> q1;
    static Queue<Integer> q2;


    public Stack() {
        // Implement the Constructor.
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        // Implement the getSize() function.
        if(q1.isEmpty()) return 0;
        return q1.size();
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function.
        if(q1.isEmpty()) return true;
        return false;
    }

    public void push(int element) {
        // Implement the push(element) function.
        while(!q1.isEmpty()) {
            q2.add(q1.element());
            q1.remove();
        }
        q1.add(element);
        while(!q2.isEmpty()){
            q1.add(q2.element());
            q2.remove();
        }
    }

    public int pop() {
        // Implement the pop() function.
        if(q1.isEmpty()) return -1;
        return q1.remove();
    }

    public int top() {
        // Implement the top() function.
        if(q1.isEmpty()) return -1;
        return q1.peek();
    }
}