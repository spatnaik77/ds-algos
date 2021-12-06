package search;

import com.sidd.ds.search.Binary_Search_Problems;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Binary_Search_Problems {

    @Test
    public void testBinarySearch()
    {
        int[] input = {10, 20, 30, 40, 50};

        Assertions.assertEquals(4, Binary_Search_Problems.binarySearch(input, 50));

        Assertions.assertEquals(2, Binary_Search_Problems.binarySearch(input, 30));

        Assertions.assertEquals(0, Binary_Search_Problems.binarySearch(input, 10));

        Assertions.assertEquals(-1, Binary_Search_Problems.binarySearch(input, 90));

    }
    @Test
    public void testBinarySearchRecursive()
    {
        int[] input = {10, 20, 30, 40, 50};

        Assertions.assertEquals(4, Binary_Search_Problems.binarySearch_recursive(input, 50));

        Assertions.assertEquals(2, Binary_Search_Problems.binarySearch_recursive(input, 30));

        Assertions.assertEquals(0, Binary_Search_Problems.binarySearch_recursive(input, 10));

        Assertions.assertEquals(-1, Binary_Search_Problems.binarySearch_recursive(input, 90));

    }

    @Test
    public void testGetIndexOfFirstOccurance()
    {
        int[] input = {5, 10, 10, 20, 20};

        Assertions.assertEquals(1, Binary_Search_Problems.getIndexOfFirstOccurance(input, 10));
    }

    @Test
    public void testGetIndexOfLastOccurance()
    {
        int[] input1 = {5, 10, 10, 10, 20};

        Assertions.assertEquals(3, Binary_Search_Problems.getIndexOfLastOccurance(input1, 10));

        int[] input2 = {5, 10, 10, 10, 10};

        Assertions.assertEquals(4, Binary_Search_Problems.getIndexOfLastOccurance(input2, 10));
    }
    @Test
    public void testGetOccuranceCount() {
        int[] input1 = {5, 10, 10, 10, 20};

        Assertions.assertEquals(3, Binary_Search_Problems.getOccuranceCount(input1, 10));

        Assertions.assertEquals(-1, Binary_Search_Problems.getOccuranceCount(input1, 100));
    }
    @Test
    public void testGetSquareRoot_naive()
    {
        Assertions.assertEquals(2, Binary_Search_Problems.getSquareRoot_naive(5));

        Assertions.assertEquals(5, Binary_Search_Problems.getSquareRoot_naive(25));

        Assertions.assertEquals(9, Binary_Search_Problems.getSquareRoot_naive(81));
    }
    @Test
    public void testGetSquareRoot_using_binary_search()
    {
        Assertions.assertEquals(2, Binary_Search_Problems.getSquareRoot_using_binary_search(4));

        Assertions.assertEquals(5, Binary_Search_Problems.getSquareRoot_using_binary_search(25));

        Assertions.assertEquals(9, Binary_Search_Problems.getSquareRoot_using_binary_search(81));

        Assertions.assertEquals(2, Binary_Search_Problems.getSquareRoot_using_binary_search(5));

    }
    @Test
    public void testSearch_In_Infinite_Size_Array()
    {
        int[] input1 = {2, 3, 10, 20, 30, 40, 43, 250, 279 };
        Assertions.assertEquals(7, Binary_Search_Problems.search_In_Infinite_sized_Array(input1, 250));
    }

    @Test
    public void test_Find_Peak_Elements()
    {
        int[] input1 = {5, 10, 20, 15, 7 };
        Assertions.assertEquals(1, Binary_Search_Problems.findPeakElements(input1).size());
        Assertions.assertEquals(20, Binary_Search_Problems.findPeakElements(input1).get(0));

        int[] input2 = {5, 10, 20, 15, 7, 70, 69 }; //Answer: 20 & 70
        Assertions.assertEquals(2, Binary_Search_Problems.findPeakElements(input2).size());
        Assertions.assertEquals(20, Binary_Search_Problems.findPeakElements(input2).get(0));
        Assertions.assertEquals(70, Binary_Search_Problems.findPeakElements(input2).get(1));
    }

    @Test
    public void test_Pair_Exists_With_Given_Sum()
    {
        int[] input1 = {5, 10, 16, 20, 25};
        Assertions.assertTrue(Binary_Search_Problems.pair_Exists_With_Given_Sum(input1, 36));

        int[] input2 = {5, 10, 16, 20, 25};
        Assertions.assertFalse(Binary_Search_Problems.pair_Exists_With_Given_Sum(input1, 66));
    }


}
