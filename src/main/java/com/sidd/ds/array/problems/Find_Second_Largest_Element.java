package com.sidd.ds.array.problems;

public class Find_Second_Largest_Element
{
    //Run two loops. In the first loop find the largest. In the second loop, find the second largest by ignoring the largest
    //Time complexity -----> O(2N)
    public static int findSecondLargestElement(int[] input)
    {
        int largest = -1;
        for(int c = 0; c < input.length; c++)
        {
            if(input[c] > largest)
            {
                largest = input[c];
            }
        }
        int secondLargest = -1;
        for(int c = 0; c < input.length; c++)
        {
            if(input[c] != largest) {
                if (input[c] > secondLargest) {
                    secondLargest = input[c];
                }
            }
        }
        return secondLargest;
    }
    //Run one loop only
    //Time complexity -----> O(N)
    public static int findSecondLargestElement_optimised(int[] input)
    {
        return -1;
    }
}
