package com.sidd.ds.mathematics;

public class Prime_Checker
{
    /** Naive solution
     * Algo
     *  1 is not a prime
     *  Loop from 2 to the number and divide by counter. if divisible, not a prime
     *  Time complexity : O(N)
     */
    public static boolean isPrime(int n)
    {
        boolean result = true;
        if(n == 1)
        {
            result = false;
        }
        else
        {
            for(int c = 2; c < n; c++)
            {
                if(n % c == 0)
                {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    /**
     *      Algo
     *      *  1 is not a prime
     *      *  Loop from 2 to the sqrt of number and divide by counter. if divisible, not a prime
     *      * Check for divisible by 2 & 3. Many iterations can be avoided
     *      *  Time complexity : O(sqrt(N))
     */
    public static boolean isPrimeOptimised(int n)
    {
        boolean result = true;
        if(n == 1)
        {
            result = false;
        }
        else if(n == 2 || n == 3)
        {
            result = true;
        }
        else if(n % 2 == 0 || n % 3 == 0)
        {
            result = false;
        }
        else
        {
            for(int c = 2; c * c  <= n; c++)
            {
                if(n % c == 0)
                {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
