import java.util.Stack;

public class StockSpanProblem {
    class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        
        for(int i=0; i<n; i++){
            int curr = price[i];
            if(st.isEmpty()){
                res[i] = i+1 ;
            }else if(price[st.peek()]>curr){
                res[i] = i-st.peek();
            }else{
                if(price[st.peek()]<=curr){
                    while(!st.isEmpty() && price[st.peek()]<=curr){
                        st.pop();
                    }
                    if(st.isEmpty()){
                        res[i] = i+1;
                    }else{
                        res[i] = i-st.peek();
                    }
                }
            }
            st.push(i);
        }
        return res;
    }
    
}
    public static void main(String[] args) {
        
    }
}
