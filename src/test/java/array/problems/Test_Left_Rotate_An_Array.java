package array.problems;

import com.sidd.ds.array.problems.Left_Rotate_An_Array;
import com.sidd.ds.array.problems.Reverse_An_Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Left_Rotate_An_Array {

    @Test
    public void testLeftRorateByPosition1()
    {
        int[] input1 = {1, 2, 3 ,4};
        int[] output1 = Left_Rotate_An_Array.leftRotate(input1); //Expected: { 2, 3, 4, 1}
        Assertions.assertEquals(2, output1[0]);
        Assertions.assertEquals(1, output1[3]);
    }
    @Test
    public void testLeftRorateByPosition2()
    {
        int[] input1 = {1, 2, 3 ,4};
        int[] output1 = Left_Rotate_An_Array.leftRotate(input1, 2); //Expected: { 3, 4, 1, 2}
        Assertions.assertEquals(3, output1[0]);
        Assertions.assertEquals(2, output1[3]);
    }
}
