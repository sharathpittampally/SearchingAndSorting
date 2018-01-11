package com.sharath.sorting;

/**
 * Divide the given array at the middle point and call mergesort(left-array),
 * mergesort(right-array) and then merge the two halves into a single array.
 * Space complexity is O(n); Time complexity: O(nlogn) (worst, avg and best).
 * Merge sort is better than selection, insertion and bubble.
 * 
 * @author sharath
 */
public class MergeSort
{

    public static void main(String[] args)
    {
        int[] list = { 1, 4, 3, 5, 7, 10, 14, 9, 12, 16 };
        int[] sortedList = mergeSort(0, list.length - 1, list);
        for (int i : sortedList)
        {
            System.out.print(i + ", ");
        }
    }

    private static int[] mergeSort(int start, int end, int[] input)
    {
        if (start == end)
            return new int[] { input[start] };

        int mid = (start + end) / 2;
        int[] left = mergeSort(start, mid, input);
        int[] right = mergeSort(mid + 1, end, input);
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right)
    {
        int[] jointArray = new int[left.length + right.length];
        int k = 0;
        int i = 0, j = 0;
        while (i < left.length && j < right.length)
        {
            if (left[i] <= right[j])
            {
                jointArray[k] = left[i];
                i++;
            }
            else
            {
                jointArray[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length)
        {
            jointArray[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length)
        {
            jointArray[k] = right[j];
            j++;
            k++;
        }
        return jointArray;
    }
}
