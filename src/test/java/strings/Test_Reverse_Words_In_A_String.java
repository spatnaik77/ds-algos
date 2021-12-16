package strings;

import com.sidd.ds.strings.Reverse_Words_In_A_String;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Reverse_Words_In_A_String {

    @Test
    public void testReverse()
    {

        Assertions.assertEquals("you love i", Reverse_Words_In_A_String.reverse("i love you"));
    }
}
