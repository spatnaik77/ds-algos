package recursion;

import com.sidd.ds.recursion.Sum_Of_Natural_Numbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Sum_Of_Natural_numbers {

    @Test
    public void test()
    {
        Assertions.assertEquals(15, Sum_Of_Natural_Numbers.sum_recursive(5));

        Assertions.assertEquals(1, Sum_Of_Natural_Numbers.sum_recursive(1));
    }
}
