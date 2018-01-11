package com.sharath.sorting;

/**
 * Choose a pivot element, any random – say last element. Partition the array as
 * per pivot element such that all elements to left of pivot are smaller than
 * pivot and all elements to right are larger than pivot. Recursively call quick
 * sort i.e repeat above steps on the left side array of pivot Recursively call
 * quick sort i.e repeat 1 and 2 steps on right side array of pivot. SC : avg
 * case O(logn) worst case: O(n). TC: Best case : O(nlogn) worst case O(n2).
 * 
 * @author sharath
 */
public class QuickSort
{
    public static void main(String[] args)
    {
        int[] arr = { 1, 4, 3, 5, 7, 10, 14, 9, 12, 16 };
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr)
        {
            System.out.print(i + ", ");
        }
    }

    private static void quickSort(int[] A, int start, int end)
    {
        if (start >= end)
            return;
        int pindex = partition(A, start, end);

        quickSort(A, start, pindex - 1);
        quickSort(A, pindex + 1, end);
    }

    private static int partition(int[] A, int start, int end)
    {
        int pivot = A[end];
        int pindex = start;

        for (int i = start; i <= end; i++)
        {
            if (A[i] < pivot)
            {
                int temp = A[pindex];
                A[pindex] = A[i];
                A[i] = temp;
                pindex++;
            }
        }
        // swap pindex with pivot
        int temp = A[pindex];
        A[pindex] = A[end];
        A[end] = temp;
        return pindex;
    }
}
