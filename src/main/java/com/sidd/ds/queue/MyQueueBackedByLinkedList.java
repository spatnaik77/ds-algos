package com.sidd.ds.queue;

import com.sidd.ds.linkedlist.MyLinkedList;

public class MyQueueBackedByLinkedList<T>
{
    MyLinkedList<T> linkedList;
    int size = 0;

    public MyQueueBackedByLinkedList()
    {
        linkedList = new MyLinkedList<T>();
    }
    public void insert(T val)
    {
        linkedList.insertAtLast(val);
        ++size;
    }
    public T peek()
    {
        T ret = (T)linkedList.getFirst().getData();
        return ret;
    }
    public T poll()
    {
        T ret = (T)linkedList.getFirst().getData();
        linkedList.removeFirst();
        --size;
        return ret;
    }

    public int getSize() {
        return size;
    }

}
