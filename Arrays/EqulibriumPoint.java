public class EqulibriumPoint {
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long left = 0, right = 0;
        for(int i=0; i<n; i++){
            left += arr[i];
        }
        for(int i=0; i<n; i++){
            left -= arr[i];
            if(left == right){
                return i+1; // 1 based Indexing
            }
            right += arr[i];
        }
        return -1;
    }
}
