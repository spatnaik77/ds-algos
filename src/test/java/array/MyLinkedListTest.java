package array;

import com.sidd.ds.array.MyArrayList;
import com.sidd.ds.array.MyList;
import com.sidd.ds.linkedlist.MyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyLinkedListTest {

    @Test
    public void test()
    {
        MyLinkedList myLinkedList = new MyLinkedList();
        for(int c = 1; c <= 5; c++)
        {
            myLinkedList.insert(c);
        }
        myLinkedList.insertAtBegining(0);
        myLinkedList.insertAtLast(6);
        myLinkedList.print();

        Assertions.assertTrue(myLinkedList.find(1));
        Assertions.assertTrue(myLinkedList.find(5));
        Assertions.assertFalse(myLinkedList.find(10));
        myLinkedList.print();

        //Delete 3
        myLinkedList.delete(3);
        Assertions.assertFalse(myLinkedList.find(3));
        myLinkedList.print();

        //Delete
        myLinkedList.delete(2);
        myLinkedList.delete(4);
        myLinkedList.delete(5);
        Assertions.assertFalse(myLinkedList.find(5));
        Assertions.assertTrue(myLinkedList.find(1));
        myLinkedList.print();
    }
}
