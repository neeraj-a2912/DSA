public class IntersectionPointInYShaped {

}
class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
        int size1=0, size2=0;
        Node list1 = head1;
        Node list2 = head2;
        while(list1 != null){
            size1++;
            list1 = list1.next;
        }
        while(list2 != null){
            size2++;
            list2 = list2.next;
        }
        list1 = head1;
        list2 = head2;
        if(size1>size2){
            for(int i=0; i<size1-size2; i++){
                list1 = list1.next;
            }
        }else{
            for(int i=0; i<size2-size1; i++){
                list2 = list2.next;
            }
        }
        while(list1 != null && list2 != null){
            if(list1 == list2){
                return list1.data;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        return -1;
	}
}
