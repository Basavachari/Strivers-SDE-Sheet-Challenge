class LinkedListNode {
    int data;
    LinkedListNode next;
    
    public LinkedListNode(int data) {
        this.data = data;
    }
}

public class AddTwoNumbers {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        LinkedListNode temp = new LinkedListNode(0);
        LinkedListNode p = temp;
        int c = 0;
        while(head1!= null || head2 != null || c ==1){
            int sum = 0;
            if(head1!= null){
                sum += head1.data;
                head1 = head1.next;
            }
            if(head2!=null){
                sum+=head2.data;
                head2 = head2.next;
            }
            sum += c;
            c = sum/10;
            LinkedListNode node = new LinkedListNode(sum%10);
            p.next = node;
            p = p.next;
        }
        return temp.next;
    }
}