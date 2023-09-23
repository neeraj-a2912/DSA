package BinarySearch;
public class FloorAndCeilInSortedArray {
    public static int findFloor(long arr[], int n, long x)
    {
        int high = n - 1, low = 0, mid, floor = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                floor = mid;
                low = mid + 1;
            }
        }
        return floor;
    }
    
    public static int findCeil(long arr[], int n, long x)
    {
        int high = n-1, low=0, mid, ceil = -1;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]==x){
                return mid;
            } else if (arr[mid] > x) {
                ceil = mid;
                high = mid - 1;

            }else{
                low = mid+1;
            }
        }
        return ceil;
    }

}
