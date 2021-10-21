package com.sidd.ds.stack;

import com.sidd.ds.linkedlist.MyLinkedList;

public class MyStack {

    MyLinkedList linkedList;
    public MyStack()
    {
        linkedList = new MyLinkedList();
    }
    public void push(int val)
    {
        linkedList.insertAtBegining(val);
    }
    public int pop()
    {
        int ret = linkedList.getFirst().getData();
        linkedList.removeFirst();
        return ret;
    }
    public int peek()
    {
        return linkedList.getFirst().getData();
    }
}
