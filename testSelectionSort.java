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
<<<<<<< HEAD
       
=======
        testMixed();
        testDuplicates();
>>>>>>> testComplex
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

<<<<<<< HEAD
=======
    public void testMixed() {
        int[] arr = {0, -1, 2, -3, 4};
        int[] sortedArr = {-3, -1, 0, 2, 4};

        // Implementing sorting and checking if the sorted array is correct
        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    public void testDuplicates() {
        int[] arr = {2, 3, 3, 1, 2};
        int[] sortedArr = {1, 2, 2, 3, 3};

        // Implementing sorting and checking if the sorted array is correct
        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

>>>>>>> testComplex
  
}
