package array.problems;

import com.sidd.ds.array.problems.Find_Largest_Element;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Find_Largest_Element {

    @Test
    public void test()
    {
        int[] input1 = {1, 30, 9, 100, 12};
        Assertions.assertEquals(100, Find_Largest_Element.findLargestElement(input1));

        int[] input2 = {30, 30};
        Assertions.assertEquals(30, Find_Largest_Element.findLargestElement(input2));
    }
}
