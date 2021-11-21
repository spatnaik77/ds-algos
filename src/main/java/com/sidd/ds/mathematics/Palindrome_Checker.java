package com.sidd.ds.mathematics;

public class Palindrome_Checker
{
    /**
     * Alogorithm
     *      1. Get the Reverse by performing modulo
     *      2. get the reversed number
     *      3. Compare both
     *      Exm.  121 --> 121 --> 1 * Math.pow(10, 0) + 2 *  Math.pow(10, 1) + 1 * Math.pow(10, 2)
     *
     * @param num
     * @return
     */
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
