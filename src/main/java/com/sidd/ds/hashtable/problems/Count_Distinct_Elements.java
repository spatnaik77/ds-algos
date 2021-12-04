package com.sidd.ds.hashtable.problems;

import java.util.HashSet;

public class Count_Distinct_Elements {

    //Solution using arrays
    public static int countDistinctElements_naive(int[] data)
    {
        int result = 0;
        for(int i = 0; i < data.length; i++)
        {
            boolean found = false;
            for(int j = 0; j < i; j++)
            {
                if(data[i] == data[j])
                {
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                result++;
            }
        }
        return result;
    }
    //Solution using Maps
    public static int countDistinctElements_optimized(int[] data)
    {
        HashSet<Integer> myset = new HashSet<>();
        for(int c : data)
        {
            myset.add(c);
        }
        return myset.size();
    }
}
