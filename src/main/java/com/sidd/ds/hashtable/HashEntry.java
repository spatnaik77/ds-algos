package com.sidd.ds.hashtable;

public class HashEntry<K, V> {

    private K k;
    private V v;
    private HashEntry next;

    public HashEntry(K k, V v)
    {
        this.k = k;
        this.v = v;
    }

    public HashEntry getNext()
    {
        return next;
    }

    public void setNext(HashEntry next)
    {
        this.next = next;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
