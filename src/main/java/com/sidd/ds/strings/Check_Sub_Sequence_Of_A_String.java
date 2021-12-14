package com.sidd.ds.strings;

public class Check_Sub_Sequence_Of_A_String {

    /**
     * Sub sequence examples:
     *      AD in ABCD --> True
     *      AC in ABCD --> True
     *      D in ABCD --> True
     *      AED in ABCDE --> False
     *
     *      Algo:
     *          1. have 2 pointers 1 for input and 1 for the string
     *          2. For each char in input traverse through str. Once found , move the input loop
     *
     */

    public static boolean is_Sub_Sequence(String str, String input)
    {
        boolean result = true;

        char[] input_chars = input.toCharArray();

        int currentPos = -1;
        for(Character c1 : input_chars)
        {
            currentPos = exist(str, currentPos+1, c1);
            if(currentPos == -1)
            {
                result = false;
                break;
            }
        }
        return result;
    }
    private static int exist(String str, int pos, Character charecter)
    {
        int result = -1;
        char[] chars = str.toCharArray();
        for(int c = pos; c < chars.length; c++)
        {
            if(chars[c] == charecter)
            {
                result = c;
                break;
            }
        }
        return result;
    }
}
