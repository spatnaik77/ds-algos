package com.sidd.ds.hashtable.problems;

import java.util.HashMap;
import java.util.Map;

public class Frequency_Of_Elements {

    public static Map<Integer, Integer> frequencyOfElement(int[] data)
    {
        Map<Integer, Integer> result = new HashMap<>();
        for(int c : data)
        {
            if(result.containsKey(c))
            {
                result.put(c, result.get(c)+1);
            }
            else
            {
                result.put(c, 1);
            }
        }
        return result;
    }
}
