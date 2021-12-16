package recursion;

import com.sidd.ds.recursion.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Factorial {

    @Test
    public void testFactorial()
    {
        Assertions.assertEquals(120, Factorial.factorial(5));

        Assertions.assertEquals(1, Factorial.factorial(1));
    }
}
