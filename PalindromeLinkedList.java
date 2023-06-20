import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class PalindromeLinkedList {
    public static LinkedListNode reverse(LinkedListNode head){
        LinkedListNode prev=null,curr=head,next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Write your code here!
        if(head == null || head.next == null) return true;
        
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverse(slow.next);
        slow = slow.next;
        LinkedListNode temp = head;
        while(slow!= null){
            if(!slow.data.equals( temp.data)) return false;
            temp = temp.next;
            slow = slow.next;
        }
        return true;	
	}
}