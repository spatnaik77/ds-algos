package com.sidd.ds.hashtable.problems;

import java.util.HashMap;

public class Pair_With_Given_Sum {

    /**
     * Exm. data = { 1, 3, 5, 7} , sum = 8 --> should return true
     *                          , sum = 13 --> should return false
     *                          , sum = 14 --> should return false. Edge case
     * @param data
     * @param sum
     * @return
     */
    public static boolean containsPairWithGivenSum(int[] data, int sum)
    {
        boolean result = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer c : data)
        {
            if(map.containsKey(sum-c))
            {
                result = true;
                break;
            }
            else
            {
                map.put(c, c);
            }

        }
        return result;
    }

}
