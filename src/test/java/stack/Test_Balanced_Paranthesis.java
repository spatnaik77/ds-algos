package stack;

import com.sidd.ds.stack.problems.BalancedParanthesis;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Balanced_Paranthesis {

    @Test
    public void test()
    {
        Assertions.assertTrue(BalancedParanthesis.check("{([])}"));

        Assertions.assertFalse(BalancedParanthesis.check("{([])}}"));
    }
}
