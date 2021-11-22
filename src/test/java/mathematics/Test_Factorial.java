package mathematics;

import com.sidd.ds.mathematics.Factorial;
import com.sidd.ds.mathematics.Palindrome_Checker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Factorial
{
    @Test
    public void testBasic()
    {
        Assertions.assertEquals(120, Factorial.factorial(5));
        Assertions.assertEquals(2, Factorial.factorial(2));
        Assertions.assertEquals(1, Factorial.factorial(1));
    }
    @Test
    public void testResursive()
    {
        Assertions.assertEquals(120, Factorial.factorial_recursive(5));
        Assertions.assertEquals(2, Factorial.factorial_recursive(2));
        Assertions.assertEquals(1, Factorial.factorial_recursive(1));
    }
}
