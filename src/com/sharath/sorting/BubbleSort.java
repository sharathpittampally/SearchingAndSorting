package com.sharath.sorting;

/**
 * Bubble sort repeatedly swaps the adjacent elements if they are in the wrong
 * order and by the completion of first iteration largest element in the array
 * will be bubbled to the end of the array. Then start next iteration and so on…
 * Finally, the entire array will become sorted. The above function always runs
 * O(n^2) time even if the array is sorted. It can be optimized by stopping the
 * algorithm if inner loop didn’t cause any swap. So in this case the best case
 * time complexity is O(n) if the array is already sorted.
 * 
 * @author sharath
 */
public class BubbleSort
{

    public static void main(String[] args)
    {
        int[] list = { 1, 4, 3, 5, 7, 10, 14, 9, 12, 16 };
        int[] sortedList = bubbleSort(list);
        for (int i : sortedList)
        {
            System.out.print(i + ", ");
        }
    }

    private static int[] bubbleSort(int[] input)
    {
        for (int i = 0; i < input.length; i++)
        {
            for (int j = i; j < input.length - 1; j++)
            {
                if (input[j] > input[j + 1])
                {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;
    }
}
