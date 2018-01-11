package com.sharath.sorting;

/**
 * In every iteration of selection sort, the minimum element is picked and put
 * in the beginning. the minimum element (considering ascending order) from the
 * unsorted subarray is picked and moved to the sorted subarray. Time complexity
 * : O(n2); space complexity: O(1)
 * 
 * @author sharath
 */
public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] list = { 1, 4, 3, 5, 7, 10, 14, 9, 12, 16 };
        int[] sortedList = selectionSort(list);
        for (int i : sortedList)
        {
            System.out.print(i + ", ");
        }
    }

    private static int[] selectionSort(int[] input)
    {
        for (int i = 0; i < input.length; i++)
        {
            int min = input[i];
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++)
            {
                if (input[j] < min)
                {
                    min = input[j];
                    minIndex = j;
                }
            }
            // swap min and input[i];
            int temp = input[i];
            input[i] = min;
            input[minIndex] = temp;
        }
        return input;
    }
}
