package com.sidd.ds.array.problems;

import java.util.ArrayList;
import java.util.List;

//All the elements which are greater than their subsequent elements are called as Leaders
//Last element is also a leader
//Exm: { 2 , 25, 9, 4, 13, 8 } -->Leaders are:  25, 13, 8
public class Find_Leaders_In_Array {
    /**
     * Algo
     *  For each element, loop through next elements and check if greater
     *  Time complexity - > O (N * N)
     */
    public static List<Integer> findLeaders_Naive_Solution(int[] input)
    {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < input.length; i++)
        {
            boolean isLeader = true;
            for(int j = i+1; j < input.length; j++)
            {
                if(input[i] < input[j])
                {
                    isLeader = false;
                    break;
                }
            }
            if(isLeader)
            {
                result.add(input[i]);
            }
        }
        return result;
    }
    /**
     * Algo
     *  Make the last element as current leader. Loop from end. if element > leader, the element is a leader and
     *  make it the current leader
     *  Time complexity - > O (N)
     */
    public static List<Integer> findLeaders_Optimised_Solution(int[] input)
    {
        List<Integer> result = new ArrayList<>();
        int currentLeader = input[input.length-1];
        result.add(currentLeader);
        for(int c = input.length-2; c >= 0; c--)
        {
            if(input[c] > currentLeader)
            {
                currentLeader = input[c];
                result.add(input[c]);
            }
        }
        return result;
    }
}
