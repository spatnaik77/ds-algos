package com.sidd.ds.array;

import java.util.Arrays;
import java.util.stream.Stream;

//An int array
public class MyArrayList implements MyList{

    long[] data;
    int currentSize;

    public MyArrayList(int capacity)
    {
        data = new long[capacity];
    }
    public void insert(long val)
    {
        data[currentSize] = val;
        currentSize++;
    }
    //return true if exists
    public boolean find(long val)
    {
        boolean result = false;
        for(int c = 0; c < data.length; c++)
        {
            if(val == data[c])
            {
                result = true;
                break;
            }
        }
        return result;
    }
    //Delete the entry. Move all the elements from right
    public void delete(long val)
    {
        int position = 0;
        boolean found = false;
        for(int c = 0; c < data.length; c++)
        {
            if (val == data[c])
            {
                position = c;
                found = true;
                break;
            }
        }
        //Move the elements from right
        if(found)
        {
            for(int c = position; c < currentSize; c++)
            {
                data[c] = data[c + 1];
            }
            currentSize--;
        }
    }
    public void print()
    {
        for(int c = 0; c < data.length; c++)
        {
            System.out.print(data[c] + " ");
        }
    }
}
