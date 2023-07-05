import java.util.* ;
import java.io.*; 

public class Stack {
    int[] st;
    int top = -1;
    int cap;
    Stack(int capacity){
        if(isFull()!=1){
            st = new int[capacity];
            this.cap = capacity;
        }
    }
    void push(int num) {
        // Write your code here.
        top = top+1;
        st[top] = num;
    }
    int pop() {
        // Write your code here.
        if(isEmpty()!=1){
            int x = st[top];
            top = top -1;
            return x;
        }
        return -1;
    }
    int top() {
        // Write your code here.
        if(isEmpty()!=1){
            return st[top];
        }
        return -1;
    }
    int isEmpty() {
        // Write your code here.
        if(top ==-1)
            return 1;
        else return 0;
    }
    int isFull() {
        // Write your code here.
        if(top == cap) return 1;
        return 0;
    }
}
