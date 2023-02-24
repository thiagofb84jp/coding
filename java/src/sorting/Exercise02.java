package sorting;

import sorting.algorithms.BubbleSort;

import java.util.Arrays;

public class Exercise02 {
    /*
     * 2 - Write a Java program to sort an array of given integers using the Bubble sorting Algorithm.
     */
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int nums[] = {7, -5, 3, 2, 1, 0, 45};

        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(nums));
        bs.bubbleSort(nums);

        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(nums));
    }
}
