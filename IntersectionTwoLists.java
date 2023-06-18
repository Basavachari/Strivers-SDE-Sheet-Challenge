/****************************************************************

 Following is the class structure of the Node class:



 *****************************************************************/

 public class IntersectionTwoLists {
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
        Node a = firstHead;
        Node b = secondHead;
        while(a!=b){
            a = a == null ? secondHead : a.next;
            b = b == null ? firstHead : b.next;
        }
        return a.data;
    }
}