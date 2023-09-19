package Strings;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean isOpening(char c){
        return c=='(' || c=='{' || c=='[';
    }

    public static boolean isMatching(char c1, char c2){
        return (c1=='(' && c2==')') || (c1=='{' && c2=='}') || (c1=='[' && c2==']');
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(isOpening(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else if(!isMatching(stack.peek(),c)){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        // take inputs accordingly
    }
}
