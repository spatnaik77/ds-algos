package com.sidd.ds.linkedlist;

import com.sidd.ds.array.MyList;

public class MyLinkedList {

    private Link first;
    private Link last;

    public void insert(int val)
    {
        if(first == null)
        {
            Link l = new Link(val);
            first = l;
            last = l;
        }
        else
        {
            Link l = new Link(val);
            last.setNext(l);
            last = l;
        }
    }
    public void insertAtBegining(int val)
    {
        if(first == null)
        {
            Link l = new Link(val);
            first = l;
            last = l;
        }
        else
        {
            Link l = new Link(val);
            l.setNext(first);
            first = l;
        }
    }
    public void insertAtLast(int val)
    {
        if(first == null)
        {
            Link l = new Link(val);
            first = l;
            last = l;
        }
        else
        {
            Link l = new Link(val);
            last.setNext(l);
        }
    }
    public boolean find(long val)
    {
        boolean result = false;
        Link curr = first;
        while(curr!= null)
        {
            if(val == curr.getData())
            {
                result = true;
                break;
            }
            else
            {
                curr = curr.getNext();
            }
        }
        return result;
    }
    public void delete(long val)
    {
        //find the link. Maintain a variable for prev link
        Link curr = first;
        Link prev = null;
        while(curr!= null)
        {
            if(val == curr.getData())
            {
                prev.setNext(curr.getNext());
                break;
            }
            else
            {
                prev = curr;
                curr = curr.getNext();
            }
        }
    }
    public void print()
    {
        System.out.println("|----------------");
        Link curr = first;
        while(curr!= null)
        {
            System.out.print(curr.getData() + ", ");
            curr = curr.getNext();
        }
        System.out.println("----------------|");
    }
}
