public class KadanesAlgo {

    public int maxSubArray(int[] nums) {
        int curr=0;
        int best = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            curr+=nums[i];
            if(nums[i]>curr){
                curr=nums[i];
            }
            if(curr>best){
                best=curr;
            }
        }
        return best;
    }

    public static void main(String[] args) {
        // Take user inputs accordingly
    }
    
}
