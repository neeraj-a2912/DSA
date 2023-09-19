package Strings;

import java.util.Stack;

public class ReverseWords {
    public static String reverseWords(String S)
    {
        // code here 
        Stack<String> st = new Stack<>();
        
        for(String word : S.split("\\.")){
            st.push(word);
        }
        
        String s ="";
        while(!st.isEmpty()){
            s += st.pop();
            if(!st.isEmpty()){
                s+=".";
            }
        }
        return s;
    }
    public static void main(String[] args) {
        // take inputs accordingly
    }
}
