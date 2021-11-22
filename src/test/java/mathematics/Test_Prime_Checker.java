package mathematics;

import com.sidd.ds.mathematics.Factorial;
import com.sidd.ds.mathematics.Prime_Checker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Prime_Checker
{
    @Test
    public void testPrime()
    {
        Assertions.assertFalse(Prime_Checker.isPrime(1));
        Assertions.assertTrue(Prime_Checker.isPrime(13));
        Assertions.assertFalse(Prime_Checker.isPrime(14));
        Assertions.assertTrue(Prime_Checker.isPrime(101));

    }

}
