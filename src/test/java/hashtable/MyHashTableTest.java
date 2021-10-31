package hashtable;

import com.sidd.ds.hashtable.MyHashTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyHashTableTest {

    @Test
    public void test1()
    {
        MyHashTable<String, String> hashTable = new MyHashTable<>(10);
        hashTable.put("1", "One");
        hashTable.put("2", "Two");
        hashTable.put("3", "Three");
        Assertions.assertEquals("One", hashTable.get("1"));
        Assertions.assertEquals(null, hashTable.get("5"));
    }
    @Test
    public void test2()
    {
        MyHashTable<Integer, String> hashTable = new MyHashTable<>(5);
        for(int c = 1; c <= 20; c++)
        {
            hashTable.put(c, "" + c);
            Assertions.assertEquals(""+c, hashTable.get(c));
        }
        Assertions.assertEquals(20, hashTable.getCurrentSize());

        Assertions.assertEquals(""+5, hashTable.get(5));
        Assertions.assertEquals(""+15, hashTable.get(15));
        Assertions.assertEquals(""+20, hashTable.get(20));

        for(int c = 21; c <= 50; c++)
        {
            hashTable.put(c, "" + c);
            Assertions.assertEquals(""+c, hashTable.get(c));
        }
        Assertions.assertEquals(50, hashTable.getCurrentSize());

    }

}
