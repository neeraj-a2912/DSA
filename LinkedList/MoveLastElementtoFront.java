package LinkedList;

public class MoveLastElementtoFront {
    public static Node moveToFront(Node head) {
        // code here
        if(head.next == null){
            return head;
        }
        Node currNode = head;
        while(currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next.next = head;
        head = currNode.next;
        currNode.next = null;
        return head;
    }
    public static void main(String[] args) {
        
    }
}
