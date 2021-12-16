package array.problems;

import com.sidd.ds.array.problems.Check_If_Array_Is_Sorted;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Check_If_Array_Is_Sorted {

    @Test
    public void testCheckIfArrayIsSorted()
    {
        int[] input1 = {1, 3, 9, 11};
        Assertions.assertTrue(Check_If_Array_Is_Sorted.isSorted(input1));

        int[] input2 = {1, 33, 9, 11};
        Assertions.assertFalse(Check_If_Array_Is_Sorted.isSorted(input2));
    }
}
