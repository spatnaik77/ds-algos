package mathematics;

import com.sidd.ds.mathematics.Factorial;
import com.sidd.ds.mathematics.Prime_Checker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Prime_Checker
{
    @Test
    public void testPrimeNaive()
    {
        Assertions.assertFalse(Prime_Checker.isPrime(1));
        Assertions.assertTrue(Prime_Checker.isPrime(2));
        Assertions.assertTrue(Prime_Checker.isPrime(3));
        Assertions.assertTrue(Prime_Checker.isPrime(13));
        Assertions.assertFalse(Prime_Checker.isPrime(14));
        Assertions.assertTrue(Prime_Checker.isPrime(101));
    }
    @Test
    public void testPrimeOptimised()
    {
        Assertions.assertFalse(Prime_Checker.isPrimeOptimised(1));
        Assertions.assertTrue(Prime_Checker.isPrime(2));
        Assertions.assertTrue(Prime_Checker.isPrime(3));
        Assertions.assertTrue(Prime_Checker.isPrimeOptimised(13));
        Assertions.assertFalse(Prime_Checker.isPrimeOptimised(14));
        Assertions.assertTrue(Prime_Checker.isPrimeOptimised(101));
    }

}
