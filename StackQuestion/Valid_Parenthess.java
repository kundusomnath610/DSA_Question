package StackQuestion;

import java.util.Stack;

public class Valid_Parenthess {
    public static void main(String[] args) {
        
    }

    public static boolean ispar(String s) 
    {
        // add your code here
        
        // if(s.length() % 2 != 0) {
        //     return false;
        // }
        
        Stack<Character> stack = new Stack<>(); // for stack declereation
        
        for(int i=0; i < s.length(); i++) { // Loop traverse the Array.
            char ch = s.charAt(i);
            
            if(ch == '(' || ch == '{' || ch == '[') { // check the parenthess..
                stack.push(ch); // if open bracket then push this bracket in the stack..
            } else {
                if(stack.isEmpty()) { // if stack empty return false
                    return false;
                }
                
                char top = stack.peek(); // find the stack peek..
                
                if(ch == ')' && top != '(') { // current bracket and top bracket is not matched return false
                    return false;
                }
                
                else if(ch == '}' && top != '{') { // current bracket and top bracket is not matched return false
                    return false;
                }
                
                else if(ch == ']' && top != '[') { // current bracket and top bracket is not matched return false
                    return false;
                } else {
                    stack.pop();// stack pop..
                }
            }
        }
        return stack.isEmpty(); 
    }

}
