package stack;

import com.sidd.ds.stack.problems.BalancedParanthesis;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBalancedParanthesis {

    @Test
    public void testCheckBalancedParanthesis()
    {
        Assertions.assertTrue(BalancedParanthesis.checkBalancedParanthesis("{([])}"));

        Assertions.assertFalse(BalancedParanthesis.checkBalancedParanthesis("{([])}}"));

        Assertions.assertFalse(BalancedParanthesis.checkBalancedParanthesis("((()"));
    }
}
