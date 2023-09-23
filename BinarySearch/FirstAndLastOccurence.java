package BinarySearch;

public class FirstAndLastOccurence {
     public pair indexes(long v[], long x)
    {
        // Your code goes here
        int first = -1, second = -1;
        int start = 0, end = v.length - 1, mid;
        while(start<=end){
            mid = (start+end)/2;
            if(v[mid]==x){
                first = mid;
                end = mid - 1;
            }else if(v[mid]>x){
                end = mid - 1;
            }else{
                start = mid+1;
            }
        }
        start = 0; end = v.length-1; 
        while(start<=end){
            mid = (start+end)/2;
            if(v[mid]==x){
                second = mid;
                start = mid + 1;
            }else if(v[mid]>x){
                end = mid - 1;
            }else{
                start = mid+1;
            }
        }
        pair index = new pair(first, second);
        return index;
    }
}
