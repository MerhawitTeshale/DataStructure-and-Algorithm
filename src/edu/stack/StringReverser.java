package edu.stack;

import java.util.Stack;

public class StringReverser {



    public String reverse(String input){

        if( input ==null) throw new IllegalArgumentException();
        Stack<Character> stack=new Stack<>();

        for (char ch:input.toCharArray())
            stack.push(ch);
            //we need to use string buffer
            StringBuffer reversed= new StringBuffer();
            while (!stack.empty())
                reversed.append(stack.pop());

            return reversed.toString();

    }
}
