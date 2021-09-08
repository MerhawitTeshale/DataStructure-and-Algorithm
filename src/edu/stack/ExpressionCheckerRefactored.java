package edu.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExpressionCheckerRefactored {

    private final int a;
    private final List<Character> leftBrackets = Arrays.asList('(','{','<','[');
    private final List<Character> rightBracket = Arrays.asList(')','}','>',']');

    public ExpressionCheckerRefactored(int a) {
        this.a = a;
    }

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {

            if(isLeftBracket(ch))
                stack.push(ch);
            if(isRightBracket(ch)){
                if (stack.isEmpty()) return false;
                char top=stack.pop();
                if(bracketNotMatch(top,ch)) return false;
            }
        }
        return stack.isEmpty();
    }
    private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }
    private boolean isRightBracket(char ch){
        return rightBracket.contains(ch);
    }
    private boolean bracketNotMatch(char left, char right){
        return leftBrackets.indexOf(left) == rightBracket.indexOf(right);
    }
}
