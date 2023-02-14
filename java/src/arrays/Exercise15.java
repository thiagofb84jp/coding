package arrays;

import java.util.Arrays;

public class Exercise15 {
    /*
     * 15 - Write a Java program to find the common elements between two arrays of integers.
     */
    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] arrayTwo = {1, 0, 6, 15, 6, 4, 7, 10};

        System.out.println("Array One : " + Arrays.toString(arrayOne));
        System.out.println("Array Two : " + Arrays.toString(arrayTwo));

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] == arrayTwo[j]) {
                    System.out.println("Common element is : " + arrayOne[i]);
                }
            }
        }
    }
}