package array.problems;

import com.sidd.ds.array.problems.Remove_Duplicates_In_Sorted_Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Remove_Duplicates_In_Sorted_Array
{
    @Test
    public void testRemoveDuplicatesInSortedArray()
    {
        int[] input = {10, 20, 20, 20, 30};
        int[] output = Remove_Duplicates_In_Sorted_Array.removeDuplicates(input);
        Assertions.assertEquals(10, output[0]);
        Assertions.assertEquals(20, output[1]);
        Assertions.assertEquals(30, output[2]);
    }
}
