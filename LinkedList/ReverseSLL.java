public class ReverseSLL {
    
}
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node currNode = head;
        Node prev = null;
        Node next;
        while(currNode != null){
            next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }
        return prev;
    }
}