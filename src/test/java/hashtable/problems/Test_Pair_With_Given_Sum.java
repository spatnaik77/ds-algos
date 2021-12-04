package hashtable.problems;

import com.sidd.ds.hashtable.problems.Pair_With_Given_Sum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Pair_With_Given_Sum {

    @Test
    public void test()
    {
        int[] data = { 1, 3, 5, 7};

        Assertions.assertTrue(Pair_With_Given_Sum.containsPairWithGivenSum(data, 8));

        Assertions.assertFalse(Pair_With_Given_Sum.containsPairWithGivenSum(data, 13));

        Assertions.assertTrue(Pair_With_Given_Sum.containsPairWithGivenSum(data, 10));

        //Edge case
        Assertions.assertFalse(Pair_With_Given_Sum.containsPairWithGivenSum(data, 14));


    }


}
