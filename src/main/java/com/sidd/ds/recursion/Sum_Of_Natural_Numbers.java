package com.sidd.ds.recursion;


public class Sum_Of_Natural_Numbers
{
    public static void main(String[] args) {
        System.out.println(sum_recursive(5));
    }
    public static int sum_recursive(int n)
    {
        if(n > 0)
        {
            return  n + sum_recursive(n-1);
        }
        else
        {
             return 0;
        }

    }
}
