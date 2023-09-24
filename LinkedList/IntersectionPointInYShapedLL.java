public class IntersectionPointInYShapedLL {
    
    int intersectPoint(Node head1, Node head2)
	{
         // code here
         int first, second;
         first=second=0;
         Node curr1 = head1;
         Node curr2 = head2;
         while(curr1 != null){
             first++;
             curr1 = curr1.next;
        }
        while(curr2 != null){
             second++;
             curr2 = curr2.next;
        }
        curr1=head1; curr2=head2;
        if(first>second){
            for(int i=0; i<first-second; i++){
                curr1=curr1.next;
            }
        }else{
                for(int i=0; i<second-first; i++){
                    curr2=curr2.next;
                }
            }
        while(curr1!=null && curr2!=null){
            if(curr1==curr2){
                return curr1.data;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return -1;
	}
    public static void main(String[] args) {
        
    }
}