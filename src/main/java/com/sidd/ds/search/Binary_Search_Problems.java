package com.sidd.ds.search;

import java.util.ArrayList;
import java.util.List;

public class Binary_Search_Problems {

    /**
     * Return the index of the element if found. Else return -1
     * Exm. Input is a sorted array: {10, 20, 30, 40, 50}, val = 30 --> should return 2
     *
     * @param data
     * @param val
     * @return
     */
    public static int binarySearch(int[] data, int val)
    {
        int result = -1;

        int start = 0;
        int end = data.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (val == data[mid]) {
                result = mid;
                break;
            } else if (val > data[mid]) {
                start = mid + 1;
            } else //(val < data[mid])
            {
                end = mid - 1;
            }
        }
        return result;
    }
    public static int binarySearch(int[] data, int val, int fromIndex, int toIndex)
    {
        int result = -1;

        int start = fromIndex;
        int end = toIndex;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (val == data[mid]) {
                result = mid;
                break;
            } else if (val > data[mid]) {
                start = mid + 1;
            } else //(val < data[mid])
            {
                end = mid - 1;
            }
        }
        return result;
    }

    public static int binarySearch_recursive(int[] data, int val) {
        return binarySearch_recursiveUtil(data, val, 0, data.length - 1);
    }

    private static int binarySearch_recursiveUtil(int[] data, int val, int start, int end) {
        int result = -1;

        if (start <= end)
        {
            int mid = (start + end) / 2;
            if (val == data[mid])
            {
                result = mid;
            } else if (val > data[mid])
            {
                start = mid + 1;
                result = binarySearch_recursiveUtil(data, val, start, end);
            } else //(val < data[mid])
            {
                end = mid - 1;
                result = binarySearch_recursiveUtil(data, val, start, end);
            }
        } else
        {
            //done. don't do anything
        }
        return result;
    }

    /**
     * Return the first index of found value in the array
     * @param data
     * @param val
     * @return
     */
    public static int getIndexOfFirstOccurance(int[] data, int val)
    {
        int result = -1;

        int start = 0;
        int end = data.length - 1;
        while (start <= end)
        {
            int mid = (start + end) / 2;

            if (val > data[mid])
            {
                start = mid + 1;
            }
            else if (val < data[mid])
            {
                end = mid - 1;
            }
            else
            {
                if(mid == 0 || data[mid-1] != data[mid])
                {
                    result = mid;
                    break;
                }
                else
                {
                    end = mid-1;
                }
            }
        }
        return result;
    }
    public static int getIndexOfLastOccurance(int[] data, int val)
    {
        int result = -1;

        int start = 0;
        int end = data.length - 1;
        while (start <= end)
        {
            int mid = (start + end) / 2;

            if (val > data[mid])
            {
                start = mid + 1;
            }
            else if (val < data[mid])
            {
                end = mid - 1;
            }
            else
            {
                if(mid == data.length-1 || data[mid+1] != data[mid])
                {
                    result = mid;
                    break;
                }
                else
                {
                    start = mid+1;
                }
            }
        }
        return result;
    }

    //Return the count of occurance of a val in a sorted array
    public static int getOccuranceCount(int[] data, int val)
    {
        int firstOccuranceIndex = getIndexOfFirstOccurance(data, val);
        int lastOccuranceIndex  = 0;
        if(firstOccuranceIndex == -1)
        {
            return -1;
        }
        else
        {
            lastOccuranceIndex = getIndexOfLastOccurance(data, val);
        }
        return (lastOccuranceIndex - firstOccuranceIndex) + 1;
    }

    // input : 25 --> returns 5.
    //input : 81 --> returns 9
    //input 78 --> returns 8
    public static int getSquareRoot_naive(int val)
    {
        int c = 1;
        while (c*c <= val)
        {
            c++;
        }
        return c-1;
    }
    // input : 25 --> returns 5.
    //input : 81 --> returns 9
    //input 78 --> returns 8
    public static int getSquareRoot_using_binary_search(int val)
    {
        int result = -1;

        int high = val;
        int low = 1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(mid * mid == val)
            {
                result = mid;
                break;
            }
            else if(mid * mid > val)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
                result = mid;

            }
        }
        return result;
    }
    /*
            Algorithm
            1. traverse the index (in 2 pow index) till u reach a number greater than the desired number
            2. Do a binary seach
     */
    public static int search_In_Infinite_sized_Array(int[] data, int val)
    {
        if(val == data[0])
            return 0;
        int index = 1;//start from first position
        while(data[index] < val)
        {
            index = index * 2;
        }
        if(data[index] == val)
            return index;
        //Else do a binary search
        return binarySearch(data, val, index/2+1, index-1);
    }

    // Find the peak elements in an unsorted array
    //Peak element is an element which is greater than its left & right neighbours
    //Exm: {5, 10, 20, 15, 7} ---> Peak is 20 (20 > 10 and 15
    //Exm: {5, 10, 20, 15, 70, 60} ---> Peak is 20 & 70
    public static List<Integer> findPeakElements(int[] data)
    {
        List<Integer> result = new ArrayList<>();
        for(int c = 1; c < data.length; c++)
        {
            if(c != data.length-1) { //condition to avoid checking for the last element so as to avoid array index bound exception
                if ((data[c]) > data[c - 1] && (data[c] > data[c + 1])) {
                    result.add(data[c]);
                }
            }
        }
        return result;
    }
    //Two pointer approach to find - if a pair exists with the given sum
    //Algo - create 2 pointers one pointing to beginning and the other pointing to the end of the array
    // add both. If sum < val , move the left pointer. else move the right pointer
    public static boolean pair_Exists_With_Given_Sum(int[] data, int val)
    {
        boolean result = false;
        int start = 0; int end = data.length-1;
        while(start < end)
        {
            if(data[start] + data[end] == val)
            {
                result = true;
                break;
            }
            if(data[start] + data[end] < val)
            {
                start++;
            }
            else if(data[start] + data[end] > val)
            {
                end--;
            }
        }
        return result;
    }


}
