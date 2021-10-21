package array;

import com.sidd.ds.array.MyArrayList;

import com.sidd.ds.array.MyList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArrayListTest {

    @Test
    public void test()
    {
        MyList arrayList = new MyArrayList(10);
        for(int c = 1; c <= 5; c++)
        {
            arrayList.insert(c);
        }
        assertEquals(20, 20);
        Assertions.assertTrue(arrayList.find(1));
        Assertions.assertTrue(arrayList.find(5));
        Assertions.assertFalse(arrayList.find(10));
        arrayList.print();

        //Delete 3
        arrayList.delete(3);
        Assertions.assertFalse(arrayList.find(3));
        arrayList.print();

        //Delete 3
        arrayList.delete(2);
        arrayList.delete(4);
        arrayList.delete(5);
        Assertions.assertFalse(arrayList.find(5));
        Assertions.assertTrue(arrayList.find(1));
        System.out.println();
        arrayList.print();

    }
}
