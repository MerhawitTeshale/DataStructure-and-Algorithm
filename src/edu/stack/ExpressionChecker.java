package edu.stack;

import java.util.Stack;

public class ExpressionChecker {

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {

            if(ch=='('||ch=='{'||ch=='['||ch=='<')
                stack.push(ch);
            if(ch==')'||ch=='}'||ch==']'||ch=='>'){
                if (stack.isEmpty()) return false;
                // we can have a top variable here and do the checking with it
                if((ch==')' && stack.pop()!='(') ||(ch=='}' && stack.pop()!='{') ||(ch==']' && stack.pop()!='[')
                        || (ch=='>' && stack.pop()!='<')) return false;
            }
        }
        return stack.isEmpty();
    }
}