package sorting;

import sorting.algorithms.QuickSort;

import java.util.Arrays;

public class Exercise01 {
    /*
     * 1 - Write a Java program to sort an array of given integers using Quick sort Algorithm.
     */
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int nums[] = {7, -5, 3, 2, 1, 0, 45};

        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(nums));
        quickSort.sort(nums);

        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(nums));
    }
}
