package mathematics;

import com.sidd.ds.mathematics.Count_Number_Of_Digits_In_A_Number;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Count_Number_Of_Digits_In_A_Number
{
    @Test
    public void testBasic()
    {
        Assertions.assertEquals(3, Count_Number_Of_Digits_In_A_Number.countNumberOfDigitsInANumber(123));
        Assertions.assertEquals(3, Count_Number_Of_Digits_In_A_Number.countNumberOfDigitsInANumber(100));
        Assertions.assertEquals(1, Count_Number_Of_Digits_In_A_Number.countNumberOfDigitsInANumber(1));
    }

    @Test
    public void testRecursive()
    {
        Assertions.assertEquals(3, Count_Number_Of_Digits_In_A_Number.countNumberOfDigitsInANumber_Recursive(123));
        Assertions.assertEquals(3, Count_Number_Of_Digits_In_A_Number.countNumberOfDigitsInANumber_Recursive(100));
        Assertions.assertEquals(1, Count_Number_Of_Digits_In_A_Number.countNumberOfDigitsInANumber_Recursive(1));
    }

}
