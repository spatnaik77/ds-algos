package com.sidd.ds.mathematics;



public class Count_Number_Of_Digits_In_A_Number
{
    public static int countNumberOfDigitsInANumber(int number)
    {
        int count = 0;
        int num = number;
        while(num != 0)
        {
            num = num / 10;
            ++count;
        }

        return count;
    }
    public static int countNumberOfDigitsInANumber_Recursive(int number)
    {
        int count = 0;
        return countNumberOfDigitsInANumber_Recursive_Util(number, count);

    }
    private static int countNumberOfDigitsInANumber_Recursive_Util(int number, int count)
    {
        if(number != 0)
        {
            count++;
            count = countNumberOfDigitsInANumber_Recursive_Util(number/10, count);
        }
        return count;
    }

}
