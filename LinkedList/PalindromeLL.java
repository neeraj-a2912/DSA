public class PalindromeLL {

}
class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head == null || head.next == null){
            return true;
        }
        Node fast = head;
        Node slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node second = reverse(slow.next);
        slow = head;
        while(second != null){
            if(slow.data != second.data){
                return false;
            }
            second = second.next;
            slow = slow.next;
        }
        return true;
    }    
    Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

