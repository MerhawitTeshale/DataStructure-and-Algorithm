package edu.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args){
        String str= "abcd";

        StringReverser reverser= new StringReverser();
        String result=reverser.reverse(str);

        System.out.println(result);

        ////////////////////////////////////////////////

        String string= "(1+2}";
        ExpressionChecker exp=new ExpressionChecker();
        System.out.println(exp.isBalanced(string));
    }
}
