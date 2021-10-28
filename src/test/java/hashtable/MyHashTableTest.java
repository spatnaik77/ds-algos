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
        for(int c = 1; c <= 10; c++)
        {
            hashTable.put(c, "" + c);
            Assertions.assertEquals(""+c, hashTable.get(c));
        }
    }

}
