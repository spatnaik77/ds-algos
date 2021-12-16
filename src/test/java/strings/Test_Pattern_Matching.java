package strings;

import com.sidd.ds.strings.Pattern_Matching_Naive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Test_Pattern_Matching {

    @Test
    public void testPatternMatchingNaive()
    {
        //Input: ABABANCD, Pattern: ABAB,  Result: 0, 2
        List<Integer> result = Pattern_Matching_Naive.matchPattern("ABABABCD", "ABAB");
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(0, result.get(0));
        Assertions.assertEquals(2, result.get(1));


        //Input: ABCABCD, Pattern: ABCD,  Result: 3
        result = Pattern_Matching_Naive.matchPattern("ABCABCD", "ABCD");
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(3, result.get(0));


        //Input: AAAAA, Pattern: AAA,  Result: 0, 1, 2
        result = Pattern_Matching_Naive.matchPattern("AAAAA", "AAA");
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals(0, result.get(0));
        Assertions.assertEquals(1, result.get(1));
        Assertions.assertEquals(2, result.get(2));
    }
}
