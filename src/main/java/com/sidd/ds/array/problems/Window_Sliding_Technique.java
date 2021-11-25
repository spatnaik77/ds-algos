package com.sidd.ds.array.problems;

public class Window_Sliding_Technique {

    /**
     * Given an array of integers and a number k, find the maximum sum of k consecutive numbers
     * Exm. Input -> {1, 8, 30, -5, 20, 7}. k = 3
         *  1+8+30 = 39
         *  8+30+-5 = 33
         *  30+-5+20 = 45
         *  -5+20+7= 22
     *  Output --> 45
     */

    /**
     * In the naive solution treat each element as starting point, move to next k elements, calculate sum
     * Loop though each element and find the maximum
    */
    public static int getMaximumSum_Naive(int[] input, int k)
    {
        int maxSum = 0;
        for(int i = 0; i <input.length - k; i++)
        {
            int sum = 0;
            for(int j = i; j <= i+2; j++)
            {
                sum = sum + input[j];
            }
            if(sum > maxSum)
            {
                maxSum = sum;
            }
        }
        return maxSum;
    }
    /**
     *
     */
    public static int getMaximumSum_Optimised(int[] input, int k)
    {
        //Find the sum for first batch of k elements
        int sum  = 0;
        for(int c = 0; c < k; c++)
        {
            sum = sum + input[c];
        }
        int maxSum = sum;
        //Now loop through next elements. Add the next element and substrct the prev one
        for(int c = 1; c <= input.length-k; c++)
        {
            sum = sum - input[c-1] + input[c+2];
            if(sum > maxSum)
            {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
