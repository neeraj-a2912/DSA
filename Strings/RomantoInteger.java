import java.util.*;

public class RomantoInteger {
    
    public static int romanToDecimal(String str) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int result = 0, currValue = 0, prevValue = 0;
        for(int i=str.length()-1; i>=0; i--){
            currValue = map.get(str.charAt(i));
            if(currValue < prevValue){
                result -= currValue;
            }else{
                result += currValue;
            }
            prevValue = currValue;
        }
        return result;
    }

    public static void main(String[] args) {
        
    }
}