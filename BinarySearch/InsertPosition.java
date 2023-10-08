class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        int low=0, high=nums.length-1, mid;
        while(low<=high){
            mid = (high+low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}