package com.sidd.ds.stack.problems;

/*
    Support 2 stacks using a single array.
    Have separate APIs for 2 stacks
    //Maintain two pointers one from begining and other from end for both the stacks
    //TODO take care of the boundary conditions like limits for each of the stack values in the array
 */
public class Two_Stacks_Using_Single_Array_Optimized
{
    private int[] data;
    int size;
    int top_1;
    int top_2;

    public Two_Stacks_Using_Single_Array_Optimized(int size)
    {
        data = new int[size];
        top_1 = -1;
        top_2 = data.length;

    }
    public void push1(int d)
    {
        if(top_2 - top_1 > 1)
            data[++top_1] = d;
        else
            throw new ArrayStoreException("Size exceeded");
    }
    public int pop1()
    {
        int result = data[top_1];
        top_1--;
        return result;
    }
    public void push2(int d)
    {
        if(top_2 - top_1 > 1)
            data[--top_2] = d;
        else
            throw new ArrayStoreException("Size exceeded");
    }
    public int pop2()
    {
        int result = data[top_2];
        top_2++;
        return result;
    }

}
