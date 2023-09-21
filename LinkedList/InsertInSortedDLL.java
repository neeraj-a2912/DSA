public class InsertInSortedDLL {
    public static Node sortedInsert(Node head, int x)
    {
        // add your code here
        Node newNode = new Node(x);
        Node currNode = head;
        
        if(x<=head.data){
            newNode.next = head;
            head.prev = newNode;
            return newNode;    
        }
        
        while(currNode.next != null && currNode.next.data < x){
            currNode = currNode.next;
        }
        
        newNode.prev = currNode;
        newNode.next = currNode.next;
        if(currNode.next != null){
            
        currNode.next.prev = newNode;
        }
        currNode.next = newNode;
        
        return head;
    public static void main(String[] args) {
        
    }
}
