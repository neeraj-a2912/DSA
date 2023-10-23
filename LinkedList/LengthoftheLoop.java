public class LengthoftheLoop {

}

class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node slow = head;
        Node fast = head;
        boolean loop = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                   loop = true;
                   break;
            }
        }
        int length = 1;
        if(loop){
            Node dummy = slow.next;
            while(dummy != slow){
                length++;
                dummy = dummy.next;
            }
            return length;
        }
        return 0;
    }
}
