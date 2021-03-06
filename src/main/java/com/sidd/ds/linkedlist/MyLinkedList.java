package com.sidd.ds.linkedlist;

import com.sidd.ds.array.MyList;

public class MyLinkedList<T> {

    private Link<T> first;
    private Link<T> last;

    public void insert(T val)
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
    public void insertAtBegining(T val)
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
    public void insertAtLast(T val)
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
    public boolean find(T val)
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
    public void delete(T val)
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

    public Link getFirst() {
        return first;
    }

    public Link getLast() {
        return last;
    }

    public void removeFirst()
    {
        Link newFirst = first.getNext();
        first = newFirst;
    }


}
