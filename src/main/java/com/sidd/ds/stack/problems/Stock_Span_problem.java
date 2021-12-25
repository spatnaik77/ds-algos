package com.sidd.ds.stack.problems;

/*
      Span is defined as the value including the current day, number of previous
      days where the stock value was equal or less

      Exm Input  {13, 15, 12, 14, 16, 8}
          output {1,  2,  1,   2, 5, 1}

      Exm Input  {30, 20, 25, 28, 27, 29}
          output {1,   1,  2,  3,  1,  5}

      Logic

 */
public class Stock_Span_problem
{
        public static int[] getSpan_Naive(int[] input)
        {
            int[] result = new int[input.length];
            for(int i = 0; i < input.length; i++)
            {
                int count = 0;
                for(int j = i; j >= 0; j--)
                {
                   if(input[j] <= input[i])
                   {
                       count++;
                   }
                   else
                   {
                           break;
                   }
                }
                result[i] = count;
            }
            return result;
        }
}
