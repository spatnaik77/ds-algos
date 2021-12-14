package com.sidd.ds.strings;

public class Palindrome_Checker {

    public static boolean isPalindrome_naive(String str)
    {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int c = chars.length-1; c >= 0; c--)
        {
            sb.append(chars[c]);
        }
        return str.equals(sb.toString());
    }
    public static boolean isPalindrome_optimized(String str)
    {
        boolean result = true;

        int start = 0;
        int end = str.length()-1;
        char[] chars = str.toCharArray();
        while(start <= end)
        {
            if(chars[start] != chars[end])
            {
                result = false;
                break;
            }
            else
            {
                start++;
                end--;
            }
        }
        return result;
    }
}
