import static org.junit.Assert.*;

import org.junit.Test;

pimport static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
    public testSelectionSort() {
    }

    @Test
    public void test() {
        testPositive();
        testNegative();
       
    }

    public void testPositive() {
        int[] arr = {8, 9, 7, 10, 2};
        int[] sortedArr = {2, 7, 8, 9, 10};

        // Assuming SelectionSort.basicSelectionSort() is a static method
        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    public void testNegative() {
        int[] arr = {-1, -3, -4, -2, -5};
        int[] sortedArr = {-5, -4, -3, -2, -1};

        // Implementing sorting and checking if the sorted array is correct
        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

  
}
