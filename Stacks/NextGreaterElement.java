public class NextGreaterElement{
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        long[] ans = new long[n];
        Stack<Long> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                ans[i] = -1;
            } else if (arr[i] < st.peek()) {
                ans[i] = st.peek();
            } else if (arr[i] >= st.peek()) {
                while (st.size() > 0 && st.peek() <= arr[i]) {
                    st.pop();
                }
                if (st.size() == 0) {
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek();
                }
            }
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}