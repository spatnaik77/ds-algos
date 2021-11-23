package com.sidd.ds.array.problems;

public class Reverse_An_Array {

    //Have 2 pointers. one pointing to begining and the other pointing to end
    //Move pointer 1 towards right and pointer 2 towards left
    //Swap the values
    //Loop till pointer1 (index) < pointer2 (index)
    public static int[] reverse(int[] input)
    {
        int low = 0;
        int high = input.length-1;
        while(low < high)
        {
            int temp = input[low];
            input[low] = input[high];
            input[high] = temp;
            low++;
            high--;
        }
        return input;
    }
}
