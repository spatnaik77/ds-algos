package com.sidd.ds.strings;

public class LeftMost_Repeating_Char {
    /*
        Return the index of first repeating charecter
        Exm. Input: geeksforgeeks , result: 0 (g is the first repeating char)
        Exm. Input: abbcc , result: 1 (b is the first repeating char)
        Exm. Input: abcd , result: -1 (No repeating char)

        Time complexity - O(2N)
     */
    public static int getIndexOfLeftMostRepeatingChar(String input) {
        int[] charsArray = new int[256]; //Assuming Ascii charecters
        char[] chars = input.toCharArray();
        for (Character c : chars) {
            int indexOfTheCharecter = (int) c;
            charsArray[indexOfTheCharecter]++;
        }
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            int index = (int) ch;
            if (charsArray[index] > 1) {
                return i;
            }
        }
        return -1;
    }
    /*
            Traverse from right to left
            Maintain isVisited for each charecter in the array
            Maintain the pointer to latest repeating charecter while moving from right to left

     */
    public static int getIndexOfLeftMostRepeatingChar_optimized(String input)
    {
        int result = -1;

        int[] charsArray = new int[256]; //Assuming Ascii charecters
        char[] chars = input.toCharArray();
        for (int j = chars.length-1; j >= 0; j--)
        {
            int indexOfTheCharecter = (int) chars[j];
            charsArray[indexOfTheCharecter]++;
            if(charsArray[indexOfTheCharecter] > 1)
                result = j;
        }
        return result;
    }
}
