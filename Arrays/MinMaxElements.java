public class MinMaxElements {

    public static int minMax(int[] arr, int n) {
        int mini=arr[0];
        int maxi=arr[0];
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
        }
        return maxi+mini;
    }
    public static void main(String[] args) {
        
    }
}
