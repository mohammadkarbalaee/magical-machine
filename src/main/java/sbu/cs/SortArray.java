package sbu.cs;

import java.util.Arrays;
import java.util.LinkedList;

public class SortArray
{

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

    public int[] insertionSort(int[] arr, int size)
    {
        int endIndex = 1;
        LinkedList<Integer> list = arrayToList(arr);
        for (int i = 1; i < list.size(); i++)
        {
            int properLocation = properLocation(list,endIndex,list.get(i));
            list.add(properLocation,list.get(i));
            list.remove(i+1);
            endIndex++;
        }
        return listToArray(list);
    }

    private int properLocation(LinkedList<Integer> list,int endIndex,int indexElement)
    {
        for (int i = 0; i <= endIndex; i++)
        {
            if (indexElement < list.get(i))
            {
                return i;
            }
        }
        return list.indexOf(indexElement);
    }

    private LinkedList<Integer> arrayToList(int[] array)
    {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < array.length; i++)
        {
            list.add(array[i]);
        }
        return list;
    }

    private int[] listToArray(LinkedList<Integer> list)
    {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            array[i] = list.get(i);
        }
        return array;
    }

    public int[] mergeSort(int[] arr, int size)
    {
        int[] temporaryArray = new int[size];
        sort(arr,temporaryArray,0,size - 1);
        return arr;
    }

    private void sort(int[] array,int[] temporaryArray,int leftStart,int rightEnd)
    {
        if (leftStart >= rightEnd)
        {
            return;
        }
        int middle = (leftStart + rightEnd)/2;
        sort(array,temporaryArray,leftStart, middle);
        sort(array,temporaryArray,middle + 1,rightEnd);
        merge(array,temporaryArray,leftStart,rightEnd);
    }

    private void merge(int[] array, int[] temporaryArray, int leftStart, int rightEnd)
    {
        int size = rightEnd - leftStart;
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int leftPosition = leftStart;
        int rightPosition = rightStart;
        int index = leftStart;
        while (leftPosition <= leftEnd && rightPosition<= rightEnd)
        {
            if (array[rightPosition] >= array[leftPosition])
            {
                temporaryArray[index] = array[leftPosition];
                leftPosition++;
            }
            else
            {
                temporaryArray[index] = array[rightPosition];
                rightPosition++;
            }
            index++;
        }
        System.arraycopy(array,leftPosition,temporaryArray,index,(leftEnd - leftPosition) + 1);
        System.arraycopy(array,rightPosition,temporaryArray,index,(rightEnd - rightPosition) + 1);
        System.arraycopy(temporaryArray,leftStart,array,leftStart,size + 1);
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
