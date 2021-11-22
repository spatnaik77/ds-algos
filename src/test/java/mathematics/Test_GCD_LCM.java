package mathematics;

import com.sidd.ds.mathematics.Factorial;
import com.sidd.ds.mathematics.GCD_LCM;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_GCD_LCM
{
    @Test
    public void testGCD()
    {
        Assertions.assertEquals(5, GCD_LCM.getGCD(5, 10));
        Assertions.assertEquals(1, GCD_LCM.getGCD(9, 10));
        Assertions.assertEquals(5, GCD_LCM.getGCD(25, 30));
    }
    @Test
    public void testGCDUsingEuclideanAlgorithm()
    {
        Assertions.assertEquals(5, GCD_LCM.getGCDUsingEuclideanAlgorithm(5, 10));
        Assertions.assertEquals(1, GCD_LCM.getGCDUsingEuclideanAlgorithm(9, 10));
        Assertions.assertEquals(5, GCD_LCM.getGCDUsingEuclideanAlgorithm(25, 30));
    }
    @Test
    public void testLCM()
    {
        Assertions.assertEquals(10, GCD_LCM.getLCM(5, 10));
        Assertions.assertEquals(30, GCD_LCM.getLCM(10, 15));
        Assertions.assertEquals(77, GCD_LCM.getLCM(7, 11));
    }
}
