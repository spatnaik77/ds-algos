package recursion;

import com.sidd.ds.recursion.Palindrome_Checker_Using_recursion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Palindrome_Checker_Using_recursion {

    @Test
    public void test()
    {
        Assertions.assertTrue(Palindrome_Checker_Using_recursion.isPalindrome("abba"));

        Assertions.assertFalse(Palindrome_Checker_Using_recursion.isPalindrome("abcde"));

    }
}
