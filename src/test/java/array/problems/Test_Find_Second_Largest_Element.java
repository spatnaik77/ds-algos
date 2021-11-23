package array.problems;

import com.sidd.ds.array.problems.Find_Largest_Element;
import com.sidd.ds.array.problems.Find_Second_Largest_Element;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Find_Second_Largest_Element {

    @Test
    public void test()
    {
        int[] input1 = {1, 30, 9, 100, 12};
        Assertions.assertEquals(30, Find_Second_Largest_Element.findSecondLargestElement(input1));

        int[] input2 = {30, 20, 10};
        Assertions.assertEquals(20, Find_Second_Largest_Element.findSecondLargestElement(input2));

        int[] input3 = {30, 30, 30};
        Assertions.assertEquals(-1, Find_Second_Largest_Element.findSecondLargestElement(input3));


    }
}
