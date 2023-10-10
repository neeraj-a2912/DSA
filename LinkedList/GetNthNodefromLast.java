public class GetNthNodefromLast {
    
}
class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	Node fast = head;
    	Node slow = head;
    	for(int i=0; i<n; i++){
    	    if(fast == null){
    	        return -1;
    	    }
    	    fast = fast.next;
    	}
    	while(fast != null){
    	    fast = fast.next;
    	    slow = slow.next;
    	}
    	return slow.data;
    }
}