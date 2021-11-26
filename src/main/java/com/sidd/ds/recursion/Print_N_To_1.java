package com.sidd.ds.recursion;

public class Print_N_To_1 {

    //print(5) --> should print 5, 4, 3, 2, 1
    public static void print(int n)
    {
        if(n >= 1)
        {
            System.out.print(n + " ");
            print(--n);
        }
        else
        {
            //don't do anything and come out
            return;
        }
    }

    public static void printXXX(int n)
    {
        if(n > 1)
        {
            n--;
            printXXX(n);
            System.out.print(n + " ");
        }
        else
        {
            //don't do anything and come out
            return;
        }
    }

    public static void print_1_To_N(int n)
    {
        int c = 1;
        print_1_To_N_recursive(c, n);

    }
    private static void print_1_To_N_recursive(int c, int n)
    {
        if(c <= n)
        {
            System.out.print(c + " ");
            print_1_To_N_recursive(++c, n);
        }
        else
        {
            //don't do anything
        }

    }


    public static void main(String[] args) {

        //print(5);

        //print_1_To_N(5);

        printXXX(5);
    }
}
