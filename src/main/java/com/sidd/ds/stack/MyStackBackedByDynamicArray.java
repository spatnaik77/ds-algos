package com.sidd.ds.stack;

import java.util.ArrayList;
import java.util.List;

public class MyStackBackedByDynamicArray {

    private List<Integer> list = new ArrayList<>();
    private int top = -1;
    public MyStackBackedByDynamicArray()
    {

    }
    public void push(int val)
    {
        ++top;
        list.add(val);
    }
    public int pop()
    {
        int val = list.remove(top);
        top--;
        return val;
    }
    public int peek()
    {
        return list.get(top);
    }
}
