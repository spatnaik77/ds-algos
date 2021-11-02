package com.sidd.ds.stack;

import com.sidd.ds.linkedlist.MyLinkedList;

//Stack backed by a linkedlist
public class MyStackBackedByLinkedList<T> {

    MyLinkedList linkedList;
    int size = 0;

    public MyStackBackedByLinkedList()
    {
        linkedList = new MyLinkedList<T>();
    }
    public void push(T val)
    {
        linkedList.insertAtBegining(val);
        ++size;
    }
    public T pop()
    {
        T ret = (T)linkedList.getFirst().getData();
        linkedList.removeFirst();
        --size;
        return ret;
    }
    public T peek()
    {
        if(linkedList.getFirst() != null)
            return (T)linkedList.getFirst().getData();
        else
            return null;
    }

    public int getSize() {
        return size;
    }
}
