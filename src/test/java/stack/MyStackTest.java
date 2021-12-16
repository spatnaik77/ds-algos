package stack;

import com.sidd.ds.stack.MyStackBackedByDynamicArray;
import com.sidd.ds.stack.MyStackBackedByLinkedList;
import com.sidd.ds.stack.MyStackBackedByArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyStackTest {

    @Test
    public void test()
    {
        MyStackBackedByLinkedList stack = new MyStackBackedByLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals(3, stack.peek());
        Assertions.assertEquals(3, stack.pop());
        Assertions.assertEquals(2, stack.pop());
        Assertions.assertEquals(1, stack.pop());
    }

    @Test
    public void testStackBackedByArray()
    {
        MyStackBackedByArray stack = new MyStackBackedByArray(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals(3, stack.peek());
        Assertions.assertEquals(3, stack.pop());
        Assertions.assertEquals(2, stack.pop());
        Assertions.assertEquals(1, stack.pop());
    }

    @Test
    public void testStackBackedByDynamicArray()
    {
        MyStackBackedByDynamicArray stack = new MyStackBackedByDynamicArray();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals(3, stack.peek());
        Assertions.assertEquals(3, stack.pop());
        Assertions.assertEquals(2, stack.pop());
        Assertions.assertEquals(1, stack.pop());
    }
}
