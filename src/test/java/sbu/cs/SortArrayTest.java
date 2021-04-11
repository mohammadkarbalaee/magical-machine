package sbu.cs;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SortArrayTest {

    private static SortArray instance;

    @BeforeAll
    static void setup() {
        instance = new SortArray();
    }

    @Test
    void selectionSort1() {
        int[] arr = {0};
        assertArrayEquals(instance.selectionSort(arr, 1), arr);
    }

    @Test
    void selectionSort2() {
        int[] arr = {81, 84, 7, 85, 636};
        assertArrayEquals(instance.selectionSort(arr, 5), new int[]{7, 81, 84, 85, 636});
    }

    @Test
    void selectionSort3() {
        int[] arr = {51, -72, 3, 12, 18, 6};
        assertArrayEquals(instance.selectionSort(arr, 6), new int[]{-72, 3, 6, 12, 18, 51});
    }

    @Test
    void insertionSort1() {
        int[] arr = {0};
        assertArrayEquals(instance.insertionSort(arr, 1), arr);
    }

    @Test
    void insertionSort2() {
        int[] arr = {81, 84, 7, 85, 636};
        assertArrayEquals(instance.insertionSort(arr, 5), new int[]{7, 81, 84, 85, 636});
    }

    @Test
    void insertionSort3() {
        int[] arr = {51, -72, 3, 12, 18, 6};
        assertArrayEquals(instance.insertionSort(arr, 6), new int[]{-72, 3, 6, 12, 18, 51});
    }

    @Test
    void mergeSort1() {
        int[] arr = {0};
        assertArrayEquals(instance.mergeSort(arr, 1), arr);
    }

    @Test
    void mergeSort2() {
        int[] arr = {81, 84, 7, 85, 636};
        assertArrayEquals(instance.mergeSort(arr, 5), new int[]{7, 81, 84, 85, 636});
    }

    @Test
    void mergeSort3() {
        int[] arr = {51, -72, 3, 12, 18, 6};
        assertArrayEquals(instance.mergeSort(arr, 6), new int[]{-72, 3, 6, 12, 18, 51});
    }

    @Test
    void binarySearchEven() {
        int[] arr = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        assertEquals(instance.binarySearch(arr, 34), 7);
    }

    @Test
    void binarySearchOdd() {
        int[] arr = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        assertEquals(instance.binarySearch(arr, 34), 7);
    }

    @Test
    void binarySearchEvenMiss() {
        int[] arr = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        assertEquals(instance.binarySearch(arr, 37), -1);
    }

    @Test
    void binarySearchOddMiss() {
        int[] arr = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        assertEquals(instance.binarySearch(arr, 37), -1);
    }

    @Test
    void binarySearchRecursiveEven() {
        int[] arr = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        assertEquals(instance.binarySearchRecursive(arr, 34), 7);
    }

    @Test
    void binarySearchRecursiveOdd() {
        int[] arr = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        assertEquals(instance.binarySearchRecursive(arr, 34), 7);
    }

    @Test
    void binarySearchRecursiveEvenMiss() {
        int[] arr = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        assertEquals(instance.binarySearchRecursive(arr, 37), -1);
    }

    @Test
    void binarySearchRecursiveOddMiss() {
        int[] arr = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        assertEquals(instance.binarySearchRecursive(arr, 37), -1);
    }
}