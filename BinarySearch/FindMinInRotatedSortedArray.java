package BinarySearch;
public class FindMinInRotatedSortedArray {
    public int findMin(int[] nums) {
        int low=0, high=nums.length-1, mid, res=nums[0];
        while(low<=high){
            mid=(low+high)/2;
            if(nums[low]<nums[high]){
                res = Math.min(res, nums[low]);
                break;
            }
            res = Math.min(res, nums[mid]);
            if(nums[mid]>=nums[low]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        // take inputs accordingly
    }
}
