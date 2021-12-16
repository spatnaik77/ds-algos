package queue;

import com.sidd.ds.queue.MyQueueBackedByLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyQueueTest {

    @Test
    public void testMyQueueBackedByLinkedList()
    {
        MyQueueBackedByLinkedList queue = new MyQueueBackedByLinkedList();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        Assertions.assertEquals(1, queue.peek());
        Assertions.assertEquals(1, queue.poll());
        Assertions.assertEquals(2, queue.poll());
        Assertions.assertEquals(3, queue.poll());
    }

}
