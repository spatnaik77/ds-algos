package stack;

import com.sidd.ds.stack.problems.Two_Stacks_Using_Single_Array_Naive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Two_Stacks_Using_Single_Array_Naive {

    @Test
    public void test2StackNaive()
    {
        Two_Stacks_Using_Single_Array_Naive stack = new Two_Stacks_Using_Single_Array_Naive(5);
        for(int c = 1; c <= 5 ; c++)
            stack.push1(c);
        //stack.push1(6);//Should throw an exception
        Assertions.assertEquals(5, stack.pop1());
        Assertions.assertEquals(4, stack.pop1());
        Assertions.assertEquals(3, stack.pop1());
        Assertions.assertEquals(2, stack.pop1());
        Assertions.assertEquals(1, stack.pop1());

        for(int c = 11; c <= 15 ; c++)
            stack.push2(c);
        //stack.push2(16);//Should throw an exception
        Assertions.assertEquals(15, stack.pop2());
        Assertions.assertEquals(14, stack.pop2());
        Assertions.assertEquals(13, stack.pop2());
        Assertions.assertEquals(12, stack.pop2());
        Assertions.assertEquals(11, stack.pop2());

    }


}
