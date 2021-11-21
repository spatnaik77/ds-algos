package mathematics;

import com.sidd.ds.mathematics.Count_Number_Of_Digits_In_A_Number;
import com.sidd.ds.mathematics.Palindrome_Checker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Palindrome_Checker
{
    @Test
    public void testBasic()
    {
        Assertions.assertEquals(true, Palindrome_Checker.palindromeCheck(121));
        Assertions.assertEquals(false, Palindrome_Checker.palindromeCheck(1234));
    }

}
