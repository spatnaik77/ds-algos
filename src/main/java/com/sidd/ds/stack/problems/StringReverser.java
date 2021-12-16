package com.sidd.ds.stack.problems;

import com.sidd.ds.stack.MyStackBackedByLinkedList;

import java.util.Arrays;

public class StringReverser {

    public static void main(String args[])
    {
        System.out.println(reverse("abc"));
    }
    public static String reverse(String input)
    {
        StringBuffer result = new StringBuffer();
        char[] chars = input.toCharArray();
        int size = chars.length;
        MyStackBackedByLinkedList<Character> stack = new MyStackBackedByLinkedList<Character>();
        for(int c = 0; c < chars.length; c++)
        {
            stack.push(chars[c]);
        }
        while(stack.peek() != null)
        {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
