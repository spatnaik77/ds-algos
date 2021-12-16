package array.problems;

import com.sidd.ds.array.problems.Window_Sliding_Technique;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Window_Sliding_Technique {

    @Test
    public void testWindowSlidingNaive()
    {
        int[] input1 = {1, 8, 30, -5, 20, 7};
        Assertions.assertEquals(45, Window_Sliding_Technique.getMaximumSum_Naive(input1, 3));

        int[] input2 = {1, 8, 30, -5};
        Assertions.assertEquals(39, Window_Sliding_Technique.getMaximumSum_Naive(input2, 3));

    }
    @Test
    public void testWindowSlidingOptimised()
    {
        int[] input1 = {1, 8, 30, -5, 20, 7};
        Assertions.assertEquals(45, Window_Sliding_Technique.getMaximumSum_Optimised(input1, 3));

        int[] input2 = {1, 8, 30, -5};
        Assertions.assertEquals(39, Window_Sliding_Technique.getMaximumSum_Optimised(input2, 3));

    }
}
