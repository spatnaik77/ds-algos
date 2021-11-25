package com.sidd.ds.array.problems;

public class Remove_Duplicates_In_Sorted_Array
{
    public static int[] removeDuplicates(int[] input)
    {
        int[] result = new int[input.length];
        int recent = 0;
        result[recent] = input[0];
        for(int c = 1; c < input.length; c++)
        {
            if(input[c] == result[recent])
            {
                //Don't do anything
            }
            else
            {
                recent++;
                result[recent] = input[c];
            }
        }
        return result;
    }
}
