package com.sidd.ds.mathematics;

public class GCD_LCM
{
    /**
     * GCD - Greatest common divisor
     * Algo
     *  Take lower of the 2 given numbers
     *  Loop back from the lowest number to 1 and divide by both numbers. if divisible, break. The GCD is found !
     *  Time Complexity : O (min (n1, n2))
     * @param n1
     * @param n2
     * @return
     */
    public static int getGCD(int n1, int n2)
    {
        int result = Math.min(n1, n2);
        int max = Math.max(n1, n2);
        for(int c = result; c >= 1; c--)
        {
            if(n1 % c == 0 && n2 % c == 0)
            {
                result = c;
                break;
            }
        }

        return result;
    }
    public static int getGCDUsingEuclideanAlgorithm(int n1, int n2)
    {
        while(n1 != n2)
        {
            if(n1 > n2)
            {
                n1 = n1 - n2;
            }
            else
            {
                n2 = n2 - n1;
            }
        }
        return n1;
    }

    /**
     *  * LCM - Least common multiplier
     *      * Algo
     *      *  Take highest of the 2 given numbers
     *      *  Loop from the highest number to n1 * n2  and divide by both number. if divisible, break. The LCM is found !
     *      *  Time Complexity : O (n1 * n2)
     *      *
     * @param a
     * @param b
     * @return
     */
    public static int getLCM(int a, int b)
    {
        int result = Math.max(a, b);
        for(int c = result; c <= a * b; c++)
        {
            if(c % a == 0 && c % b == 0)
            {
                result = c;
                break;
            }
        }
        return result;
    }
}
