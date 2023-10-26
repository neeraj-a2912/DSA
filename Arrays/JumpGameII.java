public class JumpGameII {

}

class Solution {
    public int jump(int[] nums) {
        int farthest=0, current = 0, jumps = 0;
        for(int i=0; i<nums.length-1; i++){
            farthest = Math.max(farthest, i+nums[i]);
            if(i==current){
                current = farthest;
                jumps++;
            }
        }
        return jumps;
    }
}
