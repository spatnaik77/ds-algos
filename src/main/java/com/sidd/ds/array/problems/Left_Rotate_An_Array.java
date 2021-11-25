package com.sidd.ds.array.problems;

public class Left_Rotate_An_Array {

    public static int[] leftRotate(int[] input)
    {
        int temp = input[0];
        for(int c = 1; c < input.length; c++)
        {
            input[c-1] = input[c];
        }
        input[input.length-1] = temp;

        return input;
    }
    /*
    Algorithm:
        1. copy the elements moveBy position to a temp array
        2. loop from moveBy till end of the array
                move each element to left by moveBy
         3. Merge the temp array to the array in the end
     */
    public static int[] leftRotate(int[] input, int moveBy)
    {
        int[] temp = new int[moveBy];
        //Step-1
        for(int c = 0; c < moveBy; c++)
        {
            temp[c] = input[c];
        }
        //Step-2
        for(int c = moveBy; c < input.length; c++)
        {
            input[c-moveBy] = input[c];
        }
        //Step-3
        int k = 0;
        for(int c = input.length-moveBy; c < input.length; c++)
        {
            input[c] = temp[k];
            k++;
        }
        return input;
    }
}
