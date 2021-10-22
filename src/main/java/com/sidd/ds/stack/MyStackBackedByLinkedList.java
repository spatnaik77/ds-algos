package com.sidd.ds.stack;

import com.sidd.ds.linkedlist.MyLinkedList;

//Stack backed by a linkedlist
public class MyStackBackedByLinkedList<T> {

    MyLinkedList linkedList;
    public MyStackBackedByLinkedList()
    {
        linkedList = new MyLinkedList<T>();
    }
    public void push(T val)
    {
        linkedList.insertAtBegining(val);
    }
    public T pop()
    {
        T ret = (T)linkedList.getFirst().getData();
        linkedList.removeFirst();
        return ret;
    }
    public T peek()
    {
        if(linkedList.getFirst() != null)
            return (T)linkedList.getFirst().getData();
        else
            return null;
    }
}
