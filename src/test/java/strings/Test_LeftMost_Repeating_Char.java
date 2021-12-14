package strings;

import com.sidd.ds.strings.LeftMost_Repeating_Char;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_LeftMost_Repeating_Char {

    @Test
    public void test()
    {
        Assertions.assertEquals(0, LeftMost_Repeating_Char.getIndexOfLeftMostRepeatingChar("geeksforgeeks"));

        Assertions.assertEquals(1, LeftMost_Repeating_Char.getIndexOfLeftMostRepeatingChar("abbcc"));

        Assertions.assertEquals(-1, LeftMost_Repeating_Char.getIndexOfLeftMostRepeatingChar("abcd"));

        Assertions.assertEquals(0, LeftMost_Repeating_Char.getIndexOfLeftMostRepeatingChar_optimized("geeksforgeeks"));

        Assertions.assertEquals(1, LeftMost_Repeating_Char.getIndexOfLeftMostRepeatingChar_optimized("abbcc"));

        Assertions.assertEquals(-1, LeftMost_Repeating_Char.getIndexOfLeftMostRepeatingChar_optimized("abcd"));


    }
}
