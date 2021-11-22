package com.sidd.ds.mathematics;

public class Divisors_Of_A_Number
{
    //Naive solution
    public static void printAllDivisorsOfANumber(int n)
    {
        for(int c = 1; c <= n; c++)
        {
            if(n % c == 0)
            {
                System.out.print(c + " ");
            }
        }

    }

    //Optimised solution - you need not travel till the number. you can go till sqrt of the number
    public static void printAllDivisorsOfANumber_Optimised(int n)
    {
        for(int c = 1; c*c <= n; c++)
        {
            if(n % c == 0)
            {
                System.out.print(c + " " + n/c + " ");
            }
        }
    }

    public static void main(String[] args) {

        printAllDivisorsOfANumber(12);
        System.out.println();
        printAllDivisorsOfANumber_Optimised(12);
    }
}
