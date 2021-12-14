package strings;

import com.sidd.ds.strings.Palindrome_Checker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Palindrome_Checker {

    @Test
    public void test_check_palindrome_naive()
    {
        Assertions.assertFalse(Palindrome_Checker.isPalindrome_naive("india"));

        Assertions.assertTrue(Palindrome_Checker.isPalindrome_naive("abcba"));
    }
    @Test
    public void test_check_palindrome_optimized()
    {
        Assertions.assertFalse(Palindrome_Checker.isPalindrome_optimized("india"));

        Assertions.assertTrue(Palindrome_Checker.isPalindrome_optimized("abcba"));

        Assertions.assertTrue(Palindrome_Checker.isPalindrome_optimized("xxyyxx"));
    }
}
