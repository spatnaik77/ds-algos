package strings;

import com.sidd.ds.strings.LeftMost_Non_Repeating_Char;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_LeftMost_Non_Repeating_Char {

    @Test
    public void testLeftMost_Non_Repeating_Char() {

        Assertions.assertEquals(5, LeftMost_Non_Repeating_Char.getIndexOfLeftMostNonRepeatingChar("geeksforgeeks"));

        Assertions.assertEquals(-1, LeftMost_Non_Repeating_Char.getIndexOfLeftMostNonRepeatingChar("abcabc"));

        Assertions.assertEquals(0, LeftMost_Non_Repeating_Char.getIndexOfLeftMostNonRepeatingChar("abcd"));



    }
}
