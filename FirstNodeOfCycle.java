/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

 public class FirstNodeOfCycle {
    public static Node firstNode(Node head) {
        // Write your code here.

        Node slow = head;
        Node fast = head;
        Node entry = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                while(entry != slow ){
                    entry = entry.next;
                    slow = slow.next;
                    
                }
                return slow;
            }
        }
        return null;
    }
}