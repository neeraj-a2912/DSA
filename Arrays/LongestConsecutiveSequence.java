class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest = 0, length;
        for(int num : nums){
            if(!set.contains(num-1)){
                length = 0;
                while(set.contains(num+length)){
                    length+=1;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
public class LongestConsecutiveSequence {
    
}
