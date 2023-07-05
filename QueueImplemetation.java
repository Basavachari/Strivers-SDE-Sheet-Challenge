import java.util.* ;
import java.io.*; 
public class Queue {
    int[] data;
    int end = 0;
    Queue() {
        // Implement the Constructor
        this.data = new int [5000];   
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        // Implement the isEmpty() function
        return end ==0;
    }

    void enqueue(int x) {
        // Implement the enqueue() function
        data[end++] = x;
    }

    int dequeue() {
        // Implement the dequeue() function
        if(isEmpty()) return -1;
        int dequed = data[0];
        for(int i = 1;i<end;i++)
            data[i-1] = data[i];
        end--;
        return dequed;
    }

    int front() {
        // Implement the front() function
        if(isEmpty()) return -1;
        return data[0];
    }

}
