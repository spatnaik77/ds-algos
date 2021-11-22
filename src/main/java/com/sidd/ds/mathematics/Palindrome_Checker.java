package com.sidd.ds.mathematics;

public class Palindrome_Checker
{
    public static boolean palindromeCheck(int num)
    {
        boolean result = false;
        double reverseNum = 0;
        int remaining = num;
        while(remaining != 0)
        {
            int lastDigit = remaining % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            remaining = remaining / 10;
        }
        if(num == (int)reverseNum)
        {
            result = true;
        }
        return result;

    }
}
