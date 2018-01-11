package com.sharath.sorting;

/**
 * You first build the max heap. Then swap first and last element. Now last
 * element is in its correct position Now heapify the reduced array leaving the
 * last element. Repeat the process. TC : TC of heapify + TC of building max
 * heap = O(logn) + O(n) = O(nlogn)
 * 
 * @author sharath
 */
public class HeapSort
{

    public static void main(String[] args)
    {
        int[] list = { 1, 4, 3, 5, 7, 10, 14, 9, 12, 16 };
        heapSort(list);
        for (int i : list)
        {
            System.out.print(i + ", ");
        }
    }

    private static void heapSort(int[] input)
    {
        int end = input.length - 1;
        while (end >= 0)
        {
            buildMaxHeap(end, input);
            // swapping first and last
            int temp = input[0];
            input[0] = input[end];
            input[end] = temp;
            end--;
        }
    }

    private static void buildMaxHeap(int end, int[] input)
    {
        int firstNonLeaf = (int) Math.floor((end + 1) / 2) - 1;
        while (firstNonLeaf >= 0)
        {
            heapify(input, firstNonLeaf, end);
            firstNonLeaf--;
        }
    }

    private static void heapify(int[] input, int i, int end)
    {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int largest = i;
        if (left < end + 1 && input[left] > input[i])
        {
            largest = left;
        }
        if (right < end + 1 && input[right] > input[largest])
        {
            largest = right;
        }
        if (largest != i)
        {
            int temp = input[largest];
            input[largest] = input[i];
            input[i] = temp;
            heapify(input, largest, end);
        }
    }
}
