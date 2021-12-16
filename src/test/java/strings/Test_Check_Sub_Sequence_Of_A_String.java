package strings;

import com.sidd.ds.strings.Check_Sub_Sequence_Of_A_String;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Check_Sub_Sequence_Of_A_String {

    @Test
    public void testCheck_Sub_Sequence_Of_A_String()
    {
        Assertions.assertTrue(Check_Sub_Sequence_Of_A_String.is_Sub_Sequence("abcde", "ab"));
        Assertions.assertTrue(Check_Sub_Sequence_Of_A_String.is_Sub_Sequence("abcde", "ae"));
        Assertions.assertTrue(Check_Sub_Sequence_Of_A_String.is_Sub_Sequence("abcde", "ace"));
        Assertions.assertTrue(Check_Sub_Sequence_Of_A_String.is_Sub_Sequence("abcde", "e"));
        Assertions.assertTrue(Check_Sub_Sequence_Of_A_String.is_Sub_Sequence("abcde", ""));

        Assertions.assertFalse(Check_Sub_Sequence_Of_A_String.is_Sub_Sequence("abcde", "acb"));

    }
}
