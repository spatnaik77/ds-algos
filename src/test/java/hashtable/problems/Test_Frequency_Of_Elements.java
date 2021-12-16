package hashtable.problems;

import com.sidd.ds.hashtable.problems.Frequency_Of_Elements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class Test_Frequency_Of_Elements {

    @Test
    public void testFrequencyOfElements()
    {
        int[] data = {10, 20, 30, 30, 40};
        Map<Integer, Integer> result = Frequency_Of_Elements.frequencyOfElement(data);
        //Result should be a map :  10:1 , 20:1, 30:2, 40:1
        Assertions.assertEquals(1, result.get(10));
        Assertions.assertEquals(1, result.get(20));
        Assertions.assertEquals(2, result.get(30));
        Assertions.assertEquals(1, result.get(40));
    }
}
