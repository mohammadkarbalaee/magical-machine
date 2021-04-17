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
        int key;
        int properLocation;
        for (int i = 1; i < size; i++)
        {
            key = arr[i];
            for (properLocation = i - 1;properLocation >= 0 && key < arr[properLocation];properLocation--)
            {
                arr[properLocation + 1] = arr[properLocation];
            }
            arr[properLocation + 1] = key;
        }
        return arr;
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

    public int binarySearch(int[] arr, int value)
    {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        int middle;
        while (leftIndex <= rightIndex)
        {
            middle = leftIndex + (rightIndex - leftIndex) / 2;
            if (arr[middle] == value)
            {
                return middle;
            }
            else if (arr[middle] > value)
            {
                rightIndex = middle - 1;
            }
            else
            {
                leftIndex = middle + 1;
            }
        }
        return -1;
    }

    public int binarySearchRecursive(int[] arr, int value)
    {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        return binarySeachRecrsive(arr,leftIndex,rightIndex,value);
    }

    private int binarySeachRecrsive(int[] arr,int leftIndex,int rightIndex,int value)
    {
        if (leftIndex <= rightIndex)
        {
            int middle = leftIndex + (rightIndex - leftIndex) / 2;
            if (arr[middle] == value)
            {
                return middle;
            }
            else if (arr[middle] > value)
            {
                return binarySeachRecrsive(arr,leftIndex,middle - 1,value);
            }
            else
            {
                return binarySeachRecrsive(arr,middle + 1,rightIndex,value);
            }
        }
        return -1;
    }
}
