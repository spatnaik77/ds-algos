package stack;

import com.sidd.ds.stack.problems.Stock_Span_problem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Stock_Span_Problem {

    @Test
    public void testGetSpan_Naive()
    {
        int[] input = {30, 20, 25, 28, 27, 29};
        int[] span = Stock_Span_problem.getSpan_Naive(input);
        //span should be : {1,   1,  2,  3,  1,  5}
        Assertions.assertEquals(6, span.length);
        Assertions.assertEquals(1, span[0]);
        Assertions.assertEquals(1, span[1]);
        Assertions.assertEquals(5, span[5]);

    }
}
