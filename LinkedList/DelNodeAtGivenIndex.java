public class DelNodeAtGivenIndex {

}
class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here
	        if(x==1){
	            head = head.next;
	            return head;
	        }
	    Node currNode = head;
	    for(int i=0; i<x-2; i++){
	        currNode = currNode.next;
	    }
	    currNode.next = currNode.next.next;
	    return head;
    }
}
