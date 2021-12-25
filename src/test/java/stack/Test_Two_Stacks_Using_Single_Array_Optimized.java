package stack;

import com.sidd.ds.stack.problems.Two_Stacks_Using_Single_Array_Naive;
import com.sidd.ds.stack.problems.Two_Stacks_Using_Single_Array_Optimized;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Two_Stacks_Using_Single_Array_Optimized {

    @Test
    public void test2StackOptimized_1()
    {
        Two_Stacks_Using_Single_Array_Optimized stack = new Two_Stacks_Using_Single_Array_Optimized(10);
        for(int c = 1; c <= 3 ; c++)
            stack.push1(c);

        Assertions.assertEquals(3, stack.pop1());
        Assertions.assertEquals(2, stack.pop1());
        Assertions.assertEquals(1, stack.pop1());

        for(int c = 11; c <= 15 ; c++)
            stack.push2(c);
        Assertions.assertEquals(15, stack.pop2());
        Assertions.assertEquals(14, stack.pop2());
        Assertions.assertEquals(13, stack.pop2());
        Assertions.assertEquals(12, stack.pop2());
        Assertions.assertEquals(11, stack.pop2());
    }
    @Test
    public void test2StackOptimized_2()
    {
        Two_Stacks_Using_Single_Array_Optimized stack = new Two_Stacks_Using_Single_Array_Optimized(5);
        for (int c = 1; c <= 3; c++)
            stack.push1(c);
        stack.push2(11);
        stack.push2(12);
        try {
            stack.push2(13);//should throw exception
        }catch(Exception e)
        {
            Assertions.assertTrue(e.getMessage().equals("Size exceeded"));
        }
        System.out.println("done");
    }

}
