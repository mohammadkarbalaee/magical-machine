package sbu.cs;

public class SortArray {

    /**
     * sort array arr with selection sort algorithm
     *
     * @param array  array of integers
     * @param size size of arrays
     * @return sorted array
     */
    public int[] selectionSort(int[] array, int size)
    {
        for (int i = 0; i < size; i++)
        {
            int indexOfLeastElement = indexOfLeastElement(array,i);
            swap(array,indexOfLeastElement,i);
        }
        return array;
    }

    private void swap(int[] array,int i,int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private int indexOfLeastElement(int[] array,int start)
    {
        int index = start;
        int least = array[start];
        for (int i = start; i < array.length; i++)
        {
            if (array[i] < least)
            {
                index = i;
                least = array[i];
            }
        }
        return index;
    }



    /**
     * sort array arr with insertion sort algorithm
     *
     * @param arr  array of integers
     * @param size size of arrays
     * @return sorted array
     */
    public int[] insertionSort(int[] arr, int size) {
        return null;
    }

    /**
     * sort array arr with merge sort algorithm
     *
     * @param arr  array of integers
     * @param size size of arrays
     * @return sorted array
     */
    public int[] mergeSort(int[] arr, int size) {
        return null;
    }

    /**
     * return position of given value in array arr which is sorted in ascending order.
     * use binary search algorithm and implement it in iterative form
     *
     * @param arr   sorted array
     * @param value value to be find
     * @return position of value in arr. -1 if not exists
     */
    public int binarySearch(int[] arr, int value) {
        return -1;
    }

    /**
     * return position of given value in array arr which is sorted in ascending order.
     * use binary search algorithm and implement it in recursive form
     *
     * @param arr   sorted array
     * @param value value to be find
     * @return position of value in arr. -1 if not exists
     */
    public int binarySearchRecursive(int[] arr, int value) {
        return -1;
    }
}
