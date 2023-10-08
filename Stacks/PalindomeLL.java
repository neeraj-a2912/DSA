class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode curr = head;
        while(curr!=null){
            st.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while(curr != null && !st.isEmpty()){
            if( curr.val != st.peek() ){
                return false;
            }
            curr = curr.next;
            st.pop();
        }
        return true;
    }
}
public class PalindomeLL {
    
}
