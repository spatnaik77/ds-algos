package array;

import com.sidd.ds.array.MyArrayList;
import com.sidd.ds.array.MyList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_MyArrayList {

    @Test
    public void testBasic()
    {
        MyList list = new MyArrayList(5);
        for(int c = 1; c <= 4; c++)
        {
            list.add(c);
        }
        list.add(4);
        list.print();
        Assertions.assertEquals(5, list.size());
        Assertions.assertTrue(list.contains(1));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.indexOf(4));
        Assertions.assertEquals(4, list.lastIndexOf(4));

    }
    @Test
    public void testResize()
    {
        MyList list = new MyArrayList(5);
        for(int c = 1; c <= 5; c++)
        {
            list.add(c);
        }
        for(int c = 6; c <= 10; c++)
        {
            list.add(c);
        }
        list.print();
        Assertions.assertEquals(10, list.size());
        Assertions.assertEquals(6, list.get(5));
    }
    @Test
    public void testAddAtIndex()
    {
        MyList list = new MyArrayList(4);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.print();
        list.add(2, 3);//The array should resize and size should become 8
        Assertions.assertEquals(8, list.size());
        Assertions.assertEquals(3, list.get(2));
        list.print();
    }
    @Test
    public void testRemoveAtIndex()
    {
        MyList list = new MyArrayList(10);
        for(int c = 1; c <= 5; c++)
        {
            list.add(c);
        }
        list.removeAtIndex(2);//The array should resize and size should become 8
        Assertions.assertEquals(4, list.get(2));
        list.print();
    }
    @Test
    public void testRemove()
    {
        MyList list = new MyArrayList(10);
        for(int c = 1; c <= 5; c++)
        {
            list.add(c);
        }
        list.remove(3);//The array should resize and size should become 8
        Assertions.assertEquals(4, list.get(2));
        list.print();
    }
}
