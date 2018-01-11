package com.sharath.sorting;

/**
 * Pick the element and insert it into the sorted sequence.
 * 
 * @author sharath
 */
public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] list = { 1, 4, 3, 5, 7, 10, 14, 9, 12, 16 };
        int[] sortedList = insertionSort(list);
        for (int i : sortedList)
        {
            System.out.print(i + ", ");
        }
    }

    private static int[] insertionSort(int[] input)
    {
        for (int i = 0; i < input.length - 1; i++)
        {
            int j = i;
            int elemToMove = input[j + 1];
            while (j >= 0 && elemToMove < input[j])
            {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = elemToMove;
        }
        return input;
    }
}
