package com.sidd.ds.array.problems;

public class Find_Largest_Element
{
    public static int findLargestElement(int[] input)
    {
        int largest = input[0];
        for(int c = 1; c < input.length; c++)
        {
            if(input[c] > largest)
            {
                largest = input[c];
            }
        }
        return largest;
    }
}
