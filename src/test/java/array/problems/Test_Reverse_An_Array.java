package array.problems;

import com.sidd.ds.array.problems.Reverse_An_Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Reverse_An_Array {

    @Test
    public void test()
    {
        int[] input1 = {1, 2, 3 ,4};
        int[] output1 = Reverse_An_Array.reverse(input1); //{ 4, 3, 2, 1}
        Assertions.assertEquals(4, output1[0]);
        Assertions.assertEquals(2, output1[2]);

        int[] input2 = {10, 20, 30 ,40, 50};
        int[] output2 = Reverse_An_Array.reverse(input2); //{ 50, 40, 30, 20, 10}
        Assertions.assertEquals(50, output2[0]);
        Assertions.assertEquals(40, output2[1]);
        Assertions.assertEquals(30, output2[2]);
        Assertions.assertEquals(20, output2[3]);
        Assertions.assertEquals(10, output2[4]);
    }
}
