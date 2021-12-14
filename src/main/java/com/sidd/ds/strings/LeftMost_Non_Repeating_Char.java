package com.sidd.ds.strings;

public class LeftMost_Non_Repeating_Char {
    /*
        Return the index of first non repeating charecter
        Exm. Input: geeksforgeeks , result: 5 (f is the first non repeating char)
        Exm. Input: abcabc , result: -1 (all are repeating)
        Exm. Input: abcd , result: 0 (a)

        Time complexity - O(2N)
     */
    public static int getIndexOfLeftMostNonRepeatingChar(String input) {

        int[] charsArray = new int[256]; //Assuming Ascii charecters
        char[] chars = input.toCharArray();
        for (Character c : chars) {
            int indexOfTheCharecter = (int) c;
            charsArray[indexOfTheCharecter]++;
        }
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            int index = (int) ch;
            if (charsArray[index] == 1) {
                return i;
            }
        }
        return -1;
    }

}
