package com.sidd.ds.linkedlist;

public class Link {

    private int data;
    private Link next;

    public Link(int data)
    {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "" + data;
    }
}
