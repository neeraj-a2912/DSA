import java.util.Stack;

public class LargestRectangleInHistogram {
    lass Solution {
    
    public int[] getLeft(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nsl = new int[n];
        
        for(int i=0; i<n; i++){
            if(st.isEmpty()){
                nsl[i] = -1;
            }else if(arr[st.peek()] < arr[i]){
                nsl[i] = st.peek();
            }else if(arr[st.peek()]>=arr[i]){
                while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    nsl[i] = -1;
                }else{
                    nsl[i] = st.peek();
                }
            }
            st.push(i);
        }
        return nsl;
    }

    public int[] getRight(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nsr = new int[n];
        
        for(int i=n-1; i>=0; i--){
            if(st.isEmpty()){
                nsr[i] = n;
            }else if(arr[st.peek()] < arr[i]){
                nsr[i] = st.peek();
            }else if(arr[st.peek()]>=arr[i]){
                while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    nsr[i] = n;
                }else{
                    nsr[i] = st.peek();
                }
            }
            st.push(i);
        }
        return nsr;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if(n==1){
            return heights[0];
        }
        
        int[] left = getLeft(heights);
        int[] right = getRight(heights);
        int[] width = new int[n];
        int maxArea = 0;
        for(int i=0; i<n; i++){
            width[i] = right[i] - left[i] - 1;
            maxArea = Math.max(maxArea, heights[i]*width[i]);
        }
        return maxArea;
    }
}
}
