package com.sidd.ds.stack;

//Stack backed by an array
public class MyStackBackedByArray {

    int[] array;
    int top = -1;

    public MyStackBackedByArray(int capacity)
    {
        array = new int[capacity];
    }
    public void push(int val)
    {
        ++top;
        array[top] = val;
    }
    public int pop()
    {
        int val = array[top];
        top--;
        return val;
    }
    public int peek()
    {
        return array[top];
    }
}
