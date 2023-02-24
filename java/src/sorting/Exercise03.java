package sorting;

import sorting.algorithms.RadixSort;

import java.util.Arrays;

public class Exercise03 {
    /*
     * 3 - Write a Java program to sort an array of given integers using Radix sort Algorithm.
     */
    public static void main(String[] args) {
        int nums[] = {7, -5, 3, 2, 1, 0, 45};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(nums));

        RadixSort.sort(nums);
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(nums));
    }
}
