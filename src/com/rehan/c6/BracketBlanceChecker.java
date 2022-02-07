package com.rehan.c6;

public class BracketBlanceChecker {
    public boolean isBalanced(String input){
        if(input.length()%2 == 1){
            return false;
        }
        ChaeStack stack = new ChaeStack();
       for(char c: input.toCharArray()){
           if(c == '('){
               stack.push(c);
           }
           else if(stack.isEmpty()){
               return false;
           }
           else if(c == ')'&& stack.pop()!='('){
               return false;
           }
       }
       return stack.isEmpty();
    }
}
