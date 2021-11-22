package com.sidd.ds.mathematics;

public class Factorial {

    public static int factorial(int n)
    {
        int result = 1;
        for(int c = 1; c <= n ; c++)
        {
            result = result * c;
        }
        return result;
    }
    public static int factorial_recursive(int n)
    {
        int result = 1;
        return factorial_recursiveUtil(n, result);

    }
    private static int factorial_recursiveUtil(int n, int result)
    {
        if(n == 1)
        {

        }
        else
        {
            result = result * n;
            n--;
            result = factorial_recursiveUtil(n, result);

        }
        return result;
    }


}
