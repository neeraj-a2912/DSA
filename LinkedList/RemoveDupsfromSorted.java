public class RemoveDupsfromSorted {

}
class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here	
	    Node currNode = head;
	    while(currNode.next != null){
	        if(currNode.data == currNode.next.data){
	            currNode.next = currNode.next.next;
	        }else{
	            currNode = currNode.next;
	        }
	    }
	    return head;
    }
}
