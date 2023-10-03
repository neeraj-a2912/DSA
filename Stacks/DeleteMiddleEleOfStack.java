class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        Stack<Integer> st = new Stack<>();
        int mid = sizeOfStack/2;
        for(int i=0;i<mid;i++){
            st.push(s.pop());
        }
        s.pop();
        while(!st.isEmpty()){
            s.push(st.pop());
        }
    } 
}

public class DeleteMiddleEleOfStack {
    public static void main(String[] args) {
        
    }
}
