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
            currentSize++;
        }
        else
        {
            data[index] = newEntry;
        }
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
    private void rehash()
    {

    }
}
