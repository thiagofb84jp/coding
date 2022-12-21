package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise07 {
    /*
     * 7 - Write a Java program to remove a specific element from an array.
     */
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int removeIndex = 1;

        System.out.println("Original Array: " + Arrays.toString(myArray));

        for (int i = removeIndex; i < myArray.length - 1; i++) {
            myArray[i] = myArray[i + 1];
        }

        System.out.println("After removing the second element: " + Arrays.toString(myArray));
    }
}
