package com.sharath.searching;

public class BinarySearch
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] list = { 1, 4, 3, 5, 7, 10, 14, 9, 12, 16 };
        System.out.println("Is 4 in the list?: " + binarySearch(list, 0, 9, 6));
    }

    private static boolean binarySearch(int[] list, int start, int end, int elem)
    {
        int mid = (start + end) / 2;
        if (end < start)
            return false;
        if (elem == list[mid])
            return true;
        return (binarySearch(list, 0, mid - 1, elem) || binarySearch(list, mid + 1, end, elem));
    }

}
