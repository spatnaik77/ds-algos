package com.sidd.ds.strings;

import java.util.ArrayList;
import java.util.List;

public class Pattern_Matching_Naive
{
    /*
        Example
            Input: ABABANCD, Pattern: ABAB,  Result: 0, 2
            Input: ABCABCD, Pattern: ABCD,  Result: 3
            Input: AAAAA, Pattern: AAA,  Result: 0, 1, 2

     */
    public static List<Integer> matchPattern(String input, String pattern)
    {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < (input.length() - pattern.length() + 1); i++)
        {
            boolean isMatching = true;
            for(int j = 0; j < pattern.length(); j++)
            {
                if(input.charAt(i+j) != pattern.charAt(j))
                {
                    isMatching = false;
                    break;
                }
            }
            if(isMatching)
            {
                result.add(i);
            }
        }
        return result;
    }
}
