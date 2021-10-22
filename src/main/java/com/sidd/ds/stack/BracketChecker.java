package com.sidd.ds.stack;

public class BracketChecker {

    public static void main(String[] args)
    {
       //Should return True
        System.out.println(check("{([])}"));
        //Should return false
        System.out.println(check("{([]})"));
    }
    public static boolean check(String input)
    {
        boolean result = true;
        MyStackBackedByLinkedList<Character> stack = new MyStackBackedByLinkedList<>();
        char[] chars = input.toCharArray();
        for(int c = 0; c < chars.length; c++)
        {
            switch(chars[c])
            {
                case '{':
                    //stack.push(chars[c]);
                case '(':
                    //stack.push(chars[c]);
                case '[':
                    stack.push(chars[c]);
                    break;
                case '}':
                    if('{' != stack.pop())
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
        return result;
    }
}
