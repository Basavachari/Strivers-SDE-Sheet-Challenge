import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	


*/
class LinkedListNode<T> 
{
    T data;
    LinkedListNode<T> next;
    public LinkedListNode(T data) 
    {
        this.data = data;
    }
}
public class ReverseLinkedList 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		LinkedListNode<Integer> newhead = null;
		while(head!=null){
			LinkedListNode<Integer> next = head.next;
			head.next = newhead;
			newhead = head;
			head = next;
		}
		return newhead;
    }
}