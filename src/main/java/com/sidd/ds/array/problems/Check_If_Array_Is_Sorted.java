package com.sidd.ds.array.problems;

public class Check_If_Array_Is_Sorted
{
    public static boolean isSorted(int[] input)
    {
        boolean result = true;
        for(int c = 1; c < input.length; c++)
        {
            if(input[c] < input[c-1])
            {
                result = false;
                break;
            }
        }
        return result;
    }
}
