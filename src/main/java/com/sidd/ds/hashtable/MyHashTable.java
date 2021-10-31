package com.sidd.ds.hashtable;

public class MyHashTable<K, V>
{
    private int capacity;
    private int currentSize;
    private HashEntry<K, V>[] data;

    public MyHashTable(int capacity)
    {
        this.capacity = capacity;
        data = new HashEntry[capacity];

    }
    public void put(K k, V v)
    {
        if(currentSize == capacity)
        {
            rehash();
        }
        int index = k.hashCode() % capacity;
        HashEntry<K, V> newEntry = new HashEntry<>(k, v);
        HashEntry<K, V> targetEntry = data[index];
        if(targetEntry != null) //Hash collision
        {
            while(targetEntry.getNext() != null)
            {
                targetEntry = targetEntry.getNext();
            }
            targetEntry.setNext(newEntry);

        }
        else
        {
            data[index] = newEntry;
        }
        currentSize++;
    }
    public V get(K k)
    {
        int index = k.hashCode() % capacity;
        HashEntry<K, V> entry = data[index];
        if(entry != null)
        {
            if(entry.getK().equals(k))
            {
                return entry.getV();
            }
            else
            {
                while (entry.getNext() != null)
                {
                    entry = entry.getNext();
                    if(entry.getK().equals(k))
                    {
                        break;

                    }
                }
                return entry.getV();
            }
        }
        else
        {
            return null;
        }
    }
    public int getCurrentSize()
    {
        return this.currentSize;
    }
    private void rehash()
    {
        this.capacity = capacity * 2;
        this.currentSize = 0;
        HashEntry<K, V>[] dataX = data;
        data = new HashEntry[capacity];
        for(int c = 0; c < dataX.length; c++)
        {
            HashEntry<K, V> entry = dataX[c];
            if(entry != null)
            {
                this.put(entry.getK(), entry.getV());
                while(entry.getNext() != null)
                {
                    entry = entry.getNext();
                    this.put(entry.getK(), entry.getV());
                }
            }

        }
    }
}
