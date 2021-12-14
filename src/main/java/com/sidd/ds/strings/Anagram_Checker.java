package com.sidd.ds.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Two strings are anagrams if
 *  their length is same
 *  All the charecters and their occurance count is same
 *
 *      silent and listen are anagrams
 */
public class Anagram_Checker {


    /*
           for string 1 & string 2 populate the charecters and their occurances in  maps and compare both the maps
           O(3N)
    */
    public static boolean isAnagram_sol1(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        char[] str1_chars = str1.toCharArray();
        for(Character c : str1_chars)
        {
            if(map1.containsKey(c))
            {
                map1.put(c, map1.get(c)+1);
            }
            else
            {
                map1.put(c, 1);
            }
        }

        Map<Character, Integer> map2 = new HashMap<>();
        char[] str2_chars = str2.toCharArray();
        for(Character c : str2_chars)
        {
            if(map2.containsKey(c))
            {
                map2.put(c, map2.get(c)+1);
            }
            else
            {
                map2.put(c, 1);
            }
        }
        return map1.equals(map2);
    }
    /*
            Sort the strings and compare
            O(3N)
     */
    public static boolean isAnagram_sol2(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }
        char[] str1_chars = str1.toCharArray();
        char[] str2_chars = str2.toCharArray();
        Arrays.sort(str1_chars);Arrays.sort(str2_chars);
        return Arrays.equals(str1_chars,str2_chars);
    }
    /*
           Use a single array to compare - Most efficient solution - O(N)
     */
    public static boolean isAnagram_sol3(String str1, String str2)
    {
        boolean result = true;
        if(str1.length() != str2.length())
        {
            return false;
        }
        int[] data = new int[256];
        for(int c = 0; c < str1.length(); c++)
        {
            data[(int)str1.charAt(c)]++;
            data[(int)str2.charAt(c)]--;
        }
        for(int c = 0; c < str1.length(); c++)
        {
            if(data[(int)str1.charAt(c)] != 0)
            {
                result = false;
                break;
            }
        }
        return result;
    }
}
