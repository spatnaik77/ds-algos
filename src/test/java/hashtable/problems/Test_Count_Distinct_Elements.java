package hashtable.problems;

import com.sidd.ds.hashtable.problems.Count_Distinct_Elements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Count_Distinct_Elements {

    @Test
    public void test_naive()
    {
        int[] data1 = {15, 12, 13, 12, 13, 13, 18};
        Assertions.assertEquals(4, Count_Distinct_Elements.countDistinctElements_naive(data1));

        int[] data2 = {10, 10, 10};
        Assertions.assertEquals(1, Count_Distinct_Elements.countDistinctElements_naive(data2));

        int[] data3 = {10, 11, 12};
        Assertions.assertEquals(3, Count_Distinct_Elements.countDistinctElements_naive(data3));
    }
    @Test
    public void test_optimized()
    {
        int[] data1 = {15, 12, 13, 12, 13, 13, 18};
        Assertions.assertEquals(4, Count_Distinct_Elements.countDistinctElements_optimized(data1));

        int[] data2 = {10, 10, 10};
        Assertions.assertEquals(1, Count_Distinct_Elements.countDistinctElements_optimized(data2));

        int[] data3 = {10, 11, 12};
        Assertions.assertEquals(3, Count_Distinct_Elements.countDistinctElements_optimized(data3));
    }
}
