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
}
