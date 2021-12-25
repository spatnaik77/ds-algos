package com.sidd.ds.stack.problems;

/*
    Support 2 stacks using a single array.
    Have separate APIs for 2 stacks
    //TODO take care of the boundary conditions like limits for each of the stack values in the array
 */
public class Two_Stacks_Using_Single_Array_Naive
{
    private int[] data;
    int size;
    //Divide the array into 2 parts
    int start_1;
    int end_1;
    int top_1;

    int start_2;
    int end_2;
    int top_2;

    public Two_Stacks_Using_Single_Array_Naive(int size)
    {
        data = new int[2 * size];

        start_1 = 0;
        end_1 = data.length/2 - 1;
        top_1= -1;

        start_2 = data.length / 2;
        end_2 = data.length - 1;
        top_2 = -1;
    }
    public void push1(int d)
    {
        data[++top_1] = d;
    }
    public int pop1()
    {
        int result = data[top_1];
        top_1--;
        return result;
    }
    public void push2(int d)
    {
        data[++top_2] = d;
    }
    public int pop2()
    {
        int result = data[top_2];
        top_2--;
        return result;
    }

}
