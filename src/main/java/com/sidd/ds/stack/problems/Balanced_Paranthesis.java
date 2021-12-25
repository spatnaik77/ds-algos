package com.sidd.ds.stack.problems;

import com.sidd.ds.stack.MyStackBackedByLinkedList;

import java.util.LinkedList;
import java.util.Stack;

public class Balanced_Paranthesis {

    public static void main(String[] args)
    {
       //Should return True
        System.out.println(checkBalancedParanthesis("{([])}"));
        //Should return false
        System.out.println(checkBalancedParanthesis("{([]})"));
    }
    public static boolean checkBalancedParanthesis(String input)
    {
        boolean result = true;
        Stack<Character> stack = new Stack();
        //MyStackBackedByLinkedList<Character> stack = new MyStackBackedByLinkedList<>();
        char[] chars = input.toCharArray();
        for(int c = 0; c < chars.length; c++)
        {
            switch(chars[c])
            {
                case '{':
                    stack.push(chars[c]);
                    break;
                case '(':
                    stack.push(chars[c]);
                    break;
                case '[':
                    stack.push(chars[c]);
                    break;
                case '}':
                    if(!stack.isEmpty()) {
                        if ('{' != stack.pop()) {
                            result = false;
                        }
                    }
                    else
                    {
                        result = false;
                    }
                    break;
                case ')':
                    if('(' != stack.pop())
                    {
                        result = false;
                    }
                    break;
                case ']':
                    if('[' != stack.pop())
                    {
                        result = false;
                    }
                    break;
            }
        }
        if(!stack.isEmpty())
        {
            result = false;
        }
        return result;
    }

}
