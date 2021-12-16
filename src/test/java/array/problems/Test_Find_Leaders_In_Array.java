package array.problems;

import com.sidd.ds.array.problems.Find_Leaders_In_Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Test_Find_Leaders_In_Array {

    @Test
    public void testFindLeadersNaive()
    {
        int[] input = { 2 , 25, 9, 4, 13, 8 } ;
        List<Integer> resust = Find_Leaders_In_Array.findLeaders_Naive_Solution(input);
        //Output should be :  25, 13, 8
        Assertions.assertEquals(3, resust.size());
        Assertions.assertEquals(25, resust.get(0));
        Assertions.assertEquals(13, resust.get(1));
        Assertions.assertEquals(8, resust.get(2));
    }
    @Test
    public void testFindLeadersOptimised()
    {
        int[] input = { 2 , 25, 9, 4, 13, 8 } ;
        List<Integer> resust = Find_Leaders_In_Array.findLeaders_Optimised_Solution(input);
        //Output should be :  8, 13, 25
        Assertions.assertEquals(3, resust.size());
        Assertions.assertEquals(8, resust.get(0));
        Assertions.assertEquals(13, resust.get(1));
        Assertions.assertEquals(25, resust.get(2));
    }
}
