package com.sidd.ds.mathematics;

public class Prime_Checker
{
    /**
     * Algo
     *  1 is not a prime
     *  Loop from 2 to the number and divide by counter. if divisible, not a prime
     * @param n
     * @return
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
}
