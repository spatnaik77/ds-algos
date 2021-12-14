package com.sidd.ds.strings;

import java.util.Stack;
import java.util.StringTokenizer;

public class Reverse_Words_In_A_String {

    public static String reverse(String input)
    {
        StringBuilder result = new StringBuilder();

        Stack<String> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(input, " ");
        while(st.hasMoreElements())
        {
            stack.push(st.nextToken());
        }
        while(!stack.isEmpty())
        {
            result.append(stack.pop());
            if(!stack.isEmpty())
                result.append(" ");
        }
        return result.toString();
    }
}
