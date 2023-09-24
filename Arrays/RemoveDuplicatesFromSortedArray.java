public class RemoveDuplicatesFromSortedArray {
    int remove_duplicate(int arr[],int N){
        // code here
        int k=0; 
        for(int i=0; i<N; i++){
            if(arr[k]!=arr[i]){
                arr[k+1] = arr[i];
                k++;
            }
        }
        return k+1;
    }
}
