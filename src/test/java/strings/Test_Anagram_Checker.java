package strings;

import com.sidd.ds.strings.Anagram_Checker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Anagram_Checker {

    @Test
    public void testCheckAnagram()
    {
        Assertions.assertTrue(Anagram_Checker.isAnagram_sol1("listen", "silent"));
        Assertions.assertTrue(Anagram_Checker.isAnagram_sol1("elbow", "below"));
        Assertions.assertTrue(Anagram_Checker.isAnagram_sol1("sadder", "dreads"));
        Assertions.assertFalse(Anagram_Checker.isAnagram_sol1("india", "pakistan"));

        Assertions.assertTrue(Anagram_Checker.isAnagram_sol2("listen", "silent"));
        Assertions.assertTrue(Anagram_Checker.isAnagram_sol2("elbow", "below"));
        Assertions.assertTrue(Anagram_Checker.isAnagram_sol1("sadder", "dreads"));
        Assertions.assertFalse(Anagram_Checker.isAnagram_sol2("india", "pakistan"));

        Assertions.assertTrue(Anagram_Checker.isAnagram_sol3("listen", "silent"));
        Assertions.assertTrue(Anagram_Checker.isAnagram_sol3("elbow", "below"));
        Assertions.assertTrue(Anagram_Checker.isAnagram_sol3("sadder", "dreads"));
        Assertions.assertFalse(Anagram_Checker.isAnagram_sol3("india", "pakistan"));
    }
}
