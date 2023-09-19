package Strings;

public class ConvertToMobileSequence {

    String printSequence(String S) 
    { 
        // code here
        String[] nums = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555",
                        "6", "66", "666", "7", "77", "777","7777", "8", "88", "888", "9", "99", "999", "9999" };
        
        String ans = "";
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)==' '){
                ans += 0;
            }else{
                int j = S.charAt(i) - 'A';
                ans += nums[j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // take user input accordingly
    }
}
