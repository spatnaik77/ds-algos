package com.sidd.ds.array;

public class MyArrayList implements MyList
{
    long[] data;
    int elementCount;
    int size;
    public MyArrayList(int initialCapacity)
    {
        data = new long[initialCapacity];
        size = initialCapacity;
        elementCount = 0;
    }

    @Override
    public boolean contains(long val)
    {
        boolean result = false;
        for(int c=0; c <size; c++)
        {
            if(val == data[c])
            {
                result = true;
            }
        }
        return result;
    }

    @Override
    public void add(long val)
    {
        if(elementCount == size)
        {
            resize();
            //Add the new val
            data[elementCount] = val;
        }
        else
        {
            data[elementCount] = val;
        }
        elementCount++;
    }
    private void resize()
    {
        //resize
        long[] oldData = data;
        size = 2 * size;
        data = new long[size];
        //copy the old data to data
        for(int c = 0; c < oldData.length; c++)
        {
            data[c] = oldData[c];
        }
    }

    @Override
    public void add(int insertAt, long val)
    {
        if(elementCount == size) {
            resize();
        }
        //Shift the elements to right
        for(int c = elementCount-1; c >= insertAt; c-- )
        {
            data[c+1] = data[c];
        }
        data[insertAt] = val;
    }

    @Override
    public long get(int index)
    {
        return data[index];
    }

    @Override
    public int indexOf(long val)
    {
        int result = -1;
        for(int c = 0; c < data.length; c++)
        {
            if(val == data[c])
            {
                result = c;
                break;
            }
        }
        return result;
    }

    @Override
    public int lastIndexOf(long val)
    {
        int result = -1;
        for(int c = 0; c < data.length; c++)
        {
            if(val == data[c])
            {
                result = c;
            }
        }
        return result;
    }

    @Override
    public void removeAtIndex(int index)
    {
        for(int c = index; c < elementCount; c++)
        {
            data[c] = data[c+1];
        }
        elementCount--;
    }

    @Override
    public void remove(long val)
    {
        int index = -1;
        //Find the index of the val
        for(int c = 0; c < elementCount; c++)
        {
            if(val == data[c])
            {
                index = c;
            }
        }
        if(index != -1)
        {
            this.removeAtIndex(index);
        }
    }

    @Override
    public int size()
    {
        return this.size;
    }

    @Override
    public void print()
    {
        for(int c = 0; c < data.length; c++)
        {
            System.out.print(data[c] + " ");
        }
        System.out.println();
    }
}
