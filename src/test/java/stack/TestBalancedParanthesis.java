package stack;

import com.sidd.ds.stack.problems.Balanced_Paranthesis;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBalancedParanthesis {

    @Test
    public void testCheckBalancedParanthesis()
    {
        Assertions.assertTrue(Balanced_Paranthesis.checkBalancedParanthesis("{([])}"));

        Assertions.assertFalse(Balanced_Paranthesis.checkBalancedParanthesis("{([])}}"));

        Assertions.assertFalse(Balanced_Paranthesis.checkBalancedParanthesis("((()"));



    }
}
