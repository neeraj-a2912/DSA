package Strings;

public class ValidAnagrams {
    public static  boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] hash1 = new int[150];
        for(int i=0; i<s.length(); i++){
            hash1[s.charAt(i)]++;
            hash1[t.charAt(i)]--;
        }
        for(int num:hash1){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
