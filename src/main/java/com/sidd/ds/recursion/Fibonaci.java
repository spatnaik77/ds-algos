package com.sidd.ds.recursion;

public class Fibonaci {

    //  When n = 10 ------->  0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static int fibanaci(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        else
        {
            return fibanaci(n-1) + fibanaci(n-2);
        }
    }

    public static void main (String args[])
    {
        System.out.println(fibanaci(9));
    }
}
