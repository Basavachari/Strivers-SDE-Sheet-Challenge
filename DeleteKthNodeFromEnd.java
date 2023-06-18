/****************************************************************
 Following is the class structure of the Node class:
 *****************************************************************/
class Node {
    public int data;
    public Node next;
    public Node prev;

    Node()
    {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
        this.prev = next;
    }
};

public class DeleteKthNodeFromEnd
 {
     public static Node removeKthNode(Node head, int K)
     {   
        Node start=new Node(0);
        
        start.next=head;
        // Write your code here.
        Node p1 = head;
        Node p2 = head;
        for(int i =0 ;i<K;i++){
            p2 = p2.next;
        }
        if(p2==null) return start.next.next;
        while(p2.next!= null){
            p2 = p2.next;
            p1 = p1.next;
        }                
        if(p1.next != null)
        p1.next = p1.next.next;

        return start.next;
         // return p1;
     }
 }