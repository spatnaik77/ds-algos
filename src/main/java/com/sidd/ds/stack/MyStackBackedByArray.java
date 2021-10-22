package com.sidd.ds.stack;

import com.sidd.ds.linkedlist.MyLinkedList;

//Stack backed by an array
public class MyStackBackedByArray {

    int[] array;
    int nElements = -1;

    public MyStackBackedByArray(int capacity)
    {
        array = new int[capacity];
    }
    public void push(int val)
    {
        ++nElements;
        array[nElements] = val;
    }
    public int pop()
    {
        int val = array[nElements];
        nElements--;
        return val;
    }
    public int peek()
    {
        return array[nElements];
    }
}
